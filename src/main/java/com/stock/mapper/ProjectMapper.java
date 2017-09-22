package com.stock.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stock.pojo.Project;

public interface ProjectMapper {

    int deleteByPrimaryKey(String projectUuid);

    int insert(Project record);

    int insertSelective(Project record);

    Project selectByPrimaryKey(String projectUuid);

    int updateByPrimaryKeySelective(Project record);

    int updateByPrimaryKey(Project record);
    
    List<Project> selectAllProject();
    
    List<Project> listAllProByPage(Map map);
    
    List<Project> selectMyProject(String userUuid);

	List<Project> selectAllProByUserUuid(String userUuid);

	List<Project> selectAllProjectByPager(HashMap<String, Integer> map);

	List<Project> selectLastWeekProject(HashMap<String, Object> map);

	Project selectByProjectName(String pjName);


	
}