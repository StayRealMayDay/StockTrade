package com.stock.controller;

import java.awt.Dialog.ModalExclusionType;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.math.transform.FastFourierTransformer;
import org.apache.lucene.search.FieldCache.FloatParser;
import org.aspectj.weaver.patterns.FormalBinding;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.stock.mapper.BlogMapper;
import com.stock.mapper.CbMapper;
import com.stock.mapper.CompanyMapper;
import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.CsMapper;
import com.stock.mapper.DdzzMapper;
import com.stock.mapper.DzjyMapper;
import com.stock.mapper.EdgesMapper;
import com.stock.mapper.EeoMapper;
import com.stock.mapper.HoldinglevelrelationshipMapper;
import com.stock.mapper.IndustryDistributionMapper;
import com.stock.mapper.LonghubangMapper;
import com.stock.mapper.NewStockMapper;
import com.stock.mapper.NewsTypeMapper;
import com.stock.mapper.NodesMapper;
import com.stock.mapper.ScrapyNewsMapper;
import com.stock.mapper.SharesMapper;
import com.stock.mapper.StatisticsMapper;
import com.stock.mapper.StockAndCompanyMapper;
import com.stock.mapper.StockMapper;
import com.stock.mapper.StockTypeMapper;
import com.stock.mapper.StockinfoMapper;
import com.stock.mapper.TopStockCirculationHolderMapper;
import com.stock.mapper.TopStockHolderMapper;
import com.stock.pojo.Blog;
import com.stock.pojo.Cb;
import com.stock.pojo.Company;

import com.stock.pojo.CompanyDetail;
import com.stock.pojo.CompanyNews;
import com.stock.pojo.Cs;
import com.stock.pojo.Ddzz;
import com.stock.pojo.Dzjy;
import com.stock.pojo.Edges;
import com.stock.pojo.Eeo;
import com.stock.pojo.IndustryDistribution;
import com.stock.pojo.Longhubang;
import com.stock.pojo.NewStock;
import com.stock.pojo.NewsType;
import com.stock.pojo.Nodes;
import com.stock.pojo.ScrapyNews;
import com.stock.pojo.Stock;
import com.stock.pojo.StockAndCompany;
import com.stock.pojo.StockDetail;
import com.stock.pojo.StockHolderNumber;
import com.stock.pojo.StockType;
import com.stock.pojo.Stockinfo;
import com.stock.pojo.TopStockCirculationHolder;
import com.stock.pojo.TopStockHolder;
import com.stock.pojo.Shares;
import com.stock.service.StockService;
import com.stock.service.StockinfoService;
import com.stock.utils.*;
@Controller
public class StockController {
	@Autowired
	StatisticsMapper statisticsMapper;
	@Autowired
	NewsTypeMapper newsTypeMapper;
	@Autowired
	StockAndCompanyMapper stockAndCompanyMapper;
	@Autowired
	StockService stockService;
	@Autowired
	ScrapyNewsMapper scrapyNewsMapper;
	@Autowired
	EeoMapper eeoMapper;
	@Autowired
	CbMapper cbMapper;
	@Autowired
	StockinfoMapper stockinfoMapper;
	@Autowired
	CompanyNewsMapper companyNewsMapper;
	@Autowired
	CsMapper csMapper;
	@Autowired
	StockinfoService stockinfoService;
	@Autowired
	BlogMapper blogMapper;
	@Autowired
	SharesMapper sharesMapper;
	@Autowired
	NewStockMapper newStockMapper;
	@Autowired
	DdzzMapper ddzzMapper;
	@Autowired
	DzjyMapper dzjyMapper;
	@Autowired
	CompanyMapper companyMapper;
	@Autowired
	NodesMapper nodesMapper;
	@Autowired
	EdgesMapper edgesMapper;
	@Autowired
	IndustryDistributionMapper industryDistributionMapper;
	@Autowired
	LonghubangMapper longhubangMapper;
	@Autowired
	TopStockCirculationHolderMapper topStockCirculationHolderMapper;
	@Autowired
	TopStockHolderMapper topStockHolderMapper;
	@Autowired
	HoldinglevelrelationshipMapper holdinglevelrelationshipMapper;
	/**
	 *展示企业关系图 
	 */
	@RequestMapping(value = "/relationGragh")
	public String relationGragh(HttpServletRequest request,Model model){
		String stock = request.getParameter("stock");
		System.out.println(stock);
		model.addAttribute("stock", stock);
		return "mypages/relationGragh"; 
	}
	/**
	 *展示行业分布图 
	 */
	@RequestMapping(value = "/china")
	public String china(HttpServletRequest request,Model model){
		/*String stock = request.getParameter("stock");
		model.addAttribute("stock", stock);*/
		List<String> circulation = topStockCirculationHolderMapper.circulationTest();
		List<String> level = holdinglevelrelationshipMapper.stockCountTest();
		List<String> all = new ArrayList<>();
		for(int i = 0; i < circulation.size(); i++){
			String temp= circulation.get(i);
			if(level.contains(temp)){
				continue;
			}
			all.add('\"'+temp+'\"');
		}
		System.out.println(all);
		return "mypages/china"; 
	}
	
	/**
	 * 测试echarts
	 */
	@RequestMapping(value = "/getIndusDistri",produces="application/json;charset=UTF-8")
	@ResponseBody
	public List<IndustryDistribution>  getIndusDistri(HttpServletRequest request, Model model){
		String stock = request.getParameter("stock");
		Map<String,Object> map = new HashMap();
		List<IndustryDistribution> industryDistributions = industryDistributionMapper.selectDistriAll(stock);
		//不行： 002383  600879 002405
		
		return industryDistributions;
	}
	
