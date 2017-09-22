package com.stock.mapper;

import com.stock.pojo.Income;
public interface IncomeMapper {

    int deleteByPrimaryKey(String incoUuid);

    int insert(Income record);

    int insertSelective(Income record);

    Income selectByPrimaryKey(String incoUuid);

    int updateByPrimaryKeySelective(Income record);

    int updateByPrimaryKey(Income record);
}