package com.demo.cxf1;

import java.rmi.RemoteException;

public class TestWebServiceClient {

	public static void main(String[] args) throws RemoteException {
		HelloWorldInterface service = new HelloWorldInterfaceProxy();
		String retStr = service.sayHi(" John Goo ");
		//hw.sayHi("wuyijun");
		System.out.println(retStr);
	}

}
