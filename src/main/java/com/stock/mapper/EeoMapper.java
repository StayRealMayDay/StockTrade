package com.stock.mapper;

import com.stock.pojo.Eeo;
import com.stock.pojo.EeoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EeoMapper {
    int countByExample(EeoExample example);

    int deleteByExample(EeoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Eeo record);

    int insertSelective(Eeo record);

    List<Eeo> selectByExampleWithBLOBs(EeoExample example);

    List<Eeo> selectByExample(EeoExample example);

    Eeo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Eeo record, @Param("example") EeoExample example);

    int updateByExampleWithBLOBs(@Param("record") Eeo record, @Param("example") EeoExample example);

    int updateByExample(@Param("record") Eeo record, @Param("example") EeoExample example);

    int updateByPrimaryKeySelective(Eeo record);

    int updateByPrimaryKeyWithBLOBs(Eeo record);

    int updateByPrimaryKey(Eeo record);
    
    //新增部分
    List<Eeo> selectSomeEeoNews();
    
    //于花蕾  2017年9月27
    List<Eeo> selectEeoNewsList(HashMap<String, Integer> map);
    //于花蕾 2017年9月27
    int selectAllEeoCount();
    //于花蕾2017年9月28日新增
    Eeo eeoNewsDetail(int id);
}