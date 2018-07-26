package com.stock.mapper;

import com.stock.pojo.JijinAll;
import com.stock.pojo.JijinAllExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface JijinAllMapper {
    int countByExample(JijinAllExample example);

    int deleteByExample(JijinAllExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(JijinAll record);

    int insertSelective(JijinAll record);

    List<JijinAll> selectByExample(JijinAllExample example);

    JijinAll selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") JijinAll record, @Param("example") JijinAllExample example);

    int updateByExample(@Param("record") JijinAll record, @Param("example") JijinAllExample example);

    int updateByPrimaryKeySelective(JijinAll record);

    int updateByPrimaryKey(JijinAll record);
}