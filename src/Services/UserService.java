package Services;

import Entities.User;

public interface UserService {
	
	void addUser(User user);
	
	void delete(User user);
	
	void update(User user);

}
