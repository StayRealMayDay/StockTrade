package com.stock.controller;

import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.CbMapper;
import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.CsMapper;
import com.stock.mapper.EeoMapper;
import com.stock.mapper.StockinfoMapper;
import com.stock.pojo.Cb;
import com.stock.pojo.CompanyNews;
import com.stock.pojo.Cs;
import com.stock.pojo.Eeo;
import com.stock.pojo.Stockinfo;
import com.stock.utils.Pager;

@Controller
public class CompanyNewsController {
	@Autowired
	CompanyNewsMapper companyNewsMapper;
	@Autowired
	StockinfoMapper stockinfoMapper;
	@Autowired
	EeoMapper eeoMapper;
	@Autowired
	CsMapper csMapper;
	@Autowired
	CbMapper cbMapper;
	
	
	@RequestMapping(value = "/listedCompany")
	public String companyNews(Model model,HttpServletRequest req){
		List<CompanyNews> newsList = companyNewsMapper.selectAllNews();	
		List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		model.addAttribute("news", newsList);
		model.addAttribute("stockInfo",stockList);
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		return "mypages/listedCompany";
	}
	
	
	@RequestMapping(value = "/securityNews")
	public String companyNewsAll(Model model,HttpServletRequest req,HttpServletResponse resp){
	
		int count = companyNewsMapper.selectAllNews().size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		
		List<CompanyNews> newsList = new ArrayList<CompanyNews>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		newsList = companyNewsMapper.selectAllNewsShow(map);
		
		model.addAttribute("securityNews", newsList);
		model.addAttribute("pager",pager);
		return "mypages/securityNews";
	}
	

	//于花蕾新增 2017年9月28日
	@RequestMapping(value="/companyHotDetail")
	public String companyHotDetail(Model model,HttpServletRequest req,HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		CompanyNews companyNewsDetail = companyNewsMapper.newsByHotRatiosDetail(id);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("stockInfo", stockList);
		model.addAttribute("companyNewsDetail", companyNewsDetail);
		
		return "mypages/companyHotDetail";
	}
	
	//于花蕾新增 2017年9月28日
	@RequestMapping(value="/economicNewsDetail")
	public String economicNewsDetail(Model model,HttpServletRequest req,HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		Eeo eeoNewsDetail = eeoMapper.eeoNewsDetail(id);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("stockInfo", stockList);
		model.addAttribute("eeoNewsDetail", eeoNewsDetail);
		return "mypages/economicNewsDetail";
	}
	
	//于花蕾新增 2017年9月28日
	@RequestMapping(value="/csNewsDetail")
	public String csNewsDetail(Model model,HttpServletRequest req,HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		Cs csNewsDetail = csMapper.csNewsDetail(id);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("stockInfo", stockList);
		model.addAttribute("csNewsDetail", csNewsDetail);
		return "mypages/csNewsDetail";
	}
	
	//于花蕾新增 2017年9月28日
	@RequestMapping(value="/cbNewsDetail")
	public String cbNewsDetail(Model model,HttpServletRequest req,HttpServletResponse resp){
		int id = Integer.parseInt(req.getParameter("id"));
		Cb cbNewsDetail = cbMapper.cbNewsDetail(id);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("stockInfo", stockList);
		model.addAttribute("cbNewsDetail", cbNewsDetail);
		return "mypages/cbNewsDetail";
	}
	
	//于花蕾 新增 2017年9月29日
	@RequestMapping(value ="/companyNews")
	public String companyNewsList(Model model,HttpServletRequest req,HttpServletResponse resp){
		
		int count = companyNewsMapper.selectAllNews().size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		List<CompanyNews> newsList = new ArrayList<CompanyNews>();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		newsList = companyNewsMapper.selectAllNewsShow(map);
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("companyNewsList", newsList);
		model.addAttribute("pager",pager);
		return "mypages/companyNews";
	}
	
}

