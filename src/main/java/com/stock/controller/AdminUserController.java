package com.stock.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.IndustryMapper;
import com.stock.mapper.LearnExperienceMapper;
import com.stock.mapper.NewsMapper;
import com.stock.mapper.ProductMapper;
import com.stock.mapper.ProjectMapper;
import com.stock.mapper.RelationMapper;
import com.stock.mapper.RequirementMapper;
import com.stock.mapper.RoleMapper;
import com.stock.mapper.StatisticsMapper;
import com.stock.mapper.UserMapper;
import com.stock.mapper.UserRoleMapper;
import com.stock.mapper.WorkExperienceMapper;
import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.StockMapper;
import com.stock.mapper.StockTypeMapper;
import com.stock.pojo.CompanyNews;
import com.stock.pojo.DataDictionary;
import com.stock.pojo.Industry;
import com.stock.pojo.LearnExperience;
import com.stock.pojo.News;
import com.stock.pojo.Product;
import com.stock.pojo.Project;
import com.stock.pojo.Relation;
import com.stock.pojo.Requirement;
import com.stock.pojo.Role;
import com.stock.pojo.StockType;
import com.stock.pojo.User;
import com.stock.pojo.UserRole;
import com.stock.pojo.WorkExperience;
import com.stock.service.DataDictionaryService;
import com.stock.service.NewsService;
import com.stock.service.ProjectService;
import com.stock.service.RequirementService;
import com.stock.service.UserService;
import com.stock.utils.Pager;

import net.sf.json.JSONArray;

@Controller
public class AdminUserController {
	@Autowired
	UserService userService;
	@Autowired
	UserMapper userMapper;
	@Autowired
	RoleMapper roleMapper;
	@Autowired
	UserRoleMapper userRoleMapper;
	@Autowired
	ProjectMapper projectMapper;
	@Autowired
	RelationMapper relationMapper;
	@Autowired
	ProjectService projectService;
	@Autowired
	RequirementService requirementService;
	@Autowired
	RequirementMapper requirementMapper;
	@Autowired
	NewsService newsService;
	@Autowired
	LearnExperienceMapper learnExperienceMapper;
	@Autowired
	WorkExperienceMapper workExperienceMapper;
	@Autowired
	ProductMapper productMapper;
	@Autowired
	IndustryMapper industryMapper;
	@Autowired
	DataDictionaryService dataDictionaryService;
	@Autowired
	StockMapper stockMapper;
	@Autowired
	CompanyNewsMapper companyNewsMapper;
	@Autowired
	StatisticsMapper statisticsMapper;
	@Autowired
	StockTypeMapper stockTypeMapper;
	/**
	 * 验证用户名、密码以及用户状态
	 * 
	 * @param req
	 * @param resp
	 * @param model
	 * @throws Exception
	 */
	@RequestMapping(value = "/checkAdminnamePwd")
	public void checkAdminnamePwd(HttpServletRequest req, HttpServletResponse resp, Model model) throws Exception {
		String user_name = req.getParameter("a_name").trim();
		System.out.println(user_name);
		String user_pwd = req.getParameter("a_pwd").trim();
		System.out.println(user_pwd);

		User user = userService.adminUserLogin(user_name, user_pwd);
		System.out.println(user == null);
		PrintWriter out = resp.getWriter();

		if (user != null) {
			user = userService.selectByName(user_name);
			req.getSession().setAttribute("user", user);
			System.out.println(user.toString());
			out.print("success");
			model.addAttribute("a_name", user_name);
			model.addAttribute("a_pwd", user_pwd);
		} else {
			out.print("failure");
			model.addAttribute("a_name", user_name);
			model.addAttribute("a_pwd", user_pwd);
		}

	}

