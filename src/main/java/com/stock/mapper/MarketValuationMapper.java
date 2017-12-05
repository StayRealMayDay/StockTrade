package com.stock.mapper;

import com.stock.pojo.MarketValuation;
import com.stock.pojo.MarketValuationExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MarketValuationMapper {
    int countByExample(MarketValuationExample example);

    int deleteByExample(MarketValuationExample example);

    int deleteByPrimaryKey(Integer valueId);

    int insert(MarketValuation record);

    int insertSelective(MarketValuation record);

    List<MarketValuation> selectByExample(MarketValuationExample example);

    MarketValuation selectByPrimaryKey(Integer valueId);

    int updateByExampleSelective(@Param("record") MarketValuation record, @Param("example") MarketValuationExample example);

    int updateByExample(@Param("record") MarketValuation record, @Param("example") MarketValuationExample example);

    int updateByPrimaryKeySelective(MarketValuation record);

    int updateByPrimaryKey(MarketValuation record);

	List<MarketValuation> selectOrderAllMarketValue();

	List<MarketValuation> selectOrderbyPE(HashMap<String, Integer> map);

	List<MarketValuation> selectOrderbyPB(HashMap<String, Integer> map);

	List<MarketValuation> selectOrderbyPS(HashMap<String, Integer> map);

	List<MarketValuation> selectOrderbyTotalValue(HashMap<String, Integer> map);

	List<MarketValuation> selectOrderbyFlowValue(HashMap<String, Integer> map);

	List<MarketValuation> selectOrderbyEnterpValue(HashMap<String, Integer> map);

	List<MarketValuation> selectOrderbyPredictValue(HashMap<String, Integer> map);

	List<MarketValuation> selectOrderbyDividendRate(HashMap<String, Integer> map);

}