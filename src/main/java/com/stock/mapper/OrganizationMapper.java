package com.stock.mapper;

import com.stock.pojo.Organization;

public interface OrganizationMapper {

    int deleteByPrimaryKey(String organUuid);

    int insert(Organization record);

    int insertSelective(Organization record);

    Organization selectByPrimaryKey(String organUuid);

    int updateByPrimaryKeySelective(Organization record);

    int updateByPrimaryKey(Organization record);
}