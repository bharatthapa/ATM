package dp.project.state;

import dp.project.ATM;
import dp.project.Card;

public class HasCardState implements IState {
	ATM _atm;

	public HasCardState(ATM atm) {
		_atm = atm;
	}

	@Override
	public boolean insertCard(Card card) {
		System.out.println("Card Has already been inserted.");		
		return false;
	}

	@Override
	public boolean insertPIN(String pin) {
		if(_atm.get_user().getPin() == pin){
			_atm.set_currentState(_atm.get_hasPinState());
			return true;
		}
		return false;
	}

	@Override
	public boolean selectAccount(String accountType) {
		System.out.println("Pin hasn't been entered yet.");
		return false;
	}

	@Override
	public boolean checkBalance() {
		System.out.println("Pin hasn't been entered yet.");		
		return false;
	}

	@Override
	public boolean withdraw(double amount) {
		System.out.println("Pin hasn't been entered yet.");	
		return false;
	}

	@Override
	public boolean changePinCode(String pin) {
		System.out.println("Pin hasn't been entered yet.");	
		return false;
	}

	@Override
	public boolean acceptMoney(double amount) {
		System.out.println("Pin hasn't been entered yet.");		
		return false;
	}

}
