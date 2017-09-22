package com.stock.mapper;

import com.stock.pojo.Competitor;

public interface CompetitorMapper {
	
    int deleteByPrimaryKey(String compUuid);

    int insert(Competitor record);

    int insertSelective(Competitor record);

    Competitor selectByPrimaryKey(String compUuid);

    int updateByPrimaryKeySelective(Competitor record);

    int updateByPrimaryKey(Competitor record);
}