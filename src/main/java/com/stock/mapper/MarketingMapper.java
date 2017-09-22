package com.stock.mapper;

import com.stock.pojo.Marketing;

public interface MarketingMapper {

    int deleteByPrimaryKey(String maingUuid);

    int insert(Marketing record);

    int insertSelective(Marketing record);

    Marketing selectByPrimaryKey(String maingUuid);

    int updateByPrimaryKeySelective(Marketing record);

    int updateByPrimaryKey(Marketing record);
}