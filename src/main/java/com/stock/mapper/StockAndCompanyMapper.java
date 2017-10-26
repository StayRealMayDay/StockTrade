package com.stock.mapper;
import java.util.List;

import com.stock.pojo.StockAndCompany;
public interface StockAndCompanyMapper {

	List<StockAndCompany> selectStockList(String area2);
	
}
