package poc.raviraj.cxfwspoc.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-04-11T16:06:47.472+05:30
 * Generated source version: 3.1.6
 * 
 */
@WebServiceClient(name = "users", 
                  wsdlLocation = "http://localhost:9090/userServicePort?wsdl",
                  targetNamespace = "http://service.cxfwspoc.raviraj.poc/") 
public class Users extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://service.cxfwspoc.raviraj.poc/", "users");
    public final static QName UserServicePort = new QName("http://service.cxfwspoc.raviraj.poc/", "userServicePort");
    static {
        URL url = null;
        try {
            url = new URL("http://localhost:9090/userServicePort?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(Users.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://localhost:9090/userServicePort?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public Users(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public Users(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Users() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    public Users(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public Users(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public Users(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    




    /**
     *
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "userServicePort")
    public UserService getUserServicePort() {
        return super.getPort(UserServicePort, UserService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns UserService
     */
    @WebEndpoint(name = "userServicePort")
    public UserService getUserServicePort(WebServiceFeature... features) {
        return super.getPort(UserServicePort, UserService.class, features);
    }

}
