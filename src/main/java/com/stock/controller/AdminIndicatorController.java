package com.stock.controller;

import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.EvaOptionMapper;
import com.stock.mapper.IndicatorMapper;
import com.stock.mapper.NewsMapper;
import com.stock.pojo.EvaOption;
import com.stock.pojo.Indicator;
import com.stock.service.AdminService;
import com.stock.utils.Pager;

@Controller
public class AdminIndicatorController {
	@Autowired
	NewsMapper newsMapper;
	@Autowired
	AdminService adminService;
	@Autowired
	IndicatorMapper indicatorMapper;
	@Autowired
	EvaOptionMapper optionMapper;

	@RequestMapping(value = "/adminIndicatorManage")
	public String adminIndicatorManage() {
		return "adPage/adminIndicatorManage";
	}

	@RequestMapping(value = "/addIndicator")
	public String addIndicator() {
		return "adPage/addIndicator";
	}

	@RequestMapping(value = "/addIndicator2")
	public String addIndicator2(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String inName = req.getParameter("inName");
		String inWeight = req.getParameter("inWeight");
		String inLevel = req.getParameter("inLevel");
		String inUuid = UUID.randomUUID().toString();
		Indicator indicator = new Indicator();
		indicator.setInUuid(inUuid);
		indicator.setInName(inName);
		indicator.setInWeight(inWeight);
		indicator.setInLevel(inLevel);
		indicatorMapper.insert(indicator);
		return "adPage/success";
	}

	/**
	 * 指标管理
	 */

	// 1.查询所有的指标（包括一级和二级）
	@RequestMapping(value = "/adminSelectAllIndicator")
	public String adminSelectAllIndicator(HttpServletRequest req, HttpServletResponse resp, Model model) {
		// int recordCount = newsMapper.selectAllNews().size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		// Pager pager = new Pager(recordCount, pageNum);
		Indicator indicator = new Indicator();
		indicator.setInLevel("1");
		List<Indicator> firstIndicList = adminService.selectAllFirstIndic(indicator);
		System.out.println("成功的查询到所有的一级指标");
		indicator.setInLevel("2");
		List<Indicator> secondIndicList = adminService.selectAllSecondIndic(indicator);
		System.out.println("成功的查询到所有的二级指标");
		List<EvaOption> optionList = optionMapper.selectAllOptions();
		System.out.println("成功的查询到所有的指标选项");
		Pager pager = new Pager(firstIndicList.size(), pageNum, 3);
		model.addAttribute("firstIndicList", firstIndicList);
		model.addAttribute("secondIndicList", secondIndicList);
		model.addAttribute("optionList", optionList);
		model.addAttribute("pager", pager);
		return "adPage/adminIndicatorManage";

	}

	// 2.编辑指标
	@RequestMapping(value = "/adminEditIndicator")
	public String adminEditIndicator(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String inUuid = req.getParameter("inUuid");

		String inName = req.getParameter("inName");

		Indicator indicator = new Indicator();
		indicator.setInUuid(inUuid);
		indicator.setInName(inName);
		indicatorMapper.updateByPrimaryKeySelective(indicator);
		Integer pageNum = Integer.parseInt(req.getParameter("pageNum"));
		return "redirect:adminSelectAllIndicator?pageNum=" + pageNum;
	}

	// 3.编辑指标选项
	@RequestMapping(value = "/adminEditOption")
	public String adminEditOption(HttpServletRequest req, HttpServletResponse resp, Model model) {
		String opUuid = req.getParameter("opUuid");
		String opName = req.getParameter("opName");
		String opValue = req.getParameter("opValue");
		EvaOption evaOption = new EvaOption();
		evaOption.setOpUuid(opUuid);
		evaOption.setOpName(opName);
		evaOption.setOpValue(opValue);
		optionMapper.updateByPrimaryKeySelective(evaOption);
		Integer pageNum = Integer.parseInt(req.getParameter("pageNum"));
		return "redirect:adminSelectAllIndicator?pageNum=" + pageNum;
	}

}
