package com.stock.mapper;

import com.stock.pojo.StockTemp;
import com.stock.pojo.StockTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockTempMapper {
    int countByExample(StockTempExample example);

    int deleteByExample(StockTempExample example);

    int deleteByPrimaryKey(String stockId);

    int insert(StockTemp record);

    int insertSelective(StockTemp record);

    List<StockTemp> selectByExample(StockTempExample example);

    StockTemp selectByPrimaryKey(String stockId);

    int updateByExampleSelective(@Param("record") StockTemp record, @Param("example") StockTempExample example);

    int updateByExample(@Param("record") StockTemp record, @Param("example") StockTempExample example);

    int updateByPrimaryKeySelective(StockTemp record);

    int updateByPrimaryKey(StockTemp record);

	List<StockTemp> selectTop10(String industry);

	List<StockTemp> selectAllSimIndustry(String industry);

	List<StockTemp> selectAllStockTemp();
}