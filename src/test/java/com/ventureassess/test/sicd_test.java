package com.ventureassess.test;

import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stock.pojo.User;
import com.stock.service.UserService;



@RunWith(SpringJUnit4ClassRunner.class) // 整合
@ContextConfiguration(locations = { "classpath*:spring-mybatis.xml", "classpath*:spring-mvc.xml" })

public class sicd_test {
	@Autowired 
	UserService userService;

	// 测试已通过

//	 
//		public void testQuery() {
//		
//	//	List<Map<String, Object>> newlist = resultService.selectEvaResult();
//		for (Map<String,Object> map : newlist) {
//		System.out.println(map.get("res_flag"));
//		System.out.println(map.get("res_name"));
//		System.out.println(map.get("res_protime"));
//		}
//	}
   /* @Test
    public void testQuery() {
    	User user = new User();
    	user = userService.adminUserLogin("admin", "123", "1");
    	System.out.println("````````````"+user.getUserPwd());
	}
*/
}
