package com.stock.mapper;

import com.stock.pojo.Option;

public interface OptionMapper {

    int deleteByPrimaryKey(String opUuid);

    int insert(Option record);

    int insertSelective(Option record);

    Option selectByPrimaryKey(String opUuid);

    int updateByPrimaryKeySelective(Option record);

    int updateByPrimaryKey(Option record);
}