package com.stock.mapper;

import com.stock.pojo.TotalShareStructure;
import com.stock.pojo.TotalShareStructureExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TotalShareStructureMapper {
    int countByExample(TotalShareStructureExample example);

    int deleteByExample(TotalShareStructureExample example);

    int deleteByPrimaryKey(String id);

    int insert(TotalShareStructure record);

    int insertSelective(TotalShareStructure record);

    List<TotalShareStructure> selectByExample(TotalShareStructureExample example);

    TotalShareStructure selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TotalShareStructure record, @Param("example") TotalShareStructureExample example);

    int updateByExample(@Param("record") TotalShareStructure record, @Param("example") TotalShareStructureExample example);

    int updateByPrimaryKeySelective(TotalShareStructure record);

    int updateByPrimaryKey(TotalShareStructure record);
    
    //11月23号
    List<TotalShareStructure> structureAll(String stock_id);
}