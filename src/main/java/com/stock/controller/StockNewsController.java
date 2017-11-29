package com.stock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.CompanyNewsMapper;
import com.stock.pojo.CompanyNews;


public class StockNewsController {
	@Autowired
	CompanyNewsMapper companyNewsMapper;
	/**
	 * 查看最热新闻
	 * @param model
	 */
	@RequestMapping(value = "/getHotNews")
	public void getHotNews(Model model){
		List<CompanyNews> hotNewsList = companyNewsMapper.getHotNews();
			model.addAttribute("hotNewsList", hotNewsList);
		}
	
}
