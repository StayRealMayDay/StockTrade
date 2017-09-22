package com.stock.mapper;

import com.stock.pojo.Risk;
public interface RiskMapper {

    int deleteByPrimaryKey(String riskUuid);

    int insert(Risk record);

    int insertSelective(Risk record);

    Risk selectByPrimaryKey(String riskUuid);

    int updateByPrimaryKeySelective(Risk record);

    int updateByPrimaryKey(Risk record);
}