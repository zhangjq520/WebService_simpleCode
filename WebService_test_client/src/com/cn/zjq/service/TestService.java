package com.cn.zjq.service;

import javax.jws.WebService;

import com.cn.zjq.User;

@WebService
public interface TestService {
	User getUserByName(String name);
}
