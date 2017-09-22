package com.stock.mapper;

import java.util.HashMap;
import java.util.List;

import com.stock.pojo.Project;
import com.stock.pojo.Requirement;

public interface RequirementMapper {

    int deleteByPrimaryKey(String reqUuid);

    int insert(Requirement record);

    int insertSelective(Requirement record);

    Requirement selectByPrimaryKey(String reqUuid);

    int updateByPrimaryKeySelective(Requirement record);

    int updateByPrimaryKey(Requirement record);

	List<Requirement> selectLastWeekRequirement(HashMap<String, Object> map);

	List<Requirement> selectAllReq();

	List<Requirement> selectMyRequirement(String userUuid);

	List<Requirement> selectAllRequirement();

	List<Requirement> selectAllRequirementByPaper(HashMap<String, Integer> map);
}