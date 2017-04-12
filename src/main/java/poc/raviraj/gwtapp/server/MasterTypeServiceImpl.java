package poc.raviraj.gwtapp.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import poc.raviraj.cxfwspoc.service.Mastertypes;
import poc.raviraj.gwtapp.client.MasterTypeService;
import poc.raviraj.gwtapp.shared.Department;
import poc.raviraj.gwtapp.shared.Designation;
import poc.raviraj.gwtapp.shared.Gender;
import poc.raviraj.gwtapp.shared.Role;

public class MasterTypeServiceImpl extends RemoteServiceServlet implements MasterTypeService {

	private static final long serialVersionUID = 1L;

	poc.raviraj.cxfwspoc.service.MasterTypeService port = new Mastertypes().getMasterTypeServicePort();

	@Override
	public List<Department> getAllDepartments() {
		return port.getAllDepartments();
	}

	@Override
	public List<Designation> getAllDesignations() {
		return port.getAllDesignations();
	}

	@Override
	public List<Role> getAllRoles() {
		return port.getAllRoles();
	}

	@Override
	public List<Gender> getAllGenders() {
		return port.getAllGenders();
	}

}
