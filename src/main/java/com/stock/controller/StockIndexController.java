package com.stock.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.mahout.math.jet.stat.Probability;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.CapitalFlowMapper;
import com.stock.mapper.ComprehensiveInvestmentRankMapper;
import com.stock.mapper.DuPontAnalysisMapper;
import com.stock.mapper.GrowthAbilityMapper;
import com.stock.mapper.MarketValuationMapper;
import com.stock.mapper.MonthQuotationMapper;
import com.stock.mapper.OperateCapacityMapper;
import com.stock.mapper.PerformancePreviewMapper;
import com.stock.mapper.ProfitForecastMapper;
import com.stock.mapper.ProfitabilityMapper;
import com.stock.mapper.RiskAnalysisMapper;
import com.stock.mapper.StockTempMapper;
import com.stock.mapper.StockTypeMapper;
import com.stock.mapper.WeekQuotationMapper;
import com.stock.mapper.YearQuotationMapper;
import com.stock.mapper.ZSwarningMapper;
import com.stock.pojo.CapitalFlow;
import com.stock.pojo.Company;
import com.stock.pojo.ComprehensiveInvestmentRank;
import com.stock.pojo.DuPontAnalysis;
import com.stock.pojo.GrowthAbility;
import com.stock.pojo.MarketValuation;
import com.stock.pojo.MarketValuationExample;
import com.stock.pojo.MonthQuotation;
import com.stock.pojo.OperateCapacity;
import com.stock.pojo.PerformancePreview;
import com.stock.pojo.ProfitForecast;
import com.stock.pojo.RiskAnalysis;
import com.stock.pojo.StockTemp;
import com.stock.pojo.WeekQuotation;
import com.stock.pojo.YearQuotation;
import com.stock.pojo.ZSwarning;
import com.stock.service.MarketValuationService;
import com.stock.utils.Pager;

