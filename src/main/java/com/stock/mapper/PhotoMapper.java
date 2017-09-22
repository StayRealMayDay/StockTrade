package com.stock.mapper;

import java.util.List;

import com.stock.pojo.Photo;

public interface PhotoMapper {

    int deleteByPrimaryKey(String photoUuid);

    int insert(Photo record);

    int insertSelective(Photo record);

    Photo selectByPrimaryKey(String photoUuid);

    int updateByPrimaryKeySelective(Photo record);

    int updateByPrimaryKey(Photo record);

	
	/**
	 * 2017-6-23合并  作者：张玉筱  合并者：刘禄霞
	 */
    List<Photo> selectPhotoByProductUuid(String productUuid);
}