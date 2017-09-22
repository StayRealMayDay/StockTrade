package com.stock.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.BusinessMapper;
import com.stock.mapper.EnvironmentMapper;
import com.stock.mapper.EvaOptionMapper;
import com.stock.mapper.EvaRecordMapper;
import com.stock.mapper.IndicatorMapper;
import com.stock.mapper.IndustryMapper;
import com.stock.mapper.MarketMapper;
import com.stock.mapper.ProductMapper;
import com.stock.mapper.ProjectMapper;
import com.stock.mapper.RelationMapper;
import com.stock.mapper.TechnologyMapper;
import com.stock.mapper.UserMapper;
import com.stock.pojo.Business;
import com.stock.pojo.Environment;
import com.stock.pojo.EvaOption;
import com.stock.pojo.EvaRecord;
import com.stock.pojo.Indicator;
import com.stock.pojo.Industry;
import com.stock.pojo.Market;
import com.stock.pojo.Product;
import com.stock.pojo.Project;
import com.stock.pojo.Relation;
import com.stock.pojo.Technology;
import com.stock.pojo.User;
import com.stock.service.NewsService;
import com.stock.service.ProjectService;
import com.stock.service.RequirementService;
import com.stock.utils.Pager;

@Controller
public class AdminProjectController {
	@Autowired
	ProjectMapper projectMapper;
	@Autowired
	ProjectService projectService;
	@Autowired
	ProductMapper productMapper;
	@Autowired
	UserMapper userMapper;
	@Autowired
	RelationMapper relationMapper;
	@Autowired
	NewsService newsService;
	@Autowired
	IndicatorMapper indicatorMapper;
	@Autowired
	EvaOptionMapper evaOptionMapper;
	@Autowired
	EvaRecordMapper evaRecordMapper;
	@Autowired
	RequirementService requirementService;
	@Autowired
	TechnologyMapper 	technologyMapper;
	@Autowired
	BusinessMapper businessMapper;
	@Autowired
	MarketMapper marketMapper;
	@Autowired
	EnvironmentMapper environmentMapper;
	@Autowired
	IndustryMapper industryMapper;
	/**
	 * 增加项目
	 */
	@RequestMapping(value = "/adminAddProject1")
	public String adminAddProject() {
		return "adPage/";
	}

