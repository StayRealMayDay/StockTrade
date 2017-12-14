package com.stock.mapper;

import com.stock.pojo.Company;
import com.stock.pojo.Dzjy;
import com.stock.pojo.DzjyExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DzjyMapper {
    int countByExample(DzjyExample example);

    int deleteByExample(DzjyExample example);

    int deleteByPrimaryKey(String id);

    int insert(Dzjy record);

    int insertSelective(Dzjy record);

    List<Dzjy> selectByExample(DzjyExample example);

    Dzjy selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") Dzjy record, @Param("example") DzjyExample example);

    int updateByExample(@Param("record") Dzjy record, @Param("example") DzjyExample example);

    int updateByPrimaryKeySelective(Dzjy record);

    int updateByPrimaryKey(Dzjy record);
    
    //于花蕾 新增(2017年12月1日)
    List<Dzjy> selectAllDzjy(HashMap<String, Integer> map);
    //于花蕾 新增(2017年12月1日)
    int selectAllDzjyCount();
    //于花蕾 新增(2017年12月2日)
/*    List<Dzjy> selectStockDzjy(@Param("date") String date,@Param("stock_id") String stock_id);*/
    List<Dzjy> selectStockDzjy(String stock_id);
    //于花蕾 新增 12月2日
    List<String> selectDzjyDate(String stockId); 
    //于花蕾新增 12月7日
    List<String> selectTopDzjyDate();
    //12月7日
    List<Dzjy> selectTopData(List<String> dates);
    //12月7日
    List<String> ajaxSelectData(@Param("startdate") String startdate,@Param("enddate") String enddate);
    //12月7日
    List<String> selectTopTenDate();
    //12月8日
    List<Dzjy> selectTopTenDepartmentSale(List<String> dates);
    //12月8日
    List<Dzjy> selectTopTenDepartmentPursing(List<String> dates);
   //12月8ri 
    List<String> selectDepartmentSale(List<String> dates);
    //12月8日
    List<String> selectDepartmentPursing(List<String> dates);
}