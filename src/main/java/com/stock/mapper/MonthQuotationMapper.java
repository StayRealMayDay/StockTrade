package com.stock.mapper;

import com.stock.pojo.MonthQuotation;
import com.stock.pojo.MonthQuotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MonthQuotationMapper {
    int countByExample(MonthQuotationExample example);

    int deleteByExample(MonthQuotationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MonthQuotation record);

    int insertSelective(MonthQuotation record);

    List<MonthQuotation> selectByExample(MonthQuotationExample example);

    MonthQuotation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MonthQuotation record, @Param("example") MonthQuotationExample example);

    int updateByExample(@Param("record") MonthQuotation record, @Param("example") MonthQuotationExample example);

    int updateByPrimaryKeySelective(MonthQuotation record);

    int updateByPrimaryKey(MonthQuotation record);

	List<MonthQuotation> selectMonthQuotation();
}