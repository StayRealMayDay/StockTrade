package com.stock.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.StockinfoMapper;
import com.stock.pojo.Company;
import com.stock.pojo.Stock;
import com.stock.pojo.Stockinfo;
import com.stock.utils.Pager;

@Service
@Transactional
public class StockinfoService {
	@Autowired
	StockinfoMapper stockinfoMapper;
	
	public List<Stockinfo> selectAllStockinfoByAmplitudePaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return stockinfoMapper.selectAllStockinfoByAmplitudePaper(map);
	}

	public List<Stockinfo> selectAllStockinfoByTurnRatioPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return stockinfoMapper.selectAllStockinfoByTurnRatioPaper(map);
	}

	public List<Stockinfo> selectAllStockinfoByTurnVPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return stockinfoMapper.selectAllStockinfoByTurnVPaper(map);
	}

	public List<Stockinfo> selectAllStockinfoByEquiPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return stockinfoMapper.selectAllStockinfoByEquiPaper(map);
	}

	public List<Stockinfo> selectAllStockinfoByUpRiPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return stockinfoMapper.selectAllStockinfoByUpRiPaper(map);
	}

	public List<Stockinfo> selectAllStockinfoByDownRiPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return stockinfoMapper.selectAllStockinfoByDownRiPaper(map);
	}
}
