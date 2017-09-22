package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.FileRelationMapper;
import com.stock.pojo.FileRelation;
import com.stock.utils.UUIDUtil;

@Service
@Transactional
public class FileRelationService {

	@Autowired
	FileRelationMapper fileRelationMapper;
	
	/**
	 * 根据对象id查找文件关联
	 * @param objectUuid
	 * @return
	 */
    public List<FileRelation> selectByObject(String objectUuid){
    	return fileRelationMapper.selectByObject(objectUuid);
    }
    
    public void insert(FileRelation fileRelation){
		
    	String frUuid = UUIDUtil.getUUID();
    	fileRelation.setFrUuid(frUuid);
    	fileRelationMapper.insert(fileRelation);
	}
    
    /**
     * 查找创业视频的文件关联
     * @param type
     * @return
     */
    public List<FileRelation> selectEntrepreneurialVideo(){
    	return fileRelationMapper.selectByType("创业视频");
    }
    
    /**
     * 按id删除文件关联
     * @param frUuid
     */
    public void deleteByPrimaryKey(String frUuid){
    	fileRelationMapper.deleteByPrimaryKey(frUuid);
    }
}
