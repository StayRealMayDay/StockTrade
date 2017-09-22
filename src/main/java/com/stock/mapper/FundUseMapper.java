package com.stock.mapper;

import com.stock.pojo.FundUse;

public interface FundUseMapper {

    int deleteByPrimaryKey(String fuUuid);

    int insert(FundUse record);

    int insertSelective(FundUse record);

    FundUse selectByPrimaryKey(String fuUuid);

    int updateByPrimaryKeySelective(FundUse record);

    int updateByPrimaryKey(FundUse record);
}