package com.stock.mapper;

import com.stock.pojo.Company;
import com.stock.pojo.CompanyExample;

import java.util.HashMap;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompanyMapper {
    int countByExample(CompanyExample example);

    int deleteByExample(CompanyExample example);

    int deleteByPrimaryKey(String companyId);

    int insert(Company record);

    int insertSelective(Company record);

    List<Company> selectByExample(CompanyExample example);

    Company selectByPrimaryKey(String companyId);

    int updateByExampleSelective(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByExample(@Param("record") Company record, @Param("example") CompanyExample example);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
    
	List<Company> selectAllCompany();

	List<Company> selectAllCompanyByPager(HashMap<String, Integer> map);

	List<Company> selectCompanyByArea(String area);

	List<Company> selectCompanyByCon(String conception);
	
	Company selectCompanyByStockNum(String stockNum);

	List<Company> selectCompanyByConAll();

	List<Company> selectCompanyByAreaAll();
	
	//于花蕾2017年10月20日
	String selecResolvedConcept(String stockNum);
	
	//于花蕾2017年10月25日
	String selecResolvedIndustry(String stockNum);

	//于花蕾2017年10月25日
	List<Company> selecResolvedStock(String industry);
	//
	List<Company> selecStockByIndus(String industry);

	List<Company> selectIndustryDistri(String industry);

}