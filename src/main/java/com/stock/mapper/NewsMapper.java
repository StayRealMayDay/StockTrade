package com.stock.mapper;

import java.util.HashMap;
import java.util.List;

import com.stock.pojo.News;

import net.sf.json.JSONObject;

public interface NewsMapper {

    int deleteByPrimaryKey(String newsUuid);

    int insert(News record);

    int insertSelective(News record);

    News selectByPrimaryKey(String newsUuid);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);

    List<News> selectAllNews();

	List<News> selectAllNewsByPager(HashMap<String,Integer> map);

	List<News> selectLastWeekNews(HashMap<String, Object> map);

	List<News> selectByNewsType(String newsType);
}