package com.stock.mapper;

import com.stock.pojo.NewStock;
import com.stock.pojo.NewStockExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewStockMapper {
    int countByExample(NewStockExample example);

    int deleteByExample(NewStockExample example);

    int deleteByPrimaryKey(Integer nstockId);

    int insert(NewStock record);

    int insertSelective(NewStock record);

    List<NewStock> selectByExample(NewStockExample example);

    NewStock selectByPrimaryKey(Integer nstockId);

    int updateByExampleSelective(@Param("record") NewStock record, @Param("example") NewStockExample example);

    int updateByExample(@Param("record") NewStock record, @Param("example") NewStockExample example);

    int updateByPrimaryKeySelective(NewStock record);

    int updateByPrimaryKey(NewStock record);
    
    //于花蕾 新增(2017年9月29日)
    List<NewStock> selectAllNewStock(HashMap<String, Integer> map);
    //于花蕾 新增(2017年9月29日)
    int selectAllNewStockCount();
    
}