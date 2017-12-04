/*package com.stock.utils;

import java.util.List;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.stock.mapper.CompanyMapper;
import com.stock.mapper.NodesMapper;
import com.stock.pojo.Company;

public class datadase {
	@Autowired
	CompanyMapper companyMapper;
	
	@Autowired
	NodesMapper nodesMapper;
	
	
	@Test
	public void test1() {
		List<Company> stocks = companyMapper.selectAllCompany();
		int i=1;
		double y = 0;
		double x = 0;
		for (Company company : stocks) {
			i++;
			if (i%2==0) {
				y = (Math.random()*10)-400;
			}else {
				y = -(Math.random()*10)-400;
			}
			
			x = (Math.random()*10)-660;
			nodesMapper.insertNodesGaoGuan(y,x,company.getStockNum());
			//INSERT into nodes (select executive_name,'#EEB422',executive_name,' ',0,0,30,'600118' from company_executive where duty not LIKE "%董事%" and stock = '600118')
			
		}
	}

	
}
*/