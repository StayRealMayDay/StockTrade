package com.stock.mapper;

import com.stock.pojo.Team;

public interface TeamMapper {
   
    int deleteByPrimaryKey(String teamUuid);

    int insert(Team record);

    int insertSelective(Team record);

    Team selectByPrimaryKey(String teamUuid);

    int updateByPrimaryKeySelective(Team record);

    int updateByPrimaryKey(Team record);
}