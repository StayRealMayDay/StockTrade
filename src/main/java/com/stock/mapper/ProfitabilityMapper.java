package com.stock.mapper;

import com.stock.pojo.Profitability;
import com.stock.pojo.ProfitabilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.mahout.math.jet.stat.Probability;

public interface ProfitabilityMapper {
    int countByExample(ProfitabilityExample example);

    int deleteByExample(ProfitabilityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Profitability record);

    int insertSelective(Profitability record);

    List<Profitability> selectByExample(ProfitabilityExample example);

    Profitability selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Profitability record, @Param("example") ProfitabilityExample example);

    int updateByExample(@Param("record") Profitability record, @Param("example") ProfitabilityExample example);

    int updateByPrimaryKeySelective(Profitability record);

    int updateByPrimaryKey(Profitability record);

	List<Probability> selectProbability();
}