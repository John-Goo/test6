package com.demo.cxf;

import javax.jws.WebService;

//
@WebService
public interface HelloWorldInterface {
	 String sayHi(String name);
}
