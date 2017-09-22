package com.stock.mapper;

import java.util.List;

import com.stock.pojo.DataDictionary;

public interface DataDictionaryMapper {

    int deleteByPrimaryKey(Integer ddId);

    int insert(DataDictionary record);

    int insertSelective(DataDictionary record);

    DataDictionary selectByPrimaryKey(Integer ddId);

    int updateByPrimaryKeySelective(DataDictionary record);

    int updateByPrimaryKey(DataDictionary record);
    //查找学历
    List<DataDictionary> selectByDdDatatype(String ddDataType);
}