package com.stock.mapper;

import com.stock.pojo.Holderyearstatistic;
import com.stock.pojo.HolderyearstatisticExample;
import com.stock.pojo.HolderyearstatisticWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HolderyearstatisticMapper {
    int countByExample(HolderyearstatisticExample example);

    int deleteByExample(HolderyearstatisticExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HolderyearstatisticWithBLOBs record);

    int insertSelective(HolderyearstatisticWithBLOBs record);

    List<HolderyearstatisticWithBLOBs> selectByExampleWithBLOBs(HolderyearstatisticExample example);

    List<Holderyearstatistic> selectByExample(HolderyearstatisticExample example);

    HolderyearstatisticWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HolderyearstatisticWithBLOBs record, @Param("example") HolderyearstatisticExample example);

    int updateByExampleWithBLOBs(@Param("record") HolderyearstatisticWithBLOBs record, @Param("example") HolderyearstatisticExample example);

    int updateByExample(@Param("record") Holderyearstatistic record, @Param("example") HolderyearstatisticExample example);

    int updateByPrimaryKeySelective(HolderyearstatisticWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HolderyearstatisticWithBLOBs record);

    int updateByPrimaryKey(Holderyearstatistic record);
    
    int jiJinAddFour(@Param("daleiDe")String daleiDe,@Param("menleiDe")String menleiDe,@Param("areaDe")String areaDe,@Param("area")String area
    		,@Param("jiJinId")String jiJinId,@Param("year")String year);
    
    List<HolderyearstatisticWithBLOBs> perfertOne(String name);
}