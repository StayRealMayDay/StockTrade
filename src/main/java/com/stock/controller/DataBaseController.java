package com.stock.controller;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.CompanyExecutiveMapper;
import com.stock.mapper.CompanyMapper;
import com.stock.mapper.EdgesMapper;
import com.stock.mapper.IndustryDistributionMapper;
import com.stock.mapper.NodesMapper;
import com.stock.mapper.StockholderBasicMapper;
import com.stock.pojo.Company;
import com.stock.pojo.CompanyExample;
import com.stock.pojo.CompanyExecutive;
import com.stock.pojo.Edges;
import com.stock.pojo.EdgesExample;
import com.stock.pojo.IndustryDistribution;
import com.stock.pojo.IndustryDistributionExample;
import com.stock.pojo.Nodes;
import com.stock.pojo.NodesExample;
import com.stock.pojo.StockholderBasic;
@Controller
public class DataBaseController {
	@Autowired
	CompanyMapper companyMapper;
	@Autowired
	NodesMapper nodesMapper;
	@Autowired
	EdgesMapper edgesMapper;
	@Autowired
	CompanyExecutiveMapper companyExecutiveMapper;
	@Autowired
	StockholderBasicMapper stockholderBasicMapper;
	@Autowired
	IndustryDistributionMapper industryDistributionMapper;
	
	
	
	@RequestMapping(value = "/StockNode")
	public void StockNode(Model model){
		Nodes node = new Nodes();
		List<Company> stocks = companyMapper.selectAllCompany();
		int iid =53;
		for (Company company : stocks) {
			iid++;
			node.setIid(Integer.toString(iid));
			System.out.println(iid);
			node.setId(company.getStockName());
			node.setColor("#EE4000");
			node.setLabel(company.getStockName());
			node.setAttributes("");
			node.setY(-400.0);
			node.setX(-700.0);
			node.setSize(110.0);
			node.setStock(company.getStockNum());
			System.out.println("stock:"+company.getStockNum());
			nodesMapper.insert(node);
		}
	}
	
	@RequestMapping(value = "/StockBasicAttr")
	public void StockBasicAttr(Model model){
		Edges edge = new Edges();
		String basicatt[] = {"投资","高管","上游","下游","债务","概念","并购","同行","股东"};
		List<Company> stocks = companyMapper.selectAllCompany();
		int id = 44;
		for (Company company : stocks) {
			
			edge.setSourceid(company.getStockName());
			
			edge.setAttributes("");
			edge.setSize(5.0);
			edge.setStock(company.getStockNum());
			for (int i = 0; i < 9; i++) {
				id++;
				edge.setId(id);
				edge.setTargetid(basicatt[i]);
				edgesMapper.insert(edge);
			}
		}
	}
	
	@RequestMapping(value = "/GaoguanNodes")
	public void Gaoguan(Model model){
		List<Company> stocks = companyMapper.selectAllCompany();
		int i=1;
		double y = 0;
		double x = 0;
		Nodes node = new Nodes();
		for (Company company : stocks) {
			
			List<CompanyExecutive> companyExecutives = companyExecutiveMapper.selectExecutives(company.getStockNum());
			System.out.println(company.getStockNum());
			for (CompanyExecutive companyExecutive : companyExecutives) {
				i++;
				if (i%2==0) {
					y = (Math.random()*10)-400;
				}else {
					y = -(Math.random()*10)-400;
				}
				
				x = (Math.random()*10)-660;
				System.out.println("11111111111111111111111111111111");
				node.setIid(companyExecutive.getExecutiveId());
				System.out.println("iid"+companyExecutive.getExecutiveId());
				node.setId(companyExecutive.getExecutiveName());
				System.out.println("name:"+companyExecutive.getStock());
				node.setColor("#EEB422");
				node.setLabel(companyExecutive.getExecutiveName());
				node.setAttributes("");
				node.setY(y);
				node.setX(x);
				node.setSize(30.0);
				node.setStock(companyExecutive.getStock());
				System.out.println("stock"+companyExecutive.getStock());
				nodesMapper.insert(node);
				
			}
			//INSERT into nodes (select executive_name,'#EEB422',executive_name,' ',0,0,30,'600118' from company_executive where duty not LIKE "%董事%" and stock = '600118')
			
		}
		System.out.println("ok");
	}
	
