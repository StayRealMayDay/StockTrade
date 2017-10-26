package com.stock.mapper;

import com.stock.pojo.CompanyExecutive;
import com.stock.pojo.CompanyExecutiveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyExecutiveMapper {
    int countByExample(CompanyExecutiveExample example);

    int deleteByExample(CompanyExecutiveExample example);

    int insert(CompanyExecutive record);

    int insertSelective(CompanyExecutive record);

    List<CompanyExecutive> selectByExample(CompanyExecutiveExample example);

    int updateByExampleSelective(@Param("record") CompanyExecutive record, @Param("example") CompanyExecutiveExample example);

    int updateByExample(@Param("record") CompanyExecutive record, @Param("example") CompanyExecutiveExample example);
    
    //新增部分 2017年10月19日
    List<CompanyExecutive> selectGaoGuan(String stockId);
    //新增部分2017年10月29日
    List<CompanyExecutive> selectDongShi(String stockId);
}