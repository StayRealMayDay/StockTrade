package com.stock.mapper;

import com.stock.pojo.Dzjy;
import com.stock.pojo.DzjyExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DzjyMapper {
    int countByExample(DzjyExample example);

    int deleteByExample(DzjyExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Dzjy record);

    int insertSelective(Dzjy record);

    List<Dzjy> selectByExample(DzjyExample example);

    Dzjy selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Dzjy record, @Param("example") DzjyExample example);

    int updateByExample(@Param("record") Dzjy record, @Param("example") DzjyExample example);

    int updateByPrimaryKeySelective(Dzjy record);

    int updateByPrimaryKey(Dzjy record);
    
    //于花蕾 新增(2017年9月29日)
    List<Dzjy> selectAllDzjy(HashMap<String, Integer> map);
    //于花蕾 新增(2017年9月29日)
    int selectAllDzjyCount();
    
}