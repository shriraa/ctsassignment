package Exceptionhandling;

public class Account {
	private int balance =15000;
	
	public int withdraw(int amount) throws MinimumBalanceException {
		balance=balance-amount;
		if(balance<10000) {
			throw new MinimumBalanceException();
		} return balance;
	}



}
