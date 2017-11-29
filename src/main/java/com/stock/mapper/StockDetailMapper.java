package com.stock.mapper;

import com.stock.pojo.StockDetail;
import com.stock.pojo.StockDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockDetailMapper {
    int countByExample(StockDetailExample example);

    int deleteByExample(StockDetailExample example);

    int deleteByPrimaryKey(String id);

    int insert(StockDetail record);

    int insertSelective(StockDetail record);

    List<StockDetail> selectByExample(StockDetailExample example);

    StockDetail selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StockDetail record, @Param("example") StockDetailExample example);

    int updateByExample(@Param("record") StockDetail record, @Param("example") StockDetailExample example);

    int updateByPrimaryKeySelective(StockDetail record);

    int updateByPrimaryKey(StockDetail record);
    
    List<StockDetail> selectStockDetail(String stock_detail_id);
}