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
import com.stock.mapper.CompanyMapper;
import com.stock.mapper.NewsMapper;
import com.stock.pojo.Company;
import com.stock.pojo.News;
import com.stock.service.AdminService;
import com.stock.service.CompanyService;
import com.stock.utils.Pager;


@Controller
public class AdminController {
	@Autowired
	NewsMapper newsMapper;
	@Autowired
	AdminService adminService;
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
	

	

}
