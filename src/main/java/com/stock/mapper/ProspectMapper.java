package com.stock.mapper;

import com.stock.pojo.Prospect;

public interface ProspectMapper {

    int deleteByPrimaryKey(String prosUuid);

    int insert(Prospect record);

    int insertSelective(Prospect record);

    Prospect selectByPrimaryKey(String prosUuid);

    int updateByPrimaryKeySelective(Prospect record);

    int updateByPrimaryKey(Prospect record);
}