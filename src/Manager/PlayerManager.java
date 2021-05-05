package Manager;

import Entities.User;
import Services.UserService;

public class PlayerManager implements UserService {

	PlayerCheckManager playerCheckManager;
	
	public PlayerManager(PlayerCheckManager playerCheckManager) {
		this.playerCheckManager = playerCheckManager;
	}
	
	@Override
	public void addUser(User user) {

		if (playerCheckManager.checkPlayer(user)) {
			System.out.println("Player named " + user.getFullName() + " added");
		} else {
			System.out.println("Not a valid person");
		}

	}

	@Override
	public void delete(User user) {
		System.out.println("Player named " + user.getFullName() + " deleted.");

	}

	@Override
	public void update(User user) {
		System.out.println("Player named " + user.getFullName() + " updated.");

	}

}
