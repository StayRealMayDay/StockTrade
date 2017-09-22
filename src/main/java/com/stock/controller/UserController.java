package com.stock.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.pojo.DataDictionary;
import com.stock.pojo.LearnExperience;
import com.stock.pojo.News;
import com.stock.pojo.Project;
import com.stock.pojo.Relation;
import com.stock.pojo.Requirement;
import com.stock.pojo.User;
import com.stock.pojo.WorkExperience;
import com.stock.service.DataDictionaryService;
import com.stock.service.LearnExperienceService;
import com.stock.service.NewsService;
import com.stock.service.ProjectService;
import com.stock.service.RelationService;
import com.stock.service.RequirementService;
import com.stock.service.UserService;
import com.stock.service.WorkExperienceService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	NewsService newsService;
	@Autowired
	DataDictionaryService dataDictionaryService;
	@Autowired
	WorkExperienceService workExperienceService;
	@Autowired
	LearnExperienceService learnExperienceService;
	@Autowired
	RequirementService requirementService;
	@Autowired
	ProjectService projectService;
	@Autowired
	RelationService relationService;
	
	//关于我们
	@RequestMapping(value = "/toAboutMe")
	public String toAboutMe(Model model){
		return "toAboutMe";
	}
	//查看所有（more）项目
		@RequestMapping(value = "/selectPros")
		public String selectPros(Model model){
			List<Project> pros = projectService.selectAllProject();
			model.addAttribute("pros", pros);
			return "selectPros";
		}
	
	//查看所有（more）政策法规
		@RequestMapping(value = "/selectNews3")
		public String selectNews3(Model model){
			List<News> news3 = newsService.selectByNewsType("政策法规");
			model.addAttribute("news3", news3);
			return "selectNews3";
		}
	
	//查看所有（more）行业动态
		@RequestMapping(value = "/selectNews2")
		public String selectNews2(Model model){
			List<News> news2 = newsService.selectByNewsType("行业动态");
			model.addAttribute("news2", news2);
			return "selectNews2";
		}
	
	//查看所有（more）新闻动态
		@RequestMapping(value = "/selectNews1")
		public String selectNews1(Model model){
			List<News> news1 = newsService.selectByNewsType("新闻动态");
			model.addAttribute("news1", news1);
			return "selectNews1";
		}
	
	//查看所有（more）专家
	@RequestMapping(value = "/selectExperts")
	public String selectReq(Model model){
		List<User> experts = userService.selectUserByRole("评审专家");
		model.addAttribute("experts", experts);
		return "selectExperts";
	}
	
	//查看用户详细信息
	@RequestMapping(value = "/userDetail")
	public String userDetail(HttpServletRequest req,Model model){
		String userUuid = req.getParameter("user_uuid");
		User user= userService.selectUserByUuid(userUuid);
		model.addAttribute("user", user);
		return "userDetail";
	}
	
	//前台首页
	@RequestMapping(value = "/Index")
	public String Test(Model model){
		List<News> news1 = newsService.selectByNewsType("新闻动态");
        List<News> news2 = newsService.selectByNewsType("行业动态");
        List<News> news3 = newsService.selectByNewsType("政策法规");
        List<Project> pros = projectService.selectAllProject();
        List<Requirement> reqs = requirementService.selectAllRequirement();
        List<User> experts = userService.selectUserByRole("评审专家");
        
        model.addAttribute("news1", news1);
		model.addAttribute("news2", news2);
		model.addAttribute("news3", news3);
		model.addAttribute("pros", pros);
		model.addAttribute("experts", experts);
		model.addAttribute("reqs", reqs);
		return "Index";
	}
	
	
	/**
	 */
	@RequestMapping(value = "/toRegister")
	public String toRegister(Model model){
		List<DataDictionary> edulist = dataDictionaryService.selectByDdDatatype("学历");
		List<DataDictionary> senioritylist = dataDictionaryService.selectByDdDatatype("工作资历");
		List<DataDictionary> workyearlist = dataDictionaryService.selectByDdDatatype("工作年限");
		
		model.addAttribute("edulist", edulist);
		model.addAttribute("senioritylist", senioritylist);
		model.addAttribute("workyearlist", workyearlist);
		return "register";
	}
	
	
	/**
	 * 创业者注册
	 */
	@RequestMapping("/createrRegister")
	public String userRegister(HttpServletResponse res, HttpServletRequest req,Model model) throws Exception {
		//日期
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		java.util.Date date=new java.util.Date(); 
		String data = sdf.format(date);
		String creater_name = req.getParameter("creater_name");
		String creater_pwd = req.getParameter("creater_pwd");
		String creater_realname = req.getParameter("creater_realname");
		String creater_age = req.getParameter("creater_age");
		String creater_gender = req.getParameter("creater_gender");
		String creater_edu = req.getParameter("creater_edu");
		String creater_email = req.getParameter("creater_email");
		String creater_research = req.getParameter("creater_research");
		String creater_scientific = req.getParameter("creater_scientific");
		String creater_price = req.getParameter("creater_price");
		String creater_seniority = req.getParameter("creater_seniority");
		
		String creater_company = req.getParameter("creater_company");
		String creater_workyear = req.getParameter("creater_workyear");
		String creater_area = req.getParameter("creater_area");
		String creater_brief = req.getParameter("creater_brief");
			
		User user= new User();
        user.setUserUuid(UUID.randomUUID().toString());
        user.setUserName(creater_name);
        user.setUserPwd(creater_pwd);
        user.setUserRealname(creater_realname);
        user.setUserAge(creater_age);
        user.setUserGender(creater_gender);
        user.setUserEdu(creater_edu);
        user.setUserEmail(creater_email);
        user.setUserResearch(creater_research);
        user.setUserScientific(creater_scientific);
        user.setUserPrice(creater_price);
        user.setUserSeniority(creater_seniority);
        user.setUserCompany(creater_company);
        user.setUserWorkyear(creater_workyear);
        user.setUserArea(creater_area);
        user.setUserBrief(creater_brief);
        user.setUserFlag("创业者");
        user.setUserRegistTime(data);
        userService.insertSelective(user);
        
		return "u_login";
	
	}
	/**
	 * 基金经理注册
	 */
	@RequestMapping("/financerRegister")
	public String financerRegister(HttpServletResponse res, HttpServletRequest req,Model model) throws Exception {
		

		String financer_name = req.getParameter("financer_name");
		String financer_pwd = req.getParameter("financer_pwd");
		String financer_realname = req.getParameter("financer_realname");
		String financer_age = req.getParameter("financer_age");
		String financer_gender = req.getParameter("financer_gender");
		String financer_edu = req.getParameter("financer_edu");
		String financer_email = req.getParameter("financer_email");
		String financer_research = req.getParameter("financer_research");
		String financer_scientific = req.getParameter("financer_scientific");
		String financer_price = req.getParameter("financer_price");
		String financer_seniority = req.getParameter("financer_seniority");
		
		String financer_company = req.getParameter("financer_company");
		String financer_workyear = req.getParameter("financer_workyear");
		String financer_area = req.getParameter("financer_area");
		String financer_brief = req.getParameter("financer_brief");
			
		User user= new User();
        user.setUserUuid(UUID.randomUUID().toString());
        user.setUserName(financer_name);
        user.setUserPwd(financer_pwd);
        user.setUserRealname(financer_realname);
        user.setUserAge(financer_age);
        user.setUserGender(financer_gender);
        user.setUserEdu(financer_edu);
        user.setUserEmail(financer_email);
        user.setUserResearch(financer_research);
        user.setUserScientific(financer_scientific);
        user.setUserPrice(financer_price);
        user.setUserSeniority(financer_seniority);
        user.setUserCompany(financer_company);
        user.setUserWorkyear(financer_workyear);
        user.setUserArea(financer_area);
        user.setUserBrief(financer_brief);
        user.setUserFlag("基金经理");
        userService.insertSelective(user);
        
        return "u_login";
	}
	/**
	 * 专家注册
	 */
	@RequestMapping("/expertRegister")
	public String expertRegister(HttpServletResponse res, HttpServletRequest req,Model model) throws Exception {
		
		
		String expert_name = req.getParameter("expert_name");
		String expert_pwd = req.getParameter("expert_pwd");
		String expert_realname = req.getParameter("expert_realname");
		String expert_age = req.getParameter("expert_age");
		String expert_gender = req.getParameter("expert_gender");
		String expert_edu = req.getParameter("expert_edu");
		String expert_email = req.getParameter("expert_email");
		String expert_research = req.getParameter("expert_research");
		String expert_scientific = req.getParameter("expert_scientific");
		String expert_price = req.getParameter("expert_price");
		String expert_seniority = req.getParameter("expert_seniority");
		
		String expert_company = req.getParameter("expert_company");
		String expert_workyear = req.getParameter("expert_workyear");
		String expert_area = req.getParameter("expert_area");
		String expert_brief = req.getParameter("expert_brief");
			
		User user= new User();
        user.setUserUuid(UUID.randomUUID().toString());
        user.setUserName(expert_name);
        user.setUserPwd(expert_pwd);
        user.setUserRealname(expert_realname);
        user.setUserAge(expert_age);
        user.setUserGender(expert_gender);
        user.setUserEdu(expert_edu);
        user.setUserEmail(expert_email);
        user.setUserResearch(expert_research);
        user.setUserScientific(expert_scientific);
        user.setUserPrice(expert_price);
        user.setUserSeniority(expert_seniority);
        user.setUserCompany(expert_company);
        user.setUserWorkyear(expert_workyear);
        user.setUserArea(expert_area);
        user.setUserBrief(expert_brief);
        user.setUserFlag("评审专家");
        userService.insertSelective(user);
        
		return "u_login";
	
	}
	/**
	 * 根据email查询用户是否存在
	 * @throws IOException 
	 */
	@RequestMapping(value="/getEmailValidation")
	public void getEmailValidation(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		
		String email = req.getParameter("u_email");
		User user2 = userService.selectByEmail(email);
		
		PrintWriter out = resp.getWriter();//????
		if(user2 == null){
			System.out.println("邮箱重复验证：" + email + "的用户不存在");
			out.print("success");
		}else{
			System.out.println("邮箱重复验证：" + email + "的用户存在"+user2.toString());
			out.print("failure");
		}
	}
		
	/**
	 * 根据用户名查询用户是否存在
	 */
	@RequestMapping(value="/getNameValidation")
	public void getNameValidation(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		String name = req.getParameter("u_name");
		User user3 =userService.selectByName(name);
		
		PrintWriter out = res.getWriter();
		if(user3 != null){
			System.out.println("用户名重复验证：" + name + "的用户存在");
			out.print("success");
		}else{
			out.print("failure");
		}
	}
	@RequestMapping(value = "/toLogin")
	public String toLogin(Model model){
		
		List<News> news1 = newsService.selectByNewsType("新闻动态");
        List<News> news2 = newsService.selectByNewsType("行业动态");
        List<News> news3 = newsService.selectByNewsType("政策法规");
        List<Project> pros = projectService.selectAllProject();
		
        model.addAttribute("news1", news1);
		model.addAttribute("news2", news2);
		model.addAttribute("news3", news3);
		model.addAttribute("pros", pros);
		
		return "u_login";
	}
	/**
	 * 用户登录
	 * @param req
	 * @param resp
	 * @throws Exception
	 */
	@RequestMapping(value = "/checkUsernamePwd")
	public void checkUsernamePwd(HttpServletRequest req, HttpServletResponse resp,Model model) throws Exception{
		String username = req.getParameter("u_name");
		String userpwd = req.getParameter("u_pwd");
		User user = userService.userLogin(username,userpwd);
		PrintWriter out = resp.getWriter();		
			if(user != null){
				/*user = userService.selectByName(user.getUser_name());*/
				//System.out.println("登录:用户ID：" + user.getU_id());

				//req.getSession().setAttribute("u_id", user.getU_id());
				req.getSession().setAttribute("user", user);
				//System.out.println(user.toString());
				out.print("success");
				model.addAttribute("u_name", username);
				model.addAttribute("u_pwd", userpwd);
			}else{
				out.print("failure");
				model.addAttribute("u_name", username);
				model.addAttribute("u_pwd", userpwd);
			}
	}


	/**
	 * 查看个人信息
	 */
	@RequestMapping("/userInfo")
	public String userInfo(HttpServletRequest req, Model model){
     	User userr = (User) req.getSession().getAttribute("user");
	    
		if (null==userr) {
        	System.out.println("用户为空11111111");
        	return "u_login";
		}else {
		String user_uuid = userr.getUserUuid();
		User user = userService.selectByPrimaryKey(user_uuid);
		List<WorkExperience> wes = workExperienceService.selectByUserUUID(user_uuid);
		List<LearnExperience> les = learnExperienceService.selectByUserUUID(user_uuid);
		List<Requirement> reqs = requirementService.selectMyRequirement(user_uuid);
		List<Project> pros = projectService.selectMyProject(user_uuid);
		List<Project> pros1 = new ArrayList<Project>();
		List<Relation> relationspro = relationService.selectMyFocusPro(user_uuid);
		for (Relation relation : relationspro) {
			Project project = projectService.projectDetail(relation.getProjectUuid());
			pros1.add(project);
		}
		List<Requirement> reqs1 = new ArrayList<Requirement>();
		List<Relation> relationsreq = relationService.selectMyFocusReq(user_uuid);
		for (Relation relation : relationsreq) {
			Requirement requirement = requirementService.selectByPrimaryKey(relation.getReqUuid());
			reqs1.add(requirement);
		}
         
		model.addAttribute("user", user);	
		model.addAttribute("wes", wes);
		model.addAttribute("les", les);
		model.addAttribute("reqs", reqs);
		model.addAttribute("pros", pros);
		model.addAttribute("reqs1", reqs1);
		model.addAttribute("pros1", pros1);
		
		return "user_info";
		}
	}
	/**
	 */
	@RequestMapping(value = "/toEditUserinfo")
	public String toEditUserinfo(HttpServletRequest req, Model model){
		User userr = (User) req.getSession().getAttribute("user");
		if (null==userr) {
        	System.out.println("用户为空11111111");
        	return "u_login";
		}else {
	    String user_uuid = userr.getUserUuid();
		User user = userService.selectByPrimaryKey(user_uuid);
		List<WorkExperience> wes = workExperienceService.selectByUserUUID(user_uuid);
		List<LearnExperience> les = learnExperienceService.selectByUserUUID(user_uuid);
		List<DataDictionary> edulist = dataDictionaryService.selectByDdDatatype("学历");
		List<DataDictionary> senioritylist = dataDictionaryService.selectByDdDatatype("工作资历");
		List<DataDictionary> workyearlist = dataDictionaryService.selectByDdDatatype("工作年限");
		
		model.addAttribute("edulist", edulist);
		model.addAttribute("senioritylist", senioritylist);
		model.addAttribute("workyearlist", workyearlist);
		
		model.addAttribute("user", user);	
		model.addAttribute("wes", wes);
		model.addAttribute("les", les);
		return "edit_userinfo";
		}
	}
	
	/**
	 * 修改个人基本信息
	 */
	@RequestMapping(value = "/editUserInfo")
	public String editUserInfo(HttpServletRequest req, Model model){
		String user_uuid = req.getParameter("user_uuid");
		String user_realname = req.getParameter("user_realname");
		String user_age = req.getParameter("user_age");
		String user_gender = req.getParameter("user_gender");
		String user_edu = req.getParameter("user_edu");
		String user_email = req.getParameter("user_email");
		String user_research = req.getParameter("user_research");
		String user_scientific = req.getParameter("user_scientific");
		String user_price = req.getParameter("user_price");
		String user_seniority = req.getParameter("user_seniority");
		
		String user_company = req.getParameter("user_company");
		String user_workyear = req.getParameter("user_workyear");
		String user_area = req.getParameter("user_area");
		String user_brief = req.getParameter("user_brief");
			
		User user= new User();
        user.setUserUuid(user_uuid);

        user.setUserRealname(user_realname);
        user.setUserAge(user_age);
        user.setUserGender(user_gender);
        user.setUserEdu(user_edu);
        user.setUserEmail(user_email);
        user.setUserResearch(user_research);
        user.setUserScientific(user_scientific);
        user.setUserPrice(user_price);
        user.setUserSeniority(user_seniority);
        
        user.setUserCompany(user_company);
        user.setUserWorkyear(user_workyear);
        user.setUserArea(user_area);
        user.setUserBrief(user_brief);
        if(!(user_seniority.equals("有工作经验"))){
        	user.setUserCompany("");
            user.setUserWorkyear("");
        }
        userService.updateByPrimaryKeySelective(user);
        /*List<WorkExperience> wes = workExperienceService.selectByUserUUID(user_uuid);
		List<LearnExperience> les = learnExperienceService.selectByUserUUID(user_uuid);
        	
		model.addAttribute("wes", wes);
		model.addAttribute("les", les);
		model.addAttribute("user", user);*/
		return "redirect:userInfo";
	}
	/**
	 */
	@RequestMapping(value = "/addles")
	public String addles(HttpServletRequest req, Model model){
		User userr = (User) req.getSession().getAttribute("user");
	    String user_uuid = userr.getUserUuid();
		String lstart = req.getParameter("lstart");
		String lend = req.getParameter("lend");
		String lschool = req.getParameter("lschool");
		String ledu = req.getParameter("ledu");
		
		LearnExperience le = new LearnExperience();
		le.setLeUuid(UUID.randomUUID().toString());
		le.setLeStart(lstart);
		le.setLeEnd(lend);
        le.setLeSchool(lschool);
        le.setLeEdu(ledu);
        le.setUserUuid(user_uuid);
		
        learnExperienceService.insertSelective(le);
        
		return "redirect:toEditUserinfo";
	}
	/**
	 */
	@RequestMapping(value = "/updateles")
	public String updateles(HttpServletRequest req, Model model){
		String luuid = req.getParameter("luuid");
		String lstart = req.getParameter("lstart");
		String lend = req.getParameter("lend");
		String lschool = req.getParameter("lschool");
		String ledu = req.getParameter("ledu");
		
		LearnExperience le = new LearnExperience();
		le.setLeUuid(luuid);
		le.setLeStart(lstart);
		le.setLeEnd(lend);
        le.setLeSchool(lschool);
        le.setLeEdu(ledu);
		
        learnExperienceService.updateByPrimaryKeySelective(le);
		
		return "redirect:toEditUserinfo";
	}
	/**
	 */
	@RequestMapping(value = "/deleteles")
	public String deleteles(HttpServletRequest req, Model model){
		
		String luuid = req.getParameter("luuid");
		learnExperienceService.deleteByPrimaryKey(luuid);
		
		return "redirect:toEditUserinfo";
	}
	/**
	 */
	@RequestMapping(value = "/addwes")
	public String addwes(HttpServletRequest req, Model model){
		User userr = (User) req.getSession().getAttribute("user");
	    String user_uuid = userr.getUserUuid();
		String wstart = req.getParameter("wstart");
		String wend = req.getParameter("wend");
		String wcompany = req.getParameter("wcompany");
		String wrank = req.getParameter("wrank");
		
		WorkExperience we = new WorkExperience();
		we.setWeUuid(UUID.randomUUID().toString());
		we.setWeStart(wstart);
		we.setWeEnd(wend);
		we.setWeCompany(wcompany);
		we.setWeRank(wrank);
		we.setUserUuid(user_uuid);
		
		workExperienceService.insertSelective(we);
        
		return "redirect:toEditUserinfo";
	}
	/**
	 */
	@RequestMapping(value = "/updatewes")
	public String updatewes(HttpServletRequest req, Model model){
		String wuuid = req.getParameter("wuuid");
		String wstart = req.getParameter("wstart");
		String wend = req.getParameter("wend");
		String wcompany = req.getParameter("wcompany");
		String wrank = req.getParameter("wrank");
		
		WorkExperience we = new WorkExperience();
		we.setWeUuid(wuuid);
		we.setWeStart(wstart);
		we.setWeEnd(wend);
		we.setWeCompany(wcompany);
		we.setWeRank(wrank);
		
		workExperienceService.updateByPrimaryKeySelective(we);
		
		return "redirect:toEditUserinfo";
	}
	/**
	 */
	@RequestMapping(value = "/deletewes")
	public String deletewes(HttpServletRequest req, Model model){
		
		String wuuid = req.getParameter("wuuid");
		workExperienceService.deleteByPrimaryKey(wuuid);
		
		return "redirect:toEditUserinfo";
	}
	
}
