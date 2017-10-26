package com.stock.mapper;

import com.stock.pojo.IndustryDistribution;
import com.stock.pojo.IndustryDistributionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryDistributionMapper {
    int countByExample(IndustryDistributionExample example);

    int deleteByExample(IndustryDistributionExample example);

    int deleteByPrimaryKey(String id);

    int insert(IndustryDistribution record);

    int insertSelective(IndustryDistribution record);

    List<IndustryDistribution> selectByExample(IndustryDistributionExample example);

    IndustryDistribution selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") IndustryDistribution record, @Param("example") IndustryDistributionExample example);

    int updateByExample(@Param("record") IndustryDistribution record, @Param("example") IndustryDistributionExample example);

    int updateByPrimaryKeySelective(IndustryDistribution record);

    int updateByPrimaryKey(IndustryDistribution record);

	List<IndustryDistribution> selectDistriAll(String stock);
}