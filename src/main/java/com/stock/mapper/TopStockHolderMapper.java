package com.stock.mapper;

import com.stock.pojo.TopStockCirculationHolder;
import com.stock.pojo.TopStockHolder;
import com.stock.pojo.TopStockHolderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TopStockHolderMapper {
    int countByExample(TopStockHolderExample example);

    int deleteByExample(TopStockHolderExample example);

    int deleteByPrimaryKey(String id);

    int insert(TopStockHolder record);

    int insertSelective(TopStockHolder record);

    List<TopStockHolder> selectByExample(TopStockHolderExample example);

    TopStockHolder selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TopStockHolder record, @Param("example") TopStockHolderExample example);

    int updateByExample(@Param("record") TopStockHolder record, @Param("example") TopStockHolderExample example);

    int updateByPrimaryKeySelective(TopStockHolder record);

    int updateByPrimaryKey(TopStockHolder record);
    
    //11月23日
    List<String> topStockDate(String stock_id);
    //11月23日
    List<TopStockHolder> topStockDateTwo(@Param("date") String date,@Param("stock_id") String stock_id);
    
    List<TopStockHolder> selectOutStock(@Param("date") String date,@Param("institution_name") String institution_name);
    //12月24日
    List<TopStockHolder> selectInvestionAllTwo(String institution_name);
    
    //12月28
    List<String> topSomeDate(String institution_name);
    //测试用的部分
    List<String> formalTest();
}