package org.caf.app.soap;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
 
@XmlRootElement(name="soapenv:Envelope")
public class SoapEnvelope {
 @XmlAttribute(name="xmlns:soapenv")
 private String soapEnvEncodingStyle;
 @XmlAttribute(name="xmlns:sch")
 private String sch;
 
 
 @XmlElement(name="soapenv:header")
 private String soapHeader;
  
 @XmlElement(name = "soapenv:body")
 protected Body body; 
 
 public SoapEnvelope() {
  soapEnvEncodingStyle = "http://schemas.xmlsoap.org/soap/envelope/";
  sch="http://www.howtodoinjava.com/xml/school";
  soapHeader = new String();
  body = new Body();
  Student student = new Student();
  student.setAddress("street b");
  student.setName("john doe");
  body.setStudent(student);
 }
}


