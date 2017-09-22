package com.stock.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.stock.pojo.Manufacture;

public interface ManufactureMapper {

    int deleteByPrimaryKey(String manuUuid);

    int insert(Manufacture record);

    int insertSelective(Manufacture record);

    Manufacture selectByPrimaryKey(String manuUuid);

    int updateByPrimaryKeySelective(Manufacture record);

    int updateByPrimaryKey(Manufacture record);
}