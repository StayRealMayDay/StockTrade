package com.stock.controller;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.stock.controller.MapKeyComparator;
import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.math.stat.descriptive.summary.Sum;
import org.apache.commons.math3.filter.KalmanFilter;
import org.apache.commons.math3.geometry.Space;
import org.apache.mahout.classifier.sgd.TPrior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import com.alibaba.fastjson.JSONObject;
import com.ibm.icu.text.ChineseDateFormat.Field;
import com.mysql.fabric.Response;
import com.mysql.fabric.xmlrpc.base.Array;
import com.stock.mapper.CapitalFlowMapper;
import com.stock.mapper.CompanyBulletinMapper;
import com.stock.mapper.CompanyDetailMapper;
import com.stock.mapper.CompanyExecutiveMapper;
import com.stock.mapper.CompanyMapper;
import com.stock.mapper.CompanyNewsMapper;
import com.stock.mapper.IndustryNewsinfoMapper;
import com.stock.mapper.IndustryStatusMapper;
import com.stock.mapper.JijinHoldstockMapper;
import com.stock.mapper.MarketPerformanceMapper;
import com.stock.mapper.MiddleJijinMapper;
import com.stock.mapper.NewtopcirculationMapper;
import com.stock.mapper.NewtopstockinfoMapper;
import com.stock.mapper.RankandpredictMapper;
import com.stock.mapper.DzjyMapper;
import com.stock.mapper.GuotaianStocknameMapper;
import com.stock.mapper.HolderstatisticMapper;
import com.stock.mapper.HolderyearstatisticMapper;
import com.stock.mapper.HoldinglevelrelationshipMapper;
import com.stock.mapper.StockDetailMapper;
import com.stock.mapper.StockHolderNumberMapper;
import com.stock.mapper.StockTempMapper;
import com.stock.mapper.StockholderBasicMapper;
import com.stock.mapper.StockholderRelativeMapper;
import com.stock.mapper.StockinfoMapper;
import com.stock.mapper.StocklirunMapper;
import com.stock.mapper.StockpricechangeMapper;
import com.stock.mapper.TopStockCirculationHolderMapper;
import com.stock.mapper.TopStockHolderMapper;
import com.stock.mapper.TotalShareStructureMapper;
import com.stock.pojo.CapitalFlow;
import com.stock.pojo.Company;
import com.stock.pojo.CompanyBulletin;
import com.stock.pojo.CompanyDetail;
import com.stock.pojo.CompanyExecutive;
import com.stock.pojo.CompanyNews;
import com.stock.pojo.Dzjy;
import com.stock.pojo.Holderstatistic;
import com.stock.pojo.HolderstatisticWithBLOBs;
import com.stock.pojo.Holderyearstatistic;
import com.stock.pojo.HolderyearstatisticWithBLOBs;
import com.stock.pojo.Holdinglevelrelationship;
import com.stock.pojo.IndustryDistribution;
import com.stock.pojo.IndustryNewsinfo;
import com.stock.pojo.IndustryStatus;
import com.stock.pojo.MarketPerformance;
import com.stock.pojo.MiddleJijin;
import com.stock.pojo.Newtopcirculation;
import com.stock.pojo.Newtopstockinfo;
import com.stock.pojo.Rankandpredict;
import com.stock.pojo.StockTemp;
import com.stock.pojo.StockholderBasic;
import com.stock.pojo.StockholderRelative;
import com.stock.pojo.Stockinfo;
import com.stock.pojo.Stocklirun;
import com.stock.pojo.Stockpricechange;
import com.stock.pojo.StockDetail;
import com.stock.pojo.StockHolderNumber;
import com.stock.pojo.TopStockCirculationHolder;
import com.stock.pojo.TopStockHolder;
import com.stock.pojo.TotalShareStructure;
import com.stock.utils.JsonUtil;
import com.stock.utils.Pager;
import com.sun.jersey.api.representation.Form;
import net.sf.json.JSONArray;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;  
import java.io.Writer;  
  
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
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
	DzjyMapper dzjyMapper;
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
	@Autowired
	StockHolderNumberMapper stockHolderNumberMapper;
	@Autowired
	TopStockCirculationHolderMapper topStockCirculationMapper;
	@Autowired
	TopStockHolderMapper topStockHolderMapper;
	@Autowired
	TotalShareStructureMapper totalShareStructureMapper;
	@Autowired
	StockDetailMapper stockDetailMapper;
	@Autowired
	HoldinglevelrelationshipMapper holdinglevelrelationshipMapper;
	@Autowired
	StockpricechangeMapper stockPriceChangeMapper;
	@Autowired
	StocklirunMapper stockLiRunMapper;
	@Autowired
	NewtopcirculationMapper newTopCirculationMapper;
	@Autowired
	NewtopstockinfoMapper newtopstockinfoMapperMapper;
	@Autowired 
	JijinHoldstockMapper jiJinHoldestockMapper;
	@Autowired 
	MiddleJijinMapper middleJiJinMapper;
	@Autowired
	GuotaianStocknameMapper guoTaiAnStockNameMapper;
	@Autowired
	HolderstatisticMapper holderstatisticMapper;
	@Autowired
	HolderyearstatisticMapper holderyearstatisticMapper;
	
	
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
		 Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
        Matcher m = p.matcher(stockNum);
        Company company;
        if (m.find()) {
        	company = companyMapper.selectCompanyByStockName(stockNum);
        }else {
        	company = companyMapper.selectCompanyByStockNum(stockNum);
		}
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
		
		
//		//把所有类目偏好为空的拿出来存到List里面-------------求行业门类偏好的全过程
//		List<HolderstatisticWithBLOBs> daleiNullHolder = holderstatisticMapper.daLeiP();
//		//对于每一个股东作如下操作：
//		for(int i = 0; i < daleiNullHolder.size(); i++){
//			String tempHolder = daleiNullHolder.get(i).getStockholder();
//			String[] hangYe = daleiNullHolder.get(i).getIndustryDalei().split("\\s+");
//			List<HolderyearstatisticWithBLOBs> perfectInfo = holderyearstatisticMapper.perfertOne(tempHolder);
//			if(perfectInfo.size()==0){
//				continue;
//			}
//			int aFenzi =  Integer.valueOf(perfectInfo.get(0).getSumtouzixingwei());
//			int aFenmu = Integer.valueOf(perfectInfo.get(0).getSumstockgeshu());
//			double partAll = 0;
//			Map<String,Double > statistic = new TreeMap<>();
//			for(int m = 0; m < hangYe.length; m++){
//				String hangOne = hangYe[m];	
//				double partTwo = 0;
//				for(int j = 0; j < perfectInfo.size(); j++){
//					int tongji = 0;
//					String industry = perfectInfo.get(j).getIndustrydaleide();
//					String[] indust = industry.split("\\s+");
//					for(String ind : indust){
//						if(hangOne.equals(ind)){
//							tongji++;
//						}
//					}
//					double l1 = (double)1/(j+1);
//					double l2 = (double)tongji/indust.length;
//					partTwo +=  l1 * l2;
//				}
//				partAll = aFenzi/aFenmu +  partTwo;
//				statistic.put(hangOne,partAll );
//			}
//		
//			List<Map.Entry<String, Double>> wordMap = new ArrayList<Map.Entry<String, Double>>(statistic.entrySet());  
//			Collections.sort(wordMap, new Comparator<Map.Entry<String, Double>>() {//根据value排序  
//			    public int compare(Map.Entry<String, Double> o1,  
//			            Map.Entry<String, Double> o2) {  
//			        double result = o2.getValue() - o1.getValue();  
//			        if(result > 0)  
//			            return 1;  
//			        else if(result == 0)  
//			            return 0;  
//			        else   
//			            return -1;  
//			    }  
//			});  
//			String z = "";
//			int x = 0;
//			for (Map.Entry<String, Double> entry : wordMap) {
//				
//	           z += entry.getKey()+" ";
//	           x++;
//	           if(x == 5){
//	        	   break;
//	           }
//	        }
//			holderstatisticMapper.daLeiPerfertInfo(z, tempHolder);
//			System.out.println(i);
//		}
//		List<String> geren = holderstatisticMapper.perfertGeRen();
//		Map<String, Integer> numMapGeren = new HashMap<String, Integer>();
//		for(int i = 0; i <geren.size(); i++){
//			String single = geren.get(i);
//			String[] singleOne = single.split(" ");
//			for (String word : singleOne) {
//				if(word.equals("")){
//					continue;
//				}else{
//					if (numMapGeren.containsKey(word)) {
//						numMapGeren.put(word, numMapGeren.get(word) + 1);
//					} else {
//						numMapGeren.put(word, 1);
//					}
//				}
//				
//			}
//		}
//		
//		List<Map.Entry<String, Integer>> gerenAll = new ArrayList<Map.Entry<String, Integer>>(numMapGeren.entrySet());  
//		Collections.sort(gerenAll, new Comparator<Map.Entry<String, Integer>>() {//根据value排序    
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				int result = o2.getValue() - o1.getValue(); 
//				if(result > 0)  
//		            return 1;  
//		        else if(result == 0)  
//		            return 0;  
//		        else   
//		            return -1;  
//			}  
//		});  
//		
//		
//		List<String> jijin = holderstatisticMapper.perfertJiJin();
//		Map<String, Integer> numMapJijin = new HashMap<String, Integer>();
//		for(int i = 0; i < jijin.size();i++){
//			String ji = jijin.get(i);
//			String[] jiOne = ji.split(" ");
//			for (String word : jiOne) {
//				if(word.equals("")){
//					continue;
//				}else{
//					if (numMapJijin.containsKey(word)) {
//						numMapJijin.put(word, numMapJijin.get(word) + 1);
//					} else {
//						numMapJijin.put(word, 1);
//					}
//				}
//			}
//		}
//		
//		List<Map.Entry<String, Integer>> jijinAll = new ArrayList<Map.Entry<String, Integer>>(numMapJijin.entrySet());  
//		Collections.sort(jijinAll, new Comparator<Map.Entry<String, Integer>>() {//根据value排序    
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				int result = o2.getValue() - o1.getValue(); 
//				if(result > 0)  
//		            return 1;  
//		        else if(result == 0)  
//		            return 0;  
//		        else   
//		            return -1;  
//			}  
//		});  
//		
//		List<String> jigou = holderstatisticMapper.perfertJiGou();
//		Map<String, Integer> numMapJigou = new HashMap<String, Integer>();
//		for(int i=0;i < jigou.size();i++){
//			String jig = jigou.get(i);
//			String[] jigOne = jig.split(" ");
//			for (String word : jigOne) {
//				if(word.equals("")){
//					continue;
//				}else{
//					if (numMapJigou.containsKey(word)) {
//						numMapJigou.put(word, numMapJigou.get(word) + 1);
//					} else {
//						numMapJigou.put(word, 1);
//					}
//				}
//			}
//		}
//		
//		List<Map.Entry<String, Integer>> jigouAll = new ArrayList<Map.Entry<String, Integer>>(numMapJigou.entrySet());  
//		Collections.sort(jigouAll, new Comparator<Map.Entry<String, Integer>>() {//根据value排序    
//			@Override
//			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
//				// TODO Auto-generated method stub
//				int result = o2.getValue() - o1.getValue(); 
//				if(result > 0)  
//		            return 1;  
//		        else if(result == 0)  
//		            return 0;  
//		        else   
//		            return -1;  
//			}  
//		}); 
//		
		
		
		//计算地域偏好的全过程。
