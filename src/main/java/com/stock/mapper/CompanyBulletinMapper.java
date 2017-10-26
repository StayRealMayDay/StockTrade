package com.stock.mapper;

import com.stock.pojo.CompanyBulletin;
import com.stock.pojo.CompanyBulletinExample;
import com.stock.pojo.IndustryNewsinfo;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyBulletinMapper {
    int countByExample(CompanyBulletinExample example);

    int deleteByExample(CompanyBulletinExample example);

    int deleteByPrimaryKey(String id);

    int insert(CompanyBulletin record);

    int insertSelective(CompanyBulletin record);

    List<CompanyBulletin> selectByExample(CompanyBulletinExample example);

    CompanyBulletin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CompanyBulletin record, @Param("example") CompanyBulletinExample example);

    int updateByExample(@Param("record") CompanyBulletin record, @Param("example") CompanyBulletinExample example);

    int updateByPrimaryKeySelective(CompanyBulletin record);

    int updateByPrimaryKey(CompanyBulletin record);
    
    //2017年10月25日
    List<CompanyBulletin> selectSomeBulletin(String stockNum);
    
    //于花蕾2017年10月25日
    int selectAllByStockCount(String stockId);
    
    //于花蕾2017年10月25日
    List<CompanyBulletin> selectAllByStock(@Param("page") HashMap<String,Integer> map,@Param("stock") String stockNum);
    
    //于花蕾2017年10月25日
    CompanyBulletin selectDetail(String stockId);
    
    //17年10月26日
    int selectHuByStockCount();
    //17年10月26日
    int selectShenByStockCount();
    //17年10月26日
    List<CompanyBulletin>  selectHuStock();
    //17年10月26日
    List<CompanyBulletin>  selectShenStock();
    
}