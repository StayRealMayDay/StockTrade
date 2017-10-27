package com.stock.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.stock.mapper.BlogMapper;
import com.stock.mapper.CbMapper;
import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.CsMapper;
import com.stock.mapper.DdzzMapper;
import com.stock.mapper.DzjyMapper;
import com.stock.mapper.EeoMapper;
import com.stock.mapper.NewStockMapper;
import com.stock.mapper.NewsTypeMapper;
import com.stock.mapper.ScrapyNewsMapper;
import com.stock.mapper.SharesMapper;
import com.stock.mapper.StatisticsMapper;
import com.stock.mapper.StockAndCompanyMapper;
import com.stock.mapper.StockMapper;
import com.stock.mapper.StockTypeMapper;
import com.stock.mapper.StockinfoMapper;
import com.stock.pojo.Blog;
import com.stock.pojo.Cb;
import com.stock.pojo.Company;

import com.stock.pojo.CompanyDetail;
import com.stock.pojo.CompanyNews;
import com.stock.pojo.Cs;
import com.stock.pojo.Ddzz;
import com.stock.pojo.Dzjy;

import com.stock.pojo.Eeo;
import com.stock.pojo.NewStock;
import com.stock.pojo.NewsType;
import com.stock.pojo.ScrapyNews;
import com.stock.pojo.Stock;
import com.stock.pojo.StockAndCompany;
import com.stock.pojo.StockType;
import com.stock.pojo.Stockinfo;
import com.stock.pojo.Shares;
import com.stock.service.StockService;
import com.stock.service.StockinfoService;
import com.stock.utils.Pager;
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

	//于花蕾新增  2017年9月27日
	@RequestMapping(value = "/index")
	public String index1(Model model){
		List<Cb> cbList = cbMapper.selectSomeCbNews();
		List<Eeo> eeoList = eeoMapper.selectSomeEeoNews();
		List<CompanyNews> companyNewsListByTime = companyNewsMapper.selectNewsByTime();
		List<Stockinfo> stockList = stockinfoMapper.selectStockInfo();
		List<CompanyNews> newsList = companyNewsMapper.selectAllNews();	
		List<CompanyNews> compnyNewsList = companyNewsMapper.selectNewsByHotRatios();
		List<Stockinfo> stockHuA = stockinfoMapper.selectStockHuA();
		List<Stockinfo> stockShenA = stockinfoMapper.selectStockShenA();

		
		List<Stockinfo> stockBeiDou = stockinfoMapper.selectStockBeiDou();
		List<Cs> csNews = csMapper.selectAllNews();
		List<com.stock.pojo.Shares> latestSharesList = sharesMapper.selectSharesLatest();
		List<Blog> latestBlogList = blogMapper.selectBlogLatest();
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
		
		//于花蕾新增2017年9月29日
		@RequestMapping(value = "/dzjy")
		public String dzjy(Model model,HttpServletRequest req){
			int count = dzjyMapper.selectAllDzjyCount();
			int pageNum = Integer.parseInt(req.getParameter("pageNum"));
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			Pager pager = new Pager(count, pageNum);
			map.put("start", pager.getStart());
			map.put("pagesize", pager.getPageSize());
			
			List<Dzjy> dzjyList = dzjyMapper.selectAllDzjy(map);
			model.addAttribute("dzjyList", dzjyList);
			model.addAttribute("pager", pager);
			return "mypages/dzjy";
		}
		
		/**
		 * 博客详情
		 * @param model
		 * @param req
		 * @return
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
