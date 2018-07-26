package com.stock.mapper;

import com.stock.pojo.Company;
import com.stock.pojo.Stockpricechange;
import com.stock.pojo.StockpricechangeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockpricechangeMapper {
    int countByExample(StockpricechangeExample example);

    int deleteByExample(StockpricechangeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Stockpricechange record);

    int insertSelective(Stockpricechange record);

    List<Stockpricechange> selectByExample(StockpricechangeExample example);

    Stockpricechange selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Stockpricechange record, @Param("example") StockpricechangeExample example);

    int updateByExample(@Param("record") Stockpricechange record, @Param("example") StockpricechangeExample example);

    int updateByPrimaryKeySelective(Stockpricechange record);

    int updateByPrimaryKey(Stockpricechange record);
    
    List<Stockpricechange> stockOnePriceChange(String stock_id);
    
}