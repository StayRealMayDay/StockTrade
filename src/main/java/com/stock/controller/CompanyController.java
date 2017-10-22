package com.stock.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.CompanyMapper;

import com.stock.pojo.Company;

@Controller
public class CompanyController {

	@Autowired
	CompanyMapper companyMapper;
	
	@RequestMapping(value = "/company")
	public String companyNews(Model model,HttpServletRequest req){
		String stockNum = req.getParameter("stockNum");
		Company company = companyMapper.selectCompanyByStockNum(stockNum);
		model.addAttribute("stockNum", stockNum);
		model.addAttribute("company", company);
		return "mypages/company";
	}
}
