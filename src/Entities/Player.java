package Entities;

public class Player extends User {
	double balance;
	
	public Player() {
		
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Player(double balance) {
		super();
		this.balance = balance;
	}

}
	
	
	
	
