package com.stock.mapper;

import com.stock.pojo.CompanyDetail;
import com.stock.pojo.CompanyDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyDetailMapper {
    int countByExample(CompanyDetailExample example);

    int deleteByExample(CompanyDetailExample example);

    int deleteByPrimaryKey(String companyId);

    int insert(CompanyDetail record);

    int insertSelective(CompanyDetail record);

    List<CompanyDetail> selectByExample(CompanyDetailExample example);

    CompanyDetail selectByPrimaryKey(String companyId);

    int updateByExampleSelective(@Param("record") CompanyDetail record, @Param("example") CompanyDetailExample example);

    int updateByExample(@Param("record") CompanyDetail record, @Param("example") CompanyDetailExample example);

    int updateByPrimaryKeySelective(CompanyDetail record);

    int updateByPrimaryKey(CompanyDetail record);
    
    //新增部分 2017年10月19日
    CompanyDetail companyDetail(String beiDou);
}