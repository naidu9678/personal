/**
 * TestwsSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.testws;

public class TestwsSOAPImpl implements org.example.www.testws.Testws_PortType{
    public java.lang.String newOperation(java.lang.String in) throws java.rmi.RemoteException {
       System.out.println("ws called ");
    	return "welcome";
    }

}
