package com.stock.mapper;

import com.stock.pojo.Industrialization;

public interface IndustrializationMapper {

    int deleteByPrimaryKey(String indusUuid);

    int insert(Industrialization record);

    int insertSelective(Industrialization record);

    Industrialization selectByPrimaryKey(String indusUuid);

    int updateByPrimaryKeySelective(Industrialization record);

    int updateByPrimaryKey(Industrialization record);
}