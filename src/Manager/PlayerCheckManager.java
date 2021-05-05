package Manager;

import Entities.User;
import Services.UserCheckService;

public class PlayerCheckManager implements UserCheckService {
	
    @Override
	public boolean checkPlayer(User user) {
		
		System.out.println(user.getFullName() +  " checked");
		
		return true;
	}

}
