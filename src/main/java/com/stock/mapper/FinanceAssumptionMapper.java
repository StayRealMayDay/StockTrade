package com.stock.mapper;

import com.stock.pojo.FinanceAssumption;

public interface FinanceAssumptionMapper {

    int insert(FinanceAssumption record);

    int insertSelective(FinanceAssumption record);


}