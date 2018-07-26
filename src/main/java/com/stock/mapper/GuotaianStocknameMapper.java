package com.stock.mapper;

import com.stock.pojo.GuotaianStockname;
import com.stock.pojo.GuotaianStocknameExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuotaianStocknameMapper {
    int countByExample(GuotaianStocknameExample example);

    int deleteByExample(GuotaianStocknameExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GuotaianStockname record);

    int insertSelective(GuotaianStockname record);

    List<GuotaianStockname> selectByExample(GuotaianStocknameExample example);

    GuotaianStockname selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GuotaianStockname record, @Param("example") GuotaianStocknameExample example);

    int updateByExample(@Param("record") GuotaianStockname record, @Param("example") GuotaianStocknameExample example);

    int updateByPrimaryKeySelective(GuotaianStockname record);

    int updateByPrimaryKey(GuotaianStockname record);
    
    String getStockName(String stockId);
    
    GuotaianStockname getStockAll(String stockId);
}