	/**
	 * 查看所有项目
	 */
	@RequestMapping(value = "/adminSelectAllProject")
	public String adminSelectAllProject(HttpServletRequest req, HttpServletResponse resp, Model model) {
		int recordCount = projectMapper.selectAllProject().size();
		System.out.println("项目个数：" + recordCount);
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum);
		List<Project> allProjectList = projectService.selectAllProjectByPager(pager);
		List<Product> productList = new ArrayList<Product>();
		List<User> projectCreaterList = new ArrayList<User>();
		List<User> relationList = new ArrayList<User>();
		Map<String, String> usermap = new HashMap<String, String>();
		// List<String> relationNumList = new ArrayList<String>();
		Map<String, Object> relationNumList = new HashMap<String, Object>();
		for (Project project : allProjectList) {
			// 查找该项目包含的产品服务
			String projectUuid = project.getProjectUuid();
			Product product = productMapper.selectProductByProUuid(projectUuid);
			System.out.println("项目包含的产品服务名称：" + product.getPdName());
			productList.add(product);
			List<Relation> relationUserList = relationMapper.selectRelationByProUuid(projectUuid);
			// 项目的关注人数
			Integer Num = relationUserList.size();
			System.out.println("项目的关注人数是:" + Num);
			String relationNum = Num.toString();
			relationNumList.put("projectUuid", projectUuid);
			relationNumList.put("relationNum", relationNum);
			// 查找该项目的投资人
			for (Relation relation2 : relationUserList) {
				User user2 = userMapper.selectByPrimaryKey(relation2.getUserUuid());
				System.out.println("该项目的投资人是：" + user2.getUserName());
				relationList.add(user2);
			}
		}
		usermap = getProUserName(allProjectList);
		model.addAttribute("pager", pager);
		model.addAttribute("allProjectList", allProjectList);
		model.addAttribute("productList", productList);
		model.addAttribute("usermap", usermap);
		model.addAttribute("relationList", relationList);
		model.addAttribute("relationNumList", relationNumList);
		return "adPage/adminAllProject";
	}

	/**
	 * 根据项目表中的用户ID查询用户表中的用户名
	 */
	public Map<String, String> getProUserName(List<Project> allProject) {
		Map<String, String> usermap = new HashMap<String, String>();
		User user = new User();
		for (int i = 0; i < allProject.size(); i++) {
			user = userMapper.selectByPrimaryKey(allProject.get(i).getUserUuid());
			usermap.put(allProject.get(i).getUserUuid(), user.getUserName());
		}
		return usermap;
	}

	/**
	 * 项目关注人列表
	 */
	@RequestMapping(value = "/projectFollowPerson")
	public void projectFollowPerson(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String projectUuid = req.getParameter("projectUuid");
		List<User> listProFollow = new ArrayList<User>();
		List<Relation> relationUserList = relationMapper.selectRelationByProUuid(projectUuid);
		for (Relation relation : relationUserList) {
			User user = userMapper.selectByPrimaryKey(relation.getUserUuid());
			listProFollow.add(user);
		}
		model.addAttribute("listProFollow", listProFollow);
	}

	/**
	 * 删除项目
	 */
	@RequestMapping(value = "/adminDeleteProject")
	public String adminDeleteProject(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String projectUuid = req.getParameter("projectUuid");
		String pageNum = req.getParameter("pageNum");
		projectMapper.deleteByPrimaryKey(projectUuid);
		return "adPage/adminSelectAllProject?pageNum=" + pageNum;
	}

	/**
	 * 编辑项目
	 */
	@RequestMapping(value = "/adminEditProject")
	public String adminEditProject(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String projectUuid = req.getParameter("projectUuid");
		return "";
	}

	/**
	 * 查看项目详情
	 */
	@RequestMapping(value = "/adminSelectProjectItem")
	public String adminSelectProjectItem(HttpServletRequest req, HttpServletResponse resp, Model model) {
		// String projectUuid = req.getParameter("projectUuid");
		return "adPage/adminProjectItem";
	}

	/**
	 * 创建项目
	 * 
	 * @param req
	 * @param model
	 * @return
	 */
	// 1.进入创建项目的页面
	@RequestMapping(value = "/stockUpDown")
	public String adminAddProject(HttpServletRequest req, HttpServletResponse resp, Model model) {
		Indicator indicator = new Indicator();
		Indicator indicator2 = new Indicator();
		indicator.setInLevel("1");
		indicator.setInParent("0");
		List<Indicator> ins = indicatorMapper.selectAllFirstIndic(indicator);

		indicator2.setInLevel("2");
		List<Indicator> inNextsIndicators = indicatorMapper.selectAllSecondIndic(indicator2);

		List<EvaOption> options = evaOptionMapper.selectAllOptions();
		model.addAttribute("inNexts", inNextsIndicators);
		model.addAttribute("ins", ins);
		model.addAttribute("options", options);
		return "adPage/stockUpDown";
	}

	// 测试-进入产品页面
	@RequestMapping(value = "/adminAccessProduct")
	public String test() {
		return "adPage/adminAddProduct";
	}

	// 判断项目名称是否有重复
	@RequestMapping(value = "/getProNameValidation")
	public void getProNameValidation(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String pjName = req.getParameter("pjName");
		System.out.println("项目名称：" + pjName);
		Project project = projectMapper.selectByProjectName(pjName);
		PrintWriter out = resp.getWriter();
		if (project != null) {
			System.out.println("项目名称重复验证：" + pjName + "的项目名存在");
			out.print("success");
		} else {
			out.print("failure");
		}
	}

	// 判断项目包含的产品名称是否有重复
	@RequestMapping(value = "/getProductNameValidation")
	public void getProductNameValidation(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		String pdName = req.getParameter("pdName");
		Product product = productMapper.selectByProductName(pdName);
		PrintWriter out = resp.getWriter();
		if (product != null) {
			System.out.println("产品名称重复验证：" + pdName + "的产品名存在");
			out.print("success");
		} else {
			out.print("failure");
		}
	}

	@RequestMapping(value = "/adminAddProject")
	public String adminAddProject(HttpServletRequest req, Model model) {

		String projectUuid = UUID.randomUUID().toString();
		String productUuid = UUID.randomUUID().toString();
		String marketUuid = UUID.randomUUID().toString();
		String enviroUuid = UUID.randomUUID().toString();
		String techUuid = UUID.randomUUID().toString();
		String busUuid = UUID.randomUUID().toString();

		User user = (User) req.getSession().getAttribute("user");
		String pj_name = req.getParameter("pj_name");
		String pj_background = req.getParameter("pj_background");
		String pd_name = req.getParameter("pd_name");
		String pd_type = req.getParameter("pd_type");
		String pd_practical = req.getParameter("pd_practical");
		String pd_principle = req.getParameter("pd_principle");
		String pd_description = req.getParameter("pd_description");
		String pj_period = req.getParameter("pj_period");
		String pj_targetfinance = req.getParameter("pj_targetfinance");
		String pj_shortplan = req.getParameter("pj_shortplan");
		String pj_mlplan = req.getParameter("pj_mlplan");
		String pd_technology = req.getParameter("pd_technology");
		String tech_innovatelevel = req.getParameter("tech_innovatelevel");
		String tech_difficulty = req.getParameter("tech_difficulty");
		String tech_maturelevel = req.getParameter("tech_maturelevel");
		String tech_techlevel = req.getParameter("tech_techlevel");
		String tech_patent = req.getParameter("tech_patent");
		String pd_businessmodel = req.getParameter("pd_businessmodel");
		String bus_customer = req.getParameter("bus_customer");
		String bus_product = req.getParameter("bus_product");
		String bus_price = req.getParameter("bus_price");
		String bus_channel = req.getParameter("bus_channel");
		String ma_general = req.getParameter("ma_general");
		String ma_character = req.getParameter("ma_character");
		String ma_environment = req.getParameter("ma_environment");
		String ma_prospect = req.getParameter("ma_prospect");
		String enviro_policy = req.getParameter("enviro_policy");
		String enviro_economy = req.getParameter("enviro_economy");
		String enviro_culture = req.getParameter("enviro_culture");
		String enviro_technology = req.getParameter("enviro_technology");
		String pj_production = req.getParameter("pj_production");
		String pj_team = req.getParameter("pj_team");
		Project project = new Project();
		project.setProjectUuid(projectUuid);
		project.setPjName(pj_name);
		project.setPjPeriod(pj_period);
		project.setPjProduction(pj_production);
		project.setPjBackground(pj_background);
		project.setPjShortplan(pj_shortplan);
		project.setPjTargetfinance(pj_targetfinance);
		project.setPjTeam(pj_team);
		project.setPjMlplan(pj_mlplan);
		project.setUserUuid(user.getUserUuid());
		projectService.insertProject(project);

		Product product = new Product();
		product.setProductUuid(productUuid);
		product.setPdName(pd_name);
		product.setPdPractical(pd_practical);
		product.setPdPrinciple(pd_principle);
		product.setPdTechnology(pd_technology);
		product.setPdType(pd_type);
		product.setPdBusinessmodel(pd_businessmodel);
		product.setPdDescription(pd_description);
		product.setProjectUuid(projectUuid);
		projectService.insertProduct(product);

		Technology technology = new Technology();
		technology.setTechUuid(techUuid);
		technology.setProductUuid(productUuid);
		technology.setTechDifficulty(tech_difficulty);
		technology.setTechInnovatelevel(tech_innovatelevel);
		technology.setTechMaturelevel(tech_maturelevel);
		technology.setTechTechlevel(tech_techlevel);
		technology.setTechPatent(tech_patent);
		projectService.insertTechnology(technology);

		Business bus = new Business();
		bus.setBusUuid(busUuid);
		bus.setProductUuid(productUuid);
		bus.setBusCustomer(bus_customer);
		bus.setBusChannel(bus_channel);
		bus.setBusPrice(bus_price);
		bus.setBusProduct(bus_product);
		projectService.insertBusiness(bus);

		Market market = new Market();
		market.setMaUuid(marketUuid);
		market.setMaGeneral(ma_general);
		market.setMaProspect(ma_prospect);
		market.setMaEnvironment(ma_environment);
		market.setMaCharacter(ma_character);
		market.setProductUuid(productUuid);
		projectService.insertMarket(market);

		Environment enviro = new Environment();
		enviro.setEnviroUuid(enviroUuid);
		enviro.setEnviroTechnology(enviro_technology);
		enviro.setEnviroPolicy(enviro_policy);
		enviro.setEnviroCulture(enviro_culture);
		enviro.setEnviroEconomy(enviro_economy);
		enviro.setMaUuid(marketUuid);
		projectService.insertEnvironment(enviro);

		// 查询所有二级指标
		Indicator indicator2 = new Indicator();

		indicator2.setInLevel("2");
		List<Indicator> inNextsIndicators = indicatorMapper.selectAllSecondIndic(indicator2);

		List<Double> optionscore = new ArrayList<Double>();
		for (Indicator indicator1 : inNextsIndicators) {
			String reqString = req.getParameter("options" + indicator1.getInUuid());
			String reqS = reqString.substring(0, reqString.indexOf("_"));
			System.out.println("------------" + reqS);
			optionscore.add(Double.valueOf(reqS));
		}
		Double totalDouble = 0.00;
		for (int i = 0; i < inNextsIndicators.size(); i++) {
			totalDouble += optionscore.get(i) * Double.valueOf(inNextsIndicators.get(i).getInWeight());
		}
		System.out.println("------------!!!" + totalDouble);
		Date curdate1 = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置时间显示格式
		String cur = sdf.format(curdate1);// 将当前时间格式化为需要的类型

		for (int i = 0; i < inNextsIndicators.size(); i++) {
			EvaOption eva_option = new EvaOption();
			String valueString = req.getParameter("options" + inNextsIndicators.get(i).getInUuid());
			String valueString2 = valueString.substring(0, valueString.indexOf("_"));
			eva_option.setOpValue(valueString2);
			eva_option.setInUuid(inNextsIndicators.get(i).getInUuid());
			String option_uuid = evaOptionMapper.selectOptionIdByValueIn(eva_option).getOpUuid();
			// String in_uuid=
			// evaOptionMapper.selectByPrimaryKey(option_uuid).getInUuid();
			String parent_id = indicatorMapper.selectByPrimaryKey(inNextsIndicators.get(i).getInUuid()).getInParent();
			EvaRecord evaRecord = new EvaRecord();
			evaRecord.setErUuid(UUID.randomUUID().toString());
			evaRecord.setErOptionUuid(option_uuid);
			evaRecord.setErValue(optionscore.get(i).toString());
			evaRecord.setErInParent(parent_id);
			evaRecord.setProjectUuid(projectUuid);
			evaRecordMapper.insertSelective(evaRecord);	
		}
		Project project1 = new Project();
		project1.setProjectUuid(projectUuid);
		project1.setPjAutoEvalue(totalDouble.toString());
		project1.setPjProtime(cur);
		projectService.updateProjectSelective(project1);
        System.out.println("项目插入成功！");
        model.addAttribute("project",projectService.projectDetail(projectUuid));
		model.addAttribute("product", product);
		model.addAttribute("bus", bus);
		model.addAttribute("tech", technology);
		model.addAttribute("enviro", enviro);
		model.addAttribute("market", market);
		return "adPage/success";
	}
    /**
     * 查看项目详情页
     */
	@RequestMapping("/adminSelectProItem")
	public String adminSelectProItem(HttpServletRequest req, Model model){
		String projectUuid = req.getParameter("projectUuid");
		Project project = projectMapper.selectByPrimaryKey(projectUuid);
		String userUuid = project.getUserUuid();   //获取项目创始人的UUID
		Industry industry = industryMapper.selectByPrimaryKey(project.getPjIndustry());
		Product product = productMapper.selectProductByProUuid(projectUuid);  //获取项目包含的产品信息
		String productUuid = product.getProductUuid();  //获取产品的UUID
		Technology technology = technologyMapper.selectByProductUuid(productUuid); //通过产品UUID获取技术指标概述
		Business business = businessMapper.selectBusByProductUuid(productUuid); //通过产品UUID获取商业模式指标
		Market market = marketMapper.selectMarByProducUuid(productUuid); //通过产品UUID获取市场信息		
		Environment environment = environmentMapper.selectEnvByProductUuid(market.getMaUuid());
		User user = userMapper.selectByPrimaryKey(userUuid);   //通过userUuid获取项目创始人的信息
		
		Indicator indicator = new Indicator();
		Indicator indicator2 = new Indicator();
		// 查询所有一级指标
		indicator.setInLevel("1");
		indicator.setInParent("0");
		List<Indicator> ins = indicatorMapper.selectAllFirstIndic(indicator);
		// 查询所有二级指标
		indicator2.setInLevel("2");
		List<Indicator> inNextsIndicators = indicatorMapper.selectAllSecondIndic(indicator2);
		
		List<Map<String,Object>> evaRecordList = evaRecordMapper.selectByEvaRecord(projectUuid);
		List<Object> listEva =new ArrayList<Object>();
		for(int i=0;i<evaRecordList.size();i++){
			listEva.add(evaRecordList.get(i));
		}
		model.addAttribute("project", project);
		model.addAttribute("industry", industry);
		model.addAttribute("user", user);
		model.addAttribute("product", product);
		model.addAttribute("technology", technology);
		model.addAttribute("business", business);
		model.addAttribute("market", market);
		model.addAttribute("environment", environment);
		model.addAttribute("inNexts", inNextsIndicators);
		model.addAttribute("ins", ins);	
		model.addAttribute("listEva", listEva);
		return "adPage/adminProjectItem";
	}
}
