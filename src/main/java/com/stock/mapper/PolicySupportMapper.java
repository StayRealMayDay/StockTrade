package com.stock.mapper;

import com.stock.pojo.PolicySupport;

public interface PolicySupportMapper {

    int deleteByPrimaryKey(String psUuid);

    int insert(PolicySupport record);

    int insertSelective(PolicySupport record);

    PolicySupport selectByPrimaryKey(String psUuid);

    int updateByPrimaryKeySelective(PolicySupport record);

    int updateByPrimaryKey(PolicySupport record);
}