//		String z = "";
//		//首先针对基金计算其地域偏好
//		List<String> jijinName = holderstatisticMapper.jiJinNameForQ();
//		for(int i = 0;i < jijinName.size(); i++){
//			//--------------------对于某一个基金股东，求所有地区 的列表-----------------------------
//			String jijin = jijinName.get(i);
//			   // 拿到所有年份的地区。
//			List<HolderyearstatisticWithBLOBs> perfectInfo = holderyearstatisticMapper.perfertOne(jijin);
//			if(perfectInfo.size()==0){
//				continue;
//			}
//			   //针对所有年份统计，得到---------所有地区在全集上对应的投资次数
//			Map<String, Integer> numMapJijin = new HashMap<String, Integer>();
//			List<String> diqu = new ArrayList<>();
//			int pOneFenMu = 0;
//			for(int j = 0; j <perfectInfo.size();j++){
//				//首先，我们需要得到一个股东投资过的所有地区 的列表。
//				String[] diqutemp = perfectInfo.get(j).getStockareade().split("\\s+");
//				pOneFenMu += diqutemp.length;
//				for(String word : diqutemp){
//					if(word.equals("")){
//						continue;
//					}else{
//						if (numMapJijin.containsKey(word)) {
//							numMapJijin.put(word, numMapJijin.get(word) + 1);
//						} else {
//							numMapJijin.put(word, 1);
//							diqu.add(word);
//						}
//					}
//				}
//			}
//			//--------------------此时，我们得到了所有地区 的列表-------------------------------------
//			//其中diqu列表中存放的是投资过的所有地区。  numMapJijin中存放的是地区 和投资次数的键值对。
//			//-----------------针对其中的每一个地区，我们需要计算一个数值，用于最后的比较-------------------
//			Map<String,Double > statistic = new TreeMap<>();
//			for(int j = 0; j < diqu.size(); j++){
//				String diquOne = diqu.get(j);
//				double partTwo = 0;
//				for(int o = 0 ; o < perfectInfo.size(); o++){
//					int num = 0;
//					String[] diqutemp = perfectInfo.get(o).getStockareade().split("\\s+");
//					for(String word : diqutemp){
//						if(word.equals("")){
//							continue;
//						}else{
//							if (word.equals(diquOne)) {
//								num++;
//							} 
//						}
//					}
//					//判断时间
//					String time = perfectInfo.get(o).getYear();
//					int cha = 2017 - Integer.parseInt(time) + 1;
//					double c = (double) 1 / cha;
//					partTwo = (double)(partTwo + c * num /(diqutemp.length)) ;
//				}
//				int partOneFenZi = numMapJijin.get(diquOne);
//				int partOneFenMu = pOneFenMu;
//				double oneOfall =(double)partOneFenZi/partOneFenMu + partTwo;
//				statistic.put(diquOne, oneOfall);
//			}
//			List<Map.Entry<String, Double>> wordMap = new ArrayList<Map.Entry<String, Double>>(statistic.entrySet());  
//			Collections.sort(wordMap, new Comparator<Map.Entry<String, Double>>() {//根据value排序  
//			    public int compare(Map.Entry<String, Double> o1,  
//			            Map.Entry<String, Double> o2) {  
//			        double result = o2.getValue() - o1.getValue();  
//			        if(result > 0)  
//			            return 1;  
//			        else if(result == 0)  
//			            return 0;  
//			        else   
//			            return -1;  
//			    }  
//			}); 
////			int x = 0;
////			for (Map.Entry<String, Double> entry : wordMap) {
////	           z += entry.getKey()+" ";
////	           x++;
////	           if(x == 3){
////	        	   break;
////	           } 
////	        }
//			List<String> deleiP = new ArrayList<>();
//			for (Map.Entry<String, Double> entry : wordMap){
//				if(entry.getKey().equals("广东省") || entry.getKey().equals("北京市") || entry.getKey().equals("上海市")
//						|| entry.getKey().equals("浙江省") || entry.getKey().equals("江苏省")){
//					deleiP = holderstatisticMapper.daLeiPERFERCT(jijin);
//					break;
//				}
//			}
//			for(int b = 0; b < deleiP.size(); b++){
//				z += deleiP.get(b)+ " ";
//			}
//			if(i%10==0){
//				System.out.println(i + "-----" +jijinName.size());
//			}	
//		}
//		Map<String,Integer> all = new TreeMap<>();
//		String[] diqutemp = z.split("\\s+");
//		for(String word : diqutemp){
//			if(word.equals("")){
//				continue;
//			}else{
//				if (all.containsKey(word)) {
//					all.put(word, all.get(word) + 1);
//				} else {
//					all.put(word, 1);
//				}
//			}
//		}
//		List<Map.Entry<String, Integer>> wordMap = new ArrayList<Map.Entry<String, Integer>>(all.entrySet());  
//		Collections.sort(wordMap, new Comparator<Map.Entry<String, Integer>>() {//根据value排序  
//		    public int compare(Map.Entry<String, Integer> o1,  
//		            Map.Entry<String, Integer> o2) {  
//		        double result = o2.getValue() - o1.getValue();  
//		        if(result > 0)  
//		            return 1;  
//		        else if(result == 0)  
//		            return 0;  
//		        else   
//		            return -1;  
//		    }  
//		}); 
//		System.out.println("111111");
		return "mypages/company";
