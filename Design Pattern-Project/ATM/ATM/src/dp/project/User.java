package dp.project;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String _name;
	private String _cardNumber;
	private String _pin;
	private List<Account> _accounts;
	
	public User(String name, String cardNumber, String pin){
		_name = name;
		_cardNumber = cardNumber;
		_pin = pin;
		_accounts = new ArrayList<Account>();
	}
	
	public void addAccount(Account account){
		_accounts.add(account);
	}

	public String getName() {
		return _name;
	}

	public String getCardNumber() {
		return _cardNumber;
	}

	public String getPin() {
		return _pin;
	}

	public Account getAccountOfType(String accountType) {
		for(Account account : _accounts){
			if(accountType.equals(account.getClass().getTypeName()))
				return account;
		}
		return null;
	}

}
