package com.stock.mapper;

import com.stock.pojo.PerformancePreview;
import com.stock.pojo.PerformancePreviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PerformancePreviewMapper {
    int countByExample(PerformancePreviewExample example);

    int deleteByExample(PerformancePreviewExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PerformancePreview record);

    int insertSelective(PerformancePreview record);

    List<PerformancePreview> selectByExample(PerformancePreviewExample example);

    PerformancePreview selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PerformancePreview record, @Param("example") PerformancePreviewExample example);

    int updateByExample(@Param("record") PerformancePreview record, @Param("example") PerformancePreviewExample example);

    int updateByPrimaryKeySelective(PerformancePreview record);

    int updateByPrimaryKey(PerformancePreview record);

	List<PerformancePreview> selectPerformancePreview();
}