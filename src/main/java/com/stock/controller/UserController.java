package com.stock.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.pojo.News;
import com.stock.pojo.User;
import com.stock.service.NewsService;
import com.stock.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	@Autowired
	NewsService newsService;
	
	//关于我们
	@RequestMapping(value = "/toAboutMe")
	public String toAboutMe(Model model){
		return "toAboutMe";
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
	

}
