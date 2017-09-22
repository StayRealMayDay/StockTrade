package com.stock.mapper;

import com.stock.pojo.Role;
import com.stock.pojo.User;

public interface RoleMapper {

    int deleteByPrimaryKey(String roleUuid);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String roleUuid);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);

	Role selectByRoleUuid(String roleName);
}