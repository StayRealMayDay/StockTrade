package com.stock.mapper;

import com.stock.pojo.ComprehensiveInvestmentRank;
import com.stock.pojo.ComprehensiveInvestmentRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ComprehensiveInvestmentRankMapper {
    int countByExample(ComprehensiveInvestmentRankExample example);

    int deleteByExample(ComprehensiveInvestmentRankExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ComprehensiveInvestmentRank record);

    int insertSelective(ComprehensiveInvestmentRank record);

    List<ComprehensiveInvestmentRank> selectByExample(ComprehensiveInvestmentRankExample example);

    ComprehensiveInvestmentRank selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ComprehensiveInvestmentRank record, @Param("example") ComprehensiveInvestmentRankExample example);

    int updateByExample(@Param("record") ComprehensiveInvestmentRank record, @Param("example") ComprehensiveInvestmentRankExample example);

    int updateByPrimaryKeySelective(ComprehensiveInvestmentRank record);

    int updateByPrimaryKey(ComprehensiveInvestmentRank record);

	List<ComprehensiveInvestmentRank> selectComprehensiveInvestmentRank();
}