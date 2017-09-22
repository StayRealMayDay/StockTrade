package com.stock.mapper;

import com.stock.pojo.AuRole;

public interface AuRoleMapper {


    int deleteByPrimaryKey(String auRoleUuid);

    int insert(AuRole record);

    int insertSelective(AuRole record);

    AuRole selectByPrimaryKey(String auRoleUuid);

    int updateByPrimaryKeySelective(AuRole record);

    int updateByPrimaryKey(AuRole record);
}