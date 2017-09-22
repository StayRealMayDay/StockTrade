package com.stock.mapper;

import java.util.List;

import com.stock.pojo.Indicator;

public interface IndicatorMapper {

    int deleteByPrimaryKey(String inUuid);

    int insert(Indicator record);

    int insertSelective(Indicator record);

    Indicator selectByPrimaryKey(String inUuid);

    int updateByPrimaryKeySelective(Indicator record);

    int updateByPrimaryKey(Indicator record);

	List<Indicator> selectAllFirstIndic(Indicator indicator);

	List<Indicator> selectAllSecondIndic(Indicator indicator);

	List<Indicator> selectNextIndicators(Indicator indicator2);

	List<Indicator> selectfirstIndicator(Indicator indicator);
	
}