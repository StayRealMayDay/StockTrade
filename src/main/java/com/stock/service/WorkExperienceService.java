package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.WorkExperienceMapper;
import com.stock.pojo.LearnExperience;
import com.stock.pojo.WorkExperience;

@Service
@Transactional
public class WorkExperienceService {

	@Autowired
	WorkExperienceMapper workExperienceMapper;

	public List<WorkExperience> selectByUserUUID(String userUuid){
		return workExperienceMapper.selectByUserUUID(userUuid);
	}
	
	public int deleteByPrimaryKey(String leUuid){
		return workExperienceMapper.deleteByPrimaryKey(leUuid);
	}

	public int insertSelective(WorkExperience record){
		return workExperienceMapper.insertSelective(record);
    }
    
	public int updateByPrimaryKeySelective(WorkExperience record){
		return workExperienceMapper.updateByPrimaryKeySelective(record);
    }
}
