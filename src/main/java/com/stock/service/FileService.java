package com.stock.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.FileMapper;
import com.stock.pojo.Files;
import com.stock.utils.UUIDUtil;

@Service
@Transactional
public class FileService {

	@Autowired
	FileMapper fileMapper;
	
	public Files selectByPrimaryKey(String fileUuid){
		return fileMapper.selectByPrimaryKey(fileUuid);
	}
	
	public void insert(Files files){
		
		String fileUuid = UUIDUtil.getUUID();
		files.setFileUuid(fileUuid);
		//获取当前时间
		Date date = new Date(); 
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
		String time = format.format(date);	
		files.setFileTime(time);
		
		fileMapper.insert(files);
	}
}
