package com.stock.mapper;

import com.stock.pojo.Files;

public interface FileMapper {

    int deleteByPrimaryKey(String fileUuid);

    int insert(Files record);

    int insertSelective(Files record);

    Files selectByPrimaryKey(String fileUuid);

    int updateByPrimaryKeySelective(Files record);

    int updateByPrimaryKey(Files record);
}