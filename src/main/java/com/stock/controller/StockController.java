package com.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.NewsTypeMapper;
import com.stock.mapper.StatisticsMapper;
import com.stock.mapper.StockTypeMapper;
import com.stock.pojo.EnterpriseItem;
import com.stock.pojo.NewsType;
import com.stock.pojo.StockType;
@Controller
public class StockController {
	@Autowired
	StatisticsMapper statisticsMapper;
	@Autowired
	NewsTypeMapper newsTypeMapper;
	
	
	
	@RequestMapping(value = "/index")
	public String index(Model model){
		return "mypages/index";
	}
	
	@RequestMapping(value = "/securityNews")
	public String securityNews(Model model){
		return "mypages/securityNews";
	}
	
	@RequestMapping(value = "/listedCompany")
	public String listedCompany(Model model){
		return "mypages/listedCompany";
	}
	
	@RequestMapping(value = "/company")
	public String company(Model model){
		return "mypages/company";
	}
	
	@RequestMapping(value = "/commodities")
	public String commodities(Model model){
		return "mypages/commodities";
	}
	
	@RequestMapping(value = "/starFinancialPlanner")
	public String starFinancialPlanner(Model model){
		return "mypages/starFinancialPlanner";
	}
	
	@RequestMapping(value = "/marketOverview")
	public String marketOverview(Model model){
		return "mypages/marketOverview";
	}
	
	@RequestMapping(value = "/single")
	public String single(Model model){
		return "mypages/single";
	}
	
	@RequestMapping(value = "/funds")
	public String funds(Model model){
		return "mypages/funds";
	}
	
	@RequestMapping(value = "/companyRating")
	public String companyRating(Model model){
		return "mypages/companyRating";
	}
	
	@RequestMapping(value = "/institutionalRating")
	public String institutionalRating(Model model){
		return "mypages/institutionalRating";
	}
	
	@RequestMapping(value = "/largeSingleTrack")
	public String largeSingleTrack(Model model){
		return "mypages/largeSingleTrack";
	}
	
	@RequestMapping(value = "/corporateInformation")
	public String corporateInformation(Model model){
		return "mypages/corporateInformation";
	}
	
	@RequestMapping(value = "/companySingle")
	public String companySingle(Model model){
		return "mypages/companySingle";
	}
	
	@RequestMapping(value = "/companyNews")
	public String companyNews(Model model){
		return "mypages/companyNews";
	}
	
	@RequestMapping(value = "/largeSingleTracklist")
	public String largeSingleTracklist(Model model){
		return "mypages/largeSingleTracklist";
	}
	
	/**
	 * 股票数量统计
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/stockCount")
	public String adminNewsNum(Model model){
		int stock_num = 0;
		int today_stock = 0;
		int weekly_stock = 0;
		int monthly_stock = 0;
		//统计新闻数量
		stock_num = statisticsMapper.selectStatisticsNum("stock_num");
		today_stock = statisticsMapper.selectStatisticsNum("today_stock");
		weekly_stock = statisticsMapper.selectStatisticsNum("weekly_stock");
		monthly_stock = statisticsMapper.selectStatisticsNum("monthly_stock");
		
		List<NewsType> newsTypesList = newsTypeMapper.selectNewsTypesByFlag("stock");
		model.addAttribute("stock_num", stock_num);
		model.addAttribute("today_stock", today_stock);
		model.addAttribute("weekly_stock", weekly_stock);
		model.addAttribute("monthly_stock", monthly_stock);
		model.addAttribute("newsTypesList", newsTypesList);
		
		return "adPage/stockCount";
	}
	
	/**
	 * 股票各版块指数统计
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/stockSection")
	public String stockSection(Model model){
		
		return "adPage/stockSection";
	}
	/**
	 * 股票地域版块
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/stockAreaSection")
	public String stockAreaSection(Model model){
		
		
		return "adPage/stockAreaSection";
	}
	
	
	
}