	/**
	 * 后台管理员主页
	 * @author tcf
	 * @return
	 */
	@SuppressWarnings("unchecked")
	@RequestMapping("adminLogin")
	public String adminLogin(HttpServletRequest req, HttpServletResponse resp, Model model) {
		// 统计系统用户总量
		List<User> allUserList = userMapper.selectAllUsers();
		Map<String, String> userProMap = new HashMap<String, String>();
		Map<String, String> userMap = new HashMap<String, String>();
		Map<String, String> wproMap = new HashMap<String, String>();
		Map<String, String> mproMap = new HashMap<String, String>();
		Map<String, String> indMap = new HashMap<String, String>();
		Map<String, String> indMap1 = new HashMap<String, String>();
		Integer allUsersNum = allUserList.size() - 1;
		System.out.println("系统用户的总量：" + allUsersNum);
		//热点新闻
		List<CompanyNews> hotNewsList = companyNewsMapper.getHotNews();
		model.addAttribute("hotNewsList", hotNewsList);
		int stockNum = 0;
		int newsNum = 0;
		//统计股票总量
		stockNum = stockMapper.selectAllStock().size();
		//统计新闻总量
		newsNum = statisticsMapper.selectStatisticsNum("news_num");
		//查询股票类型
		List<StockType> stockTypesList2 = stockTypeMapper.selectStockTypesByFlag("conception");
		List<StockType> stockTypesList3 = stockTypeMapper.selectStockTypesByFlag("area");
		model.addAttribute("stockTypesList2", stockTypesList2);
		model.addAttribute("stockTypesList3", stockTypesList3);
//		int entrepreneurNum = 0;
//		int fundManager = 0;
//		for (User user : allUserList) {
//			String user_flag = user.getUserFlag();
//			if (user_flag.equals("创业者")) {
//				entrepreneurNum++;
//			} else if (user_flag.equals("基金经理")) {
//				fundManager++;
//			} else {
//				System.out.println("你是管理员");
//			}
//		}
		// 统计产品-项目总量
		int product_project = 0;
		product_project = projectMapper.selectAllProject().size();
		// 统计被关注的产品-项目总量
		int relationProject = 0;
		relationProject = relationMapper.selectAllRealation().size();

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // HH:mm:ss
		Date date = new Date(); // 今天的日期
		String today = sdf.format(date);
		String lastWeekDate = sdf.format(new Date(date.getTime() - 7 * 24 * 60 * 60 * 1000));// 上周时间
		String lastMonthDate = sdf.format(new Date(date.getTime() - 30 * 24 * 60 * 60 * 1000));// 上月时间
		// 1.最近发布的产品-项目
		List<Project> weekProjectList = projectService.selectLastWeekProject(lastWeekDate, today);
		List<Project> allProject = projectMapper.selectAllProject();
		if (allProject.size() != 0) {
			userProMap = getProUserName(allProject);
		} else {
			userProMap = null;
		}
		// 2.最近发布的项目需求
		List<Requirement> allRequirement = requirementMapper.selectAllReq();
		List<Requirement> weekRequirementList = requirementService.selectLastWeekRequirement(lastWeekDate, today);
		userMap = getUserName(allRequirement);
		// 3.热门需求

		// 4.热门产品-项目
		List<Relation> allRelationList = relationMapper.selectAllRealation();
		List<Relation> hotPro = new ArrayList<Relation>();
		for (Relation relation : allRelationList) {
			if (relation.getReType().equals("关注项目")) {
				hotPro.add(relation);
			}
		}
		List<String> proName = new ArrayList<String>();
		for (Relation relation : hotPro) {
			proName.add(relation.getProjectUuid());
		}
		// 计算List中所有对象出现的次数
		Set uniqueSet = new HashSet(proName);
		for (Object temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(proName, temp));
			Integer size = Collections.frequency(proName, temp);
		}
		// 5.最近发布的新闻
		List<News> weekNewsList = newsService.selectLastWeekNews(lastWeekDate, today);
		// 6.最近一周未未被关注的成果-项目
		List<Relation> weekNoPro = projectService.selectWeekNoCare(lastWeekDate, today);
		List<Project> rpn = new ArrayList<Project>();
		for (int i = 0; i < weekNoPro.size() - 1; i++) {
			for (int j = weekNoPro.size() - 1; j > i; j--) {
				if(weekNoPro.get(i).getProjectUuid() != null&& weekNoPro.get(j).getProjectUuid() != null){
				if (weekNoPro.get(j).getProjectUuid().equals(weekNoPro.get(i).getProjectUuid())) {
					weekNoPro.remove(j);
				} else {
					break;
				}
				}else{
					if(weekNoPro.get(i).getProjectUuid() == null){
						weekNoPro.remove(i);
					}else{
						weekNoPro.remove(j);
					}
				}
			}
		}
		for (Relation relation : weekNoPro) {
			Project project2 = projectMapper.selectByPrimaryKey(relation.getProjectUuid());
			rpn.add(project2);
		}
		if (rpn.size() != 0) {
			wproMap = getProUserName(rpn);
			indMap = getProInd(rpn);
		} else {
			wproMap = null;
			indMap = null;
		}
		// 7.最近一月未未被关注的成果-项目
		List<Relation> monthNoPro = projectService.selectMonthNoCare(lastMonthDate, today);
		List<Project> rmp = new ArrayList<Project>();
		for (int i = 0; i < monthNoPro.size() - 1; i++) {
			for (int j = monthNoPro.size() - 1; j > i; j--) {
				if(monthNoPro.get(i).getProjectUuid() != null&&monthNoPro.get(j).getProjectUuid() != null){
				if (monthNoPro.get(j).getProjectUuid().equals(monthNoPro.get(i).getProjectUuid())) {
					monthNoPro.remove(j);
				} else {
					break;
				}
				}else{
					if(monthNoPro.get(i).getProjectUuid()==null){
						monthNoPro.remove(i);
					}else{
						monthNoPro.remove(j);
					}	
				}
			}
		}
		for (Relation relation : monthNoPro) {
			Project project3 = projectMapper.selectByPrimaryKey(relation.getProjectUuid());
			rmp.add(project3);
		}
		mproMap = getProUserName(rmp);
		indMap1 = getProInd(rmp);

