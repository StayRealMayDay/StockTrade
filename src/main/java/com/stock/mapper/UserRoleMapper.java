package com.stock.mapper;

import com.stock.pojo.UserRole;

public interface UserRoleMapper {

    int deleteByPrimaryKey(String userRoleUuid);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(String userRoleUuid);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);

	UserRole selectRoleUuidByUuid(String userUuid);
}