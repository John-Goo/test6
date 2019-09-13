/**
 * HwwsLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.demo.cxf1;

public class HwwsLocator extends org.apache.axis.client.Service implements com.demo.cxf1.Hwws {

    public HwwsLocator() {
    }


    public HwwsLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public HwwsLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HelloWorldImplPort
    private java.lang.String HelloWorldImplPort_address = "http://192.168.0.102:8080/wstest";

    public java.lang.String getHelloWorldImplPortAddress() {
        return HelloWorldImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HelloWorldImplPortWSDDServiceName = "HelloWorldImplPort";

    public java.lang.String getHelloWorldImplPortWSDDServiceName() {
        return HelloWorldImplPortWSDDServiceName;
    }

    public void setHelloWorldImplPortWSDDServiceName(java.lang.String name) {
        HelloWorldImplPortWSDDServiceName = name;
    }

    public com.demo.cxf1.HelloWorldInterface getHelloWorldImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HelloWorldImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHelloWorldImplPort(endpoint);
    }

    public com.demo.cxf1.HelloWorldInterface getHelloWorldImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.demo.cxf1.HwwsSoapBindingStub _stub = new com.demo.cxf1.HwwsSoapBindingStub(portAddress, this);
            _stub.setPortName(getHelloWorldImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHelloWorldImplPortEndpointAddress(java.lang.String address) {
        HelloWorldImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.demo.cxf1.HelloWorldInterface.class.isAssignableFrom(serviceEndpointInterface)) {
                com.demo.cxf1.HwwsSoapBindingStub _stub = new com.demo.cxf1.HwwsSoapBindingStub(new java.net.URL(HelloWorldImplPort_address), this);
                _stub.setPortName(getHelloWorldImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("HelloWorldImplPort".equals(inputPortName)) {
            return getHelloWorldImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cxf.demo.com/", "hwws");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cxf.demo.com/", "HelloWorldImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HelloWorldImplPort".equals(portName)) {
            setHelloWorldImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
