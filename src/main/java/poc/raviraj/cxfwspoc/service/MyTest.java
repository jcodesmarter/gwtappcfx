package poc.raviraj.cxfwspoc.service;

import java.util.List;

import poc.raviraj.gwtapp.shared.Department;

public class MyTest {

	public static void main(String[] args) {
		try {
			HelloWorld hwPort = new Helloworld_Service().getHelloWorldPort();
			System.out.println(hwPort.sayHi("Raviraj"));
			poc.raviraj.cxfwspoc.service.MasterTypeService port = new Mastertypes().getMasterTypeServicePort();
			List<Department> departments = port.getAllDepartments();
			for(Department d : departments){
				System.out.println(d.getKeyName() + "[" + d.getKeyId() + "]");
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}
