package com.cn.zjq.impl;

import javax.jws.WebService;

import com.cn.zjq.entity.User;
import com.cn.zjq.service.TestService;

@WebService(endpointInterface="com.cn.zjq.service.TestService")
public class TestServiceImpl implements TestService{

	public User getUserByName(String name) {
		User user = new User();
		user.setName(name);
		user.setPassword("123456");
		return user;
	}

}
