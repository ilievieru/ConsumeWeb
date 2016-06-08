/**
 * PosTaggerRoWS_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package service;

public interface PosTaggerRoWS_PortType extends java.rmi.Remote {
    public java.lang.String parseSentence_XML(java.lang.String rawSentenceInput) throws java.rmi.RemoteException;
    public java.lang.String parseText_XML(java.lang.String rawTextInput) throws java.rmi.RemoteException;
    public java.lang.String parseSentence_TXT(java.lang.String rawSentenceInput) throws java.rmi.RemoteException;
    public java.lang.String parseText_TXT(java.lang.String rawTextInput) throws java.rmi.RemoteException;
}
