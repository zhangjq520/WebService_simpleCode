package com.cn.zjq;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cn.zjq.service.TestService;

public class TestClinet {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://192.168.10.13:8888/ts?wsdl");
		//ͨ��Qnameָ������ľ�����Ϣ  
        /* 
         * ��һ���������ӿڵİ����ƣ����� 
         * �ڶ���������ʵ������+Service 
         * */  
        QName qname = new QName("http://impl.zjq.cn.com/","TestServiceImplService");  
        //��������  
        Service service =  Service.create(url, qname);  
        //ʵ�ֽӿ�  
        TestService tService  = service.getPort(TestService.class);  
        //���Ϸ��������⣬��Ȼ������IMyServie�ӿ�  
        User user = tService.getUserByName("zjq");
        System.out.println(user.toString());
	}
}
