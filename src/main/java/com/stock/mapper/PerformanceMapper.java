package com.stock.mapper;

import com.stock.pojo.Performance;

public interface PerformanceMapper {

    int deleteByPrimaryKey(String perUuid);

    int insert(Performance record);

    int insertSelective(Performance record);

    Performance selectByPrimaryKey(String perUuid);

    int updateByPrimaryKeySelective(Performance record);

    int updateByPrimaryKey(Performance record);
}