//		List<String> StockNumm = newTopCirculationMapper.selectStockNum();
//		for(int i = 0; i < stockNum.length(); i++){
//			List<String> date = newTopCirculationMapper.topNewCircuDateByNum(stockNum);
//			for(){
//				
//			}
//		}
		
//		List<Holderstatistic> old = holderstatisticMapper.old();
//		for(int i = 0; i < old.size(); i++){
//			String  stockholder = old.get(i).getStockholder();
//			int early = Integer.valueOf(old.get(i).getEarlyyear());
//			int late = Integer.valueOf(old.get(i).getLateyear());
//			int older = late - early + 1;
//			double year = older/(older+Math.exp((2.817-older)/8.706));
//			
//			int huGuanTouZiShu = Integer.valueOf(old.get(i).getSumtouzixingwei());	
//			double huGuanTouZi = huGuanTouZiShu/(huGuanTouZiShu+Math.exp((8.458-huGuanTouZiShu)/3003.533));
//			
//			int huGuanGuPiao = Integer.valueOf(old.get(i).getSumstockgeshu());
//			double huGuanGuPiaoShu = huGuanGuPiao/(huGuanGuPiao+Math.exp((2.939-huGuanGuPiao)/243.136));
//			
//			double al = year + huGuanTouZi + huGuanGuPiaoShu;
//			String all = String.valueOf(al);
//			holderstatisticMapper.diquInfo(all, stockholder);
//			System.out.println(i);
//		} 
//		System.out.println("-------all是");
		
	}
	
	
	@RequestMapping(value = "/similarIndustry")
	public String similarIndustry(Model model,HttpServletRequest req){
		String stockNum = req.getParameter("stockNum");
		String industry = companyMapper.selecResolvedIndustry(stockNum);
		List<StockTemp> stockListSim = stockTempMapper.selectAllSimIndustry(industry);
		model.addAttribute("stockListSim", stockListSim);
		
		//取出来所有的基金名称
		//List<String> jiJinName = jiJinHoldestockMapper.selectJiJinName();
//		List<MiddleJijin> jiJinName = middleJiJinMapper.selectJiJin();
//		for(int i = 0; i < jiJinName.size(); i++){    
//			String temp = jiJinName.get(i).getJijinName();
//			String tempJiJinId = jiJinName.get(i).getJijinId();
//			for(int j = 2; j <temp.length(); j++){
//				String cuttemp = temp.substring(0, j);
//				int num = middleJiJinMapper.selectCount(cuttemp);
//				if( num != 1){
//					continue;
//				}else{
//					newTopCirculationMapper.uniformJiJinName(cuttemp, tempJiJinId);
//					break;
//				}
//			}	
//			System.out.println("Congratulations!"+ i);
//		}
//			
//		List<String> haveJiJinId = newTopCirculationMapper.stockerHaveJiJinId();
//		for(int i = 0; i < haveJiJinId.size(); i++){ 
//			String tempJiJinId = haveJiJinId.get(i);
//			//根据基金编号去holderStatistic表中找到基金最早投资年份；
//			Holderstatistic jiJinYears = holderstatisticMapper.jiJinYears(tempJiJinId);
//			String early = jiJinYears.getEarlyyear();
//			String late = jiJinYears.getLateyear();	
//			//从最最早年份到最晚年份把数据全部拿出来。
//			int yearCha = Integer.valueOf(late) - Integer.valueOf(early);
//			for(int q = 0; q <= yearCha; q++){
//				//基金投资的股票编号(可重复)+基金共进行了多少次投资
//				String year = String.valueOf(Integer.valueOf(early) + q);
////				List<String> stockNumDe = newTopCirculationMapper.byJiJinIdAndYearFindStockNumDe(tempJiJinId, year);
////				String qq = "";
////				if(!stockNumDe.isEmpty()){
////					//得到地区分布信息；	
////					
////				}	
//				List<String> stockNum = newTopCirculationMapper.byJiJinIdAndYearFindStockNum(tempJiJinId, year);
//				String w = "";
//				String t = "";
//				if(!stockNum.isEmpty()){
//					//得到关于基金 每年的行业门类、大类信息；
//					List<String> jiJinIndustry = newtopstockinfoMapperMapper.getjiJinIndustryMenDe(stockNum);
//					//得到地域信息 w
//					List<String> jiJinAreaDe = newtopstockinfoMapperMapper.getjiJinAreaDe(stockNum);
//					for(int k = 0; k < jiJinIndustry.size(); k++){
//						String stock =jiJinIndustry.get(k);
//						t += " " + stock;
//					}
//					for(int k = 0;k <jiJinAreaDe.size();k++){
//						String area = jiJinAreaDe.get(k);
//						w += " " + area;
//					}
//					
//					List<String> jiJinIndustryDa = newtopstockinfoMapperMapper.getjiJinIndustryDaDe(stockNum);
//					List<String> jiJinArea = newtopstockinfoMapperMapper.getjiJinArea(stockNum);
//					
//					String v = "";
//					for(int k = 0; k < jiJinIndustryDa.size(); k++){
//						String stock =jiJinIndustryDa.get(k);
//						v += " " + stock;
//					}
//					
//					String e = "";
//					for(int k = 0; k < jiJinArea.size(); k++){
//						String area = jiJinArea.get(k);
//						e += " " + area;
//					}
//					
////					HolderyearstatisticWithBLOBs holderyearstatistic = new HolderyearstatisticWithBLOBs();
////					holderyearstatistic.setIndustrydaleisum(dalei);
////					holderyearstatistic.setIndustrydalei(v);
////					holderyearstatistic.setIndustrymenleisum(men);
////					holderyearstatistic.setIndustrymenlei(t);
////					holderyearstatistic.setStockholdername("基金代码-"+tempJiJinId);
////					holderyearstatistic.setStocksum(stockNum.size());
////					holderyearstatistic.setXingweisum(stockNumDe.size());
////					holderyearstatistic.setYear(year);
////					holderyearstatistic.setStock(vv);
////					holderyearstatistic.setStockde(qq);
////					holderyearstatistic.setHurate(hu);
////					holderyearstatistic.setShenrate(shen);
////					holderyearstatisticMapper.insert(holderyearstatistic);
//					
//					holderyearstatisticMapper.jiJinAddFour(v, t, w, e, tempJiJinId, year);
//				}
//				
//			}
//			System.out.println("现在在处理"+i +","+"总共" + haveJiJinId.size());
//		}		
//		存入csv文件中
//		File file = new File("C:\\Users\\lily_bud\\Desktop\\result.csv");  
//        Writer writer;
//		try {
//			writer = new FileWriter(file);
//			 CSVWriter csvWriter = new CSVWriter(writer, ',');  
//		        String[] head = { "stockHolderName", "Type", "havingStock", "Target3" };
//		        csvWriter.writeNext(head);  
//		       
//				List<String> haveJiJinId = newTopCirculationMapper.stockerHaveJiJinId();
//				for(int i = 0; i < haveJiJinId.size(); i++){ 
//					String tempJiJinId = haveJiJinId.get(i);
//					List<String> stockNum = newTopCirculationMapper.byJiJinIdFindStockNum(tempJiJinId);
//					String t = "";
//					for(int k = 0; k < stockNum.size(); k++){
//						String stock =stockNum.get(k);
//						String stockName = guoTaiAnStockNameMapper.getStockName(stock);
//						if(stockName.equals(null)){
//							t += " " + stock;
//						}else {
//							t += " " + stockName;
//						}
//						
//					}
//					String temp = "基金代码-"+tempJiJinId;
//					
//					String[] csvData = { temp, "基金", t, ""};// String.valueOf(label)
//					csvWriter.writeNext(csvData);
//					System.out.println(i + "----------" + haveJiJinId.size());
//					
//				}
//				List<String> tempOne = newTopCirculationMapper.txtGenerationOne();
//				for(int i = 0; i < tempOne.size(); i++){
//					String stocker = tempOne.get(i);
//					String t = "";
//					List<String> tempTwo = newTopCirculationMapper.txtGenerationTwo(stocker);
//					for(int k = 0; k < tempTwo.size(); k++){
//						String stock =tempTwo.get(k);
//						String stockName = guoTaiAnStockNameMapper.getStockName(stock);
//						t += " " + stockName;
//					}				
//					String[] csvData = {stocker,"",t,""};
//					csvWriter.writeNext(csvData);
//					System.out.println(i + "----------股东" + tempOne.size());
//				}
//				 csvWriter.close();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}   		
		

		
//		String srcTXT = "C:\\Users\\lily_bud\\Desktop\\stocker.txt";
//		List<String> haveJiJinId = newTopCirculationMapper.stockerHaveJiJinId();
//		int sum = 0;
//		 try {
//				for(int i = 0; i < haveJiJinId.size(); i++){
//					String stockerId = haveJiJinId.get(i);
//					List<String> stockNum = newTopCirculationMapper.byJiJinIdFindStockNum(stockerId);
//					//由于基金的名称不统一，故用Id来表示
//					String temp = "基金代码"+stockerId + "_*" + i;
//					for(int k = 0; k < stockNum.size(); k++){
//						String stock =stockNum.get(k);
//						String stockName = guoTaiAnStockNameMapper.getStockName(stock);
//						if(stockName.equals(null)){
//							temp += " " + stock;
//						}else {
//							temp += " " + stockName;
//						}
//						
//					}
//	                //构造函数中的第二个参数true表示以追加形式写文件
//	                FileWriter fw = new FileWriter(srcTXT,true);
//	                fw.write(temp + "\r\n"); // \r\n即为换行  
//	                fw.close();
//	                if(i%10 == 0){
//	                	System.out.println("共"+ (haveJiJinId.size()) + "个基金-------" + "现在打印" + i);
//	                }	
//				}
//				sum = haveJiJinId.size();
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}  	
//		
//		
		//
