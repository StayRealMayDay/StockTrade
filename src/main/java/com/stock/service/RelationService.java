package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.RelationMapper;
import com.stock.pojo.Relation;

@Service
@Transactional
public class RelationService {

	@Autowired 
	RelationMapper relationMapper;
	
	public int insertSelective(Relation record){
		return relationMapper.insertSelective(record);
	}
	
    public List<Relation> selectMyFocusPro(String userUuid){
    	return relationMapper.selectMyFocusPro(userUuid);
    }
    
    public List<Relation> selectMyFocusReq(String userUuid){
    	return relationMapper.selectMyFocusReq(userUuid);
    }
	
	//检查该用户是否已经关注过项目
	public Relation checkIsUniqueFocusPro(Relation record){
		return relationMapper.checkIsUniqueFocusPro(record);
	}
	
	//检查该用户是否已经收藏过需求
    public Relation checkIsUniqueFocusReq(Relation record){
    	return relationMapper.checkIsUniqueFocusReq(record);
    }

    public int deleteByPrimaryKey(String reUuid){
    	return relationMapper.deleteByPrimaryKey(reUuid);
    }
}
