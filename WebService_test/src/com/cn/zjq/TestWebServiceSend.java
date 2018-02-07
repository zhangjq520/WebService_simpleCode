package com.cn.zjq;

import javax.xml.ws.Endpoint;

import com.cn.zjq.impl.TestServiceImpl;

public class TestWebServiceSend {
	public static void main(String[] args) {  
        String address = "http://192.168.10.13:8888/ts";  
        Endpoint.publish(address, new TestServiceImpl());  
        System.out.println("发布消息成功");  
    }
}
