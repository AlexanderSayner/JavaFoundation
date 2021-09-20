package org.sayner.sandbox.rest.helper.soap;

//import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.ws.WebServiceMessage;
//import org.springframework.ws.client.core.WebServiceMessageCallback;
//import org.springframework.ws.soap.SoapHeader;
//import org.springframework.ws.soap.SoapMessage;
//import ru.mos.emias.soap.gateway.core.v1.client.Authentication;

//import javax.xml.bind.JAXBContext;
//import javax.xml.bind.JAXBException;
//import javax.xml.bind.Marshaller;
//import javax.xml.transform.TransformerException;
//import java.io.IOException;

public class SecurityHeader
//        implements WebServiceMessageCallback
{
//    private final Authentication authentication;
//    public SecurityHeader(Authentication authentication) {
//        this.authentication = authentication;
//    }

//    @Override
//    public void doWithMessage(WebServiceMessage message) throws IOException, TransformerException {
//        final SoapHeader soapHeader = ((SoapMessage)message).getSoapHeader();
//
//        try {
//            final JAXBContext context = JAXBContext.newInstance(Authentication.class);
//            final Marshaller marshaller = context.createMarshaller();
//            marshaller.marshal(authentication, soapHeader.getResult());
//        } catch (JAXBException e) {
//            throw new IOException("error while marshalling authentication.");
//        }
//    }
}
