package com.stock.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.stock.pojo.ProIndicator;

public interface ProIndicatorMapper {
	
    int deleteByPrimaryKey(String proUuid);

    int insert(ProIndicator record);

    int insertSelective(ProIndicator record);

    ProIndicator selectByPrimaryKey(String proUuid);
    
    //联合查询
    public List<ProIndicator> listProjects(Map map);
    
    public List<ProIndicator> selectProjects(Map map);
    
    int updateByPrimaryKeySelective(ProIndicator record);

    int updateByPrimaryKey(ProIndicator record);
}