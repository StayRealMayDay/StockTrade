package com.stock.mapper;

import com.stock.pojo.Market;

public interface MarketMapper {

    int deleteByPrimaryKey(String maUuid);

    int insert(Market record);

    int insertSelective(Market record);

    Market selectByPrimaryKey(String maUuid);

    int updateByPrimaryKeySelective(Market record);

    int updateByPrimaryKey(Market record);

	Market selectMarByProducUuid(String productUuid);

	Market selectMarketByProduct(String productUuid);

}