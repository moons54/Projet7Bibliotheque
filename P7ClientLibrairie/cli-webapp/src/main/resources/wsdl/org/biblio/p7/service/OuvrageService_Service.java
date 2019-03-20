package org.biblio.p7.service;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.2.5
 * 2019-03-19T22:10:30.439+01:00
 * Generated source version: 3.2.5
 *
 */
@WebServiceClient(name = "OuvrageService",
                  wsdlLocation = "classpath:OuvrageService.wsdl",
                  targetNamespace = "http://service.p7.biblio.org/")
public class OuvrageService_Service extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.p7.biblio.org/", "OuvrageService");
    public final static QName OuvrageServicePort = new QName("http://service.p7.biblio.org/", "OuvrageServicePort");
    static {
        URL url = OuvrageService_Service.class.getClassLoader().getResource("OuvrageService.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(OuvrageService_Service.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:OuvrageService.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public OuvrageService_Service(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public OuvrageService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public OuvrageService_Service() {
        super(WSDL_LOCATION, SERVICE);
    }

    public OuvrageService_Service(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public OuvrageService_Service(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public OuvrageService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns OuvrageService
     */
    @WebEndpoint(name = "OuvrageServicePort")
    public OuvrageService getOuvrageServicePort() {
        return super.getPort(OuvrageServicePort, OuvrageService.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns OuvrageService
     */
    @WebEndpoint(name = "OuvrageServicePort")
    public OuvrageService getOuvrageServicePort(WebServiceFeature... features) {
        return super.getPort(OuvrageServicePort, OuvrageService.class, features);
    }

}
