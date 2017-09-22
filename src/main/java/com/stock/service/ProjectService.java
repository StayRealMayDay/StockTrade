package com.stock.service;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.BusinessMapper;
import com.stock.mapper.EnvironmentMapper;
import com.stock.mapper.MarketMapper;
import com.stock.mapper.ProIndicatorMapper;
import com.stock.mapper.ProductMapper;
import com.stock.mapper.ProjectMapper;
import com.stock.mapper.RelationMapper;
import com.stock.mapper.TechnologyMapper;
import com.stock.pojo.Business;
import com.stock.pojo.Environment;
import com.stock.pojo.Market;
import com.stock.pojo.ProIndicator;
import com.stock.pojo.Product;
import com.stock.pojo.Project;
import com.stock.pojo.Relation;
import com.stock.pojo.Technology;
import com.stock.utils.Pager;

@Service
@Transactional
public class ProjectService {
	@Autowired
    ProjectMapper projectMapper;
	@Autowired
	ProductMapper productMapper;
	@Autowired
	TechnologyMapper technologyMapper;
	@Autowired
	BusinessMapper businessMapper;
	@Autowired
	MarketMapper marketMapper;
	@Autowired
	EnvironmentMapper environmentMapper;
	@Autowired
	RelationMapper relationMapper;
	@Autowired
	ProIndicatorMapper proIndicatorMapper;
	public List<Project> selectAllProjectByPager(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return projectMapper.selectAllProjectByPager(map);
	}
	public List<Project> selectLastWeekProject(String lastWeekDate,String today) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("lastWeekDate", lastWeekDate);
		map.put("today", today);
		return projectMapper.selectLastWeekProject(map);
	}
	public int insertProject(Project project) {
		return projectMapper.insertSelective(project);
		
	}
	public int insertProduct(Product product) {
		return productMapper.insertSelective(product);
		
	}
	public int insertTechnology(Technology technology) {
		return technologyMapper.insertSelective(technology);
	}
	public int insertBusiness(Business bus) {
		return businessMapper.insertSelective(bus);
		
	}
	public int insertMarket(Market market) {
		return marketMapper.insertSelective(market);
		
	}
	public int insertEnvironment(Environment enviro) {
		return environmentMapper.insertSelective(enviro);
		
	}
	public int updateProjectSelective(Project project1) {
		return projectMapper.updateByPrimaryKeySelective(project1);
		
	}
	
	public List<Relation> selectWeekNoCare(String lastWeekDate,String today) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("lastWeekDate", lastWeekDate);
		map.put("today", today);
		return relationMapper.selectWeekNoCare(map);
	}
	public List<Relation> selectMonthNoCare(String lastMonthDate,String today) {
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("lastMonthDate", lastMonthDate);
		map.put("today", today);
		return relationMapper.selectMonthNoCare(map);
	}
	
   /**
    * 2017-6-23合并  作者：张玉筱  合并者：刘禄霞
    */
	public List<Project> selectAllProject(){
		return projectMapper.selectAllProject();
	}
	public List<Project> listAllProByPage(Pager pager){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		List<Project> pros = projectMapper.listAllProByPage(map);

		return pros;
	}
	public Project projectDetail(String projectUuid){
		return projectMapper.selectByPrimaryKey(projectUuid);
	}
	
	public Business selectBusinessByProduct(String busUuid){
		return businessMapper.selectBusinessByProduct(busUuid);
	}
	public Technology selectTechByPrduct(String productUuid){
		return technologyMapper.selectTechByPrduct(productUuid);
	}
	public Market selectMarketByProduct(String productUuid){
		return marketMapper.selectMarketByProduct(productUuid);
	}
	public Environment selectEnviroByMarket(String maUuid){
		return environmentMapper.selectEnviroByMarket(maUuid);
	}
	
	public Product productDetailByProject(String projectUuid){
		return productMapper.selectByProject(projectUuid);
	}
	public int deleteProject(String projectUuid){
		return projectMapper.deleteByPrimaryKey(projectUuid);
	}
	//联合查询（不带分页）
	   public List<ProIndicator> selectProjects(String proProjectname,String proProductname,String proBackground,String proIndustry,
			   Double proIntech,Double proInbus,Double proInviro,Double proProspect,Double proIndus,Double proOrgan,
			   Double proProduction,Double proFundMin,Double proFundMax,Double proTeam,Double proRiskMin,Double proRiskMax,Double proTotalvalue){
		   HashMap<String, Object> map = new HashMap<String, Object>();
		   map.put("proProjectname", proProjectname);
		   map.put("proProductname", proProductname);
		   map.put("proBackground", proBackground);
		   map.put("proIndustry", proIndustry);
		   map.put("proIntech", proIntech);
		   map.put("proInbus", proInbus);
		   map.put("proInviro", proInviro);
		   map.put("proProspect", proProspect);
		   map.put("proIndus", proIndus);
		   map.put("proOrgan", proOrgan);
		   map.put("proProduction", proProduction);
		   map.put("proFundMax", proFundMax);
		   map.put("proFundMin", proFundMin);
		   map.put("proTeam", proTeam);
		   map.put("proRiskMax", proRiskMax);
		   map.put("proRiskMin", proRiskMin);
		   map.put("proTotalvalue", proTotalvalue);
		   return proIndicatorMapper.selectProjects(map);
	   }
	 //联合查询
	   public List<ProIndicator> listProjects(String proProjectname,String proProductname,String proBackground,String proIndustry,
			   Double proIntech,Double proInbus,Double proInviro,Double proProspect,Double proIndus,Double proOrgan,
			   Double proProduction,Double proFundMin,Double proFundMax,Double proTeam,Double proRiskMin,Double proRiskMax,Double proTotalvalue,Pager pager){
		   HashMap<String, Object> map = new HashMap<String, Object>();
		   map.put("proProjectname", proProjectname);
		   map.put("proProductname", proProductname);
		   map.put("proBackground", proBackground);
		   map.put("proIndustry", proIndustry);
		   map.put("proIntech", proIntech);
		   map.put("proInbus", proInbus);
		   map.put("proInviro", proInviro);
		   map.put("proProspect", proProspect);
		   map.put("proIndus", proIndus);
		   map.put("proOrgan", proOrgan);
		   map.put("proProduction", proProduction);
		   map.put("proFundMax", proFundMax);
		   map.put("proFundMin", proFundMin);
		   map.put("proTeam", proTeam);
		   map.put("proRiskMax", proRiskMax);
		   map.put("proRiskMin", proRiskMin);
		   map.put("proTotalvalue", proTotalvalue);
		   map.put("start", pager.getStart());
		   map.put("pagesize", pager.getPageSize());
		   return proIndicatorMapper.listProjects(map);
	   }
	   public List<Project> selectMyProject(String userUuid){
			return projectMapper.selectMyProject(userUuid);
		}
}
