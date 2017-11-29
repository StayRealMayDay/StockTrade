package com.stock.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.stock.pojo.SystemLog;

public interface SystemLogMapper {
   

    int deleteByPrimaryKey(String sloguuid);

    int insert(SystemLog record);

    int insertSelective(SystemLog record);
    SystemLog selectByPrimaryKey(String sloguuid);
    int updateByPrimaryKeySelective(SystemLog record);

    int updateByPrimaryKey(SystemLog record);
}