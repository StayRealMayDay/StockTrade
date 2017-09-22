package com.stock.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.google.gson.Gson;
import com.stock.mapper.EvaOptionMapper;
import com.stock.mapper.EvaRecordMapper;
import com.stock.mapper.EvaluationMapper;
import com.stock.mapper.IndicatorMapper;
import com.stock.mapper.InnovationMapper;
import com.stock.mapper.PhotoMapper;
import com.stock.mapper.ProIndicatorMapper;
import com.stock.pojo.Business;
import com.stock.pojo.Environment;
import com.stock.pojo.EvaOption;
import com.stock.pojo.EvaRecord;
import com.stock.pojo.Evaluation;
import com.stock.pojo.Indicator;
import com.stock.pojo.Industry;
import com.stock.pojo.Innovation;
import com.stock.pojo.Market;
import com.stock.pojo.News;
import com.stock.pojo.Photo;
import com.stock.pojo.ProIndicator;
import com.stock.pojo.Product;
import com.stock.pojo.Project;
import com.stock.pojo.Relation;
import com.stock.pojo.Requirement;
import com.stock.pojo.Technology;
import com.stock.pojo.User;
import com.stock.service.NewsService;
import com.stock.service.ProjectService;
import com.stock.service.RelationService;
import com.stock.service.RequirementService;
import com.stock.service.UserService;
import com.stock.utils.Pager;
import com.stock.utils.WordGenerator;


@Controller
public class ProjectController {

