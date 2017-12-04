package com.stock.controller;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.alibaba.fastjson.JSONObject;
import com.mysql.fabric.Response;
import com.stock.mapper.CapitalFlowMapper;
import com.stock.mapper.CompanyBulletinMapper;
import com.stock.mapper.CompanyDetailMapper;
import com.stock.mapper.CompanyExecutiveMapper;
import com.stock.mapper.CompanyMapper;
import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.IndustryNewsinfoMapper;
import com.stock.mapper.IndustryStatusMapper;
import com.stock.mapper.MarketPerformanceMapper;
import com.stock.mapper.RankandpredictMapper;
import com.stock.mapper.StockTempMapper;
import com.stock.mapper.StockholderBasicMapper;
import com.stock.mapper.StockholderRelativeMapper;
import com.stock.mapper.StockinfoMapper;

import com.stock.mapper.StockDetailMapper;
import com.stock.mapper.StockHolderNumberMapper;
import com.stock.mapper.TopStockCirculationHolderMapper;
import com.stock.mapper.TopStockHolderMapper;
import com.stock.mapper.TotalShareStructureMapper;
import com.stock.pojo.CapitalFlow;
import com.stock.pojo.Company;
import com.stock.pojo.CompanyBulletin;
import com.stock.pojo.CompanyDetail;
import com.stock.pojo.CompanyExecutive;
import com.stock.pojo.CompanyNews;

import com.stock.pojo.IndustryDistribution;
import com.stock.pojo.IndustryNewsinfo;
import com.stock.pojo.IndustryStatus;
import com.stock.pojo.MarketPerformance;
import com.stock.pojo.Rankandpredict;
import com.stock.pojo.StockTemp;
import com.stock.pojo.StockholderBasic;
import com.stock.pojo.StockholderRelative;
import com.stock.pojo.Stockinfo;

import com.stock.pojo.StockDetail;
import com.stock.pojo.StockHolderNumber;
import com.stock.pojo.StockholderBasic;
import com.stock.pojo.StockholderRelative;
import com.stock.pojo.Stockinfo;
import com.stock.pojo.TopStockCirculationHolder;
import com.stock.pojo.TopStockHolder;
import com.stock.pojo.TotalShareStructure;
import com.stock.utils.JsonUtil;
import com.stock.utils.Pager;

@Controller
public class CompanyController {

	@Autowired
	CompanyMapper companyMapper;
	@Autowired
	CompanyDetailMapper companyDetailMapper;
	@Autowired
	CompanyExecutiveMapper companyExecutiveMapper;
	@Autowired
	StockholderBasicMapper stockholderBasicMapper;
	@Autowired
	StockholderRelativeMapper stockholderRelativeMapper;
	@Autowired
	StockinfoMapper stockinfoMapper;
	@Autowired
	IndustryNewsinfoMapper industryNewsinfoMapper;
	@Autowired
	CompanyBulletinMapper companyBulletinMapper;
	@Autowired
	CompanyNewsMapper companyNewsMapper;
	@Autowired
	IndustryStatusMapper industryStatusMapper;
	@Autowired
	MarketPerformanceMapper marketPerformanceMapper;
	@Autowired
	CapitalFlowMapper capitalFlowMapper;
	@Autowired
	RankandpredictMapper rankandpredictMapper;
	@Autowired
	StockTempMapper stockTempMapper;
	
