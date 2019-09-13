package com.demo.cxf;

import javax.xml.ws.Endpoint;

public class BootStart {

	public static void main(String[] args) {
		   HelloWorldInterface hw = new HelloWorldImpl();  
	        //调用Endpoint的publish方法发布Web Service  
	        Endpoint.publish("http://192.168.0.102:8080/wstest", hw);  
	        System.out.println("Web Service暴露成功！");  

	}

}
