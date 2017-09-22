package com.stock.mapper;

import com.stock.pojo.Cooperator;


public interface CooperatorMapper {

    int deleteByPrimaryKey(String cooUuid);

    int insert(Cooperator record);

    int insertSelective(Cooperator record);

    Cooperator selectByPrimaryKey(String cooUuid);

    int updateByPrimaryKeySelective(Cooperator record);

    int updateByPrimaryKey(Cooperator record);
}