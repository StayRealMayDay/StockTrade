package com.stock.mapper;

import com.stock.pojo.CompanyNews;
import com.stock.pojo.CompanyNewsExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyNewsMapper {
    int countByExample(CompanyNewsExample example);

    int deleteByExample(CompanyNewsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CompanyNews record);

    int insertSelective(CompanyNews record);

    List<CompanyNews> selectByExampleWithBLOBs(CompanyNewsExample example);

    List<CompanyNews> selectByExample(CompanyNewsExample example);

    CompanyNews selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CompanyNews record, @Param("example") CompanyNewsExample example);

    int updateByExampleWithBLOBs(@Param("record") CompanyNews record, @Param("example") CompanyNewsExample example);

    int updateByExample(@Param("record") CompanyNews record, @Param("example") CompanyNewsExample example);

    int updateByPrimaryKeySelective(CompanyNews record);

    int updateByPrimaryKeyWithBLOBs(CompanyNews record);

    int updateByPrimaryKey(CompanyNews record);

	List<CompanyNews> getHotNews();
	
	//新增部分---于花蕾
	List<CompanyNews> selectAllNews();
	//新增部分
	List<CompanyNews> selectAllNewsShow(HashMap<String, Integer> map);
	//新增部分
	List<CompanyNews> selectNewsByHotRatios();
	//新增部分
	List<CompanyNews> selectNewsByTime();

	List<CompanyNews> selectNewsAboutCompany();

	List<CompanyNews> selectNewsAboutSource();

	List<CompanyNews> selectNewsAboutHangye();

	List<CompanyNews> selectTopNews();
	//新增部分  于花蕾 2017年9月28日
	CompanyNews newsByHotRatiosDetail(int id);
	
	//2017年10月26日
	List<CompanyNews> selectNewsByComapny(String stockNum);
	
	//2017年10月26
	CompanyNews selectNewsDetail(String stockId);
}