	@ResponseBody
	@RequestMapping("list")
	public List<IndustryDistribution>  IndusDistri(HttpServletRequest request, Model model){
		String stock = "002151";
		Map<String,Object> map = new HashMap();
		List<IndustryDistribution> industryDistributions = industryDistributionMapper.selectDistriAll(stock);
		//不行： 002383  600879 002405
		
		return industryDistributions;
	}
	
	
	/**
	 * 测试echarts
	 */
	@RequestMapping(value = "/getNE",produces="application/json;charset=UTF-8")
	@ResponseBody
	public Map<String,Object>  getStock(HttpServletRequest request, Model model){
		String stock = request.getParameter("stock");
		System.out.println(stock);
		Map<String,Object> map = new HashMap();
		List<Nodes> nodes = nodesMapper.selectNodesByStock(stock);
		List<Edges> edges = edgesMapper.selectEdgesByStock(stock);
		//不行： 002383  600879 002405
		map.put("nodes", nodes);
		map.put("edges", edges);
//		System.out.println(company.size());
		
		return map;
	}
	/**
	 * 测试echarts
	 */
	@RequestMapping(value = "/test",produces="application/json;charset=UTF-8")
	@ResponseBody
	public String  test(HttpServletRequest request, Model model){
		String string = "[{name: '北京',value: 4 },{name: '天津',value: 10 }]";
//		System.out.println(company.size());
		
		return string;
	}
	
	//于花蕾新增  2017年9月27日
	@RequestMapping(value = "/index")
	
	public String index1(Model model){
		List<Cb> cbList = cbMapper.selectSomeCbNews();
		System.out.println("cbList:");
		List<Eeo> eeoList = eeoMapper.selectSomeEeoNews();
		System.out.println("eeoList:");
		List<CompanyNews> companyNewsListByTime = companyNewsMapper.selectNewsByTime();
		System.out.println("companyNewsListByTime:");
		List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
		System.out.println("stockList:");
		List<CompanyNews> newsList = companyNewsMapper.selectAllNews();	
		System.out.println("newsList:");
		List<CompanyNews> compnyNewsList = companyNewsMapper.selectNewsByHotRatios();
		System.out.println("compnyNewsList:");
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		System.out.println("stockHuA:");
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
		System.out.println("stockShenA:");
		
		List<Stockinfo> stockBeiDou = stockinfoMapper.selectStockBeiDou();
		System.out.println("stockBeiDou:");
		List<Cs> csNews = csMapper.selectAllNews();
		System.out.println("csNews:");
		List<com.stock.pojo.Shares> latestSharesList = sharesMapper.selectSharesLatest();
		System.out.println("latestSharesList:");
		List<Blog> latestBlogList = blogMapper.selectBlogLatest();
		System.out.println("latestBlogList:");
		CompanyNews TopNews1 = companyNewsMapper.selectTopNews().get(0);
		CompanyNews TopNews2 = companyNewsMapper.selectTopNews().get(1);
		
		model.addAttribute("TopNews1", TopNews1);
		model.addAttribute("TopNews2", TopNews2);
		model.addAttribute("latestBlogList", latestBlogList);
		model.addAttribute("latestSharesList", latestSharesList);
		model.addAttribute("companyHot", compnyNewsList);
		model.addAttribute("stockInfo", stockList);
		model.addAttribute("news", newsList);
		model.addAttribute("companyNewByTime",companyNewsListByTime );
		model.addAttribute("eeolist", eeoList);
		model.addAttribute("cbInfo", cbList);
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		//新增部分--2017年10月19日
		model.addAttribute("stockBeiDou", stockBeiDou);
		model.addAttribute("csNews", csNews);
		return "mypages/index";
	}
	
	//于花蕾 新增 2017年9月27日
	@RequestMapping(value = "/economicNews")
	public String economicNews(Model model,HttpServletRequest req){	
		int count = eeoMapper.selectAllEeoCount();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());

		List<Eeo> eeoList = eeoMapper.selectEeoNewsList(map);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();

