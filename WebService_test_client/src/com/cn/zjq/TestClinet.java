package com.cn.zjq;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.cn.zjq.service.TestService;

public class TestClinet {
	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://192.168.10.13:8888/ts?wsdl");
		//通过Qname指明服务的具体信息  
        /* 
         * 第一个参数：接口的包名称，反序 
         * 第二个参数：实现类名+Service 
         * */  
        QName qname = new QName("http://impl.zjq.cn.com/","TestServiceImplService");  
        //创建服务  
        Service service =  Service.create(url, qname);  
        //实现接口  
        TestService tService  = service.getPort(TestService.class);  
        //以上服务有问题，依然依赖于IMyServie接口  
        User user = tService.getUserByName("zjq");
        System.out.println(user.toString());
	}
}