	@RequestMapping(value = "/GaoguanEdges")
	public void GaoguanEdges(Model model){
		Edges edge = new Edges();
		List<Company> stocks = companyMapper.selectAllCompany();
		int id = 27422;
		edge.setSourceid("高管成员");
		edge.setAttributes("");
		edge.setSize(5.0);
		for (Company company : stocks) {
			List<CompanyExecutive> companyExecutives = companyExecutiveMapper.selectExecutives(company.getStockNum());
			System.out.println(company.getStockNum());
			edge.setStock(company.getStockNum());
			for (CompanyExecutive companyExecutive : companyExecutives) {
				id++;
				edge.setId(id);
				edge.setTargetid(companyExecutive.getExecutiveName());
				edgesMapper.insert(edge);
			}
		}
	}
	
	
	@RequestMapping(value = "/DongshiNodes")
	public void DongshiNodes(Model model){
		List<Company> stocks = companyMapper.selectAllCompany();
		int i=1;
		NodesExample nodesExample = new NodesExample();
		int iid=nodesMapper.countByExample(nodesExample);
		double y = 0;
		double x = 0;
		Nodes node = new Nodes();
//		for (Company company : stocks) {
//			
//			List<CompanyExecutive> companyExecutives = companyExecutiveMapper.selectExecutivesDong(company.getStockNum());
		List<CompanyExecutive> companyExecutives = companyExecutiveMapper.selectExecutivesDong("603505");
//			System.out.println(company.getStockNum());
			for (CompanyExecutive companyExecutive : companyExecutives) {
				i++;
				iid++;
				if (i%2==0) {
					y = (Math.random()*5)-410;
				}else {
					y = -(Math.random()*10)-410;
				}
				
				x = (Math.random()*8)-660;
				System.out.println("11111111111111111111111111111111");
				node.setIid(Integer.toString(iid));
				System.out.println("iid"+companyExecutive.getExecutiveId());
				node.setId(companyExecutive.getExecutiveName()+"Dongshi");
				node.setColor("#EEB422");
				node.setLabel(companyExecutive.getExecutiveName());
				node.setAttributes("");
				node.setY(y);
				node.setX(x);
				node.setSize(30.1);
//				node.setStock(company.getStockName());
				node.setStock("603505");
				System.out.println("stock"+companyExecutive.getStock());
				nodesMapper.insert(node);
				
			}
			//INSERT into nodes (select executive_name,'#EEB422',executive_name,' ',0,0,30,'600118' from company_executive where duty not LIKE "%董事%" and stock = '600118')
			
//		}
		System.out.println("ok");
	}
	
