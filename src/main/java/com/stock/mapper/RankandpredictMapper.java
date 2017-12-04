package com.stock.mapper;

import com.stock.pojo.Rankandpredict;
import com.stock.pojo.RankandpredictExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RankandpredictMapper {
    int countByExample(RankandpredictExample example);

    int deleteByExample(RankandpredictExample example);

    int deleteByPrimaryKey(Integer randpId);

    int insert(Rankandpredict record);

    int insertSelective(Rankandpredict record);

    List<Rankandpredict> selectByExample(RankandpredictExample example);

    Rankandpredict selectByPrimaryKey(Integer randpId);

    int updateByExampleSelective(@Param("record") Rankandpredict record, @Param("example") RankandpredictExample example);

    int updateByExample(@Param("record") Rankandpredict record, @Param("example") RankandpredictExample example);

    int updateByPrimaryKeySelective(Rankandpredict record);

    int updateByPrimaryKey(Rankandpredict record);

	Rankandpredict selectAll(String stock);

	Rankandpredict selectPredict(String stockNum);
}