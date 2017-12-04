package com.stock.mapper;

import com.stock.pojo.RiskAnalysis;
import com.stock.pojo.RiskAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RiskAnalysisMapper {
    int countByExample(RiskAnalysisExample example);

    int deleteByExample(RiskAnalysisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(RiskAnalysis record);

    int insertSelective(RiskAnalysis record);

    List<RiskAnalysis> selectByExample(RiskAnalysisExample example);

    RiskAnalysis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") RiskAnalysis record, @Param("example") RiskAnalysisExample example);

    int updateByExample(@Param("record") RiskAnalysis record, @Param("example") RiskAnalysisExample example);

    int updateByPrimaryKeySelective(RiskAnalysis record);

    int updateByPrimaryKey(RiskAnalysis record);

	List<RiskAnalysis> selectAll();

}