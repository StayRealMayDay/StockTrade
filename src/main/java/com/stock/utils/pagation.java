package com.stock.utils;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

public class pagation {
	private <T> void pagination(HttpServletRequest request, Model model, List<T> sysOperateLogs) {
		//分页
		//将数据存到session中以便于在前台获取
		model.addAttribute("list",sysOperateLogs);
		//获取当前页的页数并转为int类型,最终将数据存到model中
		int pageNos;
		if (request.getParameter("pageNos") == null|| Integer.parseInt(request.getParameter("pageNos")) < 1) {
		          pageNos = 1;
		     } else {
		          pageNos = Integer.parseInt(request.getParameter("pageNos"));
		}
		model.addAttribute("pageNos", pageNos);
		// 定义总页数并存到session中
         int countPage = 0;
         if (sysOperateLogs.size()%5==0) {
        	 countPage = sysOperateLogs.size()/5;
		}else {
			countPage = sysOperateLogs.size()/5+1;
		}
         // 在实际开发中我们的总页数可以根据sql语句得到查询到的总条数，然后用总条数除每页的条数得到总页数
         model.addAttribute("countPage", countPage);
	}

}
