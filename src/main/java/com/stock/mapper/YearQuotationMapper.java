package com.stock.mapper;

import com.stock.pojo.YearQuotation;
import com.stock.pojo.YearQuotationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface YearQuotationMapper {
    int countByExample(YearQuotationExample example);

    int deleteByExample(YearQuotationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(YearQuotation record);

    int insertSelective(YearQuotation record);

    List<YearQuotation> selectByExample(YearQuotationExample example);

    YearQuotation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") YearQuotation record, @Param("example") YearQuotationExample example);

    int updateByExample(@Param("record") YearQuotation record, @Param("example") YearQuotationExample example);

    int updateByPrimaryKeySelective(YearQuotation record);

    int updateByPrimaryKey(YearQuotation record);

	List<YearQuotation> selectYearQuotation();
}