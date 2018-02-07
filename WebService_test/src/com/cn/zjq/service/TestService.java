package com.cn.zjq.service;

import javax.jws.WebService;

import com.cn.zjq.entity.User;

@WebService
public interface TestService {
	public User getUserByName(String name);
}
