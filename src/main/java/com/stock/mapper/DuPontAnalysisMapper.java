package com.stock.mapper;

import com.stock.pojo.DuPontAnalysis;
import com.stock.pojo.DuPontAnalysisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DuPontAnalysisMapper {
    int countByExample(DuPontAnalysisExample example);

    int deleteByExample(DuPontAnalysisExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DuPontAnalysis record);

    int insertSelective(DuPontAnalysis record);

    List<DuPontAnalysis> selectByExample(DuPontAnalysisExample example);

    DuPontAnalysis selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DuPontAnalysis record, @Param("example") DuPontAnalysisExample example);

    int updateByExample(@Param("record") DuPontAnalysis record, @Param("example") DuPontAnalysisExample example);

    int updateByPrimaryKeySelective(DuPontAnalysis record);

    int updateByPrimaryKey(DuPontAnalysis record);

	List<DuPontAnalysis> selectDuPontAnalysis();
}