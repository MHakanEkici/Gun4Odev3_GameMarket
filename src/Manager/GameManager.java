package Manager;

import Entities.Game;
import Services.GameService;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game) {
		System.out.println("Game named " + game.getName() + " added.");
		
	}

	@Override
	public void updateGame(Game game) {
		System.out.println("Game named " + game.getName() + " updated");
		
	}

	@Override
	public void deleteGame(Game game) {
		System.out.println("Game named " + game.getName() + " deleted");
		
	}

}
