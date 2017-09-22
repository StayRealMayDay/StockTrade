package com.stock.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.stock.mapper.RoleMapper;
import com.stock.mapper.UserMapper;
import com.stock.pojo.Role;
import com.stock.pojo.User;
import com.stock.utils.Pager;
@Service
@Transactional
public class UserService {
@Autowired
UserMapper userMapper;
@Autowired
RoleMapper roleMapper;
	 public User userLogin(String name, String pwd){
			
	  		Map<String,Object> usermap = new HashMap<String,Object>();
	  		usermap.put("userName", name);
	  		usermap.put("userPwd", pwd);
	  		User user = userMapper.userLogin(usermap);  		
	  		return user;
	  	}

	public String selectUserFlagByUserName(String user_name) {
		
		return userMapper.selectUserFlagByUserName(user_name);
	}

	public User selectByName(String user_name) {
		User user = userMapper.selectByName(user_name);
		return user;
	}

	public User adminUserLogin(String userName, String userPwd) {
		
		Map<String, Object> usermap = new HashMap<String, Object>();
		usermap.put("userName", userName);
		usermap.put("userPwd", userPwd);
		
		
		User user = userMapper.adminUserLogin(usermap);
		return user;
	}

	/**
	 * 根据email查询用户是否存在
	 * @author 
	 */
	public User selectByEmail(String user_email){
		
		User user = userMapper.selectByEmail(user_email);
		
		return user;
	}

	public Boolean addUserRole(Role role) {
		roleMapper.insertSelective(role);
		return true;
	}
	//查找“角色”表角色对应的UUID

	public void selectUUIDByUserName() {
		// TODO Auto-generated method stub
		
	}

	public List<User> selectAllUsersByPager(Pager pager) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("start", pager.getStart());
		map.put("pagesize", pager.getPageSize());
		return userMapper.selectAllUsersByPager(map);
	}
	
	public User selectByPrimaryKey(String userUuid){
		return userMapper.selectByPrimaryKey(userUuid);
	}
    /**
     * 2017-6-23合并  作者：张玉筱    合并者：刘禄霞
     */
	public int insertSelective(User record){
		return userMapper.insertSelective(record);
	}
	public int updateByPrimaryKeySelective(User record){
		return userMapper.updateByPrimaryKeySelective(record);
	}

	public List<User> selectUserByRole(String newsType) {
		return userMapper.selectUserByRole(newsType);
	}

	public User selectUserByUuid(String userUuid) {
		return userMapper.selectUserByUuid(userUuid);
	}
}
