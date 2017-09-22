package com.stock.mapper;

import com.stock.pojo.PolicyRelation;

public interface PolicyRelationMapper {

    int deleteByPrimaryKey(String polrUuid);

    int insert(PolicyRelation record);

    int insertSelective(PolicyRelation record);

    PolicyRelation selectByPrimaryKey(String polrUuid);

    int updateByPrimaryKeySelective(PolicyRelation record);

    int updateByPrimaryKey(PolicyRelation record);
}