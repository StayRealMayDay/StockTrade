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

	List<CompanyExecutive> selectExecutives(String stock);

	List<CompanyExecutive> selectExecutivesDong(String stock);
}