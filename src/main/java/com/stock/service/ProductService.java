package com.stock.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.ProductMapper;
import com.stock.pojo.Product;
import com.stock.pojo.User;
import com.stock.utils.Pager;

@Service
@Transactional
public class ProductService {
    @Autowired
    ProductMapper productMapper;
    /**
     * 	public List<User> selectAllUsersByPager(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return userMapper.selectAllUsersByPager(map);
	}
     * @param pager
     * @return
     */
	public List<Product> selectAllProductByPager(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		
		return productMapper.selectAllProductByPager(map);
	}
   
}
