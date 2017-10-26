package com.stock.mapper;

import com.stock.pojo.Ddzz;
import com.stock.pojo.DdzzExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DdzzMapper {
    int countByExample(DdzzExample example);

    int deleteByExample(DdzzExample example);

    int deleteByPrimaryKey(String ddzzId);

    int insert(Ddzz record);

    int insertSelective(Ddzz record);

    List<Ddzz> selectByExample(DdzzExample example);

    Ddzz selectByPrimaryKey(String ddzzId);

    int updateByExampleSelective(@Param("record") Ddzz record, @Param("example") DdzzExample example);

    int updateByExample(@Param("record") Ddzz record, @Param("example") DdzzExample example);

    int updateByPrimaryKeySelective(Ddzz record);

    int updateByPrimaryKey(Ddzz record);
    //于花蕾 新增 2017年9月29
    List<Ddzz> selectDdzzNewsList(HashMap<String, Integer> map);
    //于花蕾 新增 2017年9月29
    int selectAllDdzzCount();
    //于花蕾 新增 2017年9月29
    Ddzz ddzzNewsDetail(String id);
}