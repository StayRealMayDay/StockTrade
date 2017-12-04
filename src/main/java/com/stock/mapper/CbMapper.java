package com.stock.mapper;

import com.stock.pojo.Cb;
import com.stock.pojo.CbExample;
import com.stock.pojo.Cs;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CbMapper {
    int countByExample(CbExample example);

    int deleteByExample(CbExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cb record);

    int insertSelective(Cb record);

    List<Cb> selectByExampleWithBLOBs(CbExample example);

    List<Cb> selectByExample(CbExample example);

    Cb selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cb record, @Param("example") CbExample example);

    int updateByExampleWithBLOBs(@Param("record") Cb record, @Param("example") CbExample example);

    int updateByExample(@Param("record") Cb record, @Param("example") CbExample example);

    int updateByPrimaryKeySelective(Cb record);

    int updateByPrimaryKeyWithBLOBs(Cb record);

    int updateByPrimaryKey(Cb record);
    
    //于花蕾新增部分
    List<Cb> selectSomeCbNews();
    
    //于花蕾新增部分2017年9月27
    List<Cb> selectCbNewsList(HashMap<String, Integer> map);
   //于花蕾新增部分2017年9月27
    int selectAllCbCount();
    //于花蕾2017年9月28日新增
    Cb cbNewsDetail(int id);
}