package poc.raviraj.cxfwspoc.service;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.1.6
 * 2017-04-11T16:05:22.122+05:30
 * Generated source version: 3.1.6
 * 
 */
@WebService(targetNamespace = "http://service.cxfwspoc.raviraj.poc/", name = "masterTypeService")
@XmlSeeAlso({ObjectFactory.class})
public interface MasterTypeService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllDepartments", targetNamespace = "http://service.cxfwspoc.raviraj.poc/", className = "poc.raviraj.cxfwspoc.service.GetAllDepartments")
    @WebMethod
    @ResponseWrapper(localName = "getAllDepartmentsResponse", targetNamespace = "http://service.cxfwspoc.raviraj.poc/", className = "poc.raviraj.cxfwspoc.service.GetAllDepartmentsResponse")
    public java.util.List<poc.raviraj.gwtapp.shared.Department> getAllDepartments();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllGenders", targetNamespace = "http://service.cxfwspoc.raviraj.poc/", className = "poc.raviraj.cxfwspoc.service.GetAllGenders")
    @WebMethod
    @ResponseWrapper(localName = "getAllGendersResponse", targetNamespace = "http://service.cxfwspoc.raviraj.poc/", className = "poc.raviraj.cxfwspoc.service.GetAllGendersResponse")
    public java.util.List<poc.raviraj.gwtapp.shared.Gender> getAllGenders();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllDesignations", targetNamespace = "http://service.cxfwspoc.raviraj.poc/", className = "poc.raviraj.cxfwspoc.service.GetAllDesignations")
    @WebMethod
    @ResponseWrapper(localName = "getAllDesignationsResponse", targetNamespace = "http://service.cxfwspoc.raviraj.poc/", className = "poc.raviraj.cxfwspoc.service.GetAllDesignationsResponse")
    public java.util.List<poc.raviraj.gwtapp.shared.Designation> getAllDesignations();

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getAllRoles", targetNamespace = "http://service.cxfwspoc.raviraj.poc/", className = "poc.raviraj.cxfwspoc.service.GetAllRoles")
    @WebMethod
    @ResponseWrapper(localName = "getAllRolesResponse", targetNamespace = "http://service.cxfwspoc.raviraj.poc/", className = "poc.raviraj.cxfwspoc.service.GetAllRolesResponse")
    public java.util.List<poc.raviraj.gwtapp.shared.Role> getAllRoles();
}
