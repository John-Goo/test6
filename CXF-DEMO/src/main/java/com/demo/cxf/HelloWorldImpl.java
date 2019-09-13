package com.demo.cxf;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="com.demo.cxf.HelloWorldInterface",serviceName="hwws")//指定webservice所实现的接口以及服务名称
public class HelloWorldImpl implements HelloWorldInterface {
//https://blog.csdn.net/wuyjcsdn/article/details/72869437
	public String sayHi(String name) {
		return name+"您好！现在时间是："+new Date();  
	}

}
