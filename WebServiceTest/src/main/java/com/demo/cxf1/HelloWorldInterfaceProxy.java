package com.demo.cxf1;

public class HelloWorldInterfaceProxy implements com.demo.cxf1.HelloWorldInterface {
  private String _endpoint = null;
  private com.demo.cxf1.HelloWorldInterface helloWorldInterface = null;
  
  public HelloWorldInterfaceProxy() {
    _initHelloWorldInterfaceProxy();
  }
  
  public HelloWorldInterfaceProxy(String endpoint) {
    _endpoint = endpoint;
    _initHelloWorldInterfaceProxy();
  }
  
  private void _initHelloWorldInterfaceProxy() {
    try {
      helloWorldInterface = (new com.demo.cxf1.HwwsLocator()).getHelloWorldImplPort();
      if (helloWorldInterface != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)helloWorldInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)helloWorldInterface)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (helloWorldInterface != null)
      ((javax.xml.rpc.Stub)helloWorldInterface)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.demo.cxf1.HelloWorldInterface getHelloWorldInterface() {
    if (helloWorldInterface == null)
      _initHelloWorldInterfaceProxy();
    return helloWorldInterface;
  }
  
  public java.lang.String sayHi(java.lang.String arg0) throws java.rmi.RemoteException{
    if (helloWorldInterface == null)
      _initHelloWorldInterfaceProxy();
    return helloWorldInterface.sayHi(arg0);
  }
  
  
}