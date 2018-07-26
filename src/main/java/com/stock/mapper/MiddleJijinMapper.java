package com.stock.mapper;

import com.stock.pojo.MiddleJijin;
import com.stock.pojo.MiddleJijinExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MiddleJijinMapper {
    int countByExample(MiddleJijinExample example);

    int deleteByExample(MiddleJijinExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MiddleJijin record);

    int insertSelective(MiddleJijin record);

    List<MiddleJijin> selectByExample(MiddleJijinExample example);

    MiddleJijin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MiddleJijin record, @Param("example") MiddleJijinExample example);

    int updateByExample(@Param("record") MiddleJijin record, @Param("example") MiddleJijinExample example);

    int updateByPrimaryKeySelective(MiddleJijin record);

    int updateByPrimaryKey(MiddleJijin record);
    
    //18年4月17日
    List<MiddleJijin> selectJiJin();
    
    int selectCount(String jiJinNameCut);
}