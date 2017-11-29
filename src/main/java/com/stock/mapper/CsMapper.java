package com.stock.mapper;

import com.stock.pojo.Cb;
import com.stock.pojo.Cs;
import com.stock.pojo.CsExample;
import com.stock.pojo.Eeo;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsMapper {
    int countByExample(CsExample example);

    int deleteByExample(CsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cs record);

    int insertSelective(Cs record);

    List<Cs> selectByExampleWithBLOBs(CsExample example);

    List<Cs> selectByExample(CsExample example);

    Cs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cs record, @Param("example") CsExample example);

    int updateByExampleWithBLOBs(@Param("record") Cs record, @Param("example") CsExample example);

    int updateByExample(@Param("record") Cs record, @Param("example") CsExample example);

    int updateByPrimaryKeySelective(Cs record);

    int updateByPrimaryKeyWithBLOBs(Cs record);

    int updateByPrimaryKey(Cs record);
    
    List<Cs> selectAllNews();
    
    //于花蕾新增部分2017年9月27
    List<Cs> selectCsNewsList(HashMap<String, Integer> map);
   //于花蕾新增部分2017年9月27
    int selectAllCsCount();
    //于花蕾2017年9月28日新增
    Cs csNewsDetail(int id);
}