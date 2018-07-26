package com.stock.mapper;

import com.stock.pojo.Holderstatistic;
import com.stock.pojo.HolderstatisticExample;
import com.stock.pojo.HolderstatisticWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HolderstatisticMapper {
    int countByExample(HolderstatisticExample example);

    int deleteByExample(HolderstatisticExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HolderstatisticWithBLOBs record);

    int insertSelective(HolderstatisticWithBLOBs record);

    List<HolderstatisticWithBLOBs> selectByExampleWithBLOBs(HolderstatisticExample example);

    List<Holderstatistic> selectByExample(HolderstatisticExample example);

    HolderstatisticWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HolderstatisticWithBLOBs record, @Param("example") HolderstatisticExample example);

    int updateByExampleWithBLOBs(@Param("record") HolderstatisticWithBLOBs record, @Param("example") HolderstatisticExample example);

    int updateByExample(@Param("record") Holderstatistic record, @Param("example") HolderstatisticExample example);

    int updateByPrimaryKeySelective(HolderstatisticWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(HolderstatisticWithBLOBs record);

    int updateByPrimaryKey(Holderstatistic record);
    
    
    int jiJinUpdate(@Param("jiJin_id") String jiJin_id,@Param("earliytime")String earliytime,@Param("latetime")String latetime,@Param("eyear")String eyear,@Param("lyear")String lyear);

    int jiJinUpdateXingweiSum(@Param("jiJin_id") String jiJin_id,@Param("sum")int sum,@Param("sumstock")int sumstock,@Param("stock")String stock);
    
    int jiJinUpdateIndustry(@Param("jiJin_id") String jiJin_id,@Param("dalei")String dalei,@Param("sumdalei")int sumdalei,@Param("menlei")String menlei,@Param("summenlei")int summenlei);

    Holderstatistic jiJinYears(@Param("jiJin_id")String jiJin_id);
    
    int notJiJin(@Param("earliytime")String earliytime,@Param("earlyyear")String earlyyear,@Param("latesttime")String latesttime,
    		@Param("lateyear")String lateYear,@Param("stockholder") String stockHolder,@Param("dalei")String dalei,@Param("sumdalei")int sumdalei,
    		@Param("menlei")String menlei,@Param("summenlei")int summenlei,@Param("sumtouzixingwei")int sumtouzixingwei,@Param("sumstockgeshu")int sumstockgeshu,@Param("havingStock")String haveStock,@Param("havingStockde")String havingStockde);

   List<Holderstatistic> old();
    
   List<String> delete2018();
   
   int diquInfo(@Param("diquinfo")String diquinfo,@Param("stockholder")String stockholder);
   
   List<HolderstatisticWithBLOBs> daLeiP();
   
   int daLeiPerfertInfo(@Param("daleiperfert")String daleiperfert,@Param("stockholder")String stockholder);
   
   List<String> perfertGeRen();
   List<String> perfertJiJin();
   List<String> perfertJiGou();
   
   List<String> jiJinNameForQ();
   List<String> jiGouNameForQ();
   List<String> geRenNameForQ();
   
   List<String> daLeiPERFERCT(String stockholder);
   
}