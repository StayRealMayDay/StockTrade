package com.stock.mapper;

import java.util.List;

import com.stock.pojo.LearnExperience;
import com.stock.pojo.WorkExperience;

public interface WorkExperienceMapper {

    int deleteByPrimaryKey(String weUuid);

    int insert(WorkExperience record);

    int insertSelective(WorkExperience record);

    WorkExperience selectByPrimaryKey(String weUuid);

    int updateByPrimaryKeySelective(WorkExperience record);

    int updateByPrimaryKey(WorkExperience record);

	List<WorkExperience> selectWEByUserUuid(String userUuid);

	List<WorkExperience> selectByUserUUID(String userUuid);
	  
}