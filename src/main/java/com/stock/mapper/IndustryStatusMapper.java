package com.stock.mapper;

import com.stock.pojo.IndustryStatus;
import com.stock.pojo.IndustryStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryStatusMapper {
    int countByExample(IndustryStatusExample example);

    int deleteByExample(IndustryStatusExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(IndustryStatus record);

    int insertSelective(IndustryStatus record);

    List<IndustryStatus> selectByExample(IndustryStatusExample example);

    IndustryStatus selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") IndustryStatus record, @Param("example") IndustryStatusExample example);

    int updateByExample(@Param("record") IndustryStatus record, @Param("example") IndustryStatusExample example);

    int updateByPrimaryKeySelective(IndustryStatus record);

    int updateByPrimaryKey(IndustryStatus record);

	List<IndustryStatus> selectAllIndustryStatus();
}