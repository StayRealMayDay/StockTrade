package com.stock.mapper;

import com.stock.pojo.MarketResearch;

public interface MarketResearchMapper {

    int deleteByPrimaryKey(String mrUuid);

    int insert(MarketResearch record);

    int insertSelective(MarketResearch record);

    MarketResearch selectByPrimaryKey(String mrUuid);

    int updateByPrimaryKeySelective(MarketResearch record);

    int updateByPrimaryKey(MarketResearch record);
}