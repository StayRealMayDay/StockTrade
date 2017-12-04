package com.stock.mapper;

import com.stock.pojo.Shares;
import com.stock.pojo.SharesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SharesMapper {
    int countByExample(SharesExample example);

    int deleteByExample(SharesExample example);

    int deleteByPrimaryKey(String sharesId);

    int insert(Shares record);

    int insertSelective(Shares record);

    List<Shares> selectByExample(SharesExample example);

    int updateByExampleSelective(@Param("record") Shares record, @Param("example") SharesExample example);

    int updateByExample(@Param("record") Shares record, @Param("example") SharesExample example);

    int updateByPrimaryKeySelective(Shares record);

    int updateByPrimaryKey(Shares record);

	List<Shares> selectSharesLatest();

	Shares selectSharesByPrimaryKey(String sharesId);
}