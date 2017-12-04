package com.stock.mapper;

import com.stock.pojo.WeekQuotation;
import com.stock.pojo.WeekQuotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeekQuotationMapper {
    int countByExample(WeekQuotationExample example);

    int deleteByExample(WeekQuotationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeekQuotation record);

    int insertSelective(WeekQuotation record);

    List<WeekQuotation> selectByExample(WeekQuotationExample example);

    WeekQuotation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeekQuotation record, @Param("example") WeekQuotationExample example);

    int updateByExample(@Param("record") WeekQuotation record, @Param("example") WeekQuotationExample example);

    int updateByPrimaryKeySelective(WeekQuotation record);

    int updateByPrimaryKey(WeekQuotation record);

	List<WeekQuotation> selectWeekQuotation();
}