	@Autowired
	ProjectService projectService;
	@Autowired
	UserService userService;
	@Autowired
	NewsService newsService;
	@Autowired
	IndicatorMapper indicatorMapper;
	@Autowired
	EvaOptionMapper evaOptionMapper;
	@Autowired
	EvaRecordMapper evaRecordMapper;
	@Autowired
	EvaluationMapper evaluationMapper;
	@Autowired
	RequirementService requirementService;
	@Autowired 
	RelationService relationService;
	@Autowired 
	PhotoMapper photoMapper;
	@Autowired
	ProIndicatorMapper proIndicatorMapper;
	@Autowired
	InnovationMapper innovationMapper;
	
	
	@RequestMapping(value = "/imageUpload")
	public String imageUpload(){
		
		
		return "imageUpload";
	}
	/**
	 * 首页信息展示
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/login")
	public String selectAllProject(HttpServletRequest req,Model model){
		User userr = (User) req.getSession().getAttribute("user");
	    
		if (null==userr) {
        	System.out.println("用户为空11111111");
        	return "u_login";
		}else {
		Integer pageNum = Integer.parseInt(req.getParameter("pageNum"));
		List<Project> pros = projectService.selectAllProject();
		Integer recordCount = projectService.selectAllProject().size();
		Pager pager = new Pager(recordCount,pageNum);
		List<Project> projects = projectService.listAllProByPage(pager);
		
        List<News> news1 = newsService.selectByNewsType("新闻动态");
        List<News> news2 = newsService.selectByNewsType("行业动态");
        List<News> news3 = newsService.selectByNewsType("政策法规");
        List<Industry> industries = requirementService.selectAllIndustry();
		
		model.addAttribute("news1", news1);
		model.addAttribute("news2", news2);
		model.addAttribute("news3", news3);
		model.addAttribute("industries", industries);
		
		model.addAttribute("projects", projects);
		model.addAttribute("pros", pros);
		model.addAttribute("pager", pager);
		return "u_index";
		}
	}
	/**
	 * 项目详情
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/projectDetail")
	public String projectDetail(Model model,HttpServletRequest req){
		
		String projectUuid = req.getParameter("project_uuid");
		Project project = projectService.projectDetail(projectUuid);
		Product product = projectService.productDetailByProject(projectUuid);
		Business bus = projectService.selectBusinessByProduct(product.getProductUuid());
		Technology technology = projectService.selectTechByPrduct(product.getProductUuid());
		Market market = projectService.selectMarketByProduct(product.getProductUuid());
		Environment enviro = projectService.selectEnviroByMarket(market.getMaUuid());
		List<Photo> photos = photoMapper.selectPhotoByProductUuid(product.getProductUuid());
		List<Innovation> innovations = innovationMapper.selectInnovations(product.getProductUuid());
		
		model.addAttribute("project", project);
		model.addAttribute("photos", photos);
		model.addAttribute("product", product);
		model.addAttribute("bus", bus);
		model.addAttribute("tech", technology);
		model.addAttribute("enviro", enviro);
		model.addAttribute("market", market);
		model.addAttribute("innovations", innovations);
		return "project_detail";
	}
	
	
	@RequestMapping(value = "/addInnovation")
	@ResponseBody
	public String addInnovation(Model model,HttpServletRequest req, HttpServletResponse resp) throws IOException{
		String inno_level = req.getParameter("inno_level");
		String inno_description = req.getParameter("inno_description");
		String inno_prove = req.getParameter("inno_prove");
		String product_uuid = req.getParameter("product_uuid");
		
		Innovation innovation = new Innovation();
		innovation.setInnoUuid(UUID.randomUUID().toString());
		innovation.setInnoLevel(inno_level);
		innovation.setInnoDescription(inno_description);
		innovation.setInnoProve(inno_prove);
		innovation.setProductUuid(product_uuid);
		
		Gson gson = new Gson();
		/*PrintWriter out = resp.getWriter();	*/	
		if(innovationMapper.insertSelective(innovation)!=0){
			List<Innovation> innovations = innovationMapper.selectInnovations(product_uuid);
			
			System.out.println(innovations.size());
			String tmp = gson.toJson(innovations);
			/*out.print("success");*/
	        System.out.println(tmp);
	        resp.setCharacterEncoding("UTF-8");
	        resp.setContentType("application/json");
	        resp.getWriter().write(gson.toJson(innovations));
	        
	         
		}
		return null;
	}
	
	/**
	 * 生成项目计划书
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/planWord")
	public String planword(Model model,HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.print("asdasdasd");
        req.setCharacterEncoding("utf-8"); 
        User user = (User) req.getSession().getAttribute("user");
        if (null==user) {
        	System.out.println("用户为空11111111");
        	return "u_login";
		}else {
			String projectUuid = req.getParameter("project_uuid");
			Project project = projectService.projectDetail(projectUuid);
			Product product = projectService.productDetailByProject(projectUuid);
			Business bus = projectService.selectBusinessByProduct(product.getProductUuid());
			Technology technology = projectService.selectTechByPrduct(product.getProductUuid());
			Market market = projectService.selectMarketByProduct(product.getProductUuid());
			Environment enviro = projectService.selectEnviroByMarket(market.getMaUuid());
			List<Innovation> innovations = innovationMapper.selectInnovations(product.getProductUuid());
			Map<String, Object> map = new HashMap<String, Object>();  
			//  Enumeration<String> paramNames = req.getParameterNames(); 
			// 通过循环将表单参数放入键值对映射中  
//        while(paramNames.hasMoreElements()) {  
//            String key = paramNames.nextElement();  
//            String value = req.getParameter(key);  
//            map.put(key, value);  
//        }  
			map.put("author", user.getUserRealname());
			map.put("pdType", product.getPdType());
			map.put("pjName", project.getPjName()); 
			map.put("pjBackground", project.getPjBackground());
			map.put("pjShortplan", project.getPjShortplan());
			map.put("pjMlplan", project.getPjMlplan());
			map.put("pdName", product.getPdName());
			map.put("pdDescription", product.getPdDescription());
			map.put("pdPrinciple", product.getPdPrinciple());
			map.put("pdTechnology", product.getPdTechnology());
			map.put("techInnovatelevel", technology.getTechInnovatelevel());
			map.put("techDifficulty", technology.getTechDifficulty());
			map.put("techMaturelevel", technology.getTechMaturelevel());
			map.put("techTechlevel", technology.getTechTechlevel());
			map.put("techPatent", technology.getTechPatent());
			map.put("pdBusinessmodel", product.getPdBusinessmodel());
			map.put("busCustomer", bus.getBusCustomer());
			map.put("busProduct", bus.getBusProduct());
			map.put("busPrice", bus.getBusPrice());
			map.put("busChannel", bus.getBusChannel());
			map.put("pdMarket", product.getPdMarket());
			map.put("maCharacter", market.getMaCharacter());
			map.put("maEnvironment", market.getMaEnvironment());
			map.put("enviroTechnology", enviro.getEnviroTechnology());
			map.put("enviroPolicy", enviro.getEnviroPolicy());
			map.put("enviroEconomy", enviro.getEnviroEconomy());
			map.put("enviroCulture", enviro.getEnviroCulture());
			map.put("maProspect", market.getMaProspect());
			map.put("pjProduction", project.getPjProduction());
			map.put("pjTeam", project.getPjTeam());
			
			List<Map<String, Object>> innoList=new ArrayList<Map<String,Object>>();
			for (Innovation innovation : innovations) {
				Map<String, Object> dataMap=new HashMap<String, Object>();
				dataMap.put("innoLevel", innovation.getInnoLevel());
				dataMap.put("innoDescription", innovation.getInnoDescription());
				dataMap.put("innoProve", innovation.getInnoProve());
				innoList.add(dataMap);
			}
			
			map.put("innoList",innoList);
			// 提示：在调用工具类生成Word文档之前应当检查所有字段是否完整  
			// 否则Freemarker的模板殷勤在处理时可能会因为找不到值而报错 这里暂时忽略这个步骤了  
			File file = null;  
			InputStream fin = null;  
			ServletOutputStream out = null;  
			try {  
				// 调用工具类WordGenerator的createDoc方法生成Word文档  
				file = WordGenerator.createDoc(map, "plan");  
				fin = new FileInputStream(file);  
				
				resp.setCharacterEncoding("utf-8");  
				resp.setContentType("application/msword");  
				// 设置浏览器以下载的方式处理该文件默认名为resume.doc  
				resp.addHeader("Content-Disposition", "attachment;filename=plan.doc");  
				
				out = resp.getOutputStream();  
				byte[] buffer = new byte[512];  // 缓冲区  
				int bytesToRead = -1;  
				// 通过循环将读入的Word文件的内容输出到浏览器中  
				while((bytesToRead = fin.read(buffer)) != -1) {  
					out.write(buffer, 0, bytesToRead);  
				}  
			} finally {  
				if(fin != null) fin.close();  
				if(out != null) out.close();  
				if(file != null) file.delete(); // 删除临时文件  
			}  
			
			return "project_detail";
		}
	}
	/**
	 *跳转到创建项目
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/toAddProject")
	public String toAddProject(Model model){
		
		//查询所有样机的一级指标
		Indicator indicator  = new Indicator();
		Indicator indicator2  = new Indicator();
		indicator.setInLevel("1");
		indicator.setInParent("0");
		List<Indicator> ins = indicatorMapper.selectfirstIndicator(indicator);
		
		indicator2.setInLevel("2");
		List<Indicator> inNextsIndicators = indicatorMapper.selectNextIndicators(indicator2);
		
		List<EvaOption> options = evaOptionMapper.selectAllOptions();
		model.addAttribute("inNexts", inNextsIndicators);
		model.addAttribute("ins",ins);
		model.addAttribute("options",options);
		
		return "creatProject";
	}
	
	/**
	 * 撤销项目
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/deletePro")
	public String deletePro(Model model,HttpServletRequest req){
		String projectUuid = req.getParameter("project_uuid");
		projectService.deleteProject(projectUuid);
		
		return "redirect:userInfo";
	}
	/**
	 *创建项目
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/addProject")
	public String addProject(HttpServletRequest req,Model model){
		
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
		project.setPjEvatimes("0");
		project.setPjManualEvalue("0.00");
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
		/*
		 * 自动评估
		 * */
		//查询所有样机的一级指标
		Indicator indicator  = new Indicator();
		indicator.setInLevel("1");
		indicator.setInParent("0");
		List<Indicator> ins = indicatorMapper.selectfirstIndicator(indicator);
		//查询所有二级指标
		Indicator indicator2  = new Indicator();
		
		indicator2.setInLevel("2");
		List<Indicator> inNextsIndicators = indicatorMapper.selectNextIndicators(indicator2);
		
		List<Double> optionscore = new ArrayList<Double>();
		for (Indicator indicator1 : inNextsIndicators) {
			String reqString = req.getParameter("options"+indicator1.getInUuid()); 
			String reqS = reqString.substring(0, reqString.indexOf("_"));
			System.out.println("------------"+reqS);
			optionscore.add(Double.valueOf(reqS));
		}
		Double totalDouble = 0.00;
		for (int i=0;i<inNextsIndicators.size();i++) {
			totalDouble += optionscore.get(i) * Double.valueOf(inNextsIndicators.get(i).getInWeight());
		}
		System.out.println("------------!!!"+totalDouble);
		Date curdate1= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置时间显示格式
		String cur = sdf.format(curdate1);//将当前时间格式化为需要的类型
		
		for (int i=0;i<inNextsIndicators.size();i++) {
		    EvaOption eva_option = new EvaOption();
		    String valueString = req.getParameter("options"+inNextsIndicators.get(i).getInUuid());
		    String valueString2 = valueString.substring(0, valueString.indexOf("_"));
			/*eva_option.setOpValue(optionscore.get(i).toString());*/
		    eva_option.setOpValue(valueString2);
			eva_option.setInUuid(inNextsIndicators.get(i).getInUuid());
			
			String option_uuid = evaOptionMapper.selectOptionIdByValueIn(eva_option).getOpUuid();
			/*String in_uuid= evaOptionMapper.selectByPrimaryKey(option_uuid).getInUuid();*/
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
		//插入自动评估值
		project1.setPjAutoEvalue(totalDouble.toString());
		project1.setPjProtime(cur);
		projectService.updateProjectSelective(project1);
	
		//6.21日新加入的代码
		ProIndicator proIndicator = new ProIndicator();
		Map<String,String> recordMap = new HashMap<String,String>();
		recordMap = getRecordMap(ins,projectUuid);
		
		proIndicator.setProUuid(projectUuid);
		proIndicator.setProBackground(pj_background);
		proIndicator.setProProjectname(pj_name);
		proIndicator.setProProductname(pd_name);
		proIndicator.setProIntech(Double.parseDouble(recordMap.get("2")));
		proIndicator.setProInbus(Double.parseDouble(recordMap.get("1")));
		proIndicator.setProInviro(Double.parseDouble(recordMap.get("3")));
		proIndicator.setProProspect(Double.parseDouble(recordMap.get("4")));
		proIndicator.setProIndus(Double.parseDouble(recordMap.get("5")));
		proIndicator.setProOrgan(Double.parseDouble(recordMap.get("6")));
		proIndicator.setProProduction(Double.parseDouble(recordMap.get("7")));
		proIndicator.setProFund(Double.parseDouble(recordMap.get("8")));
		proIndicator.setProTeam(Double.parseDouble(recordMap.get("9")));
		proIndicator.setProRisk(Double.parseDouble(recordMap.get("10")));
		proIndicator.setProTotalvalue(totalDouble);
		
		proIndicatorMapper.insertSelective(proIndicator);
				
		
		model.addAttribute("project", projectService.projectDetail(projectUuid));
		model.addAttribute("product", product);
		model.addAttribute("bus", bus);
		model.addAttribute("tech", technology);
		model.addAttribute("enviro", enviro);
		model.addAttribute("market", market);
		return "redirect:toUploadImage?pro_uuid="+projectUuid;
	}
	/**
	 * 评估报告
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/toReport")
	public String toReport(Model model,HttpServletRequest req){
		
		//查询所有样机的一级指标
		Indicator indicator  = new Indicator();
		indicator.setInLevel("1");
		indicator.setInParent("0");
		List<Indicator> ins = indicatorMapper.selectfirstIndicator(indicator);
		
		String projectUuid = req.getParameter("project_uuid");
		/*String projectUuid = "7e741d0a-91e7-4ad1-b6e4-5a326f02dc5e";*/
		Project project  = projectService.projectDetail(projectUuid);
		Product product = projectService.productDetailByProject(projectUuid);
		List<Map<String, Object>> evas =  evaRecordMapper.selectByEvaRecord(projectUuid);
		/*for (Map<String, Object> map : evas) {
			System.out.println(evas);
		}*/
		Map<String,String> recordMap = new HashMap<String,String>();
		recordMap = getRecordMap(ins,projectUuid);
		String valueString = recordMap.get("value");
		/*System.out.println("yanzheng"+valueString);*/
		Map<String, String> userMap = new HashMap<String, String>();
		userMap = getUserMap(project);
		model.addAttribute("project", project);
		model.addAttribute("product", product);
		model.addAttribute("valueString", valueString);
		model.addAttribute("ins", ins);
		model.addAttribute("evas", evas);
		model.addAttribute("recordMap", recordMap);
		model.addAttribute("userMap", userMap);
		return "report";
	}
	/**
	 * @author 张玉筱
	 */
    public  Map<String,String> getRecordMap(List<Indicator> ins,String projectUuid){
		
		Map<String,String> recordMap = new HashMap<String,String>();
		DecimalFormat df = new DecimalFormat("0.00"); 
		List<Double> totals= new ArrayList<Double>(); 
		String pingjieString = "";
		for(int i=0;i < ins.size();i++){
			Map<String,String> map = new HashMap<String,String>();
			map.put("projectUuid", projectUuid);
			map.put("erInParent", ins.get(i).getInUuid());
							/*System.out.println("!!!-----------------------"+total);*/
			List<Map<String, Object>> evasOfInd = evaRecordMapper.selectByEvaRecordOfIndicator(map);
			/*System.out.println("!!!"+evasOfInd.size());*/
			double total = 0.00;
			for (Map<String, Object> e : evasOfInd) {
				total += Double.parseDouble(e.get("er_value").toString())*Double.parseDouble(e.get("in_weight").toString());
			}
			/*System.out.println("-----------------------"+total);*/
			Double double1 = Double.parseDouble(ins.get(i).getInWeight());
			totals.add(total/double1);
			if(total/double1==0){
				pingjieString = pingjieString + 5.00 +",";
				System.out.println(pingjieString);
			}
			else{
				pingjieString = pingjieString+df.format(total/double1)+",";
			}
			System.out.println(df.format(total/double1)+"!!!-----------------------"+total/double1);
		}
		String ping=pingjieString.substring(0, pingjieString.lastIndexOf(","));
		pingjieString = "[" + ping +"]";
		System.out.println(pingjieString);
		for(int i=0;i < ins.size();i++){
			recordMap.put(ins.get(i).getInUuid(), totals.get(i).toString());
/*			user = userService.selectByPrimaryKey(eva.get(i).getEva_ex_id());
			recordMap.put(eva.get(i).getEva_ex_id(), user.getUser_name());*/
		}
		recordMap.put("value", pingjieString);
		return recordMap;
	}
	/**
	 * @author 张玉筱
	 */
    public  Map<String,String> getUserMap(Project project){
    	Map<String,String> userMap = new HashMap<String,String>();
    	User user = userService.selectByPrimaryKey(project.getUserUuid());
    	System.out.println();
    	userMap.put(project.getUserUuid(), user.getUserRealname());
    	return userMap;
    }
	/**
	 * @author 张玉筱
	 */
    public  Map<String,String> getUserMap1(List<Evaluation> e){
    	Map<String,String> userMap1 = new HashMap<String,String>();
    	User user = new User();
    	for(int i=0;i < e.size();i++){
    	    user = userService.selectByPrimaryKey(e.get(i).getEvaExpertUuid());
    	    userMap1.put(e.get(i).getEvaExpertUuid(), user.getUserRealname());		
		}
    	return userMap1;
    }
	
	/**
  	 * 跳转到专家评估
	 * @author 张玉筱
	 * **/
	@RequestMapping("/toEva_project")
	public String toEva_project(Model model,HttpServletRequest req) {
		String projectUuid = req.getParameter("project_uuid");
		Project project = projectService.projectDetail(projectUuid);
		//-----------------写到这----------------
        //查询所有项目的一级指标
		Indicator indicator  = new Indicator();
		Indicator indicator2  = new Indicator();
		indicator.setInLevel("1");
		indicator.setInParent("0");
		List<Indicator> ins = indicatorMapper.selectfirstIndicator(indicator);
		
		indicator2.setInLevel("2");
		List<Indicator> inNextsIndicators = indicatorMapper.selectNextIndicators(indicator2);
		/*for (Indicator indicator3 : ins) {
			System.out.println(indicator3.getIn_name()+"+"+indicator3.getIn_parent());
		}*/
	
		
		List<EvaOption> options = evaOptionMapper.selectAllOptions();
	    model.addAttribute("ins", ins);
	    model.addAttribute("inNexts", inNextsIndicators);
	    model.addAttribute("options", options);
	    model.addAttribute("project", project);
		
    	
		return "evaProject";
	}
	/**
  	 * 提交专家评估
	 * @author 张玉筱
	 * **/
	@RequestMapping("/Eva_project")
	public String Eva_project(HttpServletRequest req,Model model) {
		
		User user = (User) req.getSession().getAttribute("user");
        
        String eva_expert_uuid = user.getUserUuid();
        
        //int res_id = 53;//暂时设定一个固定值
	    String projectUuid = req.getParameter("pro_uuid");
	    Project project = projectService.projectDetail(projectUuid);
	    System.out.println("/////////"+projectUuid+"////////////"+eva_expert_uuid);
        //查询所有二级指标
        Indicator indicator2  = new Indicator();
        indicator2.setInLevel("2");
		List<Indicator> inNextsIndicators = indicatorMapper.selectNextIndicators(indicator2);
		 
		List<Double> optionscore = new ArrayList<Double>();
		for (Indicator indicator1 : inNextsIndicators) {
			String reqString = "optionsRadios"+Integer.parseInt(indicator1.getInUuid());
			optionscore.add(Double.valueOf(req.getParameter(reqString)));
		}
		Double totalDouble = 0.00;
		for (int i=0;i<inNextsIndicators.size();i++) {
			totalDouble += optionscore.get(i) * Double.parseDouble(inNextsIndicators.get(i).getInWeight());
		}
		
		
		Date curdate1= new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置时间显示格式
		String cur = sdf.format(curdate1);//将当前时间格式化为需要的类型
		
		Evaluation evaluation = new Evaluation();
		
		String eva_uuid = UUID.randomUUID().toString();
		evaluation.setEvaUuid(eva_uuid);
		evaluation.setEvaProUuid(projectUuid);
		evaluation.setEvaExpertUuid(eva_expert_uuid);
		evaluation.setEvaTime(cur);
		evaluation.setEvaValue(totalDouble.toString());
		
		evaluationMapper.insertSelective(evaluation);
				
		for (int i=0;i<inNextsIndicators.size();i++) {
			EvaOption eva_option = new EvaOption();
			eva_option.setOpValue(optionscore.get(i).toString());
			eva_option.setInUuid(inNextsIndicators.get(i).getInUuid());
			System.out.println("-----------------------------------");
			System.out.println(optionscore.get(i).toString());
			System.out.println(inNextsIndicators.get(i).getInUuid());
			System.out.println("-----------------------------------");
			//-------------改动过---------
			String option_uuid = evaOptionMapper.selectOptionIdByValueIn(eva_option).getOpUuid();
			String in_uuid= evaOptionMapper.selectByPrimaryKey(option_uuid).getInUuid();
			String parent_uuid = indicatorMapper.selectByPrimaryKey(in_uuid).getInParent();
			
			EvaRecord evarecord = new EvaRecord();
			evarecord.setErUuid(UUID.randomUUID().toString());
			evarecord.setErEvaUuid(eva_uuid);
			evarecord.setErOptionUuid(option_uuid);
			evarecord.setErValue(optionscore.get(i).toString());
			evarecord.setErInParent(parent_uuid);
			evarecord.setProjectUuid(projectUuid);
			evarecord.setErType("专家评估");
			evaRecordMapper.insertSelective(evarecord);
		}
			Integer evatimes = Integer.parseInt(project.getPjEvatimes())+1;
			Double evalue= (Double.parseDouble(project.getPjManualEvalue())*Double.parseDouble(project.getPjEvatimes()) + totalDouble)/evatimes;
			
			project.setProjectUuid(projectUuid);
			project.setPjManualEvalue(evalue.toString());
			project.setPjEvatimes(evatimes.toString());
			projectService.updateProjectSelective(project);
		
		/*return "redirect:projectItem?pro_id="+pro_id;*/
		/*	return "redirect:projectDetail?project_uuid="+projectUuid;*/
		return "redirect:toShowEva?project_uuid="+projectUuid+"&pageNum=1";
	}


	/**
	 * 专家评估展示
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/toShowEva")
	public String toShowEva(Model model,HttpServletRequest req){
		
	    String projectUuid = req.getParameter("project_uuid");
	    Project project = projectService.projectDetail(projectUuid);
		//雷达图
		List<String> indicationDoubles  = new ArrayList<String>();
		List<Evaluation> evaluations = evaluationMapper.selectEvaPRecordByOtherUser(projectUuid);
		
		Integer pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Integer recordCount = evaluationMapper.selectEvaPRecordByOtherUser(projectUuid).size();
		Pager pager = new Pager(recordCount,pageNum);
		HashMap map = new HashMap();
		map.put("evaProUuid", projectUuid);
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<Evaluation> evaluationlist = evaluationMapper.listEvaPRecordByOtherUser(map);
		System.out.println(evaluationlist.size());
		
		String leidatu = "";
		String leidatu1 = "";
		if(evaluations.size()>0)
		{
		//查询一级指标
		Indicator indicator  = new Indicator();
		indicator.setInLevel("1");
		indicator.setInParent("0");
		List<Indicator> ins = indicatorMapper.selectfirstIndicator(indicator);
	    List<List<String>> evaDoubles  = new ArrayList<List<String>>();
		DecimalFormat df = new DecimalFormat("0.00"); 
		EvaRecord evaRecord = new EvaRecord();
		
	    for (Evaluation evaluation : evaluations) {
			String pingjiehead = "[";
			String pingjieString = "";
			for (Indicator indicator2 : ins) {
				
				Double es_value=0.00;
				evaRecord.setErEvaUuid(evaluation.getEvaUuid());
				evaRecord.setErInParent(indicator2.getInUuid());
				List<EvaRecord> esList = evaRecordMapper.selectInofESrecord(evaRecord);
				for (int i=0;i<esList.size();i++) {
					es_value += Double.parseDouble(esList.get(i).getErValue());
				}
				es_value = es_value/esList.size();
				System.out.print(esList.size());
				System.out.println(es_value);
				pingjieString = pingjieString+df.format(es_value)+",";
			}
			String ping=pingjieString.substring(0, pingjieString.lastIndexOf(",")-1);
			pingjieString = "[" + ping +"]";
			//System.out.println(pingjieString);
			indicationDoubles.add(pingjieString);
		}
		for (String pinString : indicationDoubles) {
			leidatu =leidatu + "{value :  "+pinString+",name : '指标'},";
		}
	//	System.out.println(leidatu);
		//------------------------
		//计算几次记录的平均值
		String evarageValue = "";
		String evaragePing= "";
		List<String> insDouble  = new ArrayList<String>();
		EvaRecord eRecore = new EvaRecord();
			for (Indicator indicator2 : ins) {
				Double evarage = 0.00;
				Double esvalueTotal = 0.00;
				for (Evaluation evaluation : evaluations) {
					
					Double esvalue=0.00;

					eRecore.setErEvaUuid(evaluation.getEvaUuid());
					eRecore.setErInParent(indicator2.getInUuid());
					List<EvaRecord> esList1 = evaRecordMapper.selectInofESrecord(eRecore);
					for (int i=0;i<esList1.size();i++) {
						esvalue += Double.parseDouble(esList1.get(i).getErValue());
					}
					esvalueTotal += esvalue/esList1.size();
				}
				evarage = esvalueTotal/evaluations.size();
				
				insDouble.add(evarage.toString());
			}
			for (String indouble : insDouble) {
				evaragePing += indouble + ",";
			}
			evarageValue =evarageValue + "{value : [ "+evaragePing+"],name : '均值'}";
		//----------------------------------
		
		 leidatu1= leidatu.substring(0, leidatu.lastIndexOf(",")-1)+"}";
			leidatu1= leidatu + evarageValue;
		}
		Map<String, String> userMap1 = new HashMap<String, String>();
		userMap1 = getUserMap1(evaluationlist);
		System.out.println(leidatu1);
        User user = (User) req.getSession().getAttribute("user");
        if (null==user) {
        	System.out.println("用户为空11111111");
        	return "u_login";
		}else {
        
        String username = user.getUserRealname();
		
		model.addAttribute("leidatu1", leidatu1);
		model.addAttribute("evaluationlist", evaluationlist);
		model.addAttribute("project", project);
		model.addAttribute("userMap1", userMap1);
		model.addAttribute("username", username);
				
		return "showEva";
		}
	}

/*	@RequestMapping("/uploadProductImage")
	public String uploadProImage(MultipartFile file,HttpServletRequest req,HttpServletResponse response) throws Exception {
		//MultipartFile file,HttpServletRequest request,HttpServletResponse response){  
	        response.setCharacterEncoding("utf-8");  
	        //String path = request.getServletContext().getRealPath("/images/book/");   
	      String path="f:/easyuidemoimage/";  
	        String fileName = file.getOriginalFilename();  //prefix  suffix  
	        String  suffix=fileName.substring(fileName.lastIndexOf("."));  
	      String newFileName=   UUID.randomUUID().toString()+suffix;  
	      File targetFile = new File(path, newFileName);  
	      if(!targetFile.exists()){    
	          targetFile.mkdirs();   
	      }    
	      try {    
	          file.transferTo(targetFile);    
	          System.out.println("上传成功:"+path+newFileName);  
	          response.getWriter().write("文件上传成功:"+path+newFileName);  
	      } catch (Exception e) {    
	          e.printStackTrace();    
	      }    
	     return null; 
    
	}*/
	/**
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/toUploadImage")
	public String toUploadImage(Model model,HttpServletRequest req){
		
   	    String projectUuid = req.getParameter("pro_uuid");
	 	
		model.addAttribute("projectUuid", projectUuid);
		
		return "uploadImage";
	}
	/**
	 * @author 张玉筱
	 */
	@RequestMapping("/uploadProductImage")
	public String uploadProImage(HttpServletRequest request,HttpServletResponse response)  throws IllegalStateException, IOException, InterruptedException{
		long startTime = System.currentTimeMillis();
/*		Integer pro_id = Integer.parseInt(request.getParameter("pro_id"));

		System.out.println("2:pro_id::"+pro_id);
		Project project = projectService.selectByPrimaryKey(pro_id);
		String pro_name = project.getPro_name();*/
//		Project project = new Project();
		String pro_uuid = request.getParameter("pro_uuid");
		Project project = projectService.projectDetail(pro_uuid);
		Product product = projectService.productDetailByProject(pro_uuid);
		//标记循环次数
		Integer remark = 0;
		
		String imagePath = null;
		// 将当前上下文初始化给 CommonsMutipartResolver （多部分解析器）
		CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
				request.getSession().getServletContext());
		// 检查form中是否有enctype="multipart/form-data"
		
		if (multipartResolver.isMultipart(request)) {
			// 将request变成多部分request
			MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest) request;
			// 获取multiRequest 中所有的文件名
			java.util.Iterator<String> iter = multiRequest.getFileNames();

			while (iter.hasNext()) {
				// 一次遍历所有文件
				MultipartFile file = multiRequest.getFile(iter.next().toString());
				if (file != null) {
					SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");  
					//文件名前缀
                    String preFileName = df.format(new Date()) + "_" + new Random().nextInt(1000);  
					/*String path = "D:\\workspace\\ventureassess\\src\\main\\webapp\\static\\adStyle\\img\\"+pro_name+"-" + file.getOriginalFilename();*/
					String path = "C:\\workspace\\ventureassess\\src\\main\\webapp\\static\\uStyle\\img\\" + preFileName + "-" + file.getOriginalFilename();
					// 上传
					//imagePath = pro_name+"-"+ file.getOriginalFilename();
					imagePath =  preFileName + "-" + file.getOriginalFilename();
					
					//project.setPro_type(imagePath);
					if(remark == 0){
						project.setPjLogo(imagePath);
						projectService.updateProjectSelective(project);
					}
					
					remark++;//循环数加一
					
					System.out.println(imagePath);
					//projectService.updateByPrimaryKeySelective(project);
					//model.addAttribute("imagePath", imagePath);
					Photo photo = new Photo();
					photo.setPhotoUuid(UUID.randomUUID().toString());
					photo.setPhotoUrl(imagePath);
					photo.setProductUuid(product.getProductUuid());
					photoMapper.insertSelective(photo);
					
					System.out.println(path);
					file.transferTo(new File(path));
				}

			}

		}
		long endTime = System.currentTimeMillis();
		System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
		Thread.sleep(5000);
		/*model.addAttribute("pro_id", pro_id);
		Thread.sleep(5000);*/
		return "";
    
	}
	/**
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/toMuliSearch")
	public String toMuliSearch(Model model,HttpServletRequest req){
		return "multi_search";
	}
	/**
	 * @author 张玉筱
	 */
	@RequestMapping("/muliSearch")
	public String muliSearch(HttpServletRequest req, Model model) throws Exception {
        Integer pageNum = Integer.parseInt(req.getParameter("pageNum"));
 		String proProjectname = req.getParameter("pro_projectname");
		String proProductname = req.getParameter("pro_productname");
		String proBackground = req.getParameter("pro_background");
		String proIndustry = "";
		String pro_totalvalue = req.getParameter("radio2");
		String pro_intech = req.getParameter("radio3");
		String pro_risk = req.getParameter("radio4");
		String[] checkBoxString = req.getParameterValues("checkbox2");
		Double proIntech = 0.00;
		Double proFundMax = 0.00;
		Double proFundMin = 0.00;
		Double proRiskMax = 0.00;
		Double proRiskMin = 0.00;
		Double proTotalvalue = 0.00;
		
		
		Double proInbus = 0.00;
		Double proInviro = 0.00;
		Double proProspect = 0.00;
		Double proIndus = 0.00;
		Double proOrgan = 0.00;
		Double proProduction = 0.00;
		Double proTeam = 0.00;
		//综合得分
		if(pro_totalvalue!=null && !pro_totalvalue.equals("")){
			proTotalvalue = Double.valueOf(pro_totalvalue);
		}
		//技术得分
		if(pro_intech!=null && !pro_intech.equals("")){
			proIntech = Double.valueOf(pro_intech);
		}
		
		//风险指数
		if(pro_risk!=null && !pro_risk.equals("")){
			if(pro_risk.equals("1")){//高风险高收益
				proFundMin = 9.00;
				proFundMax = 10.00;
				proRiskMin = 6.00;
				proRiskMax = 7.00;
			}if(pro_risk.equals("2")){//低风险中低收益
				proFundMin = 7.00;
				proFundMax = 9.00;
				proRiskMin = 8.50;
				proRiskMax = 10.00;
			}if(pro_risk.equals("3")){//中低风险稳收益
				proFundMin = 8.00;
				proFundMax = 9.00;
				proRiskMin = 7.00;
				proRiskMax = 8.50;
			}if(pro_risk.equals("4")) {//低风险高收益
				proFundMin = 9.00;
				proFundMax = 10.00;
				proRiskMin = 8.50;
				proRiskMax = 10.00;
			}
		}
		
		//其他指标
/*		System.out.println("checkbox::：：：");
		for(int i = 0; i < checkBoxString.length; i++){
	        System.out.print(checkBoxString[i] + ",");
	    }*/
		if(checkBoxString != null && checkBoxString.length!=0){
			for(int i = 0; i < checkBoxString.length; i++){
	            if(checkBoxString[i].equals("生产水平")){
	            	
	            	proProduction = 8.50;
	            	
				}if(checkBoxString[i].equals("商业模式")){
					
					proInbus = 8.50;
					
				}if(checkBoxString[i].equals("产业化能力")){
					
					proIndus = 8.50;
					
				}if(checkBoxString[i].equals("市场前景")){
					
					proProspect = 8.50;
					
				}if(checkBoxString[i].equals("市场环境")){
					
					proInviro = 8.50;
					
				}if(checkBoxString[i].equals("组织与管理")){
					
					proOrgan = 8.50;
					
				}if(checkBoxString[i].equals("团队水平")){
					
					proTeam = 8.50;
					
				}
			}
		}
		
	
		Integer recordCount = projectService.selectProjects(proProjectname, proProductname, proBackground, proIndustry, proIntech, proInbus, proInviro, proProspect, proIndus, proOrgan, proProduction, proFundMin, proFundMax, proTeam, proRiskMin, proRiskMax, proTotalvalue).size();
		Pager pager = new Pager(recordCount,pageNum);
 		List<ProIndicator> listProjects = projectService.listProjects(proProjectname, proProductname, proBackground, proIndustry, proIntech, proInbus, proInviro, proProspect, proIndus, proOrgan, proProduction, proFundMin, proFundMax, proTeam, proRiskMin, proRiskMax, proTotalvalue, pager);
 		List<Project> projects = new ArrayList<Project>();
 		for (ProIndicator p : listProjects) {
 			//System.out.println(p.getProProductname());
 			Project project  = projectService.projectDetail(p.getProUuid());
 			projects.add(project);
 		}
 		model.addAttribute("projects",projects);
 		model.addAttribute("pager", pager);
 		return "project_search";
		
	}
    /*---------------------------写到这里
     * **多条件检索项目
     */