		// 8.统计所有的用户
		// 9.统计所有的产品-项目

		// 10.统计所有的被关注的成果-项目

		// 11.统计最近一周未登录的用户

		// 12.用户ID-用户名
		
		model.addAttribute("stockNum", stockNum);
		model.addAttribute("newsNum", newsNum);
//		model.addAttribute("entrepreneurNum", entrepreneurNum);
//		model.addAttribute("fundManager", fundManager);
		model.addAttribute("product_project", product_project);
		model.addAttribute("relationProject", relationProject);
		model.addAttribute("weekProjectList", weekProjectList);
		model.addAttribute("weekRequirementList", weekRequirementList);
		model.addAttribute("weekNewsList", weekNewsList);
		model.addAttribute("userMap", userMap);
		model.addAttribute("userProMap", userProMap);
		model.addAttribute("weekNoPro", weekNoPro);
		model.addAttribute("monthNoPro", monthNoPro);
		model.addAttribute("rpn", rpn);
		model.addAttribute("wproMap", wproMap);
		model.addAttribute("indMap", indMap);
		model.addAttribute("rmp", rmp);
		model.addAttribute("mproMap", mproMap);
		model.addAttribute("indMap1", indMap1);
		return "adPage/adminHomePage";
	}

	// 根据用户ID查找用户名
	public Map<String, String> getUserName(List<Requirement> allRequirement) {
		Map<String, String> usermap = new HashMap<String, String>();
		User user = new User();
		// List<User> allUsers = userMapper.selectAllUsers();
		for (int i = 0; i < allRequirement.size(); i++) {
			user = userMapper.selectByPrimaryKey(allRequirement.get(i).getUserUuid());
			usermap.put(allRequirement.get(i).getUserUuid(), user.getUserName());
		}
		return usermap;
	}

	// 根据用户ID查找用户名
	public Map<String, String> getProUserName(List<Project> allProject) {
		Map<String, String> usermap = new HashMap<String, String>();
		User user = new User();
		for (int i = 0; i < allProject.size(); i++) {
			user = userMapper.selectByPrimaryKey(allProject.get(i).getUserUuid());
			usermap.put(allProject.get(i).getUserUuid(), user.getUserName());
		}
		return usermap;
	}

	// 根据proID查询项目名称
	public Map<String, String> getProName(List<Relation> relations) {
		Map<String, String> promap = new HashMap<String, String>();
		Project project = new Project();
		for (int i = 0; i < relations.size(); i++) {
			project = projectMapper.selectByPrimaryKey(relations.get(i).getProjectUuid());
			promap.put(relations.get(i).getProjectUuid(), project.getPjName());
		}
		return promap;
	}

	// 根据用户ID查询用户名
	public Map<String, String> getRUserName(List<Relation> allProject) {
		Map<String, String> usermap = new HashMap<String, String>();
		User user = new User();
		// List<User> allUsers = userMapper.selectAllUsers();
		for (int i = 0; i < allProject.size(); i++) {
			user = userMapper.selectByPrimaryKey(allProject.get(i).getUserUuid());
			usermap.put(allProject.get(i).getUserUuid(), user.getUserName());
		}
		return usermap;
	}

	/***
	 * 按照项目ID查询所属行业
	 */
	public Map<String, String> getProInd(List<Project> proList) {
		Map<String, String> indmap = new HashMap<String, String>();
		Industry industry = new Industry();
		for (int i = 0; i < proList.size(); i++) {
			industry = industryMapper.selectByPrimaryKey(proList.get(i).getPjIndustry());
			indmap.put(proList.get(i).getPjIndustry(), industry.getiName());
		}
		return indmap;

	}

	/**
	 * 根据email查询用户是否存在
	 * 
	 * @author
	 * @throws IOException
	 */
	@RequestMapping(value = "/adminGetEmailValidation")
	public void adminGetEmailValidation(HttpServletRequest req, HttpServletResponse resp) throws IOException {

		String email = req.getParameter("u_email");
		User user2 = userService.selectByEmail(email);

		PrintWriter out = resp.getWriter();// ????
		if (user2 == null) {
			System.out.println("邮箱重复验证：" + email + "的用户不存在");
			out.print("success");
		} else {
			System.out.println("邮箱重复验证：" + email + "的用户存在" + user2.toString());
			out.print("failure");
		}
	}

	/**
	 * 根据用户名查询用户是否存在
	 * 
	 * @author
	 */
	@RequestMapping(value = "/adminGetNameValidationation")
	public void adminGetNameValidationation(HttpServletRequest req, HttpServletResponse res) throws IOException {

		String name = req.getParameter("userName");
		User user3 = userService.selectByName(name);

		PrintWriter out = res.getWriter();
		if (user3 != null) {
			System.out.println("用户名重复验证：" + name + "的用户存在");
			out.print("success");
		} else {
			out.print("failure");
		}
	}

	/**
	 * 增加用户-进入增加用户页面
	 */
	@RequestMapping(value = "/adminAddUser")
	public String addUser(HttpServletRequest req, HttpServletResponse resp, Model model) {
		return "adPage/adminAddUser";
	}

	@RequestMapping(value = "/addUserRole1")
	public String addUserRole1() {
		return "adPage/addUserRole";
	}

	@RequestMapping(value = "/addUserRole2")
	public String addUserRole2(HttpServletRequest req, HttpServletResponse resp, Model model)
			throws UnsupportedEncodingException {
		req.setCharacterEncoding("UTF-8");
		String roleName = req.getParameter("roleName");
		System.out.println(roleName);
		String roleDescription = req.getParameter("roleDescription");
		Role role = new Role();
		role.setRoleUuid(UUID.randomUUID().toString());
		role.setRoleName(roleName);
		role.setRoleDescription(roleDescription);
		userService.addUserRole(role);
		return "adPage/success";
	}

	/**
	 * 增加用户-点击【注册】按钮进行的操作
	 */
	@RequestMapping(value = "/userRegister")
	public String userRegister(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String userName = req.getParameter("userName");
		String userEmail = req.getParameter("userEmail");
		String userPwd = req.getParameter("userPwd");
		String userRealname = req.getParameter("userRealname");
		String userGender = req.getParameter("userGender");
		String userAge = req.getParameter("userAge");
		// 获取用户注册的用户角色 0.创业者；1、基金经理
		Integer userRole = Integer.parseInt(req.getParameter("userRole"));

		String userArea = req.getParameter("userArea");
		String userSeniority = req.getParameter("userSeniority");
		String userEdu = req.getParameter("userEdu");

		String userScientific = req.getParameter("userScientific");
		String userCompany = req.getParameter("userCompany");
		String userWorkyear = req.getParameter("userWorkyear");
		String userResearch = req.getParameter("userResearch");

		User user = new User();
		String userUuid = UUID.randomUUID().toString();
		user.setUserUuid(userUuid);
		user.setUserName(userName);
		user.setUserEmail(userEmail);
		user.setUserPwd(userPwd);
		user.setUserRealname(userRealname);
		user.setUserGender(userGender);
		user.setUserAge(userAge);
		user.setUserArea(userArea);
		user.setUserSeniority(userSeniority);
		user.setUserEdu(userEdu);
		user.setUserScientific(userScientific);
		user.setUserCompany(userCompany);
		user.setUserWorkyear(userWorkyear);
		user.setUserResearch(userResearch);
		// 获取当前时间
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");// 设置日期格式
		String userRegistTime = df.format(new Date());
		user.setUserRegistTime(userRegistTime);
		
		UserRole userRole2 = new UserRole();
		String roleName = null;
		if (userRole == 0) {
			roleName = "创业者";
			userRole2.setUserRoleUuid(UUID.randomUUID().toString());
			userRole2.setUserUuid(userUuid);
			userRole2.setRoleUuid(roleMapper.selectByRoleUuid(roleName).getRoleUuid());
			user.setUserFlag("创业者");
			// roleMapper.se
		} else if (userRole == 1) {
			roleName = "基金经理";
			userRole2.setUserRoleUuid(UUID.randomUUID().toString());
			userRole2.setUserUuid(userUuid);
			userRole2.setRoleUuid(roleMapper.selectByRoleUuid(roleName).getRoleUuid());
			user.setUserFlag("基金经理");
		}
		userMapper.insert(user);
		System.out.println("添加用户成功！");
		userRoleMapper.insert(userRole2);
		System.out.println("插入用户-角色成功！");
		return "redirect:allUsers?pageNum="+1;
	}

	/**
	 * 查看用户信息
	 */
	@RequestMapping(value = "/userInfo111")
	public String userInfo(HttpServletRequest req, HttpServletResponse resp, Model model) {
		/*
		 * String userUuid = req.getParameter("userUuid"); User user =
		 * userMapper.selectByPrimaryKey(userUuid); model.addAttribute("user",
		 * user);
		 */
		return "adPage/adminUserInfo";
	}

	/**
	 * 查看所有的用户
	 */
	@RequestMapping(value = "/allUsers")
	public String allUsers(HttpServletRequest req, HttpServletResponse resp, Model model) {
		int recordCount = userMapper.selectAllUsers().size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum);
		List<User> listAllUsersByPager = userService.selectAllUsersByPager(pager);
		List<User> entrepreneurList = new ArrayList<User>();
		List<User> fundManager = new ArrayList<User>();
		/*
		 * for (User user : listAllUsersByPager) {
		 * //通过用户UUID在user_role表查询role_UUID String roleUuid =
		 * userRoleMapper.selectRoleUuidByUuid(user.getUserUuid()).getRoleUuid()
		 * ; //通过获取的角色UUID获取角色名称 String roleName =
		 * roleMapper.selectByPrimaryKey(roleUuid).getRoleName();
		 * if(roleName=="创业者"){ entrepreneurList.add(user); }else
		 * if(roleName=="基金经理"){ fundManager.add(user); } }
		 */
		model.addAttribute("pager", pager);
		model.addAttribute("listAllUsersByPager", listAllUsersByPager);
		model.addAttribute("entrepreneurList", entrepreneurList);
		model.addAttribute("fundManager", fundManager);
		/* JSONArray jsonArray2 = JSONArray.fromObject(entrepreneurList); */
		return "adPage/adminUserManage";
	}

	/**
	 * 删除用户
	 */
	@RequestMapping(value = "/deleteUsers")
	public String deleteUsers(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String userUuid = req.getParameter("userUuid");
		userMapper.deleteByPrimaryKey(userUuid);
		return "allUsers?pageNum=1";
	}

	/**
	 * 编辑用户信息-进入页面
	 */
	@RequestMapping(value = "/adminEditUserInfo")
	public String adminEditUserInfo(HttpServletRequest req, HttpServletResponse resp, Model model){
		String userUuid = req.getParameter("userUuid");
		User user = userMapper.selectByPrimaryKey(userUuid);
		model.addAttribute("user", user);
		return "adPage/adminProjectItem";
	}
	/**
	 * 提交编辑用户信息
	 */
	@RequestMapping("/")
	public String adminEditUserInfo2(HttpServletRequest req, HttpServletResponse resp, Model model){
		
		return"";
	}
	/**
	 * 查看个人信息
	 */
	@RequestMapping(value = "/selectUserInfo")
	public String selectUserInfo(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String userUuid = req.getParameter("userUuid");
		User user = userMapper.selectByPrimaryKey(userUuid);
		// 根据ID查找个人学习经历
		List<LearnExperience> leList = learnExperienceMapper.selectLEByUserUuid(userUuid);
		// 根据ID查找个人工作经历
		List<WorkExperience> weList = workExperienceMapper.selectWEByUserUuid(userUuid);
		// 根据个人ID查找个人创建的项目
		List<Project> listCreatePro = projectMapper.selectAllProByUserUuid(userUuid);
		// 根据pro的Uuid查找包含的产品
		List<Product> listProductService = new ArrayList<Product>();
		// 有问题
		for (Project project : listCreatePro) {
			Product product = productMapper.selectProductByProUuid(project.getProjectUuid());
			listProductService.add(product);
		}
		//在数据字典查找所有学历
		List<DataDictionary> edulist = dataDictionaryService.selectByDdDatatype("学历");
		// 根据个人UUID查找关注的需求
		
		model.addAttribute("user", user);
		model.addAttribute("leList", leList);
		model.addAttribute("weList", weList);
		model.addAttribute("listCreatePro", listCreatePro);
		model.addAttribute("listProductService", listProductService);
		model.addAttribute("edulist", edulist);
		return "adPage/adminUserInfo";
	}

	// 验证旧密码的正确性
	@RequestMapping(value = "/checkUserPWD")
	public void checkUserPWD(HttpServletRequest req, HttpServletResponse res, Model model) throws IOException {
		String a_pwd = req.getParameter("a_pwd").trim();
		String userUuid = req.getParameter("userUuid");
		User user = userMapper.selectByPrimaryKey(userUuid);
		PrintWriter out = res.getWriter();
		if (user.getUserPwd().equals(a_pwd)) {
			System.out.println("旧密码正确！");
			out.print("success");
		} else {
			System.out.println("旧密码错误");
			out.print("failure");
		}
	}

	// 修改用户的登录密码
	@RequestMapping(value = "/adminUpdatePwd")
	public String adminUpdatePwd(HttpServletRequest req, HttpServletResponse res, Model model) {
		String userUuid = req.getParameter("userUuid");
		String userPwd = req.getParameter("userPwd");
		User user = new User();
		user.setUserUuid(userUuid);
		user.setUserPwd(userPwd);
		userMapper.updateByPrimaryKeySelective(user);
		return "redirect:selectUserInfo?userUuid=" + userUuid;
	}

	/**
	 * 统计系统用户总量
	 */
	public String adminStatisticsUser(HttpServletRequest req, HttpServletResponse resp, Model model) {
		List<User> allUserList = userMapper.selectAllUsers();
		Integer allUsersNum = allUserList.size() - 1;
		System.out.println("系统用户的总量：" + allUsersNum);
		Integer entrepreneurNum = null;
		Integer fundManager = null;
		for (User user : allUserList) {
			String user_flag = user.getUserFlag();
			if (user_flag.equals("创业者")) {
				user_flag = "创业者";
				entrepreneurNum++;
			} else if (user_flag.equals("基金经理")) {
				user_flag = "基金经理";
				fundManager++;
			}
		}
		System.out.println("系统创业者用户的总量：" + allUsersNum);
		System.out.println("系统基金经理用户的总量：" + allUsersNum);
		return "";
	}

	/**
	 * 退出系统
	 */
	@RequestMapping(value = "/adminLoginOut")
	public String adminLoginOut(HttpServletRequest req, HttpServletResponse res, Model model) {
		req.getSession().removeAttribute("user");
		return "redirect:adminLogin.jsp";
	}

	/**
	 * 验证用户是否登录
	 * 
	 * @param req
	 * @param res
	 * @throws IOException
	 * @author 筱湮
	 */
	@RequestMapping(value = "/logined")
	public void logined(HttpServletRequest req, HttpServletResponse res) throws IOException {

		User user = (User) req.getSession().getAttribute("user");
		PrintWriter out = res.getWriter();
		if (user != null) {
			out.print("success");
		} else {
			out.print("failure");
		}
	}
	/**
	 * 添加个人教育经历
	 */
	@RequestMapping("/adminAddLearnExperience")
	public String adminAddLearnExperience(HttpServletRequest req, HttpServletResponse res, Model model){	
		String userUuid = req.getParameter("userUuid1");
		String leStart = req.getParameter("leStart");
		String leSchool = req.getParameter("leSchool");
		String leEdu = req.getParameter("leEdu");
		String leEnd = req.getParameter("leEnd");
		LearnExperience learnExperience = new LearnExperience();
		learnExperience.setLeUuid(UUID.randomUUID().toString());
		learnExperience.setLeStart(leStart);
		learnExperience.setLeSchool(leSchool);
		learnExperience.setLeEdu(leEdu);
		learnExperience.setLeEnd(leEnd);
		learnExperience.setUserUuid(userUuid);
		learnExperienceMapper.insertSelective(learnExperience);
		System.out.println("插入学习经历成功！");
		return "redirect:selectUserInfo?userUuid="+userUuid;
		
	}
	/**
	 * 删除学习经历
	 */
	@RequestMapping("/adminDeleteLearnExperience")
	public String adminDeleteLearnExperience(HttpServletRequest req, HttpServletResponse res, Model model){	
		String leUuid = req.getParameter("leUuid");
		learnExperienceMapper.deleteByPrimaryKey(leUuid);
		String userUuid = req.getParameter("userUuid1");
		return "redirect:selectUserInfo?userUuid="+userUuid;
	}
	/**
	 * 修改学习经历
	 */
	@RequestMapping("/adminEditLearnExperience")
	public String adminEditLearnExperience(HttpServletRequest req, HttpServletResponse res, Model model){
		String leUuid = req.getParameter("leUuid2");
		String userUuid = req.getParameter("userUuid2");
		String leStart = req.getParameter("leStart");
		String leSchool = req.getParameter("leSchool");
		String leEdu = req.getParameter("leEdu");
		String leEnd = req.getParameter("leEnd");
		LearnExperience learnExperience = new LearnExperience();
		learnExperience.setLeUuid(leUuid);
		learnExperience.setUserUuid(userUuid);
		learnExperience.setLeStart(leStart);
		learnExperience.setLeSchool(leSchool);
		learnExperience.setLeEdu(leEdu);
		learnExperience.setLeEnd(leEnd);
		learnExperienceMapper.updateByPrimaryKeySelective(learnExperience);
		return "redirect:selectUserInfo?userUuid="+userUuid;
	}
	/**
	 * 添加工作经历
	 */
	@RequestMapping("/adminAddWorkExperience")
	public String adminAddWorkExperience(HttpServletRequest req, HttpServletResponse res, Model model){
		String userUuid = req.getParameter("userUuid3");
		String weStart = req.getParameter("weStart");
		String weEnd = req.getParameter("weEnd");
		String weCompany = req.getParameter("weCompany");
		String weRank = req.getParameter("weRank");
		WorkExperience workExperience = new WorkExperience();
		workExperience.setWeUuid(UUID.randomUUID().toString());
		workExperience.setUserUuid(userUuid);
		workExperience.setWeStart(weStart);
		workExperience.setWeCompany(weCompany);
		workExperience.setWeRank(weRank);
		workExperience.setWeEnd(weEnd);
		workExperienceMapper.insertSelective(workExperience);
		return "redirect:selectUserInfo?userUuid="+userUuid;
	}
	/**
	 * 删除个人工作经历
	 */
	@RequestMapping("/adminDeletetWorkExperience")
	public String adminDeletetWorkExperience(HttpServletRequest req, HttpServletResponse res, Model model){
		String weUuid = req.getParameter("weUuid");
		String userUuid = req.getParameter("userUuid4");
		workExperienceMapper.deleteByPrimaryKey(weUuid);
		return "redirect:selectUserInfo?userUuid="+userUuid;
	}
	/**
	 * 修改个人工作经历
	 */
	@RequestMapping("/adminEditWorkExperience")
	public String adminEditWorkExperience(HttpServletRequest req, HttpServletResponse res, Model model){
		String weUuid = req.getParameter("weUuid");
		String weStart = req.getParameter("weStart");
		String weEnd = req.getParameter("weEnd");
		String weCompany = req.getParameter("weCompany");
		String weRank = req.getParameter("weRank");
		String userUuid = req.getParameter("userUuid5");
		WorkExperience workExperience = new WorkExperience();
		workExperience.setWeUuid(weUuid);
		workExperience.setWeStart(weStart);
		workExperience.setWeCompany(weCompany);
		workExperience.setWeRank(weRank);
		workExperience.setWeEnd(weEnd);
		workExperience.setUserUuid(userUuid);
		workExperienceMapper.insertSelective(workExperience);
		return "redirect:selectUserInfo?userUuid="+userUuid;
	}
}
