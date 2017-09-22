package com.stock.mapper;

import java.util.List;

import com.stock.pojo.FileRelation;

public interface FileRelationMapper {

    int deleteByPrimaryKey(String frUuid);

    int insert(FileRelation record);

    int insertSelective(FileRelation record);

    FileRelation selectByPrimaryKey(String frUuid);

    int updateByPrimaryKeySelective(FileRelation record);

    int updateByPrimaryKey(FileRelation record);
    
    //根据对象id查找文件关联
    List<FileRelation> selectByObject(String objectUuid);
    
    //根据类型查找文件关联
    List<FileRelation> selectByType(String type);
}