/* // 检索项目---点击【搜索】按钮触发联合查询事件
 	@RequestMapping("/projectSearch")
 	public String projectSearch(HttpServletRequest req, Model model) throws Exception {
 		Integer pageNum = Integer.parseInt(req.getParameter("pageNum"));
		
		
 		String proProjectname = req.getParameter("pro_projectname");
		String proProductname = req.getParameter("pro_productname");
		String proBackground = req.getParameter("pro_background");
		String proIndustry = req.getParameter("pro_industry");
		
		String pro_intech = req.getParameter("pro_intech");
		Double proIntech = 0.00;
		if(pro_intech!=null && pro_intech!=""){
			proIntech = Double.valueOf(pro_intech);
		}
		String pro_inbus = req.getParameter("pro_inbus");
		Double proInbus = 0.00;
		if(pro_inbus!=null && pro_inbus!=""){
			proInbus = Double.valueOf(pro_inbus);
		}
		String pro_inviro = req.getParameter("pro_inviro");
		Double proInviro = 0.00;
		if(pro_inviro!=null && pro_inviro!=""){
			proInviro = Double.valueOf(pro_inviro);
		}
		String pro_prospect = req.getParameter("pro_prospect");
		Double proProspect = 0.00;
		if(pro_prospect!=null && pro_prospect!=""){
			proProspect = Double.valueOf(pro_prospect);
		}
		String pro_indus = req.getParameter("pro_indus");
		Double proIndus = 0.00;
		if(pro_indus!=null && pro_indus!=""){
			proIndus = Double.valueOf(pro_indus);
		}
		String pro_organ = req.getParameter("pro_organ");
		Double proOrgan = 0.00;
		if(pro_organ!=null && pro_organ!=""){
			proOrgan = Double.valueOf(pro_organ);
		}
		String pro_production = req.getParameter("pro_production");
		Double proProduction = 0.00;
		if(pro_production!=null && pro_production!=""){
			proProduction = Double.valueOf(pro_production);
		}
		String pro_fund = req.getParameter("pro_fund");
		Double proFund = 0.00;
		if(pro_fund!=null && pro_fund!=""){
			proFund = Double.valueOf(pro_fund);
		}
		String pro_team = req.getParameter("pro_team");
		Double proTeam = 0.00;
		if(pro_team!=null && pro_team!=""){
			proTeam = Double.valueOf(pro_team);
		}
		String pro_risk = req.getParameter("pro_risk");
		Double proRisk = 0.00;
		if(pro_risk!=null && pro_risk!=""){
			proRisk = Double.valueOf(pro_risk);
		}
		String pro_totalvalue = req.getParameter("pro_totalvalue");
		Double proTotalvalue = 0.00;
		if(pro_totalvalue!=null && pro_totalvalue!=""){
			proTotalvalue = Double.valueOf(pro_totalvalue);
		}
		Integer recordCount = projectService.selectProjects(proProjectname, proProductname, proBackground, proIndustry, proIntech, proInbus, proInviro, proProspect, proIndus, proOrgan, proProduction, proFund, proTeam, proRisk, proTotalvalue).size();
		Pager pager = new Pager(recordCount,pageNum);
 		List<ProIndicator> listProjects = projectService.listProjects(proProjectname, proProductname, proBackground, proIndustry, proIntech, proInbus, proInviro, proProspect, proIndus, proOrgan, proProduction, proFund, proTeam, proRisk, proTotalvalue, pager);
 		for (ProIndicator p : listProjects) {
 			System.out.println(p.getProProductname());
 		}
 		model.addAttribute("listProjects",listProjects);
 		model.addAttribute("pager", pager);
 		return "project_search";

 	}*/

 	/**
	 * 关注项目
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/focusOnPro")
	public String focusOnPro(HttpServletRequest req){
		String pageNum = req.getParameter("pageNum");
		String projectUuid = req.getParameter("project_uuid");
		User user = (User) req.getSession().getAttribute("user");
		Relation re = new Relation();
		re.setProjectUuid(projectUuid);
		re.setUserUuid(user.getUserUuid());
		Relation r = relationService.checkIsUniqueFocusPro(re);
		
		if(r==null){
			
			re.setReUuid(UUID.randomUUID().toString());
			re.setReType("关注项目");
			relationService.insertSelective(re);
		}
		
		return "redirect:login?pageNum="+pageNum;
	}
	
	/**
	 * 取消关注项目
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/NofocusOnPro")
	public String NofocusOnPro(HttpServletRequest req){
		
		User user = (User) req.getSession().getAttribute("user");
		String projectUuid = req.getParameter("project_uuid");
		Relation re = new Relation();
		re.setProjectUuid(projectUuid);
		re.setUserUuid(user.getUserUuid());
		Relation r = relationService.checkIsUniqueFocusPro(re);
		relationService.deleteByPrimaryKey(r.getReUuid());
		
		return "redirect:userInfo";
	}
}
