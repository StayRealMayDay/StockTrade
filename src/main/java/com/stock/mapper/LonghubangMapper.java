package com.stock.mapper;

import com.stock.pojo.Longhubang;
import com.stock.pojo.LonghubangExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LonghubangMapper {
    int countByExample(LonghubangExample example);

    int deleteByExample(LonghubangExample example);

    int deleteByPrimaryKey(String id);

    int insert(Longhubang record);

    int insertSelective(Longhubang record);

    List<Longhubang> selectByExample(LonghubangExample example);

    Longhubang selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Longhubang record, @Param("example") LonghubangExample example);

    int updateByExample(@Param("record") Longhubang record, @Param("example") LonghubangExample example);

    int updateByPrimaryKeySelective(Longhubang record);

    int updateByPrimaryKey(Longhubang record);
    //１２月１４日
    List<String> selectAllDate();
    //12月１４日
    List<Longhubang> selectSomeDateData(String date);
    //12月15日
    List<Longhubang> selectDataOfThree(List<String> dates);
}