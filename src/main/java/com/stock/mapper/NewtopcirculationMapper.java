package com.stock.mapper;

import com.stock.pojo.Newtopcirculation;
import com.stock.pojo.NewtopcirculationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewtopcirculationMapper {
    int countByExample(NewtopcirculationExample example);

    int deleteByExample(NewtopcirculationExample example);

    int deleteByPrimaryKey(String id);

    int insert(Newtopcirculation record);

    int insertSelective(Newtopcirculation record);

    List<Newtopcirculation> selectByExample(NewtopcirculationExample example);

    Newtopcirculation selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Newtopcirculation record, @Param("example") NewtopcirculationExample example);

    int updateByExample(@Param("record") Newtopcirculation record, @Param("example") NewtopcirculationExample example);

    int updateByPrimaryKeySelective(Newtopcirculation record);

    int updateByPrimaryKey(Newtopcirculation record);
    
    //18年3月20日
    List<String> topNewCircuDate(String institution_name);
    List<String> topNewCircuDateByNum(String stock_num);
    
    //18年3月20日
    List<Newtopcirculation> selectNewCircuStock(@Param("date") String date,@Param("institution_name") String institution_name);
    //18年4月3日
    List<String> txtGenerationOne();
    List<String> txtGenerationTwo(String institution_name);
    //18年4月12日
    int uniformJiJinName(@Param("institution_name") String institution_name,@Param("jiJinId")String jiJinId);
    //18年4月19日
    List<String> stockerHaveJiJinId();
    List<String> byJiJinIdFindStockNum(String jiJinId);
    List<String> byJiJinIdFindStockNumDe(String jiJinId);
    List<String> stockNum();
    
    List<String> jiJindate_TouZi(String jiJinId);
    List<Newtopcirculation> jiJinYearAddId(@Param("date")String date,@Param("jiJinId")String jiJin_id); 
    List<String> byJiJinIdAndYearFindStockNumDe(@Param("jiJinId")String jiJinId,@Param("year")String year);
    List<String> byJiJinIdAndYearFindStockNum(@Param("jiJinId")String jiJinId,@Param("year")String year);
    
    //关于非基金
    List<String> notJiJindate_TouZi(String stockHolder);
    List<String> byNotJiJinIdFindStockNumDe(String stockHolder);
    List<String> byNotJiJinIdFindStockNum(String stockHolder);
    
    //拿出所有的股票
    List<String> selectStockNum();
}