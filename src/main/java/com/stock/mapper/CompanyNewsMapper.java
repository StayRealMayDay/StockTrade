package com.stock.mapper;

import com.stock.pojo.CompanyNews;
import com.stock.pojo.CompanyNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyNewsMapper {
    int countByExample(CompanyNewsExample example);

    int deleteByExample(CompanyNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyNews record);

    int insertSelective(CompanyNews record);

    List<CompanyNews> selectByExampleWithBLOBs(CompanyNewsExample example);

    List<CompanyNews> selectByExample(CompanyNewsExample example);

    CompanyNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyNews record, @Param("example") CompanyNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyNews record, @Param("example") CompanyNewsExample example);

    int updateByExample(@Param("record") CompanyNews record, @Param("example") CompanyNewsExample example);

    int updateByPrimaryKeySelective(CompanyNews record);

    int updateByPrimaryKeyWithBLOBs(CompanyNews record);

    int updateByPrimaryKey(CompanyNews record);

	List<CompanyNews> getHotNews();
}