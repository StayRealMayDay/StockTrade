package com.stock.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.NewsMapper;
import com.stock.pojo.News;
import com.stock.utils.Pager;
@Service
@Transactional
public class AdminService {
	@Autowired
	NewsMapper newsMapper;
    //查询全部的新闻-带分页
	public List<News> selectAllNewsByPager(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return newsMapper.selectAllNewsByPager(map);
	}



}
