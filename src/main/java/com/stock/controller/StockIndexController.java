package com.stock.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.CapitalFlowMapper;
import com.stock.pojo.CapitalFlow;

@Controller
public class StockIndexController {
	@Autowired
	CapitalFlowMapper capitalFlowMapper;
	/**
	 * 博客详情
	 * @param model
	 * @param req
	 * @return
	 */
	@RequestMapping(value = "/capital_flow")
	public String sharesDetail(Model model,HttpServletRequest req){
		
		List<CapitalFlow> capitalFlows = capitalFlowMapper.selectFlowByIndustry();
		List<CapitalFlow> capitalFlowsArea = capitalFlowMapper.selectFlowByArea();
		System.out.println(capitalFlowsArea.size());
		model.addAttribute("capitalFlows",capitalFlows);
		model.addAttribute("capitalFlowsArea",capitalFlowsArea);
		return "mypages/capital_flow";
	}
	
	@RequestMapping(value = "/flowArae")
	public String flowArae(Model model,HttpServletRequest req){
		
		List<CapitalFlow> capitalFlows = capitalFlowMapper.selectFlowByIndustry();
		List<CapitalFlow> capitalFlowsArea = capitalFlowMapper.selectFlowByArea();
		System.out.println(capitalFlowsArea.size());
		model.addAttribute("capitalFlows",capitalFlows);
		model.addAttribute("capitalFlowsArea",capitalFlowsArea);
		return "mypages/flow_area";
	}
	
	@RequestMapping(value = "/flowIndustry")
	public String flowIndustry(Model model,HttpServletRequest req){
		
		List<CapitalFlow> capitalFlows = capitalFlowMapper.selectFlowByIndustry();
		List<CapitalFlow> capitalFlowsArea = capitalFlowMapper.selectFlowByArea();
		System.out.println(capitalFlowsArea.size());
		model.addAttribute("capitalFlows",capitalFlows);
		model.addAttribute("capitalFlowsArea",capitalFlowsArea);
		return "mypages/flow_industry";
	}
	
	@RequestMapping(value = "/flowConcept")
	public String flowConcept(Model model,HttpServletRequest req){
		
		List<CapitalFlow> capitalFlows = capitalFlowMapper.selectFlowByIndustry();
		List<CapitalFlow> capitalFlowsArea = capitalFlowMapper.selectFlowByArea();
		System.out.println(capitalFlowsArea.size());
		model.addAttribute("capitalFlows",capitalFlows);
		model.addAttribute("capitalFlowsArea",capitalFlowsArea);
		return "mypages/flow_concept";
	}
	
    @RequestMapping(value = "/netFlowIn")
	public String netFlowIn(Model model,HttpServletRequest req){
		
		List<CapitalFlow> netFlowIn = capitalFlowMapper.selectFlowByNet();
		model.addAttribute("netFlowIn",netFlowIn);
		return "mypages/netFlowIn";
	}
    @RequestMapping(value = "/moneyRate")
	public String moneyRate(Model model,HttpServletRequest req){
		
    	List<CapitalFlow> moneyRate = capitalFlowMapper.selectFlowByMoneyRate();
		model.addAttribute("moneyRate",moneyRate);
		return "mypages/moneyRate";
	}
    
    @RequestMapping(value = "/sbigActiveOut")
	public String sbigActiveOut(Model model,HttpServletRequest req){
		
    	List<CapitalFlow> sbigActiveOut = capitalFlowMapper.selectFlowBySActiveOut();
		model.addAttribute("sbigActiveOut",sbigActiveOut);
		return "mypages/sbigActiveOut";
	}
    
    @RequestMapping(value = "/sbigActiveIn")
	public String sbigActiveIn(Model model,HttpServletRequest req){
		
    	List<CapitalFlow> sbigActiveIn = capitalFlowMapper.selectFlowBySActiveIn();
		model.addAttribute("sbigActiveIn",sbigActiveIn);
		return "mypages/sbigActiveIn";
	}
    @RequestMapping(value = "/sbigPassitiveIn")
	public String sbigPassitiveIn(Model model,HttpServletRequest req){
		
    	List<CapitalFlow> sbigPassitiveIn = capitalFlowMapper.selectFlowBySPassitiveIn();
		model.addAttribute("sbigPassitiveIn",sbigPassitiveIn);
		return "mypages/sbigPassitiveIn";
	}
    @RequestMapping(value = "/sbigPassitiveOut")
   	public String sbigPassitiveOut(Model model,HttpServletRequest req){
   		
    	List<CapitalFlow> sbigPassitiveOut = capitalFlowMapper.selectFlowBySPassitiveOut();
		model.addAttribute("sbigPassitiveOut",sbigPassitiveOut);
   		return "mypages/sbigPassitiveOut";
   	}
    @RequestMapping(value = "/ruteArea")
   	public String ruteArea(Model model,HttpServletRequest req){
   		return "mypages/rute_area";
   	}
    @RequestMapping(value = "/ruteIndustry")
   	public String ruteIndustry(Model model,HttpServletRequest req){
   		return "mypages/rute_industry";
   	}
    @RequestMapping(value = "/ruteConcept")
   	public String ruteConcept(Model model,HttpServletRequest req){
   		return "mypages/rute_concept";
   	}
    
    @RequestMapping(value = "/importantDays")
   	public String importantDays(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	System.out.println(stockNum);
   		return "mypages/stockIndex/importantDays";
   	}
    
    @RequestMapping(value = "/market_value")
   	public String marketValue(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/market_value";
   	}
    @RequestMapping(value = "/PE")
   	public String PE(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/PE";
   	}
    @RequestMapping(value = "/PB")
   	public String PB(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/PB";
   	}
    @RequestMapping(value = "/PS")
   	public String PS(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/PS";
   	}
    @RequestMapping(value = "/total_value")
   	public String total_value(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/total_value";
   	}
    @RequestMapping(value = "/flow_value")
   	public String flow_value(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/flow_value";
   	}
    @RequestMapping(value = "/enterprise_value")
   	public String enterprise_value(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/enterprise_value";
   	}
    @RequestMapping(value = "/PE_predict12")
   	public String PE_predict12(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/PE_predict12";
   	}
    @RequestMapping(value = "/dividend_rate12")
   	public String dividend_rate12(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/dividend_rate12";
   	}
}
