package com.stock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.pojo.News;
import com.stock.service.NewsService;

@Controller
public class NewsController {

	@Autowired
	NewsService newsService;
	
	/*@RequestMapping(value = "/selectAllNews")
	public String selectAllProject(Model model){
		
		List<News> news = newsService.selectByNewsType();
		
		model.addAttribute("news", news);
		return "u_index";
	}*/
	/**
	 * 新闻详情
	 * @author 张玉筱
	 */
	@RequestMapping(value = "/newsDetail")
	public String newsDetail(Model model,HttpServletRequest req){
		String newsUuid = req.getParameter("news_uuid");
		News news = newsService.selectByPrimaryKey(newsUuid);
		
		model.addAttribute("news", news);
		return "news_detail";
	}
}