		model.addAttribute("securityNews", eeoList);
		model.addAttribute("pager",pager);
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		return "mypages/economicNews";
	}
	
	//于花蕾 新增 2017年9月27日
	@RequestMapping(value = "/industryNews")
	public String industryNews(Model model,HttpServletRequest req){	
		int count = cbMapper.selectAllCbCount();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());

		List<Cb> cbList = cbMapper.selectCbNewsList(map);	
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();	
		model.addAttribute("securityNews", cbList);
		model.addAttribute("pager",pager);
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		return "mypages/industryNews";
	}
	
	//于花蕾 新增 2017年9月27日
	@RequestMapping(value = "/chinaSecurityNews")
	public String chinaSecurityNews(Model model,HttpServletRequest req){	
		int count = csMapper.selectAllCsCount();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		Pager pager = new Pager(count, pageNum);
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());

		List<Cs> csList = csMapper.selectCsNewsList(map);
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();	
		model.addAttribute("securityNews", csList);
		model.addAttribute("pager",pager);
		model.addAttribute("stockHuA", stockHuA);
		model.addAttribute("stockShenA", stockShenA);
		return "mypages/chinaSecurityNews";
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
	 * 股票地域版块（各地区）
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/stockAreaSection")
	public String stockAreaSection(HttpServletRequest request, Model model){
		
		String area = request.getParameter("area");
		List<StockAndCompany> stockAndCompanieList = stockService.selectStockList(area);
		System.out.println(area);
		//List<StockAndCompany> stockAndCompanieList = stockAndCompanyMapper.selectStockList(area);
		System.out.println(stockAndCompanieList);
		System.out.println(stockAndCompanieList.size());
		model.addAttribute("stockAndCompanieList", stockAndCompanieList);
		return "adPage/stockAreaSection";
	}
	
	/**
	 * 股票概念版块（各概念）
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/stockConceptionSection")
	public String stockConceptionSection(HttpServletRequest request, Model model){
		
		String conception = request.getParameter("conception");
		List<StockAndCompany> stockAndCompanieList = stockService.selectStockListByCon(conception);
		System.out.println(conception);
		//List<StockAndCompany> stockAndCompanieList = stockAndCompanyMapper.selectStockList(area);
		System.out.println(stockAndCompanieList);
		System.out.println(stockAndCompanieList.size());
		model.addAttribute("stockAndCompanieList", stockAndCompanieList);
		return "adPage/stockConceptionSection";
	}
	
	/**
	 * 股票概念版块
	 * @param model
	 * @return
	 */
	@SuppressWarnings("null")
	@ResponseBody
	@RequestMapping(value = "/getStockByNum",produces="application/json;charset=UTF-8")
	public String[][]  getStockByNum(HttpServletRequest request, Model model){
		String stock_id = request.getParameter("stock_id");
		System.out.println(stock_id);
		List<ScrapyNews> stocks = scrapyNewsMapper.selectStockByNum(stock_id);
		String stock[][] = new String[stocks.size()][];
		for (int i = 0; i < stocks.size(); i++) {
			stock[i] = new String[10];
			System.out.println(stocks.get(i).getDate());
			stock[i][0] = stocks.get(i).getDate().toString();
			System.out.println(stocks.get(i).getOpen());
			stock[i][1] = stocks.get(i).getOpen().toString();
			stock[i][2] = stocks.get(i).getClose().toString();
			stock[i][5] = stocks.get(i).getLow().toString();
			stock[i][6] = stocks.get(i).getHigh().toString();
			stock[i][9] = "-";
		}
		model.addAttribute("stock", stock);
		return stock;
	}
	
	/**
	 * 振幅排行
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/amplitudeRank")
	public String marketIndex(HttpServletRequest request, Model model){
		int recordCount = stockinfoMapper.selectStockInfoAll().size();
		System.out.println(recordCount);
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 	
		List<Stockinfo> stockinfosAmp = stockinfoService.selectAllStockinfoByAmplitudePaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("stockinfosAmp", stockinfosAmp);
		return "mypages/rank/amplitudeRank";
	}
	
	/**
	 * 换手率排行
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/turnoverRatioRank")
	public String turnoverRatioRank(HttpServletRequest request, Model model){
		int recordCount = stockinfoMapper.selectStockInfoAll().size();
		System.out.println(recordCount);
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 	
		List<Stockinfo> stockinfosTur = stockinfoService.selectAllStockinfoByTurnRatioPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("stockinfosTur", stockinfosTur);
		return "mypages/rank/turnoverRatioRank";
	}
	
	/**
	 * 成交量排行
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/turnVolumeRank")
	public String turnVolumeRank(HttpServletRequest request, Model model){
		int recordCount = stockinfoMapper.selectStockInfoAll().size();
		System.out.println(recordCount);
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 	
		List<Stockinfo> stockinfosTurV = stockinfoService.selectAllStockinfoByTurnVPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("stockinfosTurV", stockinfosTurV);
		return "mypages/rank/turnVolumeRank";
	}
	
	/**
	 * 量比排行
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/equivalentRatioRank")
	public String equivalentRatioRank(HttpServletRequest request, Model model){
		int recordCount = stockinfoMapper.selectStockInfoAll().size();
		System.out.println(recordCount);
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 	
		List<Stockinfo> stockinfosEqui = stockinfoService.selectAllStockinfoByEquiPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("stockinfosEqui", stockinfosEqui);
		return "mypages/rank/equivalentRatioRank";
	}
	
	
	/**
	 * 涨幅排行
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/upRatioRank")
	public String upRatioRank(HttpServletRequest request, Model model){
		int recordCount = stockinfoMapper.selectStockInfoAll().size();
		System.out.println(recordCount);
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 	
		List<Stockinfo> stockinfosUpRi = stockinfoService.selectAllStockinfoByUpRiPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("stockinfosUpRi", stockinfosUpRi);
		return "mypages/rank/upRatioRank";
	}
	/**
	 * 跌幅排行
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/downRatioRank")
	public String downRatioRank(HttpServletRequest request, Model model){
		int recordCount = stockinfoMapper.selectStockInfoAll().size();
		System.out.println(recordCount);
		int pageNum = Integer.parseInt(request.getParameter("pageNum"));
		Pager pager = new Pager(recordCount, pageNum); 	
		List<Stockinfo> stockinfosDownRi = stockinfoService.selectAllStockinfoByDownRiPaper(pager);
		model.addAttribute("pager", pager);
		model.addAttribute("stockinfosDownRi", stockinfosDownRi);
		return "mypages/rank/downRatioRank";
	}
	
	/**
	 * 股票概念版块（各概念）
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/conceptionSectionAll")
	public String stockConceptionSectionAll(HttpServletRequest request, Model model){
		
		List<StockAndCompany> stockAndCompanieList = stockService.selectStockListByConAll();
		System.out.println(stockAndCompanieList);
		System.out.println(stockAndCompanieList.size());
		model.addAttribute("stockAndCompanieList", stockAndCompanieList);
		return "mypages/section/stockConceptionSectionAll";
	}
	
	/**
	 * 股票地域版块（各地区）
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/areaSectionAll")
	public String stockAreaSectionAll(HttpServletRequest request, Model model){
		
		List<StockAndCompany> stockAndCompanieList = stockService.selectStockListByAreaAll();
		model.addAttribute("stockAndCompanieList", stockAndCompanieList);
		return "mypages/section/stockAreaSectionAll";
	}
	
	/**
	 * 最新博客
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/latestBlog")
	public String latestBlog(HttpServletRequest request, Model model){
		
		List<Blog> latestBlogList = blogMapper.selectBlogLatest();
		pagination(request, model, latestBlogList);
		
		List<Blog> hotBlogList = blogMapper.selectBlogHot();
		pagination(request, model, hotBlogList);
		
		List<Blog> renqiBlogList = blogMapper.selectBlogRenqi();
		pagination(request, model, hotBlogList);
		
//		List<Blog> hotBlogList = blogMapper.selectBlogLatest();
//		pagination(request, model, latestBlogList);
		
		model.addAttribute("latestBlogList", latestBlogList);
		model.addAttribute("hotBlogList", hotBlogList);
		model.addAttribute("renqiBlogList", renqiBlogList);
		
		return "mypages/blog/latestBlog";
	}
	
	
	@RequestMapping(value = "/shares")
	public String Shares(HttpServletRequest request, Model model){
		
		List<Shares> latestSharesList = sharesMapper.selectSharesLatest();
		pagination1(request, model, latestSharesList);
		model.addAttribute("latestSharesList", latestSharesList);
		return "mypages/blog/shares";
	}

	private void pagination1(HttpServletRequest request, Model model, List<com.stock.pojo.Shares> latestSharesList) {
		//分页
		//将数据存到session中以便于在前台获取
		model.addAttribute("list",latestSharesList);
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
         if (latestSharesList.size()%15==0) {
        	 countPage = latestSharesList.size()/15;
		}else {
			countPage = latestSharesList.size()/15+1;
		}
         // 在实际开发中我们的总页数可以根据sql语句得到查询到的总条数，然后用总条数除每页的条数得到总页数
         model.addAttribute("countPage", countPage);
	}
		
	

	private void pagination(HttpServletRequest request, Model model, List<Blog> latestBlogList) {
		//分页
				//将数据存到session中以便于在前台获取
				model.addAttribute("list",latestBlogList);
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
		         if (latestBlogList.size()%15==0) {
		        	 countPage = latestBlogList.size()/15;
				}else {
					countPage = latestBlogList.size()/15+1;
				}
		         // 在实际开发中我们的总页数可以根据sql语句得到查询到的总条数，然后用总条数除每页的条数得到总页数
		         model.addAttribute("countPage", countPage);
			}
	
	//于花蕾新增2017年9月29日
		@RequestMapping(value = "/marketIndex")
		public String marketIndex(Model model,HttpServletRequest req){	
			
			int count = stockinfoMapper.selectAllStockInfoCount();
			int pageNum = Integer.parseInt(req.getParameter("pageNum"));
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			Pager pager = new Pager(count, pageNum);
			map.put("start", pager.getStart());
			map.put("pagesize", pager.getPageSize());
			
			List<Stockinfo> stockAllList = stockinfoMapper.selectStockAllList(map);
			model.addAttribute("stockAllList", stockAllList);
			model.addAttribute("pager",pager);
			return "mypages/marketIndex";
		}

		//于花蕾新增2017年9月29日
		@RequestMapping(value = "/marketIndexHuA")
		public String marketIndexHuA(Model model,HttpServletRequest req){	
			int count = stockinfoMapper.selectAllStockHuACount();
			int pageNum = Integer.parseInt(req.getParameter("pageNum"));
			Pager pager = new Pager(count, pageNum);
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			map.put("start", pager.getStart());
			map.put("pagesize", pager.getPageSize());
			
			List<Stockinfo> stockAllList = stockinfoMapper.selectAllStockHuA(map);
			model.addAttribute("stockAllList", stockAllList);
			model.addAttribute("pager",pager);
			return "mypages/marketIndex";
		}
		
		//于花蕾新增2017年9月29日
		@RequestMapping(value = "/marketIndexShenA")
		public String marketIndexShenA(Model model,HttpServletRequest req){	
			int count = stockinfoMapper.selectAllStockShenACount();
			int pageNum = Integer.parseInt(req.getParameter("pageNum"));
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			Pager pager = new Pager(count, pageNum);
			map.put("start", pager.getStart());
			map.put("pagesize", pager.getPageSize());
			
			List<Stockinfo> stockAllList = stockinfoMapper.selectAllStockShenA(map);
			model.addAttribute("stockAllList", stockAllList);
			model.addAttribute("pager",pager);
			return "mypages/marketIndex";
		}
		
		
		//于花蕾新增2017年9月29日
		@RequestMapping(value = "/newStock")
		public String newStock(Model model,HttpServletRequest req){
			int count = newStockMapper.selectAllNewStockCount();
			int pageNum = Integer.parseInt(req.getParameter("pageNum"));
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			Pager pager = new Pager(count, pageNum);
			map.put("start", pager.getStart());
			map.put("pagesize", pager.getPageSize());
			
			List<NewStock> newStockList = newStockMapper.selectAllNewStock(map);
			model.addAttribute("newStockList", newStockList);
			model.addAttribute("pager", pager);
			return "mypages/newStock";
		}
		
		//于花蕾新增2017年9月29日
		@RequestMapping(value = "/AstockNews")
		public String astockNews(Model model,HttpServletRequest req){
			int count = ddzzMapper.selectAllDdzzCount();
			int pageNum = Integer.parseInt(req.getParameter("pageNum"));
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			Pager pager = new Pager(count, pageNum);
			map.put("start", pager.getStart());
			map.put("pagesize", pager.getPageSize());
			List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
			List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();	
			List<Ddzz> newStockList = ddzzMapper.selectDdzzNewsList(map);
			model.addAttribute("stockHuA", stockHuA);
			model.addAttribute("stockShenA", stockShenA);
			model.addAttribute("newStockList", newStockList);
			model.addAttribute("pager", pager);
			return "mypages/AstockNews";
		}
		
		//于花蕾新增2017年9月29日
		@RequestMapping(value = "/AstockNewsDetail")
		public String astockNewsDetail(Model model,HttpServletRequest req){
			
			String id = req.getParameter("id");
			List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
			List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
			Ddzz stockList = ddzzMapper.ddzzNewsDetail(id);
			model.addAttribute("stockHuA", stockHuA);
			model.addAttribute("stockShenA", stockShenA);
			model.addAttribute("stockInfo", stockList);
			return "mypages/AstockNewsDetail";
		}
		
		//于花蕾新增2017年12月7日+8号新增部分
		@RequestMapping(value = "/dzjy")
		public String dzjy(Model model,HttpServletRequest req){
			int count = dzjyMapper.selectAllDzjyCount();
			String pageStr = req.getParameter("pageNum");
			int pageNum = 1;
			if(pageStr != null && !pageStr.equals("")){
				pageNum = Integer.parseInt(pageStr);
			}
			List<String> topDatelist = dzjyMapper.selectTopTenDate();
			//根据10个日期去拿到大宗交易的数据
			List<Dzjy> topDzjyData = dzjyMapper.selectTopData(topDatelist);
			//用于存交易金额
			List<String> topDzjySum = new ArrayList<>();
			List<String> addDzjySum = new ArrayList<>();
			List<String> lowDzjySum = new ArrayList<>();
			List<String> addRate = new ArrayList<>();
			List<String> lowRate = new ArrayList<>();
			for(int i = 0;i < topDatelist.size(); i++){
				float sum = 0;
				float addsum = 0;
				float lowsum = 0;
				String tempDate = topDatelist.get(i);
				for(int j = 0 ; j < topDzjyData.size(); j ++){
					if(tempDate.equals(topDzjyData.get(j).getTransactionDate())){
						float temp1 = Float.parseFloat(topDzjyData.get(j).getDealNum());
						float temp2 = Float.parseFloat(topDzjyData.get(j).getDealPrice());
						float temp = temp1 * temp2;
						sum += temp;
						String s = "-";
						Boolean utemp1 = (topDzjyData.get(j).getPremiumRate()).startsWith(s);
						if(utemp1){
							lowsum += temp;
						}else {
							addsum += temp;
						}
						topDzjyData.remove(j);
						j--;
					}else {
						continue;
					}
				topDzjySum.add(String.valueOf(sum));
				addDzjySum.add(String.valueOf(addsum));
				lowDzjySum.add(String.valueOf(lowsum));
				float add = addsum/sum;
				float low = (1-add);
				addRate.add(String.valueOf(add));
				lowRate.add(String.valueOf(low));
			}
		}
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Pager pager = new Pager(count, pageNum);
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<Dzjy> dzjyList = dzjyMapper.selectAllDzjy(map);
		
		
		//买方活跃营业部+所有数据
		List<String> pursing = dzjyMapper.selectDepartmentPursing(topDatelist);
		List<Dzjy> topTenPursing = dzjyMapper.selectTopTenDepartmentPursing(topDatelist);
		//卖方活跃营业部
		List<String> saling = dzjyMapper.selectDepartmentSale(topDatelist);
		List<Dzjy> topTenSaling = dzjyMapper.selectTopTenDepartmentSale(topDatelist);
	
		//先统计、再计算前10个买方活跃营业部
		List<Integer> purse = new ArrayList<>();
		List<String> stockNum = new ArrayList<>();
		List<Integer> stockSumPurse = new ArrayList<>();
		List<Float> stockMuchPurse = new ArrayList<>();
		Map<String, List<Float>> purseResult = new LinkedHashMap<>();
		for(int i = 0 ;i < pursing.size(); i++){
			int k1 = 0;//用于记录近10日活跃次数
			int k2 = 0;//用于记录近10日股票成交数量
			float k3 = 0;//用于记录近10日股票成交额
			List<Float> all = new ArrayList<>();
			for(int j = 0; j <topTenPursing.size();j++){
				String temp1 = topTenPursing.get(j).getPurchasingDepartment();
				if((pursing.get(i)).equals(temp1)){
					k1++;
					if(!stockNum.contains(topTenPursing.get(j).getStockId())){
						stockNum.add(topTenPursing.get(j).getStockId());
						k2++;
					}
					float temp2 = Float.parseFloat(topTenPursing.get(j).getDealNum());
					float temp3 = Float.parseFloat(topTenPursing.get(j).getDealPrice());
					k3 += temp2*temp3;
					topTenPursing.remove(j);
					j--;
				}else{
					continue;
				}
			}
			purse.add(k1);
			stockSumPurse.add(k2);
			stockMuchPurse.add(k3);
			all.add((float)k1);
			all.add((float)k2);
			all.add(k3);
			purseResult.put(pursing.get(i),all);
		}
		//这里将map.entrySet()转换成list
		List<Map.Entry<String,List<Float>>> llist = new ArrayList<Map.Entry<String,List<Float>>>(purseResult.entrySet());
		  //然后通过比较器来实现排序
        Collections.sort(llist,new Comparator<Map.Entry<String,List<Float>>>() {
            //升序排序
			@Override
			public int compare(Entry<String, List<Float>> o1, Entry<String, List<Float>> o2) {
				// TODO Auto-generated method stub
				List<Float> s1 = o1.getValue();  
	            List<Float> s2 = o2.getValue();
				return (s2.get(0)).compareTo(s1.get(0));
			}    
        });
       Map<String, List<Float>> mapResult1 = new LinkedHashMap<>();
        for(int i =0; i < 15;i++){//15是首页输出个数
        	mapResult1.put(llist.get(i).getKey(),llist.get(i).getValue());
        }
		//先统计、再计算前10个卖方活跃营业部
		List<Integer> sale = new ArrayList<>();
		List<String> stockNumSale = new ArrayList<>();
		List<Integer> stockSumSale = new ArrayList<>();
		List<Float> stockMuchSale = new ArrayList<>();
		Map<String, List<Float>> saleResult = new LinkedHashMap<String, List<Float>>();
		for(int i = 0 ;i < saling.size(); i++){
			int k1 = 0;//用于记录近10日活跃次数
			int k2 = 0;//用于记录近10日股票成交数量
			float k3 = 0;//用于记录近10日股票成交额
			List<Float> all = new ArrayList<>();
			for(int j = 0; j <topTenSaling.size();j++){
				String temp1 = topTenSaling.get(j).getSalesDepartment();
				if((saling.get(i)).equals(temp1)){
					k1++;
					if(!stockNumSale.contains(topTenSaling.get(j).getStockId())){
						stockNumSale.add(topTenSaling.get(j).getStockId());
						k2++;
					}
					float temp2 = Float.parseFloat(topTenSaling.get(j).getDealNum());
					float temp3 = Float.parseFloat(topTenSaling.get(j).getDealPrice());
					k3 += temp2*temp3;
					topTenSaling.remove(j);
					j--;
				}else{
					continue;
				}
			}
			sale.add(k1);
			stockSumSale.add(k2);
			stockMuchSale.add(k3);
			all.add((float)k1);
			all.add((float)k2);
			all.add(k3);
			saleResult.put(saling.get(i),all);
		}
		//这里将map.entrySet()转换成list
		List<Map.Entry<String,List<Float>>> list = new ArrayList<Map.Entry<String,List<Float>>>(saleResult.entrySet());
		  //然后通过比较器来实现排序
        Collections.sort(list,new Comparator<Map.Entry<String,List<Float>>>() {
            //升序排序
			@Override
			public int compare(Entry<String, List<Float>> o1, Entry<String, List<Float>> o2) {
				// TODO Auto-generated method stub
				List<Float> s1 = o1.getValue();  
	            List<Float> s2 = o2.getValue();
				return (s2.get(0)).compareTo(s1.get(0));
			}    
        });
       Map<String, List<Float>> mapResult2 = new LinkedHashMap<>();
        for(int i =0; i < 15;i++){//15是首页输出个数
        	mapResult2.put(list.get(i).getKey(),list.get(i).getValue());
        }
        //营业部信息
        List<String> department = dzjyMapper.selectDepartmentPur();
        System.out.println(department);
        //合并某些信息
        List<String> cutDepartment = new ArrayList<>();
        for(int i = 0; i < department.size(); i++){
        	String temp = department.get(i);
        	Matcher matcher=Pattern.compile("证券").matcher(temp);
        	if(matcher.find()){  
        	     System.out.println(matcher.start());  
        	     int p = matcher.start()+2;
        	     temp = temp.substring(0, p);
        	 }
        	else{
        		continue;
        	}
        	if (cutDepartment.size() == 0) {
				cutDepartment.add(temp);
				continue;
			}
        	if (temp.length()>10) {
				continue;
			}
        	for(int j = 0 ; j < cutDepartment.size();j++){
    	    	 if(temp.equals(cutDepartment.get(j))){
    	    		 break;
    	    	 }else {
					if (j == cutDepartment.size() - 1) {
						cutDepartment.add(temp);
					}else{
						continue;
					}
				}
    	     }
        }
		model.addAttribute("topDatelist",topDatelist );
		model.addAttribute("topDzjySum",topDzjySum );
		model.addAttribute("addDzjySum",addDzjySum );
		model.addAttribute("lowDzjySum",lowDzjySum );
		model.addAttribute("addRate",addRate );
		model.addAttribute("lowRate", lowRate);
		model.addAttribute("dzjyList", dzjyList);
		model.addAttribute("pager", pager);
		model.addAttribute("mapResult2",mapResult2);
		JSONObject jsonObject2 = new JSONObject();
		jsonObject2.put("map2", mapResult2);
		model.addAttribute("map2",jsonObject2);
		model.addAttribute("mapResult1",mapResult1);
		JSONObject jsonObject1 = new JSONObject();
		jsonObject1.put("map1", mapResult1);
		model.addAttribute("map1",jsonObject1);
		model.addAttribute("cutdepartment",cutDepartment );
		return "mypages/dzjy";
	}
		
		//2017年12月7日新增  第一次生成图
		@RequestMapping(value = "/dzjySum",produces="application/json;charset=UTF-8")
		@ResponseBody
		public  Map<Object,Object> getdzjySumGraph(HttpServletRequest req, Model model,HttpServletResponse rsp){
			//首先拿到50个最近的日期
			List<String> topDatelist = dzjyMapper.selectTopDzjyDate();
			//根据50个日期去拿到大宗交易的数据
			List<Dzjy> topDzjyData = dzjyMapper.selectTopData(topDatelist);
			//用于存交易金额
			List<String> topDzjySum = new ArrayList<>();
			Map<String, String> map = new LinkedHashMap<>();
			for(int i = 0;i < topDatelist.size(); i++){
				float sum = 0;
				String tempDate = topDatelist.get(i);
				for(int j = 0 ; j < topDzjyData.size(); j ++){
					if(tempDate.equals(topDzjyData.get(j).getTransactionDate())){
						float temp1 = Float.parseFloat(topDzjyData.get(j).getDealNum());
						float temp2 = Float.parseFloat(topDzjyData.get(j).getDealPrice());
						sum += temp1 * temp2;
						topDzjyData.remove(j);
						j--;
					}else {
						continue;
					}
				}
				topDzjySum.add(String.valueOf(sum));
			}
			Map<Object, Object> map2 = new LinkedHashMap<>();
			map2.put("date", topDatelist);
			map2.put("sumMap", topDzjySum);
			System.out.println(map2);
			return map2;
		}
		
		
		@RequestMapping(value = "/ajaxSelectApartmentDetail",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void shareholderDetail(Model model,HttpServletRequest req,HttpServletResponse rsp){
			String roleIdTwo = req.getParameter("apartmentName");
			List<Dzjy> apartmentDetail = dzjyMapper.selectDepartPartOne(roleIdTwo);
			List<Dzjy> apartmentDetailTwo = dzjyMapper.selectDepartPartTwo(roleIdTwo);
			apartmentDetail.addAll(apartmentDetailTwo);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("apartmentDetail", apartmentDetail);
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
		
		//2017年12月7日  异步生成图
		@RequestMapping(value = "/ajaxSelectDzjyData",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void stockDzjy(Model model,HttpServletRequest req,HttpServletResponse rsp){
		
			String startDate = req.getParameter("startDate");		
			String endDate = req.getParameter("endDate");	
			List<String> topDatelist = dzjyMapper.ajaxSelectData(startDate, endDate);
			//根据日期去拿到大宗交易的数据
			List<Dzjy> topDzjyData = dzjyMapper.selectTopData(topDatelist);
			//用于存交易金额
			List<String> topDzjySum = new ArrayList<>();
			Map<String, String> map = new LinkedHashMap<>();
			for(int i = 0;i < topDatelist.size(); i++){
				float sum = 0;
				String tempDate = topDatelist.get(i);
				for(int j = 0 ; j < topDzjyData.size(); j ++){
					if(tempDate.equals(topDzjyData.get(j).getTransactionDate())){
						float temp1 = Float.parseFloat(topDzjyData.get(j).getDealNum());
						float temp2 = Float.parseFloat(topDzjyData.get(j).getDealPrice());
						sum += temp1 * temp2;
						topDzjyData.remove(j);
						j--;
					}else {
						continue;
					}
				}
				topDzjySum.add(String.valueOf(sum));
			}
			Map<Object, Object> map2 = new LinkedHashMap<>();
			map2.put("date", topDatelist);
			map2.put("sumMap", topDzjySum);
			System.out.println(map2);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("map2", map2);
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
		/**
		 * 2017年１２月１４日　　龙虎榜单页面
		 */
		@RequestMapping(value = "/longhubang")
		public String longHuBang(Model model,HttpServletRequest req){
			List<String> allDate = longhubangMapper.selectAllDate();
			String temp = allDate.get(0);
			List<Longhubang> latestInfo = longhubangMapper.selectSomeDateData(temp);
			//三日龙虎榜单的显示
			List<String> threeDate = new ArrayList<>();
			threeDate.add(allDate.get(0));
			threeDate.add(allDate.get(1));
			threeDate.add(allDate.get(2));
			List<Longhubang> dataOfThree = longhubangMapper.selectDataOfThree(threeDate);
			Map<String, Integer> threeDaylist = new LinkedHashMap<>();
			Map<String,Object> threeMoneylist = new LinkedHashMap<>();
			
			for(int i = 0 ; i <dataOfThree.size();i++){
				Float[] money = new Float[]{(float) 0.0,(float) 0.0,(float) 0.0,(float) 0.0,(float) 0.0,(float) 0.0};
				String t = dataOfThree.get(i).getStockName();
				Float[] o = (Float[]) threeMoneylist.get(t);
				if (threeDaylist.containsKey(t)) {
					threeDaylist.put(t, threeDaylist.get(t) + 1);	
				} else {
					threeDaylist.put(t, 1);
				}
				String ll = dataOfThree.get(i).getNetPurchase();
				String tt = dataOfThree.get(i).getNetTotalturnover();
				money[4] = Float.parseFloat(ll)/((Float.parseFloat(tt)/100));//总成交额
				money[0] = (float)threeDaylist.get(t);
				if(dataOfThree.get(i).getNetPurchase().startsWith("-")){
					//净卖出额
					String one = dataOfThree.get(i).getNetPurchase().substring(1);
				    if(o != null){
				    	money[2] = o[2] + Float.parseFloat(one);
				    	money[3] = o[1] - money[2];
				    	money[1] = o[1];
				    	money[4] += o[4];
				    	money[5] = money[3]/money[4];
				    }else {
						money[2] = Float.parseFloat(one);
					}
				    
				}else{
					//净买入额
					String two = dataOfThree.get(i).getNetPurchase();
					 if(o != null){
					    	money[1] = o[1] + Float.parseFloat(two);
					    	money[3] = money[1] - o[2];
					    	money[2] = o[2];
					    	money[4] += o[4];
					    	money[5] = money[3]/money[4];
					    }else {
							money[1] = Float.parseFloat(two);
						}
					
				}
				threeMoneylist.put(t,money);
			}
			model.addAttribute("threeMoneylist",threeMoneylist );
	        model.addAttribute("mapResult2",threeDaylist);
			model.addAttribute("latestInfo",latestInfo);
			return "mypages/longhubang";
		}
		//2017年12月14日  异步查询  龙虎榜单
		@RequestMapping(value = "/ajaxSelectSomeData",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void longhuSomeData(Model model,HttpServletRequest req,HttpServletResponse rsp){
		
			String startDate = req.getParameter("startDate");		
			List<Longhubang> someData = longhubangMapper.selectSomeDateData(startDate);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("someData", someData);
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
		//2017年12月17日新增
		@RequestMapping(value = "/ajaxSelectlgb",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void shareholderother(Model model,HttpServletRequest req,HttpServletResponse rsp){
			
			String roleId = req.getParameter("roleId");
			int temp = Integer.parseInt(roleId);
			List<String> allDate = longhubangMapper.selectAllDate();
			List<String> threeDate = new ArrayList<>();
			for(int i = 0; i < temp;i++){
				threeDate.add(allDate.get(i));
			}
			List<Longhubang> dataOfThree = longhubangMapper.selectDataOfThree(threeDate);
			Map<String, Integer> threeDaylist = new LinkedHashMap<>();
			Map<String,Object> threeMoneylist = new LinkedHashMap<>();
			
			for(int i = 0 ; i <dataOfThree.size();i++){
				Float[] money = new Float[]{(float) 0.0,(float) 0.0,(float) 0.0,(float) 0.0,(float) 0.0,(float) 0.0};
				String t = dataOfThree.get(i).getStockName();
				Float[] o = (Float[]) threeMoneylist.get(t);
				if (threeDaylist.containsKey(t)) {
					threeDaylist.put(t, threeDaylist.get(t) + 1);	
				} else {
					threeDaylist.put(t, 1);
				}
				String ll = dataOfThree.get(i).getNetPurchase();
				String tt = dataOfThree.get(i).getNetTotalturnover();
				money[4] = Float.parseFloat(ll)/((Float.parseFloat(tt)/100));//总成交额
				money[0] = (float)threeDaylist.get(t);
				if(dataOfThree.get(i).getNetPurchase().startsWith("-")){
					//净卖出额
					String one = dataOfThree.get(i).getNetPurchase().substring(1);
				    if(o != null){
				    	money[2] = o[2] + Float.parseFloat(one);
				    	money[3] = o[1] - money[2];
				    	money[1] = o[1];
				    	money[4] += o[4];
				    	money[5] = money[3]/money[4];
				    }else {
						money[2] = Float.parseFloat(one);
					}
				    
				}else{
					//净买入额
					String two = dataOfThree.get(i).getNetPurchase();
					 if(o != null){
					    	money[1] = o[1] + Float.parseFloat(two);
					    	money[3] = money[1] - o[2];
					    	money[2] = o[2];
					    	money[4] += o[4];
					    	money[5] = money[3]/money[4];
					    }else {
							money[1] = Float.parseFloat(two);
						}
					
				}
				threeMoneylist.put(t,money);
			}
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("threeMoneylist", threeMoneylist);
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

		/**
		 * 博客详情
		 */
		@RequestMapping(value = "/blogDetail")
		public String blogDetail(Model model,HttpServletRequest req){
			String blogId = req.getParameter("blogId");
			Blog blogDetail = blogMapper.selectByPrimaryKey(blogId);
			List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
			List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
			List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
			model.addAttribute("stockHuA", stockHuA);
			model.addAttribute("stockShenA", stockShenA);
			model.addAttribute("stockInfo", stockList);
			model.addAttribute("blogDetail", blogDetail);
			return "mypages/blog/blogDetail";
		}
		
		/**
		 * 博客详情
		 * @param model
		 * @param req
		 * @return
		 */
		@RequestMapping(value = "/sharesDetail")
		public String sharesDetail(Model model,HttpServletRequest req){
			String sharesId = req.getParameter("sharesId");
			Shares sharesDetail = sharesMapper.selectSharesByPrimaryKey(sharesId);
			List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
			List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();
			List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
			model.addAttribute("stockHuA", stockHuA);
			model.addAttribute("stockShenA", stockShenA);
			model.addAttribute("stockInfo", stockList);
			model.addAttribute("sharesDetail", sharesDetail);
			return "mypages/blog/sharesDetail";
		}

}
