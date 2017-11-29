package com.stock.mapper;

import com.stock.pojo.StockholderBasic;
import com.stock.pojo.StockholderBasicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockholderBasicMapper {
    int countByExample(StockholderBasicExample example);

    int deleteByExample(StockholderBasicExample example);

    int deleteByPrimaryKey(String stockholderId);

    int insert(StockholderBasic record);

    int insertSelective(StockholderBasic record);

    List<StockholderBasic> selectByExample(StockholderBasicExample example);

    StockholderBasic selectByPrimaryKey(String stockholderId);

    int updateByExampleSelective(@Param("record") StockholderBasic record, @Param("example") StockholderBasicExample example);

    int updateByExample(@Param("record") StockholderBasic record, @Param("example") StockholderBasicExample example);

    int updateByPrimaryKeySelective(StockholderBasic record);

    int updateByPrimaryKey(StockholderBasic record);

    
    List<StockholderBasic> selectStockHolderB(String stockNum);

	List<StockholderBasic> selecStockholderByStock(String stock);

}