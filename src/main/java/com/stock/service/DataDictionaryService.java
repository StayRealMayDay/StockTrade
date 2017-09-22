package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.DataDictionaryMapper;
import com.stock.pojo.DataDictionary;

@Service
@Transactional
public class DataDictionaryService {

	@Autowired
	DataDictionaryMapper dataDictionaryMapper;
	
	public List<DataDictionary> selectByDdDatatype(String ddDataType){
		return dataDictionaryMapper.selectByDdDatatype(ddDataType);
	}
}
