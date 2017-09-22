package com.stock.mapper;

import com.stock.pojo.Milestone;

public interface MilestoneMapper {
    int deleteByPrimaryKey(String msUuid);

    int insert(Milestone record);

    int insertSelective(Milestone record);

    Milestone selectByPrimaryKey(String msUuid);

    int updateByPrimaryKeySelective(Milestone record);

    int updateByPrimaryKey(Milestone record);
}