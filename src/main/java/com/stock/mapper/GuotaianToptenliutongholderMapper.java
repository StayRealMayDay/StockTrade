package com.stock.mapper;

import com.stock.pojo.GuotaianToptenliutongholder;
import com.stock.pojo.GuotaianToptenliutongholderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GuotaianToptenliutongholderMapper {
    int countByExample(GuotaianToptenliutongholderExample example);

    int deleteByExample(GuotaianToptenliutongholderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GuotaianToptenliutongholder record);

    int insertSelective(GuotaianToptenliutongholder record);

    List<GuotaianToptenliutongholder> selectByExample(GuotaianToptenliutongholderExample example);

    GuotaianToptenliutongholder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GuotaianToptenliutongholder record, @Param("example") GuotaianToptenliutongholderExample example);

    int updateByExample(@Param("record") GuotaianToptenliutongholder record, @Param("example") GuotaianToptenliutongholderExample example);

    int updateByPrimaryKeySelective(GuotaianToptenliutongholder record);

    int updateByPrimaryKey(GuotaianToptenliutongholder record);
    //18年4月23日
    List<String> txtGenerationOne();
    List<String> txtGenerationTwo(String institution_name);
}