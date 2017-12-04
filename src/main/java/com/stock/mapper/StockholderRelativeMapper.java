package com.stock.mapper;

import com.stock.pojo.StockholderRelative;
import com.stock.pojo.StockholderRelativeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockholderRelativeMapper {
    int countByExample(StockholderRelativeExample example);

    int deleteByExample(StockholderRelativeExample example);

    int deleteByPrimaryKey(String stockholderRelativeid);

    int insert(StockholderRelative record);

    int insertSelective(StockholderRelative record);

    List<StockholderRelative> selectByExample(StockholderRelativeExample example);

    StockholderRelative selectByPrimaryKey(String stockholderRelativeid);

    int updateByExampleSelective(@Param("record") StockholderRelative record, @Param("example") StockholderRelativeExample example);

    int updateByExample(@Param("record") StockholderRelative record, @Param("example") StockholderRelativeExample example);

    int updateByPrimaryKeySelective(StockholderRelative record);

    int updateByPrimaryKey(StockholderRelative record);
    
    StockholderRelative selectStockHolderR(String stockNum);
}