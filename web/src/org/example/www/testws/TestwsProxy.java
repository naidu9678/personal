package org.example.www.testws;

import java.rmi.RemoteException;

public class TestwsProxy implements org.example.www.testws.Testws_PortType {
  private String _endpoint = null;
  private org.example.www.testws.Testws_PortType testws_PortType = null;
  
  public TestwsProxy() {
    _initTestwsProxy();
  }
  
  public TestwsProxy(String endpoint) {
    _endpoint = endpoint;
    _initTestwsProxy();
  }
  
  private void _initTestwsProxy() {
    try {
      testws_PortType = (new org.example.www.testws.Testws_ServiceLocator()).gettestwsSOAP();
      if (testws_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)testws_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)testws_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (testws_PortType != null)
      ((javax.xml.rpc.Stub)testws_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.testws.Testws_PortType getTestws_PortType() {
    if (testws_PortType == null)
      _initTestwsProxy();
    return testws_PortType;
  }

@Override
public String newOperation(String in) throws RemoteException {
	// TODO Auto-generated method stub
	return null;
}
  
  
}