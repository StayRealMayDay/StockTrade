package com.stock.mapper;

import com.stock.pojo.Funding;

public interface FundingMapper {

    int deleteByPrimaryKey(String fUuid);

    int insert(Funding record);

    int insertSelective(Funding record);

    Funding selectByPrimaryKey(String fUuid);

    int updateByPrimaryKeySelective(Funding record);

    int updateByPrimaryKey(Funding record);
}