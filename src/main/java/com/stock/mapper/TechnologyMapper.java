package com.stock.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.stock.pojo.Technology;

public interface TechnologyMapper {

    int deleteByPrimaryKey(String techUuid);

    int insert(Technology record);

    int insertSelective(Technology record);

    Technology selectByPrimaryKey(String techUuid);

    int updateByPrimaryKeySelective(Technology record);

    int updateByPrimaryKey(Technology record);

	Technology selectByProductUuid(String productUuid);

	Technology selectTechByPrduct(String productUuid);

}