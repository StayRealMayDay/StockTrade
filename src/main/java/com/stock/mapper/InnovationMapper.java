package com.stock.mapper;

import java.util.List;

import com.stock.pojo.Innovation;

public interface InnovationMapper {

    int deleteByPrimaryKey(String innoUuid);

    int insert(Innovation record);

    int insertSelective(Innovation record);

    Innovation selectByPrimaryKey(String innoUuid);

    int updateByPrimaryKeySelective(Innovation record);

    int updateByPrimaryKey(Innovation record);

	List<Innovation> selectInnovations(String productUuid);
}