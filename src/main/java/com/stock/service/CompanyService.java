package com.stock.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.CompanyMapper;
import com.stock.pojo.Company;
import com.stock.utils.Pager;

@Service
@Transactional
public class CompanyService {
	@Autowired
	CompanyMapper companyMapper;
	
	public List<Company> selectAllCompanyByPager(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return companyMapper.selectAllCompanyByPager(map);
	}

	public List<Company> selectAllCompanyByPaper(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return companyMapper.selectAllCompanyByPager(map);
	}
}
