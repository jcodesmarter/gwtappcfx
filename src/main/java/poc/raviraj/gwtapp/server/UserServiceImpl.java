package poc.raviraj.gwtapp.server;

import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

import poc.raviraj.cxfwspoc.service.Users;
import poc.raviraj.gwtapp.client.UserService;
import poc.raviraj.gwtapp.shared.User;

public class UserServiceImpl extends RemoteServiceServlet implements UserService {

	private static final long serialVersionUID = 1L;
	
	poc.raviraj.cxfwspoc.service.UserService port = new Users().getUserServicePort();

	@Override
	public User save(User user) {
		return port.save(user);
	}

	@Override
	public User delete(User user) {
		return port.delete(user);
	}

	@Override
	public List<User> findAll() {
		return port.findAll();
	}

	@Override
	public User find(Long userId) {
		return port.find(userId);
	}

	@Override
	public List<User> paginated(int pageNumber, int perPageLimit) {
		return port.paginated(pageNumber, perPageLimit);
	}
	
	@Override
	public List<User> findAllByFirstNameOrLastNameOrUsername(String searchText){
		if(searchText.length() == 0){
			return port.findAll();
		}
		searchText = searchText + "%";
		return port.findAllByFirstNameOrLastNameOrUsername(searchText);
	}

}
