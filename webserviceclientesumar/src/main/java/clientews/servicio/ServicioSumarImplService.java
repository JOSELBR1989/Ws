
package clientews.servicio;

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
 * JAX-WS RI 2.2.9-b14002
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ServicioSumarImplService", targetNamespace = "http://bean.core.ws.josebaten.org/", wsdlLocation = "http://LABC29-18:9090/ServicioSumarImplService/ServicioSumarImpl?wsdl")
public class ServicioSumarImplService
    extends Service
{

    private final static URL SERVICIOSUMARIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException SERVICIOSUMARIMPLSERVICE_EXCEPTION;
    private final static QName SERVICIOSUMARIMPLSERVICE_QNAME = new QName("http://bean.core.ws.josebaten.org/", "ServicioSumarImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://LABC29-18:9090/ServicioSumarImplService/ServicioSumarImpl?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOSUMARIMPLSERVICE_WSDL_LOCATION = url;
        SERVICIOSUMARIMPLSERVICE_EXCEPTION = e;
    }

    public ServicioSumarImplService() {
        super(__getWsdlLocation(), SERVICIOSUMARIMPLSERVICE_QNAME);
    }

    public ServicioSumarImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOSUMARIMPLSERVICE_QNAME, features);
    }

    public ServicioSumarImplService(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOSUMARIMPLSERVICE_QNAME);
    }

    public ServicioSumarImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOSUMARIMPLSERVICE_QNAME, features);
    }

    public ServicioSumarImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioSumarImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioSumarWC
     */
    @WebEndpoint(name = "ServicioSumarImplPort")
    public ServicioSumarWC getServicioSumarImplPort() {
        return super.getPort(new QName("http://bean.core.ws.josebaten.org/", "ServicioSumarImplPort"), ServicioSumarWC.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioSumarWC
     */
    @WebEndpoint(name = "ServicioSumarImplPort")
    public ServicioSumarWC getServicioSumarImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://bean.core.ws.josebaten.org/", "ServicioSumarImplPort"), ServicioSumarWC.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOSUMARIMPLSERVICE_EXCEPTION!= null) {
            throw SERVICIOSUMARIMPLSERVICE_EXCEPTION;
        }
        return SERVICIOSUMARIMPLSERVICE_WSDL_LOCATION;
    }

}
