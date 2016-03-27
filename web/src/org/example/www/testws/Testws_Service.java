/**
 * Testws_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.testws;

public interface Testws_Service extends javax.xml.rpc.Service {
    public java.lang.String gettestwsSOAPAddress();

    public org.example.www.testws.Testws_PortType gettestwsSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.testws.Testws_PortType gettestwsSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
