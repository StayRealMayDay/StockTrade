package com.stock.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.NewsTypeMapper;
import com.stock.mapper.StatisticsMapper;
import com.stock.pojo.CompanyNews;

import com.stock.pojo.NewsType;

import com.stock.service.NewsService;

@Controller
public class AdminEnterpriseItemController {
	@Autowired
	StatisticsMapper statisticsMapper;
	@Autowired
	NewsTypeMapper newsTypeMapper;
	@Autowired
	NewsService newsService;
	@Autowired
	CompanyNewsMapper companyNewsMapper;

	/**
	 * 今日新闻行业统计
	 */
	@RequestMapping(value = "/todayNewsIndustry")
	public String todayNewsIndustry(Model model){
		
		List<CompanyNews> hangyeNews = companyNewsMapper.selectNewsAboutHangye();
		model.addAttribute("hangyeNews", hangyeNews);
		
		return "adPage/todayNewsIndustry";
	}
	
	/**
	 * 今日新闻来源统计
	 */
	@RequestMapping(value = "/todayNewsSource")
	public String todayNewsSource(Model model){
		
		List<CompanyNews> sourceNews = companyNewsMapper.selectNewsAboutSource();
		model.addAttribute("sourceNews", sourceNews);
		
		return "adPage/todayNewsSource";
	}
	
	/**
	 * 今日新闻相关公司
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/todayNewsCompany")
	public String aUploadVideoPage(Model model){
		List<CompanyNews> companyNews = companyNewsMapper.selectNewsAboutCompany();
		model.addAttribute("companyNews", companyNews);
		return "adPage/todayNewsCompany";
	}
	
	
	/**
	 * 查看新闻总量
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/adminNewsNum")
	public String adminNewsNum(Model model){
		int newsNum = 0;
		int today_news = 0;
		int weekly_news = 0;
		int monthly_news = 0;
		//统计新闻数量
		newsNum = statisticsMapper.selectStatisticsNum("news_num");
		today_news = statisticsMapper.selectStatisticsNum("today_news");
		weekly_news = statisticsMapper.selectStatisticsNum("weekly_news");
		monthly_news = statisticsMapper.selectStatisticsNum("monthly_news");
		
		List<NewsType> newsTypesList = newsTypeMapper.selectNewsTypesByFlag("news");
		model.addAttribute("newsNum", newsNum);
		model.addAttribute("today_news", today_news);
		model.addAttribute("weekly_news", weekly_news);
		model.addAttribute("monthly_news", monthly_news);
		model.addAttribute("newsTypesList", newsTypesList);
		
		return "adPage/adminNewsNum";
	}
	

}
