package com.stock.mapper;

import com.stock.pojo.ZSwarning;
import com.stock.pojo.ZSwarningExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZSwarningMapper {
    int countByExample(ZSwarningExample example);

    int deleteByExample(ZSwarningExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ZSwarning record);

    int insertSelective(ZSwarning record);

    List<ZSwarning> selectByExample(ZSwarningExample example);

    ZSwarning selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ZSwarning record, @Param("example") ZSwarningExample example);

    int updateByExample(@Param("record") ZSwarning record, @Param("example") ZSwarningExample example);

    int updateByPrimaryKeySelective(ZSwarning record);

    int updateByPrimaryKey(ZSwarning record);

	List<ZSwarning> selectZSwarning();
}