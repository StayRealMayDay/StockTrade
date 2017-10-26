package com.stock.mapper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.stock.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String userUuid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userUuid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User userLogin(Map<String, Object> usermap);

	String  selectUserFlagByUserName(String user_name);

	User selectByName(String user_name);

	User adminUserLogin(Map<String, Object> usermap);

	User selectByEmail(String user_email);

	List<User> selectAllUsers();

	List<User> selectAllUsersByPager(HashMap<String,Integer> map);

	List<User> selectUserByRole(String newsType);

	User selectUserByUuid(String userUuid);

	
}