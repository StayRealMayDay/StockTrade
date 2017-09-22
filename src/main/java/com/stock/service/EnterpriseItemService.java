package com.stock.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.EnterpriseItemMapper;
import com.stock.pojo.EnterpriseItem;
import com.stock.utils.UUIDUtil;

@Service
@Transactional
public class EnterpriseItemService {

	@Autowired
	EnterpriseItemMapper enterpriseItemMapper;
	
	/**
	 * 按enter_order查找创业事项
	 * @param enter_order
	 * @return
	 */
	public EnterpriseItem selectItemByOrder(String enterOrder){
		return enterpriseItemMapper.selectItemByOrder(enterOrder);
	}
	
	/**
	 * 获取创业事项的数量
	 * @return
	 */
    public Integer selectItemNum(){
    	return enterpriseItemMapper.selectItemNum();
    }
	
	/**
	 * 获取所有创业流程
	 * @return
	 */
    public List<EnterpriseItem> selectAll(){
    	return enterpriseItemMapper.selectAll();
    }
    
    /**
     * 按id查询创业事项
     * @param enterUuid
     * @return
     */
    public EnterpriseItem selectByPrimaryKey(String enterUuid){
    	return enterpriseItemMapper.selectByPrimaryKey(enterUuid);
    }
    
    /**
     * 根据id更新记录
     * @param record
     */
    public void updateByPrimaryKey(EnterpriseItem record){
    	enterpriseItemMapper.updateByPrimaryKey(record);
    }
    
    /**
     * 按id删除创业事项
     * @param enterUuid
     */
    public void deleteByPrimaryKey(String enterUuid){
    	enterpriseItemMapper.deleteByPrimaryKey(enterUuid);
    }
    
    /**
     * 按名称查询
     * @param enterName
     * @return
     */
    public EnterpriseItem selectByName(String enterName){
    	return enterpriseItemMapper.selectByName(enterName);
    }
    
    public void insert(EnterpriseItem enterpriseItem){
    	
    	String enterUuid = UUIDUtil.getUUID();
    	enterpriseItem.setEnterUuid(enterUuid);
    	enterpriseItemMapper.insert(enterpriseItem);
    }
}