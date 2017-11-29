package com.stock.mapper;

import com.stock.pojo.Nodes;
import com.stock.pojo.NodesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NodesMapper {
    int countByExample(NodesExample example);

    int deleteByExample(NodesExample example);

    int deleteByPrimaryKey(String iid);

    int insert(Nodes record);

    int insertSelective(Nodes record);

    List<Nodes> selectByExample(NodesExample example);

    Nodes selectByPrimaryKey(String iid);

    int updateByExampleSelective(@Param("record") Nodes record, @Param("example") NodesExample example);

    int updateByExample(@Param("record") Nodes record, @Param("example") NodesExample example);

    int updateByPrimaryKeySelective(Nodes record);

    int updateByPrimaryKey(Nodes record);
    
    List<Nodes> selectNodesByStock(String stock);

	void insertNodesGaoGuan(@Param("y")double y, @Param("x")double x, @Param("stock")String stock);
}