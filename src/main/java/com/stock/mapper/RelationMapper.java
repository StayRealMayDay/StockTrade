package com.stock.mapper;

import java.util.HashMap;
import java.util.List;

import com.stock.pojo.Project;
import com.stock.pojo.Relation;

public interface RelationMapper {

    int deleteByPrimaryKey(String reUuid);

    int insert(Relation record);

    int insertSelective(Relation record);

    Relation selectByPrimaryKey(String reUuid);

    int updateByPrimaryKeySelective(Relation record);

    int updateByPrimaryKey(Relation record);

	List<Relation> selectRelationByProUuid(String projectUuid);

	List<Relation> countRelationNum(String projectUuid);

	List<Relation> selectAllRealation();

	List<Relation> selectWeekNoCare(HashMap<String, Object> map);

	List<Relation> selectMonthNoCare(HashMap<String, Object> map);
    
	 /**
	  *  2017-6-23合并  作者：张玉筱    合并者：刘禄霞
	  */
	List<Relation> selectMyFocusPro(String userUuid);
	
	List<Relation> selectMyFocusReq(String userUuid);
	
	 //检查该用户是否已经收藏过需求
    Relation checkIsUniqueFocusReq(Relation record);
    
    //检查该用户是否已经关注过项目
    Relation checkIsUniqueFocusPro(Relation record);
	
}