package com.stock.mapper;

import com.stock.pojo.Holdinglevelrelationship;
import com.stock.pojo.HoldinglevelrelationshipExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HoldinglevelrelationshipMapper {
    int countByExample(HoldinglevelrelationshipExample example);

    int deleteByExample(HoldinglevelrelationshipExample example);

    int deleteByPrimaryKey(String id);

    int insert(Holdinglevelrelationship record);

    int insertSelective(Holdinglevelrelationship record);

    List<Holdinglevelrelationship> selectByExample(HoldinglevelrelationshipExample example);

    Holdinglevelrelationship selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Holdinglevelrelationship record, @Param("example") HoldinglevelrelationshipExample example);

    int updateByExample(@Param("record") Holdinglevelrelationship record, @Param("example") HoldinglevelrelationshipExample example);

    int updateByPrimaryKeySelective(Holdinglevelrelationship record);

    int updateByPrimaryKey(Holdinglevelrelationship record);
    //用于测试
    List<String> stockCountTest();
    //18年1月11日
    List<Holdinglevelrelationship> selectOnlyOneFirm(String stockNum);
    //18年1月16号
    List<Holdinglevelrelationship> selectAllFirm();
}