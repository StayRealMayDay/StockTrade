package com.stock.mapper;

import com.stock.pojo.ProfitForecast;
import com.stock.pojo.ProfitForecastExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProfitForecastMapper {
    int countByExample(ProfitForecastExample example);

    int deleteByExample(ProfitForecastExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ProfitForecast record);

    int insertSelective(ProfitForecast record);

    List<ProfitForecast> selectByExample(ProfitForecastExample example);

    ProfitForecast selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ProfitForecast record, @Param("example") ProfitForecastExample example);

    int updateByExample(@Param("record") ProfitForecast record, @Param("example") ProfitForecastExample example);

    int updateByPrimaryKeySelective(ProfitForecast record);

    int updateByPrimaryKey(ProfitForecast record);

	List<ProfitForecast> selectProfitForecast();
}