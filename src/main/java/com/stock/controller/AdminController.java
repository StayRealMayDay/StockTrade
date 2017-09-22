package com.stock.controller;

import java.io.File;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.lang.ProcessBuilder.Redirect;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.enterprise.inject.New;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.MultipartStream.MalformedStreamException;
import org.apache.mahout.common.distance.MahalanobisDistanceMeasure;
import org.aspectj.weaver.bcel.BcelWeavingSupport;
import org.codehaus.jettison.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import com.ibm.icu.text.Normalizer.Mode;
import com.stock.mapper.CompanyMapper;
import com.stock.mapper.EvaOptionMapper;
import com.stock.mapper.IndicatorMapper;
import com.stock.mapper.NewsMapper;
import com.stock.mapper.RequirementMapper;
import com.stock.pojo.Company;
import com.stock.pojo.EvaOption;
import com.stock.pojo.Indicator;
import com.stock.pojo.News;
import com.stock.pojo.Requirement;
import com.stock.pojo.User;
import com.stock.service.AdminService;
import com.stock.service.CompanyService;
import com.stock.service.RequirementService;
import com.stock.service.UserService;
import com.stock.utils.Pager;

import net.sf.json.JSONObject;

@Controller
public class AdminController {
	@Autowired
	NewsMapper newsMapper;
	@Autowired
	AdminService adminService;
	@Autowired
	IndicatorMapper indicatorMapper;
	@Autowired
	EvaOptionMapper optionMapper;
	@Autowired
	RequirementService requirementService;
	@Autowired
	RequirementMapper requirementMapper;
	@Autowired
	CompanyMapper companyMapper;
	@Autowired
	CompanyService companyService;
	
