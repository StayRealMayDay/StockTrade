package com.stock.mapper;

import com.stock.pojo.Stocklirun;
import com.stock.pojo.StocklirunExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StocklirunMapper {
    int countByExample(StocklirunExample example);

    int deleteByExample(StocklirunExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Stocklirun record);

    int insertSelective(Stocklirun record);

    List<Stocklirun> selectByExample(StocklirunExample example);

    Stocklirun selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Stocklirun record, @Param("example") StocklirunExample example);

    int updateByExample(@Param("record") Stocklirun record, @Param("example") StocklirunExample example);

    int updateByPrimaryKeySelective(Stocklirun record);

    int updateByPrimaryKey(Stocklirun record);
    
    List<Stocklirun> stockLiRun(String stock_id);
}