	@RequestMapping(value = "/IndustryNodes")
	public void IndustryNodes(Model model){
		List<Company> stocks = companyMapper.selectAllCompany();
		NodesExample nodesExample = new NodesExample();
		int i=nodesMapper.countByExample(nodesExample);
		double y = 0;
		double x = 0;
		Nodes node = new Nodes();
		for (Company company : stocks) {
			String industry = companyMapper.selecResolvedIndustry(company.getStockNum());
		
//		    String industry = companyMapper.selecResolvedIndustry("603505");
			List<Company> comByIndus = companyMapper.selecStockByIndus(industry);
			for (Company comByIndu : comByIndus) {
				if (comByIndu.getStockNum()!=company.getStockNum()) {
					
					i++;
					if (i%2==0) {
						y = (Math.random()*10)-400;
					}else {
						y = -(Math.random()*10)-400;
					}
					
					x = -(Math.random()*8)-725;
					node.setIid(Integer.toString(i));
					node.setId(comByIndu.getStockName()+"hangye");
					node.setColor("#458B00");
					node.setLabel(comByIndu.getStockName());
					node.setAttributes("");
					node.setY(y);
					node.setX(x);
					node.setSize(30.2);
				    node.setStock(company.getStockNum());
//					node.setStock("603505");
					System.out.println("stock:"+comByIndu.getStockNum());
					nodesMapper.insert(node);
				}
			}
		}
	}
	
	
	@RequestMapping(value = "/MStockholderNodes")
	public void MStockholderNodes(Model model){
		List<Company> stocks = companyMapper.selectAllCompany();
		NodesExample nodesExample = new NodesExample();
		int i=nodesMapper.countByExample(nodesExample);
		double y = 0;
		double x = 0;
		Nodes node = new Nodes();
		for (Company company : stocks) {
			List<StockholderBasic> stockholders = stockholderBasicMapper.selecStockholderByStock(company.getStockNum());
//		    List<StockholderBasic> stockholders = stockholderBasicMapper.selecStockholderByStock("603505");
//		    String industry = companyMapper.selecResolvedIndustry("603505");
			for (StockholderBasic stockholder : stockholders) {
					i++;
					if (i%2==0) {
						y = (Math.random()*10)-377;
					}else {
						y = -(Math.random()*10)-377;
					}
					
					x = -(Math.random()*8)-728;
					node.setIid(Integer.toString(i));
					node.setId(stockholder.getStockholderName()+"Mgudong");
					node.setColor("#A0522D");
					node.setLabel(stockholder.getStockholderName());
					node.setAttributes("");
					node.setY(y);
					node.setX(x);
					node.setSize(30.3);
				    node.setStock(company.getStockNum());
//					node.setStock("603505");
					System.out.println("股东:"+stockholder.getStockholderName());
					nodesMapper.insert(node);
			}
		}
	}
	
	//节点
	@RequestMapping(value = "/ConceptType")
	public void ConceptType(Model model){
		List<Company> stocks = companyMapper.selectAllCompany();
		NodesExample nodesExample = new NodesExample();
		int i=nodesMapper.countByExample(nodesExample);
		double y = 0;
		double x = 0;
		Nodes node = new Nodes();
		for (Company company : stocks) {
//		    String conceptStr = companyMapper.selecResolvedConcept("002151");
			String  conceptStr = companyMapper.selecResolvedConcept(company.getStockNum());
		    System.out.println("概念字符串："+conceptStr);
		    if (conceptStr.contains("，")) {
				
		    	String []concepts = conceptStr.split("，");
		    	for (String concept : concepts) {
		    		i++;
		    		if (i%2==0) {
		    			x = (Math.random()*10)-700;
		    		}else {
		    			x = -(Math.random()*10)-700;
		    		}
		    		
		    		y = -(Math.random()*8)-430;
		    		node.setIid(Integer.toString(i));
		    		node.setId(concept+"Gailian");
		    		node.setColor("#87CEFF");
		    		node.setLabel(concept);
		    		node.setAttributes("");
		    		node.setY(y);
		    		node.setX(x);
		    		node.setSize(30.4);
				    node.setStock(company.getStockNum());
//		    		node.setStock("603505");
		    		System.out.println("概念:"+concept);
		    		nodesMapper.insert(node);
		    	}
			}
		    else {
		    	i++;
	    		if (i%2==0) {
	    			x = (Math.random()*10)-700;
	    		}else {
	    			x = -(Math.random()*10)-700;
	    		}
	    		
	    		y = -(Math.random()*8)-430;
	    		node.setIid(Integer.toString(i));
	    		node.setId(conceptStr+"Gailian");
	    		node.setColor("#87CEFF");
	    		node.setLabel(conceptStr);
	    		node.setAttributes("");
	    		node.setY(y);
	    		node.setX(x);
	    		node.setSize(30.4);
			    node.setStock(company.getStockNum());
//	    		node.setStock("603505");
	    		System.out.println("概念:"+conceptStr);
	    		nodesMapper.insert(node);
			}
		}
	}
	
