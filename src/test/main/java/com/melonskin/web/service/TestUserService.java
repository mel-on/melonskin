package com.melonskin.web.service;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)	//基于junit4的spring测试框架
@ContextConfiguration(locations={"/applicationContext.xml"})	//启动Spring容器
public class TestUserService {
	
	@Autowired
	private UserService userService;

	@Test
	public void hasMatchUser() {
		boolean b1 = userService.hasMatchUser("admin", "123456");
		boolean b2 = userService.hasMatchUser("root", "123");
		assertTrue(b1);
		assertTrue(!b2);
	}

}
