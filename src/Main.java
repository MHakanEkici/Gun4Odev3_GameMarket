import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Manager.CampaignManager;
import Manager.GameManager;
import Manager.PlayerCheckManager;
import Manager.PlayerManager;
import Manager.SalesManager;

public class Main {

	public static void main(String[] args) {
		
		Player player1 = new Player();
		player1.setFirstName("Hakan");
		player1.setLastName("Ekici");
		player1.setNationalId("123456789101");
		player1.setBalance(20);
		
		Player player2 = new Player();
		player2.setFirstName("Abrulrezzak");
		player2.setLastName("Tikitak");
		player2.setNationalId("101987654321");
		player2.setBalance(100);
		
		System.out.println("----------------------------------------------------------------");
		
		Game game1 = new Game();
		game1.setName("CounterStrikeGlobalOffansive");
		game1.setId(1);
		game1.setPrice(30);
		game1.setGameType("FPS, Action");
		
		Game game2 = new Game();
		game2.setName("The Witcher 3: Wild Hunt");
		game2.setId(2);
		game2.setPrice(120);
		game2.setGameType("RPG, Action, Adventure");
		
		System.out.println("----------------------------------------------------------------");
		
		Campaign campaign1 = new Campaign();
		campaign1.setCampaignId(11);
		campaign1.setDiscountRate(40);
		campaign1.setCampaignName("Summer campaign");
		
		Campaign campaign2 = new Campaign();
		campaign2.setCampaignId(22);
		campaign2.setDiscountRate(30);
		campaign2.setCampaignName("Winter campaign");
		
		System.out.println("----------------------------------------------------------------");
		
		PlayerManager playerManager = new PlayerManager(new PlayerCheckManager());
		playerManager.addUser(player1);
		playerManager.delete(player1);
		playerManager.update(player2);
		
		System.out.println("----------------------------------------------------------------");
		
		GameManager gameManager = new GameManager();
		gameManager.addGame(game2);
		gameManager.updateGame(game2);
		gameManager.deleteGame(game1);
		
		System.out.println("----------------------------------------------------------------");
		
		CampaignManager campaignManager = new CampaignManager();
		campaignManager.addCampaign(campaign1);
		campaignManager.deleteCampaign(campaign2);
		campaignManager.updateCampaign(campaign1);
		
		System.out.println("----------------------------------------------------------------");
		
		campaignManager.applyCampaign(campaign1, game1);
		campaignManager.applyCampaign(campaign2, game2);
		
		System.out.println("----------------------------------------------------------------");
		
		SalesManager salesManager = new SalesManager();
		
		salesManager.buy(player1, game1);
		salesManager.buy(player2, game2);
		salesManager.buy(player1, game2);
		
		
		
	}
}
