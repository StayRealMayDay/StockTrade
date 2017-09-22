package com.stock.mapper;

import java.util.List;

import com.stock.pojo.EvaOption;

public interface EvaOptionMapper {

    int deleteByPrimaryKey(String opUuid);

    int insert(EvaOption record);

    int insertSelective(EvaOption record);

    EvaOption selectByPrimaryKey(String opUuid);

    int updateByPrimaryKeySelective(EvaOption record);

    int updateByPrimaryKey(EvaOption record);

	List<EvaOption> selectAllOptions();

	EvaOption selectOptionIdByValueIn(EvaOption eva_option);
}