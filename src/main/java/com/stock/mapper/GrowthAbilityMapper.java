package com.stock.mapper;

import com.stock.pojo.GrowthAbility;
import com.stock.pojo.GrowthAbilityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GrowthAbilityMapper {
    int countByExample(GrowthAbilityExample example);

    int deleteByExample(GrowthAbilityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(GrowthAbility record);

    int insertSelective(GrowthAbility record);

    List<GrowthAbility> selectByExample(GrowthAbilityExample example);

    GrowthAbility selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") GrowthAbility record, @Param("example") GrowthAbilityExample example);

    int updateByExample(@Param("record") GrowthAbility record, @Param("example") GrowthAbilityExample example);

    int updateByPrimaryKeySelective(GrowthAbility record);

    int updateByPrimaryKey(GrowthAbility record);

	List<GrowthAbility> selectGrowthAbility();
}