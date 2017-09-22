package com.stock.mapper;

import com.stock.pojo.Capacity;

public interface CapacityMapper {

    int deleteByPrimaryKey(String caUuid);

    int insert(Capacity record);

    int insertSelective(Capacity record);
    
    Capacity selectByPrimaryKey(String caUuid);

    int updateByPrimaryKeySelective(Capacity record);

    int updateByPrimaryKey(Capacity record);
}