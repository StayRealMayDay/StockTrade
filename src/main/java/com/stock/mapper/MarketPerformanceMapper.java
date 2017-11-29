package com.stock.mapper;

import com.stock.pojo.MarketPerformance;
import com.stock.pojo.MarketPerformanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketPerformanceMapper {
    int countByExample(MarketPerformanceExample example);

    int deleteByExample(MarketPerformanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MarketPerformance record);

    int insertSelective(MarketPerformance record);

    List<MarketPerformance> selectByExample(MarketPerformanceExample example);

    MarketPerformance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MarketPerformance record, @Param("example") MarketPerformanceExample example);

    int updateByExample(@Param("record") MarketPerformance record, @Param("example") MarketPerformanceExample example);

    int updateByPrimaryKeySelective(MarketPerformance record);

    int updateByPrimaryKey(MarketPerformance record);

	List<MarketPerformance> selectAllMarketPerformance();
}