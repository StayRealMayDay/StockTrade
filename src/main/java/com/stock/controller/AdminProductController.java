package com.stock.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.stock.mapper.ProductMapper;
import com.stock.mapper.ProjectMapper;
import com.stock.mapper.UserMapper;
import com.stock.pojo.Product;
import com.stock.pojo.Project;
import com.stock.pojo.User;
import com.stock.service.ProductService;
import com.stock.utils.Pager;

@Controller
public class AdminProductController {
	@Autowired
	ProductMapper productMapper;
	 @Autowired
    ProductService productService;
	 @Autowired
	 ProjectMapper projectMapper;
	 @Autowired
	 UserMapper userMapper;
	/**
	 * 查看所有的产品服务
	 */
	@RequestMapping(value="/selectAllProduct")
	public String selectAllProduct(HttpServletRequest req, HttpServletResponse resp, Model model){
		int recordCount = productMapper.selectAllProduct().size();
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		/*String productUuid = req.getParameter("productUuid");*/
		Pager pager = new Pager(recordCount, pageNum);
		List<Product> allProductList = productService.selectAllProductByPager(pager);
		List<Project> projectList = new ArrayList<Project>();
		List<User> userList = new ArrayList<User>();
		for (Product product : allProductList) {
			String projectUuid = product.getProjectUuid();
			Project project = projectMapper.selectByPrimaryKey(projectUuid);
			System.out.println("所属项目名称："+project.getPjName());
			projectList.add(project);
			String userUuid = product.getUserUuid();
			User user = userMapper.selectByPrimaryKey(userUuid);
			System.out.println("产品提交人："+user.getUserName());
			userList.add(user);
		}
		//查找产品所在的项目名称
		
		//查找产品的提交人
		model.addAttribute("allProductList", allProductList);
		model.addAttribute("projectList", projectList);
		model.addAttribute("userList", userList);
		return "adPage/adminAllProductService";
	}
	/**
	 * 删除一条产品服务
	 */
	@RequestMapping(value="/deleteProduct")
	public String deleteProductByUuid(HttpServletRequest req, HttpServletResponse resp, Model model){
		String productUuid = req.getParameter("productUuid");
		productMapper.deleteByPrimaryKey(productUuid);
		return "adPage/selectAllProduct?pageNum=1";
	}
	/**
	 * 编辑产品服务
	 */
	public String editProductByUuid(HttpServletRequest req, HttpServletResponse resp, Model model){
		int pageNum = Integer.parseInt(req.getParameter("pageNum"));
		return "adPage/selectAllProduct?pageNum="+pageNum;
	}
	/**
	 * 增加产品服务
	 */
}
