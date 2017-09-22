package com.stock.mapper;

import com.stock.pojo.AssetEva;

public interface AssetEvaMapper {

    int deleteByPrimaryKey(String aeUuid);

    int insert(AssetEva record);

    int insertSelective(AssetEva record);

    AssetEva selectByPrimaryKey(String aeUuid);

    int updateByPrimaryKeySelective(AssetEva record);

    int updateByPrimaryKey(AssetEva record);
}