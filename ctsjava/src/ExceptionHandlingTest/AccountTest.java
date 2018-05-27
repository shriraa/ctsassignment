package ExceptionHandlingTest;

import Exceptionhandling.Account;
import Exceptionhandling.MinimumBalanceException;

public class AccountTest {
	public static void main(String[] args) {
		Account account = new Account();
		try {
			System.out.println(account.withdraw(6000));
		} catch (MinimumBalanceException e) {

			e.printStackTrace();
		}
	}


}
