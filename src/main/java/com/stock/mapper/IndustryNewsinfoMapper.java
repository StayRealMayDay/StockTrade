package com.stock.mapper;

import com.stock.pojo.IndustryNewsinfo;
import com.stock.pojo.IndustryNewsinfoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IndustryNewsinfoMapper {
    int countByExample(IndustryNewsinfoExample example);

    int deleteByExample(IndustryNewsinfoExample example);

    int insert(IndustryNewsinfo record);

    int insertSelective(IndustryNewsinfo record);

    List<IndustryNewsinfo> selectByExample(IndustryNewsinfoExample example);

    int updateByExampleSelective(@Param("record") IndustryNewsinfo record, @Param("example") IndustryNewsinfoExample example);

    int updateByExample(@Param("record") IndustryNewsinfo record, @Param("example") IndustryNewsinfoExample example);
    
    //于花蕾2017年10月25日
    List<IndustryNewsinfo> selectTitleByStock(List<String> listByIds);
    
    //于花蕾2017年10月25日
    int selectAllByStockCount(List<String> listByIds);
    
    //于花蕾2017年10月25日
    List<IndustryNewsinfo> selectAllByStock(@Param("page") HashMap<String,Integer> map,@Param("stocklist") List<String> stocklist);
    
    //于花蕾2017年10月25日
    IndustryNewsinfo selectDetail(String stockId);
}