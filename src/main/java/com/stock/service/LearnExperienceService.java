package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.LearnExperienceMapper;
import com.stock.pojo.LearnExperience;

@Service
@Transactional
public class LearnExperienceService {

	@Autowired
	LearnExperienceMapper learnExperienceMapper;
	
	public List<LearnExperience> selectByUserUUID(String userUuid){
		return learnExperienceMapper.selectByUserUUID(userUuid);
	}
	
	public int deleteByPrimaryKey(String leUuid){
		return learnExperienceMapper.deleteByPrimaryKey(leUuid);
	}

	public int insertSelective(LearnExperience record){
		return learnExperienceMapper.insertSelective(record);
    }
    
	public int updateByPrimaryKeySelective(LearnExperience record){
		return learnExperienceMapper.updateByPrimaryKeySelective(record);
    }
}
