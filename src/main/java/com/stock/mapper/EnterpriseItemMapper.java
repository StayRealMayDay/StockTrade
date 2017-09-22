package com.stock.mapper;

import java.util.List;

import com.stock.pojo.EnterpriseItem;

public interface EnterpriseItemMapper {

    int deleteByPrimaryKey(String enterUuid);

    int insert(EnterpriseItem record);

    int insertSelective(EnterpriseItem record);

    EnterpriseItem selectByPrimaryKey(String enterUuid);

    int updateByPrimaryKeySelective(EnterpriseItem record);

    int updateByPrimaryKey(EnterpriseItem record);
    
    //按enter_order查找
    EnterpriseItem selectItemByOrder(String enterOrder);
    
    //获取创业事项的数量
    Integer selectItemNum();
    
    //获取所有创业流程
    List<EnterpriseItem> selectAll();
    
    //按名称查询
    EnterpriseItem selectByName(String enterName);
}