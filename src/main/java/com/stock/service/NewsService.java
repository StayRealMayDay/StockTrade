package com.stock.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.NewsMapper;
import com.stock.mapper.NewsTypeMapper;
import com.stock.pojo.News;
import com.stock.pojo.NewsType;
import com.stock.utils.UUIDUtil;

@Service
@Transactional
public class NewsService {
	@Autowired
	NewsMapper newsMapper;
	@Autowired
	NewsTypeMapper newsTypeMapper;
	
	public List<News> selectLastWeekNews(String lastWeekDate, String today) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("lastWeekDate", lastWeekDate);
		map.put("today", today);
		return newsMapper.selectLastWeekNews(map);
	}
	/**
	  *  2017-6-23合并  作者：张玉筱    合并者：刘禄霞
	  */
	 public News  selectByPrimaryKey(String newsUuid) {
			return newsMapper.selectByPrimaryKey(newsUuid);
		}

	 public List<News> selectByNewsType(String newsType){
			return newsMapper.selectByNewsType(newsType);
		}
	 /**
	  * 添加新闻类型
	  * @param newsType
	  */
	public void insert(NewsType newsType) {
		String newsTypeUuid = UUIDUtil.getUUID();
		newsType.setNewsTypeId(newsTypeUuid);
		newsType.setNewsTypeNum(0);
		newsType.setFlag("news");
    	newsTypeMapper.insert(newsType);
	}
}