	@RequestMapping(value = "/hangye")
	public void hangye(Model model){
		Edges edge = new Edges();
		List<Company> stocks = companyMapper.selectAllCompany();
		EdgesExample edgesExample = new EdgesExample();
		int id=edgesMapper.countByExample(edgesExample)+10;
//		int id = 27422;
		edge.setSourceid("同行");
		edge.setAttributes("");
		edge.setSize(5.3);
		for (Company company : stocks) {
			String industry = companyMapper.selecResolvedIndustry(company.getStockNum());
			
//		    String industry = companyMapper.selecResolvedIndustry("002465");
			List<Company> comByIndus = companyMapper.selecStockByIndus(industry);
			System.out.println(company.getStockNum());
			edge.setStock(company.getStockNum());
//			edge.setStock("002465");
			for (Company comByIndu : comByIndus) {
				id++;
				edge.setId(id);
				edge.setTargetid(comByIndu.getStockName()+"hangye");
				edgesMapper.insert(edge);
			}
		}
	}
	
	@RequestMapping(value = "/MStockEdges")
	public void MStockEdges(Model model){
		Edges edge = new Edges();
		List<Company> stocks = companyMapper.selectAllCompany();
		EdgesExample edgesExample = new EdgesExample();
		int id=edgesMapper.countByExample(edgesExample)+10;
//		int id = 27422;
		edge.setSourceid("主要股东");
		edge.setAttributes("");
		edge.setSize(5.1);
		for (Company company : stocks) {
			List<StockholderBasic> stockholders = stockholderBasicMapper.selecStockholderByStock(company.getStockNum());
			System.out.println(company.getStockNum());
			edge.setStock(company.getStockNum());
			
			for (StockholderBasic stockholder : stockholders) {
				id++;
				edge.setId(id);
				edge.setTargetid(stockholder.getStockholderName()+"Mgudong");
				edgesMapper.insert(edge);
			}
		}
	}
	
	
	@RequestMapping(value = "/ConceptTypeEdges")
	public void ConceptTypeEdges(Model model){
		Edges edge = new Edges();
		List<Company> stocks = companyMapper.selectAllCompany();
		EdgesExample edgesExample = new EdgesExample();
		int id=edgesMapper.countByExample(edgesExample)+10;
		edge.setSourceid("概念");
		edge.setAttributes("");
		edge.setSize(5.2);
		for (Company company : stocks) {
			edge.setStock(company.getStockNum());
//			edge.setStock("603505");
			String  conceptStr = companyMapper.selecResolvedConcept(company.getStockNum());
//			String  conceptStr = companyMapper.selecResolvedConcept("603505");
		    System.out.println("概念字符串："+conceptStr);
		    if (conceptStr.contains("，")) {
		    	String []concepts = conceptStr.split("，");
		    	for (String concept : concepts) {
		    		id++;
		    		edge.setId(id);
		    		edge.setTargetid(concept+"Gailian");
		    		edgesMapper.insert(edge);
		    	}
            }else {
            	id++;
	    		edge.setId(id);
	    		edge.setTargetid(conceptStr+"Gailian");
	    		edgesMapper.insert(edge);
			}
		}
	}
	
	
	@RequestMapping(value = "/setIndusDistri")
	public void setIndusDistri(Model model){
		IndustryDistributionExample edgesExample = new IndustryDistributionExample();
		int id=industryDistributionMapper.countByExample(edgesExample);
		List<Company> stocks = companyMapper.selectAllCompany();
		IndustryDistribution industryDistribution = new IndustryDistribution();
		for (Company company : stocks) {
			String industry = companyMapper.selecResolvedIndustry(company.getStockNum());
			List<Company> industryDistri = companyMapper.selectIndustryDistri(industry);
			industryDistribution.setStock(company.getStockNum());
			System.out.println("代码："+company.getStockNum());
			for (Company company2 : industryDistri) {
				id++;
				industryDistribution.setId(Integer.toString(id));
				industryDistribution.setName(company2.getCompanyArea());
				industryDistribution.setValue(company2.getCoun());
				industryDistributionMapper.insert(industryDistribution);
			}
		}
		System.out.println(id);
	}
}
