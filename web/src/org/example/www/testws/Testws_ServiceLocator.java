/**
 * Testws_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.testws;

public class Testws_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.testws.Testws_Service {

    public Testws_ServiceLocator() {
    }


    public Testws_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Testws_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for testwsSOAP
    private java.lang.String testwsSOAP_address = "http://localhost:8080/web/services/";

    public java.lang.String gettestwsSOAPAddress() {
        return testwsSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String testwsSOAPWSDDServiceName = "testwsSOAP";

    public java.lang.String gettestwsSOAPWSDDServiceName() {
        return testwsSOAPWSDDServiceName;
    }

    public void settestwsSOAPWSDDServiceName(java.lang.String name) {
        testwsSOAPWSDDServiceName = name;
    }

    public org.example.www.testws.Testws_PortType gettestwsSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(testwsSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return gettestwsSOAP(endpoint);
    }

    public org.example.www.testws.Testws_PortType gettestwsSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.testws.TestwsSOAPStub _stub = new org.example.www.testws.TestwsSOAPStub(portAddress, this);
            _stub.setPortName(gettestwsSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void settestwsSOAPEndpointAddress(java.lang.String address) {
        testwsSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.testws.Testws_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.testws.TestwsSOAPStub _stub = new org.example.www.testws.TestwsSOAPStub(new java.net.URL(testwsSOAP_address), this);
                _stub.setPortName(gettestwsSOAPWSDDServiceName());
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
        if ("testwsSOAP".equals(inputPortName)) {
            return gettestwsSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/testws/", "testws");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/testws/", "testwsSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("testwsSOAP".equals(portName)) {
            settestwsSOAPEndpointAddress(address);
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
