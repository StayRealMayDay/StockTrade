package com.stock.mapper;

import com.stock.pojo.JijinHoldstock;
import com.stock.pojo.JijinHoldstockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JijinHoldstockMapper {
    int countByExample(JijinHoldstockExample example);

    int deleteByExample(JijinHoldstockExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JijinHoldstock record);

    int insertSelective(JijinHoldstock record);

    List<JijinHoldstock> selectByExample(JijinHoldstockExample example);

    JijinHoldstock selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JijinHoldstock record, @Param("example") JijinHoldstockExample example);

    int updateByExample(@Param("record") JijinHoldstock record, @Param("example") JijinHoldstockExample example);

    int updateByPrimaryKeySelective(JijinHoldstock record);

    int updateByPrimaryKey(JijinHoldstock record);
    //18年4月12日
    List<String> selectJiJinName();
}