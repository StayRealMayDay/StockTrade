package com.stock.mapper;

import com.stock.pojo.ScrapyNews;
import com.stock.pojo.ScrapyNewsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScrapyNewsMapper {
    int countByExample(ScrapyNewsExample example);

    int deleteByExample(ScrapyNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScrapyNews record);

    int insertSelective(ScrapyNews record);

    List<ScrapyNews> selectByExample(ScrapyNewsExample example);

    ScrapyNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScrapyNews record, @Param("example") ScrapyNewsExample example);

    int updateByExample(@Param("record") ScrapyNews record, @Param("example") ScrapyNewsExample example);

    int updateByPrimaryKeySelective(ScrapyNews record);

    int updateByPrimaryKey(ScrapyNews record);

	List<ScrapyNews> selectStockByNum(String stock_id);
}