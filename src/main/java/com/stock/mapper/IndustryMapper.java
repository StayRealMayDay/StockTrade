package com.stock.mapper;

import java.util.List;

import com.stock.pojo.Industry;

public interface IndustryMapper {

    int deleteByPrimaryKey(String industryUuid);

    int insert(Industry record);

    int insertSelective(Industry record);

    Industry selectByPrimaryKey(String industryUuid);

    int updateByPrimaryKeySelective(Industry record);

    int updateByPrimaryKey(Industry record);
    
    /**
	 * 2017-6-23合并  作者：张玉筱  合并者：刘禄霞
	 */
    List<Industry> selectAllIndustry();
}