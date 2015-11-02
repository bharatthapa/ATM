package dp.project.state;

import dp.project.ATM;
import dp.project.Card;
import dp.project.User;

public class NoCardState implements IState {
	ATM _atm;

	public NoCardState(ATM atm) {
		_atm = atm;
	}

	@Override
	public boolean insertCard(Card card) {
		User user = _atm.get_bank().getUser(card.get_cardHolderName(), card.get_cardNumber());
		if (user != null) {
			_atm.set_user(user);
			_atm.set_currentState(_atm.get_hasCardState());
			System.out.println(user.getCardNumber());
			return true;
		}
		return false;
	}

	@Override
	public boolean insertPIN(String pin) {
		System.out.println("Card hasn't been inserted yet.");
		return false;
	}

	@Override
	public boolean selectAccount(String accountType) {
		System.out.println("Card hasn't been inserted yet.");
		return false;
	}

	@Override
	public boolean checkBalance() {
		System.out.println("Card hasn't been inserted yet.");
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		System.out.println("Card hasn't been inserted yet.");
		return false;
	}

	@Override
	public boolean changePinCode(String pin) {
		System.out.println("Card hasn't been inserted yet.");
		return false;
	}

	@Override
	public boolean acceptMoney(double amount) {
		System.out.println("Card hasn't been inserted yet.");
		return false;
	}

}
