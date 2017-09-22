package com.stock.mapper;

import java.util.HashMap;
import java.util.List;

import com.stock.pojo.Product;
import com.stock.pojo.Project;
import com.stock.utils.Pager;

public interface ProductMapper {

    int deleteByPrimaryKey(String productUuid);

    int insert(Product record);

    int insertSelective(Product record);

    Product selectByPrimaryKey(String productUuid);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);

	List<Product> selectAllProduct();

	List<Product> selectAllProductByPager(HashMap<String, Integer> map);

	Product selectProductByProUuid(String projectUuid);

	Product selectByProductName(String pdName);

	Product selectByProject(String projectUuid);
}