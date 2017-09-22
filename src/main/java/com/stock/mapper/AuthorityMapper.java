package com.stock.mapper;

import com.stock.pojo.Authority;

public interface AuthorityMapper {


    int deleteByPrimaryKey(String auUuid);

    int insert(Authority record);

    int insertSelective(Authority record);

    Authority selectByPrimaryKey(String auUuid);

    int updateByPrimaryKeySelective(Authority record);

    int updateByPrimaryKey(Authority record);
}