package com.stock.mapper;

import com.stock.pojo.StockHolderNumber;
import com.stock.pojo.StockHolderNumberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockHolderNumberMapper {
    int countByExample(StockHolderNumberExample example);

    int deleteByExample(StockHolderNumberExample example);

    int deleteByPrimaryKey(String id);

    int insert(StockHolderNumber record);

    int insertSelective(StockHolderNumber record);

    List<StockHolderNumber> selectByExample(StockHolderNumberExample example);

    StockHolderNumber selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") StockHolderNumber record, @Param("example") StockHolderNumberExample example);

    int updateByExample(@Param("record") StockHolderNumber record, @Param("example") StockHolderNumberExample example);

    int updateByPrimaryKeySelective(StockHolderNumber record);

    int updateByPrimaryKey(StockHolderNumber record);
    
    List<StockHolderNumber> stock_holderDetail(String stock_id);
}