	/**
	 * 管理员-新闻管理
	 */
	//1.新增新闻
	@RequestMapping(value="/adminAddNews")
	public String adminAddNews(){
		return "adPage/adminAddNews";
	}
	@RequestMapping(value="/adminAddNews1")
	public String adminAddNews1(HttpServletRequest req, HttpServletResponse resp, Model model){
		String newsTitle = req.getParameter("newsTitle");
		String newsOrigin = req.getParameter("newsOrigin");
		String newsAuthor = req.getParameter("newsAuthor");
		String newsTime = req.getParameter("newsTime");
		String newsType = req.getParameter("newsType");
		String newsHot = req.getParameter("newsHot");
		String newsContent = req.getParameter("newsContent");
		String newsUuid = UUID.randomUUID().toString();
		News news = new News();
		news.setNewsUuid(newsUuid);
		news.setNewsTitle(newsTitle);
		news.setNewsOrigin(newsOrigin);
		news.setNewsTime(newsTime);
		news.setNewsAuthor(newsAuthor);
		news.setNewsType(newsType);
		news.setNewsHot(newsHot);
		news.setNewsContent(newsContent);
		newsMapper.insert(news);
		System.out.println("新增新闻成功！");
		return "redirect:adminSelectAllNews?pageNum=1";
	}
	/**
	 * 2.显示全部的新闻
	 */
	@RequestMapping(value="/adminAllClawer")
	public String adminAllClawer(HttpServletRequest req, HttpServletResponse resp, Model model){
		int recordCount = newsMapper.selectAllNews().size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 
		List<News> allNewsList = adminService.selectAllNewsByPager(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("allNewsList", allNewsList);
		return "adPage/adminAllClawer";
	}
	
	/**
	 * 查看新增上市公司信息
	 * @author Administrator
	 * @param req
	 * @param resp
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/adminListedCompany")
	public String adminListedCompany(HttpServletRequest req, HttpServletResponse resp, Model model){
		int recordCount = companyMapper.selectAllCompany().size();
		System.out.println(recordCount);
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 	
		List<Company> allCompanyList = companyService.selectAllCompanyByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("allCompanyList", allCompanyList);
		return "adPage/adminListedCompany";
	}
	
	/**
	 * 3.进入公司详情页
	 * @author Administrator
	 */
	@RequestMapping(value="/adminSelectCompanyItem")
	public String adminSelectNewsItem(HttpServletRequest req, HttpServletResponse resp, Model model){
		String companyId = req.getParameter("companyId");
		Company company = companyMapper.selectByPrimaryKey(companyId);
		model.addAttribute("company", company);
		return "adPage/adminSelectCompanyItem";
	}
	/**
	 * 删除公司
	 * @author Administrator
	 * @param req
	 * @param resp
	 * @param model
	 * @return adminDeleteCompany
	 */
	@RequestMapping(value="/adminDeleteCompany")
	public String adminDeleteNews(HttpServletRequest req, HttpServletResponse resp, Model model){
		String companyId = req.getParameter("companyId");
		System.out.println(companyId);
		companyMapper.deleteByPrimaryKey(companyId);
/*		int pageNum = Integer.parseInt(req.getParameter("pageNum"));*/
		/*System.out.println(pageNum);*/
		return "redirect:adminListedCompany?pageNum=1";
	}
	/**
	 * @author Administrator
	 * 4.编辑公司信息-进入编辑页面
	 */
	@RequestMapping(value="/adminEditCompany")
	public String adminEditNews(HttpServletRequest req, HttpServletResponse resp, Model model){
		String companyId = req.getParameter("companyId");
		Company company = companyMapper.selectByPrimaryKey(companyId);
		System.out.println(company.getCompanyId());
		model.addAttribute("company", company);
		return "adPage/adminEditCompany";
	}
	/**
	 * 编辑新闻-提交编辑信息
	 */
	@RequestMapping(value="/adminUpdateCompanyInfo")
	public String adminUpdateNewsInfo(HttpServletRequest req, HttpServletResponse resp, Model model){
		String companyId = req.getParameter("companyId");
		System.out.println("公司ID是："+companyId);
		String stockName = req.getParameter("stockName");
		String stockNum = req.getParameter("stockNum");
		String companyArea = req.getParameter("companyArea");
		String resolvedConcept = req.getParameter("resolvedConcept");
		String lunchDate = req.getParameter("lunchDate");
		String esNetAsset = req.getParameter("esNetAsset");
		String esIncome = req.getParameter("esIncome");
		
		String netProfit = req.getParameter("netProfit");
		String netProfitGrowthRate = req.getParameter("netProfitGrowthRate");
		String revenue = req.getParameter("revenue");
		String esCashFlow = req.getParameter("esCashFlow");
		String esPublicFund = req.getParameter("esPublicFund");
		String esNotProfit = req.getParameter("esNotProfit");
		String totalCapital = req.getParameter("totalCapital");
		String floatingStock = req.getParameter("floatingStock");
		String mainBusiness = req.getParameter("mainBusiness");
		
		Company company = new Company();
		company.setCompanyId(companyId);
		company.setStockName(stockName);
		company.setStockNum(stockNum);
		company.setCompanyArea(companyArea);
		company.setResolvedConcept(resolvedConcept);
		company.setLunchDate(lunchDate);
		company.setEsIncome(esIncome);
		company.setNetProfit(netProfitGrowthRate);
		company.setNetProfitGrowthRate(netProfitGrowthRate);
		company.setRevenue(revenue);
		company.setEsCashFlow(esCashFlow);
		company.setEsPublicFund(esPublicFund);
		company.setEsNotProfit(esNotProfit);
		company.setTotalCapital(totalCapital);
		company.setFloatingStock(floatingStock);
		company.setMainBusiness(mainBusiness);
		companyMapper.updateByPrimaryKeySelective(company);
		//newsMapper.updateByPrimaryKey(news);
		System.out.println("编辑公司信息成功！");
		return "redirect:adminSelectCompanyItem?companyId="+companyId;
		//return "adPage/success";
	}
	
	/**
	 * 修改项目需求
	 */
	@RequestMapping("/adminUpdateRequirement")
	public String adminUpdateRequirement(HttpServletRequest req, HttpServletResponse resp, Model model){
		String reqUuid = req.getParameter("reqUuid");
		Requirement requirement = requirementMapper.selectByPrimaryKey(reqUuid);
		model.addAttribute("requirement", requirement);
		return "adPage/adminSelectReqItem";
	}
	/**
	 * 提交项目需求
	 */
	@RequestMapping("/adminAddRequirement")
	public String adminAddRequirement(HttpServletRequest req, HttpServletResponse resp, Model model){	
		HttpSession session = req.getSession();
		User user = (User) session.getAttribute("user");
		String reqUuid = req.getParameter("reqUuid"); 
		String reqName = req.getParameter("reqName");
		String reqBrief = req.getParameter("reqBrief");
		String reqContent = req.getParameter("reqContent");
		String reqProtime = req.getParameter("reqProtime");
		String reqEmail = req.getParameter("reqEmail");
		String reqPhone = req.getParameter("reqPhone");
		String reqMoney = req.getParameter("reqMoney");
		String userUuid = user.getUserUuid();
		Requirement requirement = new Requirement();
		requirement.setReqUuid(reqUuid);
		requirement.setReqBrief(reqBrief);
		requirement.setReqContent(reqContent);
		requirement.setReqEmail(reqEmail);
		requirement.setReqMoney(reqMoney);
		requirement.setReqName(reqName);
		requirement.setReqPhone(reqPhone);
		requirement.setReqProtime(reqProtime);
		requirement.setUserUuid(userUuid);
		return "";
	}
}
