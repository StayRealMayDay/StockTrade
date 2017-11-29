package com.stock.mapper;

import com.stock.pojo.Edges;
import com.stock.pojo.EdgesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EdgesMapper {
    int countByExample(EdgesExample example);

    int deleteByExample(EdgesExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Edges record);

    int insertSelective(Edges record);

    List<Edges> selectByExample(EdgesExample example);

    Edges selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Edges record, @Param("example") EdgesExample example);

    int updateByExample(@Param("record") Edges record, @Param("example") EdgesExample example);

    int updateByPrimaryKeySelective(Edges record);

    int updateByPrimaryKey(Edges record);
    
    List<Edges> selectEdgesByStock(String stock);
}