package com.stock.mapper;

import com.stock.pojo.CapitalFlow;
import com.stock.pojo.CapitalFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CapitalFlowMapper {
    int countByExample(CapitalFlowExample example);

    int deleteByExample(CapitalFlowExample example);

    int deleteByPrimaryKey(Integer flowId);

    int insert(CapitalFlow record);

    int insertSelective(CapitalFlow record);

    List<CapitalFlow> selectByExample(CapitalFlowExample example);

    CapitalFlow selectByPrimaryKey(Integer flowId);

    int updateByExampleSelective(@Param("record") CapitalFlow record, @Param("example") CapitalFlowExample example);

    int updateByExample(@Param("record") CapitalFlow record, @Param("example") CapitalFlowExample example);

    int updateByPrimaryKeySelective(CapitalFlow record);

    int updateByPrimaryKey(CapitalFlow record);

	List<CapitalFlow> selectFlowIn();

	List<CapitalFlow> selectFlowOut();

	List<CapitalFlow> selectFlowByIndustry();

	List<CapitalFlow> selectFlowByArea();

	List<CapitalFlow> selectFlowByNet();

	List<CapitalFlow> selectFlowByMoneyRate();

	List<CapitalFlow> selectFlowBySActiveOut();

	List<CapitalFlow> selectFlowBySActiveIn();

	List<CapitalFlow> selectFlowBySPassitiveIn();

	List<CapitalFlow> selectFlowBySPassitiveOut();

}