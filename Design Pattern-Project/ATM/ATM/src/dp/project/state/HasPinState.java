package dp.project.state;

import dp.project.ATM;
import dp.project.Card;

public class HasPinState implements IState{
	ATM _atm;

	public HasPinState(ATM atm) {
		_atm = atm;
	}

	@Override
	public boolean insertCard(Card card) {
		System.out.println("Card Has already been inserted.");
		return false;
	}

	@Override
	public boolean insertPIN(String pin) {
		System.out.println("Pin has already been entered.");
		return false;
	}

	@Override
	public boolean selectAccount(String accountType) {
		_atm.set_account(_atm.get_user().getAccountOfType(accountType));
		_atm.set_currentState(_atm.get_accountSelectedState());
		return true;
	}

	@Override
	public boolean checkBalance() {
		System.out.println("Account hasn't been selected yet.");
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		System.out.println("Account hasn't been selected yet.");	
		return false;
	}

	@Override
	public boolean changePinCode(String pin) {
		System.out.println("Account hasn't been selected yet.");
		return false;
	}

	@Override
	public boolean acceptMoney(double amount) {
		System.out.println("Account hasn't been selected yet.");
		return false;
	}

}
