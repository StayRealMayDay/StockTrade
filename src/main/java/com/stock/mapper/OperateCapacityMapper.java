package com.stock.mapper;

import com.stock.pojo.OperateCapacity;
import com.stock.pojo.OperateCapacityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperateCapacityMapper {
    int countByExample(OperateCapacityExample example);

    int deleteByExample(OperateCapacityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(OperateCapacity record);

    int insertSelective(OperateCapacity record);

    List<OperateCapacity> selectByExample(OperateCapacityExample example);

    OperateCapacity selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") OperateCapacity record, @Param("example") OperateCapacityExample example);

    int updateByExample(@Param("record") OperateCapacity record, @Param("example") OperateCapacityExample example);

    int updateByPrimaryKeySelective(OperateCapacity record);

    int updateByPrimaryKey(OperateCapacity record);

	List<OperateCapacity> selectOperateCapacity();
}