package com.stock.mapper;

import com.stock.pojo.Cb;
import com.stock.pojo.Stockinfo;
import com.stock.pojo.StockinfoExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StockinfoMapper {
    int countByExample(StockinfoExample example);

    int deleteByExample(StockinfoExample example);

    int insert(Stockinfo record);

    int insertSelective(Stockinfo record);

    List<Stockinfo> selectByExample(StockinfoExample example);

    int updateByExampleSelective(@Param("record") Stockinfo record, @Param("example") StockinfoExample example);

    int updateByExample(@Param("record") Stockinfo record, @Param("example") StockinfoExample example);

	Stockinfo selectStockByCode(String stockNum);

	//新增（于花蕾）
	List<Stockinfo> selectStockInfo();
	
	//新增（于花蕾）
	List<Stockinfo> selectStockUpRatio();
	
	//新增（于花蕾）
	List <Stockinfo> selectStockDownRatio();
	//新增（于花蕾）
	List<Stockinfo> selectStockHuA();
	//新增（于花蕾）
	List<Stockinfo> selectStockShenA();

	List<Stockinfo> selectStockUp(String flag);

	List<Stockinfo> selectStockDown(String flag);

	List<Stockinfo> selectStockInfoAll();

	List<Stockinfo> selectAllStockinfoByAmplitudePaper(HashMap<String, Integer> map);

	List<Stockinfo> selectAllStockinfoByTurnRatioPaper(HashMap<String, Integer> map);

	List<Stockinfo> selectAllStockinfoByTurnVPaper(HashMap<String, Integer> map);

	List<Stockinfo> selectAllStockinfoByEquiPaper(HashMap<String, Integer> map);

	List<Stockinfo> selectAllStockinfoByUpRiPaper(HashMap<String, Integer> map);

	List<Stockinfo> selectAllStockinfoByDownRiPaper(HashMap<String, Integer> map);
	
	//新增（于花蕾）2017年9月29
	List<Stockinfo> selectStockAllList(HashMap<String, Integer> map);
	//新增（于花蕾）2017年9月29
	int selectAllStockInfoCount();
	//新增（于花蕾）2017年9月29
	List<Stockinfo> selectAllStockHuA(HashMap<String, Integer> map);
	//新增（于花蕾）2017年9月29
	List<Stockinfo> selectAllStockShenA(HashMap<String, Integer> map);
	//新增（于花蕾）2017年9月29
	int selectAllStockHuACount();
	//新增（于花蕾）2017年9月29
	int selectAllStockShenACount();
	//新增（于花蕾）2017年10月19
	List<Stockinfo> selectStockBeiDou();
	
	//新增（于花蕾）2017年10月20
	List<Stockinfo> selectConcept(@Param("page") HashMap<String,Integer> map,@Param("conception") String conception);
	
	int selectConceptCount(String conception);

}