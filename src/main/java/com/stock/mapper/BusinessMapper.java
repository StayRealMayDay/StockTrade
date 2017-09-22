package com.stock.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.stock.pojo.Business;

public interface BusinessMapper {

    int deleteByPrimaryKey(String busUuid);

    int insert(Business record);

    int insertSelective(Business record);

    Business selectByPrimaryKey(String busUuid);

    int updateByPrimaryKeySelective(Business record);

    int updateByPrimaryKey(Business record);

	Business selectBusByProductUuid(String productUuid);

	Business selectBusinessByProduct(String busUuid);
}