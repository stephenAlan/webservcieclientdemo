
package com.stephen.demo;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WebServiceHelloService", targetNamespace = "http://demo.stephen.com/", wsdlLocation = "http://localhost:8089/Service/ServiceHello?wsdl")
public class WebServiceHelloService
    extends Service
{

    private final static URL WEBSERVICEHELLOSERVICE_WSDL_LOCATION;
    private final static WebServiceException WEBSERVICEHELLOSERVICE_EXCEPTION;
    private final static QName WEBSERVICEHELLOSERVICE_QNAME = new QName("http://demo.stephen.com/", "WebServiceHelloService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8089/Service/ServiceHello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WEBSERVICEHELLOSERVICE_WSDL_LOCATION = url;
        WEBSERVICEHELLOSERVICE_EXCEPTION = e;
    }

    public WebServiceHelloService() {
        super(__getWsdlLocation(), WEBSERVICEHELLOSERVICE_QNAME);
    }

    public WebServiceHelloService(WebServiceFeature... features) {
        super(__getWsdlLocation(), WEBSERVICEHELLOSERVICE_QNAME, features);
    }

    public WebServiceHelloService(URL wsdlLocation) {
        super(wsdlLocation, WEBSERVICEHELLOSERVICE_QNAME);
    }

    public WebServiceHelloService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WEBSERVICEHELLOSERVICE_QNAME, features);
    }

    public WebServiceHelloService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WebServiceHelloService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WebServiceHello
     */
    @WebEndpoint(name = "WebServiceHelloPort")
    public WebServiceHello getWebServiceHelloPort() {
        return super.getPort(new QName("http://demo.stephen.com/", "WebServiceHelloPort"), WebServiceHello.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WebServiceHello
     */
    @WebEndpoint(name = "WebServiceHelloPort")
    public WebServiceHello getWebServiceHelloPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://demo.stephen.com/", "WebServiceHelloPort"), WebServiceHello.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WEBSERVICEHELLOSERVICE_EXCEPTION!= null) {
            throw WEBSERVICEHELLOSERVICE_EXCEPTION;
        }
        return WEBSERVICEHELLOSERVICE_WSDL_LOCATION;
    }

}
