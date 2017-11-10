package com.stock.controller;


import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.stock.mapper.CompanyBulletinMapper;
import com.stock.mapper.CompanyDetailMapper;
import com.stock.mapper.CompanyExecutiveMapper;
import com.stock.mapper.CompanyMapper;
import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.IndustryNewsinfoMapper;
import com.stock.mapper.IndustryStatusMapper;
import com.stock.mapper.MarketPerformanceMapper;
import com.stock.mapper.StockholderBasicMapper;
import com.stock.mapper.StockholderRelativeMapper;
import com.stock.mapper.StockinfoMapper;
import com.stock.pojo.Company;
import com.stock.pojo.CompanyBulletin;
import com.stock.pojo.CompanyDetail;
import com.stock.pojo.CompanyExecutive;
import com.stock.pojo.CompanyNews;
import com.stock.pojo.IndustryNewsinfo;
import com.stock.pojo.IndustryStatus;
import com.stock.pojo.MarketPerformance;
import com.stock.pojo.StockholderBasic;
import com.stock.pojo.StockholderRelative;
import com.stock.pojo.Stockinfo;
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
		System.out.println("1111111111111");
		model.addAttribute("stockinfo",stockinfo );
		model.addAttribute("industryList",industryList );
		model.addAttribute("stockNum", stockNum);
		model.addAttribute("company", company);
		model.addAttribute("stocklist",stocklist );
		model.addAttribute("bulletins",bulletins );
		model.addAttribute("companyNewsList",companyNewsList );
		return "mypages/company";
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
}
