package com.stock.mapper;

import com.stock.pojo.TopStockCirculationHolder;
import com.stock.pojo.TopStockCirculationHolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopStockCirculationHolderMapper {
    int countByExample(TopStockCirculationHolderExample example);

    int deleteByExample(TopStockCirculationHolderExample example);

    int deleteByPrimaryKey(String id);

    int insert(TopStockCirculationHolder record);

    int insertSelective(TopStockCirculationHolder record);

    List<TopStockCirculationHolder> selectByExample(TopStockCirculationHolderExample example);

    TopStockCirculationHolder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TopStockCirculationHolder record, @Param("example") TopStockCirculationHolderExample example);

    int updateByExample(@Param("record") TopStockCirculationHolder record, @Param("example") TopStockCirculationHolderExample example);

    int updateByPrimaryKeySelective(TopStockCirculationHolder record);

    int updateByPrimaryKey(TopStockCirculationHolder record);
    //11月23日
    List<String> topStockCircuDate(String stock_id);
    //11月23日
    List<TopStockCirculationHolder> topStockDateOne(@Param("date") String date,@Param("stock_id") String stock_id);
    //11月30日
    List<TopStockCirculationHolder> selectCircuOutStock(@Param("date") String date,@Param("institution_name") String institution_name);
}