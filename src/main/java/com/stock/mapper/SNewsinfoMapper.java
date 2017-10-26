package com.stock.mapper;

import com.stock.pojo.SNewsinfo;
import com.stock.pojo.SNewsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SNewsinfoMapper {
    int countByExample(SNewsinfoExample example);

    int deleteByExample(SNewsinfoExample example);

    int insert(SNewsinfo record);

    int insertSelective(SNewsinfo record);

    List<SNewsinfo> selectByExample(SNewsinfoExample example);

    int updateByExampleSelective(@Param("record") SNewsinfo record, @Param("example") SNewsinfoExample example);

    int updateByExample(@Param("record") SNewsinfo record, @Param("example") SNewsinfoExample example);
}