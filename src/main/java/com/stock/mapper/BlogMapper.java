package com.stock.mapper;

import com.stock.pojo.Blog;
import com.stock.pojo.BlogExample;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogMapper {
    int countByExample(BlogExample example);

    int deleteByExample(BlogExample example);

    int insert(Blog record);

    int insertSelective(Blog record);

    List<Blog> selectByExample(BlogExample example);

    int updateByExampleSelective(@Param("record") Blog record, @Param("example") BlogExample example);

    int updateByExample(@Param("record") Blog record, @Param("example") BlogExample example);

	List<Blog> selectBlogLatest();

	List<Blog> selectBlogHot();

	List<Blog> selectBlogRenqi();
	
	Blog selectByPrimaryKey(String blolId);

}