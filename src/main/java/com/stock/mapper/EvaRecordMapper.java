package com.stock.mapper;

import java.util.List;
import java.util.Map;

import com.stock.pojo.EvaRecord;

public interface EvaRecordMapper {

    int deleteByPrimaryKey(String erUuid);

    int insert(EvaRecord record);

    int insertSelective(EvaRecord record);

    EvaRecord selectByPrimaryKey(String erUuid);
    
    List<Map<String, Object>> selectByEvaRecord(String projectUuid);
    
    List<Map<String, Object>> selectByEvaRecordOfIndicator(Map map);

    int updateByPrimaryKeySelective(EvaRecord record);

    int updateByPrimaryKey(EvaRecord record);
    /**
     * 2017-6-23合并  作者：张玉筱   合并者：刘禄霞
     * @param evaRecord
     * @return
     */

	List<EvaRecord> selectInofESrecord(EvaRecord evaRecord);
}