package com.stock.mapper;

import com.stock.pojo.Newtopstockinfo;
import com.stock.pojo.NewtopstockinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewtopstockinfoMapper {
    int countByExample(NewtopstockinfoExample example);

    int deleteByExample(NewtopstockinfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Newtopstockinfo record);

    int insertSelective(Newtopstockinfo record);

    List<Newtopstockinfo> selectByExample(NewtopstockinfoExample example);

    Newtopstockinfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Newtopstockinfo record, @Param("example") NewtopstockinfoExample example);

    int updateByExample(@Param("record") Newtopstockinfo record, @Param("example") NewtopstockinfoExample example);

    int updateByPrimaryKeySelective(Newtopstockinfo record);

    int updateByPrimaryKey(Newtopstockinfo record);
    
    String stockName(String stockNum);
    
    Newtopstockinfo getStockAll(String stockNum);
    
	List<Newtopstockinfo> getStockNameArray(List<String> stockIds);
	
	List<String> getjiJinIndustryMen(List<String>stockIds);
	
	List<String> getjiJinIndustryDa(List<String>stockIds);
	
	List<String> getjiJinIndustryMenDe(List<String>stockIds);
	
	List<String> getjiJinIndustryDaDe(List<String>stockIds);
	
	List<String> getjiJinArea(List<String>stockIds);
	
	List<String> getjiJinAreaDe(List<String>stockIds);

}