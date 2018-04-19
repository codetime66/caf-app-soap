package org.caf.app.soap;

import java.io.StringWriter;

public class App {
	public static void main(String[] args) {
		SoapEnvelope envelope = new SoapEnvelope();

		try {
			javax.xml.bind.JAXBContext jaxbCtx = javax.xml.bind.JAXBContext
					.newInstance(org.caf.app.soap.SoapEnvelope.class);
			javax.xml.bind.Marshaller marshaller = jaxbCtx.createMarshaller();
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_ENCODING, "UTF-8");
			marshaller.setProperty(javax.xml.bind.Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			StringWriter writer = new StringWriter();

			marshaller.marshal(envelope, writer);

			System.out.println(writer.toString());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
