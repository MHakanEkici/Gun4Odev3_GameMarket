package Entities;

public class Game extends Product {
	String gameType;

	public Game() {
	}
	
	public Game(String gameType) {
		super();
		this.gameType = gameType;
	}
	
	public String getGameType() {
		return gameType;
	}

	public void setGameType(String gameType) {
		this.gameType = gameType;
	}

	
}
