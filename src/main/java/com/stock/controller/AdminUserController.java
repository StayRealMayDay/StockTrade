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

import com.stock.mapper.StatisticsMapper;
import com.stock.mapper.UserMapper;

import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.StockMapper;
import com.stock.mapper.StockTypeMapper;
import com.stock.pojo.CompanyNews;

import com.stock.pojo.News;

import com.stock.pojo.StockType;
import com.stock.pojo.User;
import com.stock.service.NewsService;
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
	NewsService newsService;
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

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); // HH:mm:ss
		Date date = new Date(); // 今天的日期
		String today = sdf.format(date);
		String lastWeekDate = sdf.format(new Date(date.getTime() - 7 * 24 * 60 * 60 * 1000));// 上周时间
		String lastMonthDate = sdf.format(new Date(date.getTime() - 30 * 24 * 60 * 60 * 1000));// 上月时间

		model.addAttribute("stockNum", stockNum);
		model.addAttribute("newsNum", newsNum);
		model.addAttribute("userMap", userMap);
		model.addAttribute("userProMap", userProMap);
		model.addAttribute("wproMap", wproMap);
		model.addAttribute("indMap", indMap);
		model.addAttribute("mproMap", mproMap);
		model.addAttribute("indMap1", indMap1);
		return "adPage/adminHomePage";
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
	
}