@Controller
public class StockIndexController {
	@Autowired
	CapitalFlowMapper capitalFlowMapper;
	@Autowired
	MarketValuationMapper marketValuationMapper;
	@Autowired
	MarketValuationService marketValuationService;
	@Autowired
	RiskAnalysisMapper riskAnalysisMapper;
	@Autowired
	StockTempMapper stockTempMapper;
	@Autowired
	WeekQuotationMapper weekQuotationMapper;
	@Autowired
	MonthQuotationMapper monthQuotationMapper;
	@Autowired
	YearQuotationMapper yearQuotationMapper;
	@Autowired
	ProfitForecastMapper profitForecastMapper;
	@Autowired
	ComprehensiveInvestmentRankMapper comprehensiveInvestmentRankMapper;
	@Autowired
	PerformancePreviewMapper performancePreviewMapper;
	@Autowired
	ProfitabilityMapper profitabilityMapper;
	@Autowired
	GrowthAbilityMapper growthAbilityMapper;
	@Autowired
	OperateCapacityMapper operateCapacityMapper;
	@Autowired
	DuPontAnalysisMapper duPontAnalysisMapper;
	@Autowired
	ZSwarningMapper zSwarningMapper;
	
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
    	List<MarketValuation> PE  = marketValuationMapper.selectOrderAllMarketValue();
    	int recordCount = PE.size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 	
		List<MarketValuation> allPE = marketValuationService.selectAllPEByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("allPE", allPE);
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/PE";
   	}
    @RequestMapping(value = "/PB")
   	public String PB(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	List<MarketValuation> PE  = marketValuationMapper.selectOrderAllMarketValue();
    	int recordCount = PE.size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		System.out.println(pageNum);
		Pager pager = new Pager(recordCount, pageNum); 	
		List<MarketValuation> allPB = marketValuationService.selectAllPBByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("allPB", allPB);
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/PB";
   	}
    @RequestMapping(value = "/PS")
   	public String PS(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	List<MarketValuation> PE  = marketValuationMapper.selectOrderAllMarketValue();
    	int recordCount = PE.size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		System.out.println(pageNum);
		Pager pager = new Pager(recordCount, pageNum); 	
		List<MarketValuation> allPS = marketValuationService.selectAllPSByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("allPS", allPS);
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/PS";
   	}
    @RequestMapping(value = "/total_value")
   	public String total_value(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	List<MarketValuation> PE  = marketValuationMapper.selectOrderAllMarketValue();
    	int recordCount = PE.size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		System.out.println(pageNum);
		Pager pager = new Pager(recordCount, pageNum); 	
		List<MarketValuation> allTotalValue = marketValuationService.selectAllTotalValueByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("allTotalValue", allTotalValue);
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/total_value";
   	}
    @RequestMapping(value = "/flow_value")
   	public String flow_value(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	List<MarketValuation> PE  = marketValuationMapper.selectOrderAllMarketValue();
    	int recordCount = PE.size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		System.out.println(pageNum);
		Pager pager = new Pager(recordCount, pageNum); 	
		List<MarketValuation> allFlowValue = marketValuationService.selectAllFlowValueByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("allFlowValue", allFlowValue);
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/flow_value";
   	}
    @RequestMapping(value = "/enterprise_value")
   	public String enterprise_value(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	List<MarketValuation> PE  = marketValuationMapper.selectOrderAllMarketValue();
    	int recordCount = PE.size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		System.out.println(pageNum);
		Pager pager = new Pager(recordCount, pageNum); 	
		List<MarketValuation> enterpValue = marketValuationService.selectAllEterppValueByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("enterpValue", enterpValue);
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/enterprise_value";
   	}
    @RequestMapping(value = "/PE_predict12")
   	public String PE_predict12(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	List<MarketValuation> PE  = marketValuationMapper.selectOrderAllMarketValue();
    	int recordCount = PE.size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		System.out.println(pageNum);
		Pager pager = new Pager(recordCount, pageNum); 	
		List<MarketValuation> predictValue = marketValuationService.selectAllPredictValueByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("predictValue", predictValue);
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/PE_predict12";
   	}
    @RequestMapping(value = "/dividend_rate12")
   	public String dividend_rate12(Model model,HttpServletRequest req){
    	String stockNum = req.getParameter("stockNum");
    	List<MarketValuation> PE  = marketValuationMapper.selectOrderAllMarketValue();
    	int recordCount = PE.size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		System.out.println(pageNum);
		Pager pager = new Pager(recordCount, pageNum); 	
		List<MarketValuation> dividendRate = marketValuationService.selectAllDividendRateByPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("dividendRate", dividendRate);
    	model.addAttribute("stockNum",stockNum);
   		return "mypages/stockIndex/dividend_rate12";
   	}
    
    @RequestMapping(value = "/riskAnalysis")
   	public String riskAnalysis(Model model,HttpServletRequest req){
    	List<RiskAnalysis> riskAnalysis = riskAnalysisMapper.selectAll();
    	model.addAttribute("riskAnalysis", riskAnalysis);
   		return "mypages/stockIndex/riskAnalysis";
   	}
    
    @RequestMapping(value = "/dailyQuotation")
   	public String dailyQuotation(Model model,HttpServletRequest req){
    	List<StockTemp> stockTemps = stockTempMapper.selectAllStockTemp();
    	model.addAttribute("stockTemps", stockTemps);
   		return "mypages/stockIndex/dailyQuotations";
   	}
    @RequestMapping(value = "/weekQuotation")
   	public String weekQuotation(Model model,HttpServletRequest req){
    	List<WeekQuotation> weekQuotation = weekQuotationMapper.selectWeekQuotation();
    	System.out.println(weekQuotation.size());
    	model.addAttribute("weekQuotation", weekQuotation);
   		return "mypages/stockIndex/weekQuotations";
   	}
    @RequestMapping(value = "/monthQuotation")
   	public String monthQuotation(Model model,HttpServletRequest req){
    	List<MonthQuotation> monthQuotation = monthQuotationMapper.selectMonthQuotation();
    	model.addAttribute("monthQuotation", monthQuotation);
   		return "mypages/stockIndex/monthQuotations";
   	}
   
    @RequestMapping(value = "/yearQuotation")
   	public String yearQuotation(Model model,HttpServletRequest req){
    	List<YearQuotation> yearQuotation = yearQuotationMapper.selectYearQuotation();
    	model.addAttribute("yearQuotation", yearQuotation);
   		return "mypages/stockIndex/yearQuotations";
   	}
    @RequestMapping(value = "/profitForecast")
   	public String profitForecast(Model model,HttpServletRequest req){
    	List<ProfitForecast> profitForecast = profitForecastMapper.selectProfitForecast();
    	model.addAttribute("profitForecast", profitForecast);
   		return "mypages/stockIndex/profitForecast";
   	}
    
    @RequestMapping(value = "/comprehensiveInvestmentRank")
   	public String comprehensiveInvestmentRank(Model model,HttpServletRequest req){
    	List<ComprehensiveInvestmentRank> comprehensiveInvestmentRank = comprehensiveInvestmentRankMapper.selectComprehensiveInvestmentRank();
    	model.addAttribute("comprehensiveInvestmentRank", comprehensiveInvestmentRank);
   		return "mypages/stockIndex/comprehensiveInvestmentRank";
   	}
    
    @RequestMapping(value = "/performancePreview")
   	public String performancePreview(Model model,HttpServletRequest req){
    	List<PerformancePreview> performancePreview = performancePreviewMapper.selectPerformancePreview();
    	System.out.println(performancePreview.size());
    	model.addAttribute("performancePreview", performancePreview);
   		return "mypages/stockIndex/performancePreview";
   	}
    
    @RequestMapping(value = "/profitability")
   	public String profitability(Model model,HttpServletRequest req){
    	List<Probability> profitability = profitabilityMapper.selectProbability();
    	System.out.println(profitability.size());
    	model.addAttribute("profitability", profitability);
   		return "mypages/stockIndex/profitability";
   	}
    @RequestMapping(value = "/growth_ability")
   	public String growth_ability(Model model,HttpServletRequest req){
    	List<GrowthAbility> growth_ability = growthAbilityMapper.selectGrowthAbility();
    	model.addAttribute("growth_ability", growth_ability);
   		return "mypages/stockIndex/growth_ability";
   	}
    @RequestMapping(value = "/operate_capacity")
   	public String operate_capacity(Model model,HttpServletRequest req){
    	List<OperateCapacity> operate_capacity = operateCapacityMapper.selectOperateCapacity();
    	model.addAttribute("operate_capacity", operate_capacity);
   		return "mypages/stockIndex/operate_capacity";
   	}
    @RequestMapping(value = "/du_pont_analysis")
   	public String du_pont_analysis(Model model,HttpServletRequest req){
    	List<DuPontAnalysis> du_pont_analysis = duPontAnalysisMapper.selectDuPontAnalysis();
    	model.addAttribute("du_pont_analysis", du_pont_analysis);
   		return "mypages/stockIndex/du_pont_analysis";
   	}
    @RequestMapping(value = "/z_swarning")
   	public String z_swarning(Model model,HttpServletRequest req){
    	List<ZSwarning> z_swarning = zSwarningMapper.selectZSwarning();
    	model.addAttribute("z_swarning", z_swarning);
   		return "mypages/stockIndex/z_swarning";
   	}
    
}
