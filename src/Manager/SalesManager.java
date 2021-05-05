package Manager;

import Entities.Player;
import Entities.Product;
import Entities.User;
import Services.SalesService;

public class SalesManager implements SalesService {

	@Override
	public void buy(Player player, Product product) {
		if (player.getBalance() < product.getPrice()) {
			System.out.println("Unable to perform requested operation. Insufficient balance");
		} else {
			player.setBalance(player.getBalance() - product.getPrice());
			System.out.println(player.getFullName() + " bought " + product.getName());
			System.out.println("New Balance: " + player.getBalance());
		}
		
		

	}

}
