package com.stock.mapper;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.stock.pojo.Evaluation;

public interface EvaluationMapper {
    int deleteByPrimaryKey(String evaUuid);

    int insert(Evaluation record);

    int insertSelective(Evaluation record);

    Evaluation selectByPrimaryKey(String evaUuid);

    int updateByPrimaryKeySelective(Evaluation record);

    int updateByPrimaryKey(Evaluation record);

	List<Evaluation> selectEvaPRecordByOtherUser(String projectUuid);

	List<Evaluation> listEvaPRecordByOtherUser(HashMap map);

	
}