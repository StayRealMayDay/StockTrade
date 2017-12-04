package com.stock.mapper;

import com.stock.pojo.StockTemp;
import com.stock.pojo.StockType;
import com.stock.pojo.StockTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockTypeMapper {
    int countByExample(StockTypeExample example);

    int deleteByExample(StockTypeExample example);

    int deleteByPrimaryKey(Integer typeId);

    int insert(StockType record);

    int insertSelective(StockType record);

    List<StockType> selectByExample(StockTypeExample example);

    StockType selectByPrimaryKey(Integer typeId);

    int updateByExampleSelective(@Param("record") StockType record, @Param("example") StockTypeExample example);

    int updateByExample(@Param("record") StockType record, @Param("example") StockTypeExample example);

    int updateByPrimaryKeySelective(StockType record);

    int updateByPrimaryKey(StockType record);

	List<StockType> selectStockTypesByFlag(String flag);

}