//		List<String> haveJiJinId = newTopCirculationMapper.stockerHaveJiJinId();
//		for(int i = 0; i < haveJiJinId.size();i++){
//			String stockHolder = haveJiJinId.get(i);
//			List<String> date = newTopCirculationMapper.jiJindate_TouZi(stockHolder);
//			String early = date.get(0);
//	    	String earlyYear = early.split("-")[0];
//	    	String late = date.get(date.size()-1);
//	    	String lateYear = late.split("-")[0];
//	    	List<String> touziSum = newTopCirculationMapper.byJiJinIdFindStockNumDe(stockHolder);
//	    	int touZi = touziSum.size();
//	    	List<String> stockOfSum = newTopCirculationMapper.byJiJinIdFindStockNum(stockHolder);
//	    	String temp = "";
//			for(int k = 0; k < stockOfSum.size(); k++){
//				String stock =stockOfSum.get(k);
//				String stockName = guoTaiAnStockNameMapper.getStockName(stock);
//				if(stockName.equals(null)){
//					temp += " " + stock;
//				}else {
//					temp += " " + stockName;
//				}
//			}
//	    	int stockCount = stockOfSum.size();
//	    	//填写大类
//	    	List<String> dalei = newtopstockinfoMapperMapper.getjiJinIndustryDa(stockOfSum);
//	    	int daleiSum = dalei.size();
//	    	String v = "";
//	    	for(int k = 0; k < dalei.size(); k++){
//				String stock =dalei.get(k);
//				v += " " + stock;
//			}	
//	    	//填写menlei
//	    	List<String> menlei = newtopstockinfoMapperMapper.getjiJinIndustryMen(stockOfSum);
//	    	int menleiSum = menlei.size();
//	    	String t = "";
//	    	for(int k = 0; k < menlei.size(); k++){
//				String stock =menlei.get(k);
//				t += " " + stock;
//			}  
//	    	holderstatisticMapper.notJiJin(early, earlyYear, late, lateYear, stockHolder, v, daleiSum, t, menleiSum,touZi,stockCount,temp);
//	    	System.out.println("现在在处理"+i +","+"总共" + haveJiJinId.size());
//		}
//	    List<String> tempOne = newTopCirculationMapper.txtGenerationOne();
//	    List<String> tempOne = holderstatisticMapper.delete2018();
//	    for(int i = 0 ;i < tempOne.size(); i++){
//	    	String stockHolder = tempOne.get(i);
//	    	String name = "";
//	    	List<String> date = new ArrayList<>();
//	    	if(stockHolder.startsWith("基金代码")){
//	    		name = stockHolder.split("-")[1];
//	    		date = newTopCirculationMapper.jiJindate_TouZi(name);
//	    	}else{
//	    		  date = newTopCirculationMapper.notJiJindate_TouZi(stockHolder);
//	    	}
//	    	String early = date.get(0);
//	    	String earlyYear = early.split("-")[0];
//	    	String late = date.get(date.size()-1);
//	    	String lateYear = late.split("-")[0];
//	    	
//	    	//填写 投资行为数
//	    	List<String> touziSum = new ArrayList<>();
//	    	if(stockHolder.startsWith("基金代码")){
//	    		touziSum = newTopCirculationMapper.byJiJinIdFindStockNumDe(name);
//	    	}else{
//	    		touziSum = newTopCirculationMapper.byNotJiJinIdFindStockNumDe(stockHolder);
//	    	}
//	    	int touZi = touziSum.size();
//	    	String tempDe = "";
//			for(int k = 0; k < touziSum.size(); k++){
//				String stock =touziSum.get(k);
//				String stockName = guoTaiAnStockNameMapper.getStockName(stock);
//				if(stockName.equals(null)){
//					tempDe += " " + stock;
//				}else {
//					tempDe += " " + stockName;
//				}
//			}
//	    	//填写投资股票个数
//			List<String> stockOfSum = new ArrayList<>();
//			if(stockHolder.startsWith("基金代码")){
//				stockOfSum = newTopCirculationMapper.byJiJinIdFindStockNum(name);
//			}else{
//				stockOfSum = newTopCirculationMapper.byNotJiJinIdFindStockNum(stockHolder);
//			}
//	    	
//	    	String temp = "";
//			for(int k = 0; k < stockOfSum.size(); k++){
//				String stock =stockOfSum.get(k);
//				String stockName = guoTaiAnStockNameMapper.getStockName(stock);
//				if(stockName.equals(null)){
//					temp += " " + stock;
//				}else {
//					temp += " " + stockName;
//				}
//			}
//	    	int stockCount = stockOfSum.size();
//	    	//填写大类
//	    	List<String> dalei = newtopstockinfoMapperMapper.getjiJinIndustryDa(stockOfSum);
//	    	int daleiSum = dalei.size();
//	    	String v = "";
//	    	for(int k = 0; k < dalei.size(); k++){
//				String stock =dalei.get(k);
//				v += " " + stock;
//			}	
//	    	//填写menlei
//	    	List<String> menlei = newtopstockinfoMapperMapper.getjiJinIndustryMen(stockOfSum);
//	    	int menleiSum = menlei.size();
//	    	String t = "";
//	    	for(int k = 0; k < menlei.size(); k++){
//				String stock =menlei.get(k);
//				t += " " + stock;
//			}    	
////	    	//地区信息
////	    	List<String> area = newtopstockinfoMapperMapper.getjiJinArea(stockOfSum);
//	    	holderstatisticMapper.notJiJin(early, earlyYear, late, lateYear, stockHolder, v, daleiSum, t, menleiSum,touZi,stockCount,temp,tempDe);
//	    	System.out.println("现在在处理"+i +","+"总共" + tempOne.size());   	
//	    }
		return "mypages/similarIndustry";
}
//        try {
//			for(int i = 0; i < tempOne.size(); i++){
//				String stocker = tempOne.get(i);				
////				String temp = stocker + "_*" + (sum+i);
//				List<String> tempTwo = newTopCirculationMapper.txtGenerationTwo(stocker);
//				for(int k = 0; k < tempTwo.size(); k++){
//					String stock =tempTwo.get(k);
//					
//					
//					
//					String stockName = guoTaiAnStockNameMapper.getStockName(stock);
//					temp += " " + stockName;
//				}
//                //构造函数中的第二个参数true表示以追加形式写文件
//                FileWriter fw = new FileWriter(srcTXT,true);
//                fw.write(temp + "\r\n"); // \r\n即为换行  
//                fw.close();
//                if(i%10 == 0){
//                	System.out.println("共"+ (tempOne.size()-1) + "个股东-------" + "现在打印" + i);
//                }	
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  		
//		
//		List<String> aStockNum = newTopCirculationMapper.stockNum();
//		List<String> a = new ArrayList<>();
//		for(int i = 0 ; i < aStockNum.size(); i++){
//			String atemp = aStockNum.get(i);
//			String all = guoTaiAnStockNameMapper.getStockName(atemp);
//			a.add("\"" + all + "\"");
//		}
	
	
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
			List<Holdinglevelrelationship> level = holdinglevelrelationshipMapper.selectOnlyOneFirm(stockNum);
			List<Map<String, Object>> edgeslist = new ArrayList<>();
			List<Map<String, Object>> nodeList = new ArrayList<>(); 
			List<String> node = new ArrayList<>();
			for(int i = 0 ; i < level.size(); i++){
				String from = level.get(i).getInstitutionnamefrom();
				String to = level.get(i).getInstitutionnameto();
				if(i == 0){
					node.add(from);
					node.add(to);
					continue;
				}
				if(!node.contains(from)){
					node.add(from);
				}
				if(!node.contains(to)){
					node.add(to);
				}
			}
			for(int i = 0 ; i < node.size(); i++){	
				Map<String, Object> mapTwo = new HashMap<>();//点
				mapTwo.put("name",node.get(i));
				mapTwo.put("value", node.get(i));
				nodeList.add(mapTwo);
			}
			for(int i = 0; i < level.size();i++){
				Map<String, Object> mapOne = new HashMap<>();//边
				String from = level.get(i).getInstitutionnamefrom();
				String to = level.get(i).getInstitutionnameto();
				String value = level.get(i).getHoldvalue();
				int flag = 0;
				int flagg = 0;
				for(int j = 0; j < node.size(); j++){
					if(from.equals(node.get(j))){
						mapOne.put("source", j);
						flag = 1;
					}
					if(to.equals(node.get(j))){
						mapOne.put("target", j);
						flagg = 1;
					}
					if(flag == 1 && flagg == 1){
						mapOne.put("info", "持有其"+value);
						break;
					}
				}
				edgeslist.add(mapOne);
			}
			Map<Object, Object> map = new HashMap<>();
			map.put("edgeslist",edgeslist);
			map.put("nodeList",nodeList);
			//定义JSON对象把点表、边表封装成Map,传递过去；
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("mapList", map);
			model.addAttribute("mapList", jsonObject);
			
			String control = level.get(0).getControlshareholder();
			String controlInfor = level.get(0).getControlshareholderinfor();
			String actualControl = level.get(0).getActualcontroller();
			String actualInfor = level.get(0).getActualcontrollerinfor();
			String finalControl = level.get(0).getFinalcontrol();
			String finalInfor = level.get(0).getFinalcontrolinfor();
			
			model.addAttribute("controller",control );
			model.addAttribute("controllerInfo",controlInfor );
			model.addAttribute("realController",actualControl );
			model.addAttribute("realControllerInfo",actualInfor );
			model.addAttribute("finalController",finalControl );
			model.addAttribute("finalControllerInfo",finalInfor );
			model.addAttribute("classLevel",level );
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

		//用于展示一只股票的价格变化 和 股票 相关利润
		@RequestMapping(value = "/ajaxstockPriceChange",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void stockPriceChange(Model model,HttpServletRequest req,HttpServletResponse rsp){
			String stockName = req.getParameter("stockName");
			String stockId = companyMapper.nameTransferTOId(stockName);
			List<Stockpricechange> priceList = stockPriceChangeMapper.stockOnePriceChange(stockId);
			List<Stocklirun> lirunList = stockLiRunMapper.stockLiRun(stockId);
			
			//用于存放 时期（即折线图的X横坐标）
			List<String> date = new ArrayList<>();
			//用于存储股价变化的  data值
			List<Map<String,String>> data = new ArrayList<>();
			for(int i = 0; i <priceList.size(); i++){
				date.add(priceList.get(i).getDate());
				Map<String, String> temp = new HashMap<>();
				temp.put("stockPrice",priceList.get(i).getShoupanprice());
				temp.put("jiaoYiNum", priceList.get(i).getJiaoyinum());
				temp.put("circulationPrice",priceList.get(i).getCirculationprice());
				data.add(temp);
			}
			//用于存储股票利润变化的 lirundata
			List<String> liRundate = new ArrayList<>();
			List<Map<String, String>> liRundata = new ArrayList<>();
			for(int i = 0; i < lirunList.size(); i++){
				liRundate.add(lirunList.get(i).getDate());
				Map<String, String> temp = new HashMap<>();
				temp.put("jingLiRun", lirunList.get(i).getJinglirun());
				temp.put("eachShouYi", lirunList.get(i).getEachshouyi());
				liRundata.add(temp);
			}
			
			Map<Object, Object> result = new HashMap<>();
			result.put("date", date);
			result.put("data", data);
			result.put("liRundate", liRundate);
			result.put("liRundata", liRundata);
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("result", result);
			String resultAll = JsonUtil.toJsonString(jsonObject);	
			System.out.println(resultAll);
			PrintWriter out;
			try {
				out = rsp.getWriter();
				out.write(resultAll);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
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
				stockNamelist.add(stockIdlist.get(l));
			}
			for(int i = 0; i < stockNamelisttemp.size(); i++){
				String q = stockNamelisttemp.get(i).getStockName();
				String control = stockNamelisttemp.get(i).getStockNum();
				for(int j = 0; j < stockNamelisttemp.size(); j++){   //此处有些问题
					if(stockIdlist.get(j).equals(control)){
						stockNamelist.set(j, q);
						break;
					}
				}
			}
			stockNamelist.add(institutionName);
			System.out.println(stockNamelist);
			List<Map<String, Object>> edgeslist = new ArrayList<>();
			 //最终的点表
			List<Map<String, Object>> nodeList = new ArrayList<>(); 
			for(int i = 0; i < stockNamelist.size()-1; i++){
				//info: stockTypelist.add(typeTemp);  end :stockNamelist   start: stockNamelist.add(institutionName);
				Map<String, Object> mapOne = new HashMap<>();
				Map<String, Object> mapTwo = new HashMap<>();
				mapOne.put("source", stockNamelist.size()-1);
				mapOne.put("target", i);
				mapOne.put("info",stockTypelist.get(i));
				edgeslist.add(mapOne);
				Pattern pattern = Pattern.compile("^(\\d+)(.*)");
				Matcher matcher = pattern.matcher(stockTypelist.get(i));
				int type = 0;
				if (matcher.matches()) {//数字开头
					type = 3;
				}else{
					if(stockTypelist.get(i).startsWith("-")){
						type = 4;
					}else if(stockTypelist.get(i).equals("不变")){
						type = 1;
					}else if(stockTypelist.get(i).equals("新进")){
						type = 0;
					}else if(stockTypelist.get(i).equals("退出")){
						type = 2;
					}
				}			
				mapTwo.put("name", stockNamelist.get(i));
				mapTwo.put("category",type);
				mapTwo.put("value", stockNamelist.get(i));
				nodeList.add(mapTwo);
			}	
			Map<String, Object> mapTwo = new HashMap<>();
			mapTwo.put("name", stockNamelist.get(stockNamelist.size()-1));
			mapTwo.put("value", stockNamelist.get(stockNamelist.size()-1));
			mapTwo.put("category",5);
			nodeList.add(mapTwo);
			//通过Map传给前台...
			Map<Object, Object> map = new HashMap<>();
			map.put("edgeslist",edgeslist);
			map.put("stockNamelist",nodeList);
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
		
		
		//2017年12月27日  带有时间轴的图-------改用新的数据 Newtopcirculation  Mapper和Pojo
		@RequestMapping(value = "/detailsInvestment")
		public String timeLineGroup(Model model,HttpServletRequest req){	
			String institutionName;
			try {
				institutionName = new String(req.getParameter("institutionName").getBytes("iso-8859-1"), "utf-8");
				//把和这支机构有关的时间全都拿出来
//				List<String> outDatelist = topStockCirculationMapper.topSomeCircuDate(institutionName);	
				List<String> outDatelist = newTopCirculationMapper.topNewCircuDate(institutionName);	
				List<Map<String,List<Map<String, Object>>>> all = new ArrayList<>();
				//得到行业信息
				List<List<Map<String, Object>>> stockIndustryAll = new ArrayList<>();
				//为主题流图做准备。
				List<Object[]> value = new ArrayList<>();
				List<String> cataTheme = new ArrayList<>();
				
				for(int j = 0; j < outDatelist.size(); j++){ //按照 日期 去 查询
					Map<String, Integer> stockIndustry = new HashMap<>();
					String date = outDatelist.get(j);
//					List<TopStockCirculationHolder> outByNameandTime = topStockCirculationMapper.selectCircuOutStock(date, institutionName);		
					List<Newtopcirculation> outByNameandTime = newTopCirculationMapper.selectNewCircuStock(date, institutionName);

					List<String> stockIdlist = new ArrayList<>();
					List<String> stockTypelist = new ArrayList<>();//对应于现在的changeBefore
					List<String> stockDatelist = new ArrayList<>();

					for(int i = 0; i < outByNameandTime.size(); i++){//对应于某一日期，取相关的所有内容。
						String temp = outByNameandTime.get(i).getStockNum();//取到所有相关股票的ID
						String typeTemp = outByNameandTime.get(i).getChangebefore();//取所有的type	
						String dateTemp = outByNameandTime.get(i).getDate();//取所有的date
						stockIdlist.add(temp);
						stockTypelist.add(typeTemp); // String[] categorieslist = {"不变","退出（无）","新进","增股xxx","减股xxx"};新数据中没有“退出”
						stockDatelist.add(dateTemp);
					}
					
//					List<Company> stockNamelisttemp = companyMapper.getStockNameArray(stockIdlist);//拿出来所有的股票名称					
					List<Newtopstockinfo> stockNamelisttemp = newtopstockinfoMapperMapper.getStockNameArray(stockIdlist);
					
					List<String> stockNamelist = new ArrayList<String>();	
					
					for(int l = 0; l < stockNamelisttemp.size();l++){
						stockNamelist.add(stockIdlist.get(l));
					}
					for(int i = 0; i < stockNamelisttemp.size(); i++){
						String q = stockNamelisttemp.get(i).getStockName();
						//取出每一只股票的行业信息
						String p = stockNamelisttemp.get(i).getIndustry();
						if(i == 0){
							stockIndustry.put(p,1);
							if(cataTheme.size() == 0){
								cataTheme.add(p);
							}
						}else {
							if (stockIndustry.containsKey(p)) {
								stockIndustry.put(p, stockIndustry.get(p) + 1);
								//总共行业，用于 主题流图 的 类目；
							} else {
								stockIndustry.put(p, 1);
							}
							if(!cataTheme.contains(p)){
								cataTheme.add(p);
							}else{}	
						}												
						String control = stockNamelisttemp.get(i).getStockNum();
						for(int k = 0; k < stockNamelisttemp.size(); k++){//正确的应该为j < stockIdlist.size();
							if(stockIdlist.get(k).equals(control)){
								stockNamelist.set(k, q);
								break;
							}
						}
					}

					List<Map<String, Object>> industrySome = new ArrayList<>();
					for(String k : stockIndustry.keySet()){
						Map<String, Object> industry = new HashMap<>();//每个日期下的类别。
						industry.put("name", k);
						industry.put("value", stockIndustry.get(k));
						industrySome.add(industry);
						String[] dateSplit = date.split("-");
						Object[] v = new Object[3];
						v[0] = dateSplit[0] + "/" + dateSplit[1] + "/" + dateSplit[2];
						v[1] = stockIndustry.get(k).intValue();
						v[2] = k;
						value.add(v);
					}					
					stockIndustryAll.add(industrySome);
					stockNamelist.add(institutionName);	
					//接下来构造边表
					List<Map<String, Object>> edgeslist = new ArrayList<>();
					//最终的点表
					List<Map<String, Object>> nodeList = new ArrayList<>(); 
					for(int i = 0; i < stockNamelist.size()-1; i++){
						//info: stockTypelist.add(typeTemp);  end :stockNamelist   start: stockNamelist.add(institutionName);
						Map<String, Object> mapOne = new HashMap<>();
						Map<String, Object> mapTwo = new HashMap<>();
						mapOne.put("source", stockNamelist.size()-1);
						mapOne.put("target", i);
						mapOne.put("info",stockTypelist.get(i));
						mapOne.put("date", stockDatelist.get(i));
						edgeslist.add(mapOne);
						int type = 0;
						if (stockTypelist.get(i).startsWith("增持")) {//数字开头
							type = 3;
						}else{
							if(stockTypelist.get(i).startsWith("减持")){//.startsWith("-")
								type = 4;
							}else if(stockTypelist.get(i).startsWith("不变")){
								type = 1;
							}else if(stockTypelist.get(i).startsWith("新进")){//.equals("新进")
								type = 0;
							}else if(stockTypelist.get(i).equals("退出")){
								type = 2;
							}
						}			
						mapTwo.put("name", stockNamelist.get(i));
						mapTwo.put("category",type);
						mapTwo.put("value", stockNamelist.get(i));
						mapTwo.put("date",stockDatelist.get(i) );
						nodeList.add(mapTwo);
					}
					Map<String, Object> mapTwo = new HashMap<>();
					mapTwo.put("name", stockNamelist.get(stockNamelist.size()-1));
					mapTwo.put("value", stockNamelist.get(stockNamelist.size()-1));
					mapTwo.put("category",5);
					nodeList.add(mapTwo);	
					Map<String,List<Map<String, Object>>> allsome = new LinkedHashMap<>();
					allsome.put("edgeslist", edgeslist);
					allsome.put("nodeList", nodeList);
					all.add(allsome);
				}
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("all", all);
				model.addAttribute("all",jsonObject);
				
				JSONObject jsonObjectTwo = new JSONObject();
				jsonObjectTwo.put("date", outDatelist);
				model.addAttribute("date", jsonObjectTwo);
				
				JSONObject jsonObjectThree = new JSONObject();
				jsonObjectThree.put("institutionName", institutionName);
				model.addAttribute("institutionName", jsonObjectThree);
				System.out.println(stockIndustryAll);
				
				JSONObject jsonObjectelse = new JSONObject();
				jsonObjectelse.put("stockIndustryAll", stockIndustryAll);
				model.addAttribute("stockIndustryAll",jsonObjectelse);	
				
				JSONObject jsonObjectvalue = new JSONObject();
				jsonObjectvalue.put("valueNew", value);
				model.addAttribute("valueNew",jsonObjectvalue);
				
				JSONObject jsonObjectCata = new JSONObject();
				jsonObjectCata.put("cataTheme", cataTheme);
				model.addAttribute("cataTheme",jsonObjectCata);
				System.out.println(value);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return "mypages/detailsInvestment";
		}

		//2018年1月6日  填充tooltip
		@RequestMapping(value = "/similar",method={org.springframework.web.bind.annotation.RequestMethod.POST},produces="application/json;charset=UTF-8")
		public void tooltipContent(Model model,HttpServletRequest req,HttpServletResponse rsp){
			String similar = req.getParameter("similarBydataAll");
			String[] s = similar.split("\\],\\[");
		    List<List<String>> search = new ArrayList<>();
		    int leastLong = 0;
		    int whichOne = 0;
		    //用于存储第一次查询的结果
			for(int j = 0; j < s.length; j++){//s指： 有几个条件
				String t = "";
				t = s[j].replaceAll("\\[", "\"");
				t = t.replaceAll("\\]", "\"");
				t = t.replaceAll("\"", "");
				System.out.println(t);
				String[] tStrings = t.split(",");
				List<String> temp = new ArrayList<>();
				for(int i = 0 ; i < 3; i++){//每个条件的三个配置项 tStrings.length=3
					if(i == 0){ 
						String p = tStrings[0];
						String id = companyMapper.nameTransferTOId(p);
						temp.add(id);
						continue;
					}
					temp.add(tStrings[i]);
				}
				int l = Integer.parseInt(temp.get(1));
				List<String> instituation = new ArrayList<>();
				if(l <= 2){
					if(l == 0){
						temp.set(1, "新进");
					}else if (l == 1) {
						temp.set(1, "不变");
					}else {
						temp.set(1, "退出");
					}
					instituation = topStockCirculationMapper.similarPrepare(temp.get(0), temp.get(1), temp.get(2));
					System.out.println(instituation);
				}else{
					if(l == 3){
						temp.set(1, "增持");
						instituation = topStockCirculationMapper.similarPrepareAdd(temp.get(0), temp.get(2));
						System.out.println(instituation);
					}else{
						temp.set(1, "减持");
						instituation = topStockCirculationMapper.similarPrepareCut(temp.get(0), temp.get(2));
						System.out.println(instituation);
					}
				}
				if(j == 0){
					leastLong = instituation.size();
					whichOne = 0;
				}
				if(j > 0 && instituation.size() < leastLong){
					leastLong = instituation.size();
					whichOne = j;
				}
				search.add(instituation);
			}
			System.out.println(s);
			List<String> finalResult = new ArrayList<>();
			if(search.size() > 1){
				List<String> removeOne = search.get(whichOne);
				search.remove(whichOne);
				for(int w = 0; w < removeOne.size(); w++){
					int flag = 0;
					for(int k = 0; k < search.size(); k++){
						if(!search.get(k).contains(removeOne.get(w))){
							break;
						}else{
							flag = flag + 1;
						}
					}
					if(flag == search.size()){
						finalResult.add(removeOne.get(w));
					}
				}
			}else{
				for(int s1 = 0; s1 < search.get(0).size(); s1++){
					finalResult.add(search.get(0).get(s1));
				}
			}

			//定义JSON对象把点表、边表封装成Map,传递过去；
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("finalResult", finalResult);
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

		//企业全关系图
		@RequestMapping(value = "/firmAllRelationForm")
		public String firmAll(Model model,HttpServletRequest req,HttpServletResponse rsp){
			List<Holdinglevelrelationship> firmAll = holdinglevelrelationshipMapper.selectAllFirm();
			//用于存储所有节点
			List<String> nodeAll = new ArrayList<>();
			for(int i = 0; i < firmAll.size(); i++){
				String q = firmAll.get(i).getInstitutionnamefrom();
				String p = firmAll.get(i).getInstitutionnameto();
				if(i == 0 ){
					nodeAll.add(q);
					nodeAll.add(p);	
				}else {
					if(!nodeAll.contains(p)){
						nodeAll.add(p);
					}
					if(!nodeAll.contains(q)){
						nodeAll.add(q);
					}
				}
			}
			List<Map<String, String>> node = new ArrayList<>();
			for(int k = 0; k < nodeAll.size(); k++){
				Map<String, String> l = new HashMap<>();
				l.put("name", nodeAll.get(k));
				node.add(l);
			}
			
			List<Map<String, Integer>> edgeAll = new ArrayList<>();		
			
			for(int j = 0; j < firmAll.size();j++){//所有边
				String q = firmAll.get(j).getInstitutionnamefrom();
				String p = firmAll.get(j).getInstitutionnameto();
				Map<String, Integer> edge= new LinkedHashMap<>();//所有节点
				int source =0;
				int target =0;
				int flag = 0;
				int flagg = 0;
				for(int k = 0; k < nodeAll.size(); k++){
					if(flag == 0 && nodeAll.get(k).equals(q)){
						source = k;
						flag = 1;
					}
					if(flagg == 0 && nodeAll.get(k).equals(p)){
						target = k;
						flagg = 1;
					}
					if(flagg == 1 && flag == 1){
						edge.put("source", source);
						edge.put("target", target);
						edgeAll.add(edge);
						break;
					}	
				}
			}	
			//通过Map传给前台...
			Map<Object, Object> map = new HashMap<>();
			map.put("edgeAll",edgeAll);
			map.put("nodeAll",node);
			//定义JSON对象把点表、边表封装成Map,传递过去；
			JSONObject jsonObject = new JSONObject();
			jsonObject.put("mapList", map);
		
			model.addAttribute("mapList",jsonObject);
			return "mypages/firmAlldisplay";

		}
			
		//2017年12月27日  带有时间轴的图
		@RequestMapping(value = "/detailsInvestmentTwo")
		public String timeLineGroupTwo(Model model,HttpServletRequest req){	
			String institutionName;
			try {
				institutionName = new String(req.getParameter("institutionName").getBytes("iso-8859-1"), "utf-8");
				//把和这支机构有关的时间全都拿出来
				List<String> outDatelist = topStockHolderMapper.topSomeDate(institutionName);			
				List<Map<String,List<Map<String, Object>>>> all = new ArrayList<>();
				for(int j = 0; j < outDatelist.size(); j++){ //按照 日期 去 查询
					String date = outDatelist.get(j);
					List<TopStockHolder> outByNameandTime = topStockHolderMapper.selectOutStock(date, institutionName);	
					List<String> stockIdlist = new ArrayList<>();
					List<String> stockTypelist = new ArrayList<>();
					List<String> stockDatelist = new ArrayList<>();
					for(int i = 0; i < outByNameandTime.size(); i++){
						String temp = outByNameandTime.get(i).getStockId();//取到所有相关ID
						String typeTemp = outByNameandTime.get(i).getHolderChange();//取所有的type
						String dateTemp = outByNameandTime.get(i).getDate();//取所有的date
						stockIdlist.add(temp);
						stockTypelist.add(typeTemp); // String[] categorieslist = {"不变","退出","新进","增股","减股"};
						stockDatelist.add(dateTemp);
					}
					List<Company> stockNamelisttemp = companyMapper.getStockNameArray(stockIdlist);//拿出来所有的股票名称
					List<String> stockNamelist = new ArrayList<String>();	
					for(int l = 0; l < stockNamelisttemp.size();l++){
						stockNamelist.add(stockIdlist.get(l));
					}
					for(int i = 0; i < stockNamelisttemp.size(); i++){
						String q = stockNamelisttemp.get(i).getStockName();
						String control = stockNamelisttemp.get(i).getStockNum();
						for(int k = 0; k < stockNamelisttemp.size(); k++){//正确的应该为j < stockIdlist.size();
							if(stockIdlist.get(k).equals(control)){
								stockNamelist.set(k, q);
								break;
							}
						}
					}
					stockNamelist.add(institutionName);
					//接下来构造边表
					List<Map<String, Object>> edgeslist = new ArrayList<>();
					//最终的点表
					List<Map<String, Object>> nodeList = new ArrayList<>(); 
					for(int i = 0; i < stockNamelist.size()-1; i++){
						//info: stockTypelist.add(typeTemp);  end :stockNamelist   start: stockNamelist.add(institutionName);
						Map<String, Object> mapOne = new HashMap<>();
						Map<String, Object> mapTwo = new HashMap<>();
						mapOne.put("source", stockNamelist.size()-1);
						mapOne.put("target", i);
						mapOne.put("info",stockTypelist.get(i));
						mapOne.put("date", stockDatelist.get(i));
						edgeslist.add(mapOne);
						Pattern pattern = Pattern.compile("^(\\d+)(.*)");
						Matcher matcher = pattern.matcher(stockTypelist.get(i));
						int type = 0;
						if (matcher.matches()) {//数字开头
							type = 3;
						}else{
							if(stockTypelist.get(i).startsWith("-")){
								type = 4;
							}else if(stockTypelist.get(i).equals("不变")){
								type = 1;
							}else if(stockTypelist.get(i).equals("新进")){
								type = 0;
							}else if(stockTypelist.get(i).equals("退出")){
								type = 2;
							}
						}			
						mapTwo.put("name", stockNamelist.get(i));
						mapTwo.put("category",type);
						mapTwo.put("value", stockNamelist.get(i));
						mapTwo.put("date",stockDatelist.get(i) );
						nodeList.add(mapTwo);
					}
					Map<String, Object> mapTwo = new HashMap<>();
					mapTwo.put("name", stockNamelist.get(stockNamelist.size()-1));
					mapTwo.put("value", stockNamelist.get(stockNamelist.size()-1));
					mapTwo.put("category",5);
					nodeList.add(mapTwo);	
					Map<String,List<Map<String, Object>>> allsome = new LinkedHashMap<>();
					allsome.put("edgeslist", edgeslist);
					allsome.put("nodeList", nodeList);
					all.add(allsome);
				}
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("all", all);
				model.addAttribute("all",jsonObject);
				
				JSONObject jsonObjectTwo = new JSONObject();
				jsonObjectTwo.put("date", outDatelist);
				model.addAttribute("date", jsonObjectTwo);
				
				JSONObject jsonObjectThree = new JSONObject();
				jsonObjectThree.put("institutionName", institutionName);
				model.addAttribute("institutionName", jsonObjectThree);
			} catch (UnsupportedEncodingException e) {
				e.printStackTrace();
			}
			return "mypages/detailsInvestment";
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
			//1、把股票的名称查出来(生成点表的一部分：点表 = 股票名称 + 类别)   
			List<String> stockIdlist = new ArrayList<>();
			List<String> stockTypelist = new ArrayList<>();
			for(int i = 0; i < outStocklist.size(); i++){
				String temp = outStocklist.get(i).getStockId();
				String typeTemp = outStocklist.get(i).getHolderChange();
				stockIdlist.add(temp);
				stockTypelist.add(typeTemp); // String[] categorieslist = {"不变","退出","新进","增股","减股"};
			}
			List<Company> stockNamelisttemp = companyMapper.getStockNameArray(stockIdlist);//拿出来所有的股票名称
			List<String> stockNamelist = new ArrayList<String>();	
			for(int l = 0; l < stockNamelisttemp.size();l++){
				stockNamelist.add(stockIdlist.get(l));
			}
			for(int i = 0; i < stockNamelisttemp.size(); i++){
				String q = stockNamelisttemp.get(i).getStockName();
				String control = stockNamelisttemp.get(i).getStockNum();
				for(int j = 0; j < stockNamelisttemp.size(); j++){//正确的应该为j < stockIdlist.size();
					if(stockIdlist.get(j).equals(control)){
						stockNamelist.set(j, q);
						break;
					}
				}
			}
			stockNamelist.add(institutionName);
			//2、构造边表
			List<Map<String, Object>> edgeslist = new ArrayList<>();
			 //最终的点表
			List<Map<String, Object>> nodeList = new ArrayList<>(); 
			for(int i = 0; i < stockNamelist.size()-1; i++){
				//info: stockTypelist.add(typeTemp);  end :stockNamelist   start: stockNamelist.add(institutionName);
				Map<String, Object> mapOne = new HashMap<>();
				Map<String, Object> mapTwo = new HashMap<>();
				mapOne.put("source", stockNamelist.size()-1);
				mapOne.put("target", i);
				mapOne.put("info",stockTypelist.get(i));
				edgeslist.add(mapOne);
				Pattern pattern = Pattern.compile("^(\\d+)(.*)");
				Matcher matcher = pattern.matcher(stockTypelist.get(i));
				int type = 0;
				if (matcher.matches()) {//数字开头
					type = 3;
				}else{
					if(stockTypelist.get(i).startsWith("-")){
						type = 4;
					}else if(stockTypelist.get(i).equals("不变")){
						type = 1;
					}else if(stockTypelist.get(i).equals("新进")){
						type = 0;
					}else if(stockTypelist.get(i).equals("退出")){
						type = 2;
					}
				}			
				mapTwo.put("name", stockNamelist.get(i));
				mapTwo.put("category",type);
				mapTwo.put("value", stockNamelist.get(i));
				nodeList.add(mapTwo);
			}	
			Map<String, Object> mapTwo = new HashMap<>();
			mapTwo.put("name", stockNamelist.get(stockNamelist.size()-1));
			mapTwo.put("value", stockNamelist.get(stockNamelist.size()-1));
			mapTwo.put("category",5);
			nodeList.add(mapTwo);
			
			//通过Map传给前台...
			Map<Object, Object> map = new HashMap<>();
			map.put("edgeslist",edgeslist);
			map.put("stockNamelist",nodeList);
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
		
		
		//2017年12月2日
		@RequestMapping(value = "/oneDzjy")
		public String stockDzjy(Model model,HttpServletRequest req,HttpServletResponse rsp){
			String stockId = req.getParameter("stockId");	
			Company company = companyMapper.selectCompanyByStockNum(stockId);
			Stockinfo stockinfo = stockinfoMapper.selectStockByCode(stockId);
		/*	List<String> dateList = dzjyMapper.selectDzjyDate(stockId);
			String date = dateList.get(0);
			List<Dzjy> DzjyList = dzjyMapper.selectStockDzjy(date,stockId);*/
			
			List<Dzjy> DzjyList = dzjyMapper.selectStockDzjy(stockId);
			
			System.out.println(DzjyList);
			model.addAttribute("DzjyList",DzjyList );
			model.addAttribute("stockinfo",stockinfo);
			model.addAttribute("company", company);
	/*		model.addAttribute("holderDate", dateList);*/
			return "mypages/oneDzjy";
		}
		
}
