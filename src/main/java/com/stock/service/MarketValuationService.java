package com.stock.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.MarketValuationMapper;
import com.stock.pojo.MarketValuation;
import com.stock.utils.Pager;

@Service
@Transactional
public class MarketValuationService {
	@Autowired
	MarketValuationMapper marketValuationMapper;

	public List<MarketValuation> selectAllPEByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<MarketValuation> PE = marketValuationMapper.selectOrderbyPE(map);
		return PE;
	}

	public List<MarketValuation> selectAllPBByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<MarketValuation> PE = marketValuationMapper.selectOrderbyPB(map);
		return PE;
	}

	public List<MarketValuation> selectAllPSByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<MarketValuation> PS = marketValuationMapper.selectOrderbyPS(map);
		return PS;
	}

	public List<MarketValuation> selectAllTotalValueByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<MarketValuation> TotalValue = marketValuationMapper.selectOrderbyTotalValue(map);
		return TotalValue;
	}

	public List<MarketValuation> selectAllFlowValueByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<MarketValuation> FlowValue = marketValuationMapper.selectOrderbyFlowValue(map);
		return FlowValue;
	}

	public List<MarketValuation> selectAllEterppValueByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<MarketValuation> EnterpValue = marketValuationMapper.selectOrderbyEnterpValue(map);
		return EnterpValue;
	}

	public List<MarketValuation> selectAllPredictValueByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<MarketValuation> PredictValue = marketValuationMapper.selectOrderbyPredictValue(map);
		return PredictValue;
	}

	public List<MarketValuation> selectAllDividendRateByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<MarketValuation> DividendRate = marketValuationMapper.selectOrderbyDividendRate(map);
		return DividendRate;
	}
	
	
}
