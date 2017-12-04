package com.stock.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.CompanyMapper;
import com.stock.mapper.StockAndCompanyMapper;
import com.stock.mapper.StockMapper;
import com.stock.mapper.StockinfoMapper;
import com.stock.pojo.Company;
import com.stock.pojo.StockAndCompany;
import com.stock.pojo.Stockinfo;

@Service
@Transactional
public class StockService {
	@Autowired
    CompanyMapper companyMapper;
	@Autowired
    StockMapper stockMapper;
	@Autowired
    StockAndCompanyMapper stockAndCompanyMapper;
	@Autowired
	StockinfoMapper stockinfoMapper;
	
	@SuppressWarnings("null")
	public List<StockAndCompany> selectStockList(String area) {
		List<StockAndCompany> stockAndCompanies = new ArrayList<StockAndCompany>();
		
		List<Company> companies = companyMapper.selectCompanyByArea(area);
		Stockinfo stockinfos ;
		
		for (Company company : companies) {
			stockinfos = stockinfoMapper.selectStockByCode(company.getStockNum());
			if (stockinfos==null) {
				continue;
			}
			StockAndCompany stockAndCompany = new StockAndCompany();
			stockAndCompany.setCompany(company);
			stockAndCompany.setStockinfo(stockinfos);
			stockAndCompanies.add(stockAndCompany);
		}
		return stockAndCompanies;
	}
	
	@SuppressWarnings("null")
	public List<StockAndCompany> selectStockListByCon(String conception) {
		List<StockAndCompany> stockAndCompanies = new ArrayList<StockAndCompany>();
		
		List<Company> companies = companyMapper.selectCompanyByCon(conception);
		Stockinfo stockinfos ;
		
		for (Company company : companies) {
			stockinfos = stockinfoMapper.selectStockByCode(company.getStockNum());
			if (stockinfos==null) {
				continue;
			}
			StockAndCompany stockAndCompany = new StockAndCompany();
			stockAndCompany.setCompany(company);
			stockAndCompany.setStockinfo(stockinfos);
			stockAndCompanies.add(stockAndCompany);
		}
		return stockAndCompanies;
	}
	
//	public List<StockAndCompany> selectStockListByConAll() {
//		List<StockAndCompany> stockAndCompanies = new ArrayList<StockAndCompany>();
//		
//		List<Company> companies = companyMapper.selectCompanyByCon("4G");
//		Stockinfo stockinfos ;
//		
//		for (Company company : companies) {
//			stockinfos = stockinfoMapper.selectStockByCode(company.getStockNum());
//			if (stockinfos==null) {
//				continue;
//			}
//			StockAndCompany stockAndCompany = new StockAndCompany();
//			stockAndCompany.setCompany(company);
//			stockAndCompany.setStockinfo(stockinfos);
//			stockAndCompanies.add(stockAndCompany);
//		}
//		return stockAndCompanies;
//	}

	
	@SuppressWarnings("null")
	public List<StockAndCompany> selectStockListByConAll() {
		List<StockAndCompany> stockAndCompanies = new ArrayList<StockAndCompany>();
		
		List<Company> companies = companyMapper.selectCompanyByConAll();
		Stockinfo stockinfos = new Stockinfo();
		
		for (Company company : companies) {
			stockinfos = stockinfoMapper.selectStockByCode(company.getStockNum());
			if (stockinfos==null) {
				continue;
			}
			StockAndCompany stockAndCompany = new StockAndCompany();
			stockAndCompany.setCompany(company);
			stockAndCompany.setStockinfo(stockinfos);
			stockAndCompanies.add(stockAndCompany);
		}
		return stockAndCompanies;
	}

	public List<StockAndCompany> selectStockListByAreaAll() {
		List<StockAndCompany> stockAndCompanies = new ArrayList<StockAndCompany>();
		
		List<Company> companies = companyMapper.selectCompanyByAreaAll();
		Stockinfo stockinfos = new Stockinfo();
		
		for (Company company : companies) {
			stockinfos = stockinfoMapper.selectStockByCode(company.getStockNum());
			if (stockinfos==null) {
				continue;
			}
			StockAndCompany stockAndCompany = new StockAndCompany();
			stockAndCompany.setCompany(company);
			stockAndCompany.setStockinfo(stockinfos);
			stockAndCompanies.add(stockAndCompany);
		}
		return stockAndCompanies;
	}
	
}
