package com.stock.mapper;

import java.util.List;

import com.stock.pojo.LearnExperience;

public interface LearnExperienceMapper {

    int deleteByPrimaryKey(String leUuid);

    int insert(LearnExperience record);

    int insertSelective(LearnExperience record);

    LearnExperience selectByPrimaryKey(String leUuid);
    
    int updateByPrimaryKeySelective(LearnExperience record);

    int updateByPrimaryKey(LearnExperience record);

	List<LearnExperience> selectLEByUserUuid(String userUuid);

	int deleteByUuid(String userUuid);

	List<LearnExperience> selectByUserUUID(String userUuid);
	
}