	StockHolderNumberMapper stockHolderNumberMapper;
	@Autowired
	TopStockCirculationHolderMapper topStockCirculationMapper;
	@Autowired
	TopStockHolderMapper topStockHolderMapper;
	@Autowired
	TotalShareStructureMapper totalShareStructureMapper;
	@Autowired
	StockDetailMapper stockDetailMapper;
	@RequestMapping(value = "/profit_predict",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object> profitPredict(Model model,HttpServletRequest req){
		/*["预测每股收益","预测净利润","预测主营业务营收"]
		 * 
		 * */
		String stockNum = req.getParameter("stockNum");
		Map<String,Object> map = new HashMap();
		String[] str1 = {"预测每股收益","预测净利润","预测主营业务营收"};
		Rankandpredict rankandpredicts = rankandpredictMapper.selectPredict(stockNum);
		
		String[] str2 = new String[3];
		str2[0] = rankandpredicts.getPredictEveryProfit();
		str2[1] = rankandpredicts.getPredictNetProfit();
		str2[2] = rankandpredicts.getPredictMainIncome();
		System.out.println(str2);
		map.put("categories", str1);
		map.put("data", str2);
		
		return map;
	}
	
	@RequestMapping(value = "/company")
	public String companyNews(Model model,HttpServletRequest req){
		String stockNum = req.getParameter("stockNum");
		Company company = companyMapper.selectCompanyByStockNum(stockNum);
		System.out.println(company);
		String industry = companyMapper.selecResolvedIndustry(stockNum);
		List<Company> stock = companyMapper.selecResolvedStock(industry);
		Stockinfo stockinfo = stockinfoMapper.selectStockByCode(stockNum);
		List<String> stocklist = new ArrayList<String>();
		for(int i = 0; i < stock.size(); i++){
			String s = stock.get(i).getStockNum();
			stocklist.add(s);
		}
		List<IndustryNewsinfo> industryList = industryNewsinfoMapper.selectTitleByStock(stocklist);
		List<CompanyBulletin> bulletins = companyBulletinMapper.selectSomeBulletin(stockNum);
		List<CompanyNews> companyNewsList = companyNewsMapper.selectNewsByComapny(stockNum);
		List<CapitalFlow> capitalFlowInlist = capitalFlowMapper.selectFlowIn();
		List<CapitalFlow> capitalFlowOutlist = capitalFlowMapper.selectFlowOut();
		Rankandpredict rankAndPredict = rankandpredictMapper.selectAll(stockNum);
		List<StockTemp> stockList = stockTempMapper.selectTop10(industry);
		model.addAttribute("stockList", stockList);
		model.addAttribute("rankAndPredict",rankAndPredict );
		model.addAttribute("rankAndPredict",rankAndPredict );
		System.out.println("评级数量"+rankAndPredict);
		model.addAttribute("stockinfo",stockinfo );
		model.addAttribute("industryList",industryList );
		model.addAttribute("stockNum", stockNum);
		model.addAttribute("company", company);
		model.addAttribute("stocklist",stocklist );
		model.addAttribute("bulletins",bulletins );
		model.addAttribute("companyNewsList",companyNewsList );
		model.addAttribute("capitalFlowInlist",capitalFlowInlist );
		model.addAttribute("capitalFlowOutlist",capitalFlowOutlist );
		return "mypages/company";
	}
	
	
	@RequestMapping(value = "/similarIndustry")
	public String similarIndustry(Model model,HttpServletRequest req){
		String stockNum = req.getParameter("stockNum");
		String industry = companyMapper.selecResolvedIndustry(stockNum);
		List<StockTemp> stockListSim = stockTempMapper.selectAllSimIndustry(industry);
		model.addAttribute("stockListSim", stockListSim);
		return "mypages/similarIndustry";
		
	}
	
		@RequestMapping(value = "/industryChain")
		public String industryChain(Model model,HttpServletRequest req){
			String Stock = req.getParameter("stock");
			List<IndustryStatus> industryStatus = industryStatusMapper.selectAllIndustryStatus();
			List<MarketPerformance> marketPerformance = marketPerformanceMapper.selectAllMarketPerformance();
			String industry = companyMapper.selecResolvedIndustry(Stock);
			List<Stockinfo> stockIndustry = stockinfoMapper.selectIndustryBystock(industry);
			System.out.println(stockIndustry.size());
			model.addAttribute("stock", Stock);
			model.addAttribute("stockIndustry",stockIndustry);
			model.addAttribute("industryStatus",industryStatus);
			model.addAttribute("marketPerformance",marketPerformance);
			return "mypages/industryChain";
		}
	
	//2017年10月19日新增
	@RequestMapping(value = "/company_detail")
	public String companyDetail(Model model,HttpServletRequest req){
		String beiDou = req.getParameter("beiDou");
		CompanyDetail beiDouDetail = companyDetailMapper.companyDetail(beiDou);
		List<CompanyExecutive> listGaoGuan = companyExecutiveMapper.selectGaoGuan(beiDou);
		List<CompanyExecutive> listDongShi = companyExecutiveMapper.selectDongShi(beiDou);
		String resolvedConcept = companyMapper.selecResolvedConcept(beiDou);
		String industry = companyMapper.selecResolvedIndustry(beiDou);
		String[] concept = resolvedConcept.split("，");
		List<String> concepts = new ArrayList<String>();
		Stockinfo stockinfo = stockinfoMapper.selectStockByCode(beiDou);
		int i=0;
		int size = concept.length;
		while( i < size && concept[i]!=null) {
			concepts.add(concept[i]);
			i++;
		}
		List<StockholderBasic> listStockBasic = stockholderBasicMapper.selectStockHolderB(beiDou);
		StockholderRelative listStockRelative = stockholderRelativeMapper.selectStockHolderR(beiDou);
		System.out.println(listStockRelative);
		model.addAttribute("stockinfo", stockinfo);
		model.addAttribute("beiDouDetail", beiDouDetail);
		model.addAttribute("listGaoGuan", listGaoGuan);
		model.addAttribute("listDongShi", listDongShi);
		model.addAttribute("concepts", concepts);
		model.addAttribute("industry", industry);
		model.addAttribute("listStockBasic",listStockBasic );
		
		model.addAttribute("relative",listStockRelative );
		return "mypages/company_detail";
	}
	
	//2017年10月20日新增
	@RequestMapping(value = "/relationConcept")
	public String marketIndex(Model model,HttpServletRequest req){	
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		String conc = req.getParameter("conc");
		int count = 0;
		String str ="";
		try {
			str = new String(conc.getBytes("utf-8"), "utf-8");
			System.out.println(str);
			List<Company> companys = companyMapper.selecResolvedConceptCount(str);
			count = companys.size();
			System.out.println(count);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Pager pager = new Pager(count, pageNum);
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<Stockinfo> stockConcept = stockinfoMapper.selectConcept(map,str);
		System.out.println(stockConcept.size());
		model.addAttribute("pager",pager);
		model.addAttribute("stockConcept", stockConcept );
		model.addAttribute("str", str);
		return "mypages/relationConcept";
	}
	
	@RequestMapping(value = "/relationIndustry")
	public String relationIndustry(Model model,HttpServletRequest req){	
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		String industry = req.getParameter("industry");
		int count = 0;
		String str ="";
		try {
			str = new String(industry.getBytes("utf-8"), "utf-8");
			System.out.println(str);
			List<Company> companys = companyMapper.selecResolvedIndustryCount(str);
			count = companys.size();
			System.out.println(count);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Pager pager = new Pager(count, pageNum);
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<Stockinfo> stockIndustry = stockinfoMapper.selectIndustry(map,str);
		System.out.println(stockIndustry.size());
		model.addAttribute("pager",pager);
		model.addAttribute("stockIndustry", stockIndustry );
		model.addAttribute("str", str);
		return "mypages/relationIndustry";
	}
	
	//2017年10月25日
	@RequestMapping(value="/resolvedIndusNewsList")
	public String industryNews(Model model,HttpServletRequest req,
							@RequestParam(required = false, value = "stocklist[]") List<String>stocklist){
		int count = industryNewsinfoMapper.selectAllByStockCount(stocklist);
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<IndustryNewsinfo> newsList = industryNewsinfoMapper.selectAllByStock(map, stocklist);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("newsList",newsList);
		return "mypages/resolvedIndusNewsList";
	}
	
	//2017年10月25日
	@RequestMapping(value="/resolvedIndusNewsDetail")
	public String industryNewsDetail(Model model,HttpServletRequest req){
		
		String stockId = req.getParameter("id");
		IndustryNewsinfo newsinfo = industryNewsinfoMapper.selectDetail(stockId);
		
		model.addAttribute("newsinfo",newsinfo );
		return "mypages/resolvedIndusNewsDetail";
	}
	
	
	//2017年10月25日
	@RequestMapping(value="/companyBulletinList")
	public String BulletinList(Model model,HttpServletRequest req){
		String stockNum = req.getParameter("stockNum");
		int count = companyBulletinMapper.selectAllByStockCount(stockNum);
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		List<CompanyBulletin> newsList = companyBulletinMapper.selectAllByStock(map, stockNum);
		model.addAttribute("newsList",newsList);
		return "mypages/companyBulletinList";
	}
	
	//2017年10月25日
	@RequestMapping(value="/companyBulletinDetail")
	public String BulletinDetail(Model model,HttpServletRequest req){
		
		String stockId = req.getParameter("id");
		CompanyBulletin newsinfo = companyBulletinMapper.selectDetail(stockId);
		System.out.println("111111111");
		model.addAttribute("newsinfo",newsinfo );
		
		return "mypages/companyBulletinDetail";
	}
	
	//2017年10月26日
	@RequestMapping(value="/companyNewsDetail")
	public String newsDetail(Model model,HttpServletRequest req){
		
		String stockId = req.getParameter("id");
		CompanyNews newsinfo = companyNewsMapper.selectNewsDetail(stockId);
		System.out.println("111111111");
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("newsinfo",newsinfo );
		System.out.println("111111111");
		return "mypages/companyNewsDetail";
	}
	
	//2017年10月26日
	@RequestMapping(value="/huBulletinList")
	public String huBulletinList(Model model,HttpServletRequest req){
		int count = companyBulletinMapper.selectHuByStockCount();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		
		List<CompanyBulletin> newsList = companyBulletinMapper.selectHuStock();
		model.addAttribute("newsList",newsList);
		return "mypages/huBulletinList";
	}
	
	//2017年10月26日
	@RequestMapping(value="/shenBulletinList")
	public String shenBulletinList(Model model,HttpServletRequest req){
		int count = companyBulletinMapper.selectShenByStockCount();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		
		List<CompanyBulletin> newsList = companyBulletinMapper.selectShenStock();
		model.addAttribute("newsList",newsList);
		return "mypages/shenBulletinList";
	}
	
	//2017年10月26日
	@RequestMapping(value="/huBulletinDetail")
	public String huBulletin(Model model,HttpServletRequest req){
		
		String stockId = req.getParameter("id");
		CompanyNews newsinfo = companyNewsMapper.selectNewsDetail(stockId);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("newsinfo",newsinfo );
		System.out.println("111111111");
		return "mypages/huBulletinDetail";
	}
	
	//2017年10月26日
	@RequestMapping(value="/shenBulletinDetail")
	public String shenBulletin(Model model,HttpServletRequest req){
		
		String stockId = req.getParameter("id");
		CompanyNews newsinfo = companyNewsMapper.selectNewsDetail(stockId);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		model.addAttribute("newsinfo",newsinfo );
		System.out.println("111111111");
		return "mypages/shenBulletinDetail";
	}
	//2017年11月23日新增
		@RequestMapping(value = "/shareholderEquity")
		public String shareholder(Model model,HttpServletRequest req){
			String stockNum = req.getParameter("stockNum");
			Company company = companyMapper.selectCompanyByStockNum(stockNum);
			Stockinfo stockinfo = stockinfoMapper.selectStockByCode(stockNum);
			System.out.println(company);
			List<StockHolderNumber> holderNumDetail = stockHolderNumberMapper.stock_holderDetail(stockNum);
			
			List<String> holderDate = topStockCirculationMapper.topStockCircuDate(stockNum);
			String date = holderDate.get(0);
			List<TopStockCirculationHolder> topCircuList = topStockCirculationMapper.topStockDateOne(date,stockNum);
			String stock_held = topCircuList.get(0).getStockHeld();
			String stock_held_rate = topCircuList.get(0).getStockHeld();
			String change_before = topCircuList.get(0).getChangeBefore();
		
			List<String> holderTwoDate = topStockHolderMapper.topStockDate(stockNum);
			String dateTwo = holderTwoDate.get(0);
			List<TopStockHolder> topList = topStockHolderMapper.topStockDateTwo(dateTwo, stockNum);
			
			List<TotalShareStructure> totalStructure = totalShareStructureMapper.structureAll(stockNum);
			
			model.addAttribute("stockinfo",stockinfo);
			model.addAttribute("company", company);
			model.addAttribute("holderNumDetail", holderNumDetail);
			model.addAttribute("holderDate", holderDate);
			model.addAttribute("topCircuList",topCircuList);
			model.addAttribute("stock_held", stock_held);
			model.addAttribute("stock_held_rate",stock_held_rate );
			model.addAttribute("change_before",change_before );
			model.addAttribute("holderTwoDate",holderTwoDate );
			model.addAttribute("topList",topList );
			model.addAttribute("totalStructure",totalStructure );
			return "mypages/shareholderEquity";
		}
		
		//2017年11月23日新增
		@RequestMapping(value = "/holderNumGraph",produces="application/json;charset=UTF-8")
		@ResponseBody
		public  Map<Object,Object> getHolderNumGraph(HttpServletRequest req, Model model,HttpServletResponse rsp){
//			String stockNum = req.getParameter("stockNum");
//			List<StockHolderNumber> holderNumDetail = stockHolderNumberMapper.stock_holderDetail(stockNum);			
			String stockNum = req.getParameter("stockNum");
			Map<Object,Object> map = new HashMap();
			List<String> str11 = new ArrayList<>();
			List<String> str22 = new ArrayList<>();
			List<String> str33 = new ArrayList<>();
			List<StockHolderNumber> holderNumDetail = stockHolderNumberMapper.stock_holderDetail(stockNum);	
			for(int i = 0; i < holderNumDetail.size();i++){
				str11.add(i,holderNumDetail.get(i).getDate());
				str22.add(i, holderNumDetail.get(i).getPrice()); 
				str33.add(i, holderNumDetail.get(i).getHolderNumber());
			}
			String[]str1 =new String[str11.size()];
			String[]strr2 = new String[str22.size()];
			String[]strr3 = new String[str33.size()];
			
			String[][] str3 = new String[2][10];
			for(int j = 0;j < str11.size(); j++){
				str1[j] =str11.get(j);
				strr2[j]= str22.get(j);
				strr3[j]= str33.get(j);
			}
			for(int i = 0;i < 2; i++){
				for(int j = 0; j < strr2.length; j++){
					if (i == 0) {
						str3[0][j] = strr2[j];
					}else {
						str3[1][j] = strr3[j];
					}
					
				}
			}
			map.put("categories", str1);
			map.put("data", str3);
			System.out.println(str22);
			return map;
		}

		
		//2017年11月23日新增
		@RequestMapping(value = "/ajaxSelectRole",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void shareholderother(Model model,HttpServletRequest req,HttpServletResponse rsp){
			
			String roleId = req.getParameter("roleId");
			String stockNum = req.getParameter("stockNum");

			List<TopStockCirculationHolder> topCircuList = topStockCirculationMapper.topStockDateOne(roleId,stockNum); 
           
			String[] listInfo = new String[3];
            listInfo[0] = topCircuList.get(0).getStockHeld();
			listInfo[1] = topCircuList.get(0).getStockHeld();
			listInfo[2] = topCircuList.get(0).getChangeBefore();
			
			Map<Object, Object> map = new HashMap<Object,Object>();
			map.put("topCircuList",topCircuList );
			map.put("listInfo", listInfo);
			
			
			System.out.println("aaaaa"+stockNum);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("mapList", map);
			String result = JsonUtil.toJsonString(jsonObject);
			
			System.out.println(result);
			PrintWriter out;
			try {
				out = rsp.getWriter();
				out.write(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		//2017年11月23日新增
		@RequestMapping(value = "/ajaxSelectRoleTwo",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void shareholderTwoother(Model model,HttpServletRequest req,HttpServletResponse rsp){
			
			String roleIdTwo = req.getParameter("roleIdTwo");
			String stockNum = req.getParameter("stockNum");

			List<TopStockHolder> topList = topStockHolderMapper.topStockDateTwo(roleIdTwo, stockNum); 
			
			System.out.println("aaaaa"+stockNum);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("topList", topList);
			String result = JsonUtil.toJsonString(jsonObject);
			/*result = result.replaceAll("%(?![0-9a-fA-F]{2})", "%25"); */
			System.out.println(result);
			PrintWriter out;
			try {
				out = rsp.getWriter();
				out.write(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//2017年11月24日新增
		@RequestMapping(value = "/ajaxSelectstockDetail",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void shareholderDetail(Model model,HttpServletRequest req,HttpServletResponse rsp){
			
			String roleIdTwo = req.getParameter("roleId");
			List<StockDetail> listDetail = stockDetailMapper.selectStockDetail(roleIdTwo);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("listDetail", listDetail);
			String result = JsonUtil.toJsonString(jsonObject);
			System.out.println(result);
			PrintWriter out;
			try {
				out = rsp.getWriter();
				out.write(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//2017年11月20日  某一时间段内，投资--撤资关系图
		@RequestMapping(value = "/ajaxCircuSingleCompanyGraph",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void selectInforSingleCompany(Model model,HttpServletRequest req,HttpServletResponse rsp){
			//传过来一个公司的名字；institutionName
			String institutionName = req.getParameter("institutionName");
			//传过来一个选中的日期；roleId
			String roleId = req.getParameter("roleId");
			//利用这两个去十大流通股票表中去查询，得到List;
			List<TopStockCirculationHolder> outStocklist = topStockCirculationMapper.selectCircuOutStock(roleId, institutionName);
			//把这个list中的内容用来形成边表、点表；（可能会去股票相关的表中进行查询，查股票的名称）
			//1、把股票的名称查出来(生成点表)   
			List<String> stockIdlist = new ArrayList<>();
			List<String> stockTypelist = new ArrayList<>();
			for(int i = 0; i < outStocklist.size(); i++){
				String temp = outStocklist.get(i).getStockId();
				String typeTemp = outStocklist.get(i).getHolderChange();
				stockIdlist.add(temp);
				stockTypelist.add(typeTemp); // String[] categorieslist = {"不变","退出","新进","增股","减股"};
			}
			System.out.println(stockIdlist);
			List<Company> stockNamelisttemp = companyMapper.getStockNameArray(stockIdlist);
			List<String> stockNamelist = new ArrayList<String>();
			for(int l = 0; l < stockNamelisttemp.size();l++){
				stockNamelist.add("1");
			}
			for(int i = 0; i < stockNamelisttemp.size(); i++){
				String q = stockNamelisttemp.get(i).getStockName();
				String control = stockNamelisttemp.get(i).getStockNum();
				for(int j = 0; j < stockIdlist.size(); j++){
					if(stockIdlist.get(j).equals(control)){
						stockNamelist.set(j, q);
						break;
					}
				}
			}
			stockNamelist.add(institutionName);
			System.out.println(stockNamelist);
			//2、构造边表
			List<Map<String, String>> edgeslist = new ArrayList<>();
			for(int i = 0; i < stockNamelist.size()-1; i++){
				//info: stockTypelist.add(typeTemp);  end :stockNamelist   start: stockNamelist.add(institutionName);
				Map<String, String> mapOne = new HashMap<>();
				mapOne.put("source", Integer.toString(stockNamelist.size()-1));
				mapOne.put("target", Integer.toString(i));
				mapOne.put("info",stockTypelist.get(i));
				edgeslist.add(mapOne);
			}		
			System.out.println(edgeslist);
			//通过Map传给前台...
			Map<Object, Object> map = new HashMap<>();
			map.put("edgeslist",edgeslist);
			map.put("stockNamelist",stockNamelist);
			//定义JSON对象把点表、边表封装成Map,传递过去；
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("mapList", map);
			String result = JsonUtil.toJsonString(jsonObject);
			
			System.out.println(result);
			PrintWriter out;
			try {
				out = rsp.getWriter();
				out.write(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		//2017年11月20日  某一时间段内，投资--撤资关系图
		@RequestMapping(value = "/ajaxSingleCompanyGraph",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void selectSingleCompany(Model model,HttpServletRequest req,HttpServletResponse rsp){
			//传过来一个公司的名字；institutionName
			String institutionName = req.getParameter("institutionName");
			//传过来一个选中的日期；roleId
			String roleId = req.getParameter("roleId");
			//利用这两个去十大流通股票表中去查询，得到List;
			List<TopStockHolder> outStocklist = topStockHolderMapper.selectOutStock(roleId, institutionName);
			//把这个list中的内容用来形成边表、点表；（可能会去股票相关的表中进行查询，查股票的名称）
			//1、把股票的名称查出来(生成点表)   
			List<String> stockIdlist = new ArrayList<>();
			List<String> stockTypelist = new ArrayList<>();
			for(int i = 0; i < outStocklist.size(); i++){
				String temp = outStocklist.get(i).getStockId();
				String typeTemp = outStocklist.get(i).getHolderChange();
				stockIdlist.add(temp);
				stockTypelist.add(typeTemp); // String[] categorieslist = {"不变","退出","新进","增股","减股"};
			}
			System.out.println(stockIdlist);
			List<Company> stockNamelisttemp = companyMapper.getStockNameArray(stockIdlist);
			List<String> stockNamelist = new ArrayList<String>();
			for(int l = 0; l < stockNamelisttemp.size();l++){
				stockNamelist.add("1");
			}
			for(int i = 0; i < stockNamelisttemp.size(); i++){
				String q = stockNamelisttemp.get(i).getStockName();
				String control = stockNamelisttemp.get(i).getStockNum();
				for(int j = 0; j < stockIdlist.size(); j++){
					if(stockIdlist.get(j).equals(control)){
						stockNamelist.set(j, q);
						break;
					}
				}
			}
			stockNamelist.add(institutionName);
			System.out.println(stockNamelist);
			//2、构造边表
			List<Map<String, String>> edgeslist = new ArrayList<>();
			for(int i = 0; i < stockNamelist.size()-1; i++){
				//info: stockTypelist.add(typeTemp);  end :stockNamelist   start: stockNamelist.add(institutionName);
				Map<String, String> mapOne = new HashMap<>();
				mapOne.put("source", Integer.toString(stockNamelist.size()-1));
				mapOne.put("target", Integer.toString(i));
				mapOne.put("info",stockTypelist.get(i));
				edgeslist.add(mapOne);
			}		
			System.out.println(edgeslist);
			//通过Map传给前台...
			Map<Object, Object> map = new HashMap<>();
			map.put("edgeslist",edgeslist);
			map.put("stockNamelist",stockNamelist);
			//定义JSON对象把点表、边表封装成Map,传递过去；
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("mapList", map);
			String result = JsonUtil.toJsonString(jsonObject);
			
			System.out.println(result);
			PrintWriter out;
			try {
				out = rsp.getWriter();
				out.write(result);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//2017年11月16日新增
		@RequestMapping(value = "/industryInfor")
		public String showindustryInfor(Model model,HttpServletRequest req){
			String stockNum = req.getParameter("stockNum");
			Company company = companyMapper.selectCompanyByStockNum(stockNum);
			Stockinfo stockinfo = stockinfoMapper.selectStockByCode(stockNum);
			System.out.println(company);	
			model.addAttribute("stockinfo",stockinfo);
			model.addAttribute("company", company);
			return "mypages/industryInfor";
		}	
		//2017年11月16日新增
		@RequestMapping(value = "/financialAnalysis")
		public String showfinancialAnalysis(Model model,HttpServletRequest req){
			String stockNum = req.getParameter("stockNum");
			Company company = companyMapper.selectCompanyByStockNum(stockNum);
			Stockinfo stockinfo = stockinfoMapper.selectStockByCode(stockNum);
			model.addAttribute("stockinfo",stockinfo);
			model.addAttribute("company", company);
			return "mypages/financialAnalysis";
		}
		
}
