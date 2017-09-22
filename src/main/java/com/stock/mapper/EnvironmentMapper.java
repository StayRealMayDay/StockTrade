package com.stock.mapper;

import com.stock.pojo.Environment;

public interface EnvironmentMapper {

    int deleteByPrimaryKey(String enviroUuid);

    int insert(Environment record);

    int insertSelective(Environment record);

    Environment selectByPrimaryKey(String enviroUuid);

    int updateByPrimaryKeySelective(Environment record);

    int updateByPrimaryKey(Environment record);

	Environment selectEnvByProductUuid(String maUuid);

	Environment selectEnviroByMarket(String maUuid);
}