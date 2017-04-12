
package poc.raviraj.cxfwspoc.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import poc.raviraj.gwtapp.shared.Department;
import poc.raviraj.gwtapp.shared.Designation;
import poc.raviraj.gwtapp.shared.Gender;
import poc.raviraj.gwtapp.shared.MasterType;
import poc.raviraj.gwtapp.shared.Role;
import poc.raviraj.gwtapp.shared.SoftDeleteableModel;
import poc.raviraj.gwtapp.shared.User;
import poc.raviraj.gwtapp.shared.VersionableModel;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the poc.raviraj.cxfwspoc.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Delete_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "delete");
	private final static QName _DeleteResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "deleteResponse");
	private final static QName _Find_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "find");
	private final static QName _FindAll_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "findAll");
	private final static QName _FindAllByFirstNameOrLastNameOrUsername_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "findAllByFirstNameOrLastNameOrUsername");
	private final static QName _FindAllByFirstNameOrLastNameOrUsernameResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "findAllByFirstNameOrLastNameOrUsernameResponse");
	private final static QName _FindAllResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "findAllResponse");
	private final static QName _FindResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "findResponse");
	private final static QName _Paginated_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "paginated");
	private final static QName _PaginatedResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "paginatedResponse");
	private final static QName _Save_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "save");
	private final static QName _SaveResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "saveResponse");
	private final static QName _GetAllDepartments_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "getAllDepartments");
	private final static QName _GetAllDepartmentsResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "getAllDepartmentsResponse");
	private final static QName _GetAllDesignations_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "getAllDesignations");
	private final static QName _GetAllDesignationsResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "getAllDesignationsResponse");
	private final static QName _GetAllGenders_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "getAllGenders");
	private final static QName _GetAllGendersResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "getAllGendersResponse");
	private final static QName _GetAllRoles_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "getAllRoles");
	private final static QName _GetAllRolesResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "getAllRolesResponse");
	private final static QName _SayHi_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "sayHi");
    private final static QName _SayHiResponse_QNAME = new QName("http://service.cxfwspoc.raviraj.poc/", "sayHiResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: poc.raviraj.cxfwspoc.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

	/**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

	/**
     * Create an instance of {@link Find }
     * 
     */
    public Find createFind() {
        return new Find();
    }

	/**
     * Create an instance of {@link FindAll }
     * 
     */
    public FindAll createFindAll() {
        return new FindAll();
    }

	/**
     * Create an instance of {@link FindAllByFirstNameOrLastNameOrUsername }
     * 
     */
    public FindAllByFirstNameOrLastNameOrUsername createFindAllByFirstNameOrLastNameOrUsername() {
        return new FindAllByFirstNameOrLastNameOrUsername();
    }

	/**
     * Create an instance of {@link FindAllByFirstNameOrLastNameOrUsernameResponse }
     * 
     */
    public FindAllByFirstNameOrLastNameOrUsernameResponse createFindAllByFirstNameOrLastNameOrUsernameResponse() {
        return new FindAllByFirstNameOrLastNameOrUsernameResponse();
    }

	/**
     * Create an instance of {@link FindAllResponse }
     * 
     */
    public FindAllResponse createFindAllResponse() {
        return new FindAllResponse();
    }

	/**
     * Create an instance of {@link FindResponse }
     * 
     */
    public FindResponse createFindResponse() {
        return new FindResponse();
    }

	/**
     * Create an instance of {@link Paginated }
     * 
     */
    public Paginated createPaginated() {
        return new Paginated();
    }

	/**
     * Create an instance of {@link PaginatedResponse }
     * 
     */
    public PaginatedResponse createPaginatedResponse() {
        return new PaginatedResponse();
    }

	/**
     * Create an instance of {@link Save }
     * 
     */
    public Save createSave() {
        return new Save();
    }

	/**
     * Create an instance of {@link SaveResponse }
     * 
     */
    public SaveResponse createSaveResponse() {
        return new SaveResponse();
    }

	/**
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

	/**
     * Create an instance of {@link VersionableModel }
     * 
     */
    public VersionableModel createVersionableModel() {
        return new VersionableModel();
    }

	/**
     * Create an instance of {@link GetAllDepartments }
     * 
     */
    public GetAllDepartments createGetAllDepartments() {
        return new GetAllDepartments();
    }

	/**
     * Create an instance of {@link GetAllDepartmentsResponse }
     * 
     */
    public GetAllDepartmentsResponse createGetAllDepartmentsResponse() {
        return new GetAllDepartmentsResponse();
    }

	/**
     * Create an instance of {@link GetAllDesignations }
     * 
     */
    public GetAllDesignations createGetAllDesignations() {
        return new GetAllDesignations();
    }

	/**
     * Create an instance of {@link GetAllDesignationsResponse }
     * 
     */
    public GetAllDesignationsResponse createGetAllDesignationsResponse() {
        return new GetAllDesignationsResponse();
    }

	/**
     * Create an instance of {@link GetAllGenders }
     * 
     */
    public GetAllGenders createGetAllGenders() {
        return new GetAllGenders();
    }

	/**
     * Create an instance of {@link GetAllGendersResponse }
     * 
     */
    public GetAllGendersResponse createGetAllGendersResponse() {
        return new GetAllGendersResponse();
    }

	/**
     * Create an instance of {@link GetAllRoles }
     * 
     */
    public GetAllRoles createGetAllRoles() {
        return new GetAllRoles();
    }

	/**
     * Create an instance of {@link GetAllRolesResponse }
     * 
     */
    public GetAllRolesResponse createGetAllRolesResponse() {
        return new GetAllRolesResponse();
    }

	/**
     * Create an instance of {@link Department }
     * 
     */
    public Department createDepartment() {
        return new Department();
    }

	/**
     * Create an instance of {@link MasterType }
     * 
     */
    public MasterType createMasterType() {
        return new MasterType();
    }

	/**
     * Create an instance of {@link SoftDeleteableModel }
     * 
     */
    public SoftDeleteableModel createSoftDeleteableModel() {
        return new SoftDeleteableModel();
    }

	/**
     * Create an instance of {@link Gender }
     * 
     */
    public Gender createGender() {
        return new Gender();
    }

	/**
     * Create an instance of {@link Designation }
     * 
     */
    public Designation createDesignation() {
        return new Designation();
    }

	/**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link Find }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "find")
    public JAXBElement<Find> createFind(Find value) {
        return new JAXBElement<Find>(_Find_QNAME, Find.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAll }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "findAll")
    public JAXBElement<FindAll> createFindAll(FindAll value) {
        return new JAXBElement<FindAll>(_FindAll_QNAME, FindAll.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllByFirstNameOrLastNameOrUsername }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "findAllByFirstNameOrLastNameOrUsername")
    public JAXBElement<FindAllByFirstNameOrLastNameOrUsername> createFindAllByFirstNameOrLastNameOrUsername(FindAllByFirstNameOrLastNameOrUsername value) {
        return new JAXBElement<FindAllByFirstNameOrLastNameOrUsername>(_FindAllByFirstNameOrLastNameOrUsername_QNAME, FindAllByFirstNameOrLastNameOrUsername.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllByFirstNameOrLastNameOrUsernameResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "findAllByFirstNameOrLastNameOrUsernameResponse")
    public JAXBElement<FindAllByFirstNameOrLastNameOrUsernameResponse> createFindAllByFirstNameOrLastNameOrUsernameResponse(FindAllByFirstNameOrLastNameOrUsernameResponse value) {
        return new JAXBElement<FindAllByFirstNameOrLastNameOrUsernameResponse>(_FindAllByFirstNameOrLastNameOrUsernameResponse_QNAME, FindAllByFirstNameOrLastNameOrUsernameResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindAllResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "findAllResponse")
    public JAXBElement<FindAllResponse> createFindAllResponse(FindAllResponse value) {
        return new JAXBElement<FindAllResponse>(_FindAllResponse_QNAME, FindAllResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link FindResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "findResponse")
    public JAXBElement<FindResponse> createFindResponse(FindResponse value) {
        return new JAXBElement<FindResponse>(_FindResponse_QNAME, FindResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link Paginated }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "paginated")
    public JAXBElement<Paginated> createPaginated(Paginated value) {
        return new JAXBElement<Paginated>(_Paginated_QNAME, Paginated.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaginatedResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "paginatedResponse")
    public JAXBElement<PaginatedResponse> createPaginatedResponse(PaginatedResponse value) {
        return new JAXBElement<PaginatedResponse>(_PaginatedResponse_QNAME, PaginatedResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link Save }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "save")
    public JAXBElement<Save> createSave(Save value) {
        return new JAXBElement<Save>(_Save_QNAME, Save.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link SaveResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "saveResponse")
    public JAXBElement<SaveResponse> createSaveResponse(SaveResponse value) {
        return new JAXBElement<SaveResponse>(_SaveResponse_QNAME, SaveResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartments }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "getAllDepartments")
    public JAXBElement<GetAllDepartments> createGetAllDepartments(GetAllDepartments value) {
        return new JAXBElement<GetAllDepartments>(_GetAllDepartments_QNAME, GetAllDepartments.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDepartmentsResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "getAllDepartmentsResponse")
    public JAXBElement<GetAllDepartmentsResponse> createGetAllDepartmentsResponse(GetAllDepartmentsResponse value) {
        return new JAXBElement<GetAllDepartmentsResponse>(_GetAllDepartmentsResponse_QNAME, GetAllDepartmentsResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDesignations }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "getAllDesignations")
    public JAXBElement<GetAllDesignations> createGetAllDesignations(GetAllDesignations value) {
        return new JAXBElement<GetAllDesignations>(_GetAllDesignations_QNAME, GetAllDesignations.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllDesignationsResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "getAllDesignationsResponse")
    public JAXBElement<GetAllDesignationsResponse> createGetAllDesignationsResponse(GetAllDesignationsResponse value) {
        return new JAXBElement<GetAllDesignationsResponse>(_GetAllDesignationsResponse_QNAME, GetAllDesignationsResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGenders }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "getAllGenders")
    public JAXBElement<GetAllGenders> createGetAllGenders(GetAllGenders value) {
        return new JAXBElement<GetAllGenders>(_GetAllGenders_QNAME, GetAllGenders.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllGendersResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "getAllGendersResponse")
    public JAXBElement<GetAllGendersResponse> createGetAllGendersResponse(GetAllGendersResponse value) {
        return new JAXBElement<GetAllGendersResponse>(_GetAllGendersResponse_QNAME, GetAllGendersResponse.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRoles }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "getAllRoles")
    public JAXBElement<GetAllRoles> createGetAllRoles(GetAllRoles value) {
        return new JAXBElement<GetAllRoles>(_GetAllRoles_QNAME, GetAllRoles.class, null, value);
    }

	/**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllRolesResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "getAllRolesResponse")
    public JAXBElement<GetAllRolesResponse> createGetAllRolesResponse(GetAllRolesResponse value) {
        return new JAXBElement<GetAllRolesResponse>(_GetAllRolesResponse_QNAME, GetAllRolesResponse.class, null, value);
    }

	/**
     * Create an instance of {@link SayHi }
     * 
     */
    public SayHi createSayHi() {
        return new SayHi();
    }

    /**
     * Create an instance of {@link SayHiResponse }
     * 
     */
    public SayHiResponse createSayHiResponse() {
        return new SayHiResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHi }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "sayHi")
    public JAXBElement<SayHi> createSayHi(SayHi value) {
        return new JAXBElement<SayHi>(_SayHi_QNAME, SayHi.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHiResponse }{@code >}}
     * 
     */
//    @XmlElementDecl(namespace = "http://service.cxfwspoc.raviraj.poc/", name = "sayHiResponse")
    public JAXBElement<SayHiResponse> createSayHiResponse(SayHiResponse value) {
        return new JAXBElement<SayHiResponse>(_SayHiResponse_QNAME, SayHiResponse.class, null, value);
    }

}
