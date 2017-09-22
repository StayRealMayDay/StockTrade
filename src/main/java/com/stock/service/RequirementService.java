package com.stock.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.IndustryMapper;
import com.stock.mapper.RequirementMapper;
import com.stock.pojo.Industry;
import com.stock.pojo.Requirement;
import com.stock.utils.Pager;

@Service
@Transactional
public class RequirementService {
	@Autowired
	RequirementMapper requirementMapper;
	@Autowired
	IndustryMapper industryMapper;
	
	public List<Requirement> selectLastWeekRequirement(String lastWeekDate, String today) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("lastWeekDate", lastWeekDate);
		map.put("today", today);
		return requirementMapper.selectLastWeekRequirement(map);
	}
	/**
	 * 2017-6-23合并  作者：张玉筱  合并者：刘禄霞
	 */
	public List<Industry> selectAllIndustry(){
		return industryMapper.selectAllIndustry();
	}
	public List<Requirement> selectMyRequirement(String userUuid){
		return requirementMapper.selectMyRequirement(userUuid);
	}
	public int insertSelective(Requirement record){
		return requirementMapper.insertSelective(record);
	}
	public int deleteByPrimaryKey(String reqUuid){
		return requirementMapper.deleteByPrimaryKey(reqUuid);
	}
	public List<Requirement> selectAllRequirement(){
		return requirementMapper.selectAllRequirement();
	}
	public Requirement selectByPrimaryKey(String reqUuid){
		return requirementMapper.selectByPrimaryKey(reqUuid);
	}
	public List<Requirement> selectAllRequirementByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return requirementMapper.selectAllRequirementByPaper(map);
	}
}
