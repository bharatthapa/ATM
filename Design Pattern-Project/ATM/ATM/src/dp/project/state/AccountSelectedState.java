package dp.project.state;

import dp.project.ATM;
import dp.project.Card;

public class AccountSelectedState implements IState{
	ATM _atm;
	
	public AccountSelectedState(ATM atm) {
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
		System.out.println("Account has already been selected.");
		return false;
	}

	@Override
	public boolean checkBalance() {
		// TODO Auto-generated method stub
		double availableBalance = _atm.getAccount().getBalance();
		_atm.getSmsFacade().sendMessage("Your Balance is \t"+availableBalance);
		return true;
	}

	@Override
	public boolean withdraw(double amount) {
		// TODO Auto-generated method stub
		if(_atm.getAccount().getBalance()<1)
		{
			_atm.message("Machine run out of Money. Refill Soon !!!");
		}
		else {
			_atm.getAccount().setBalance(_atm.getAccount().getBalance()-amount);//State does'nt changes. 
			_atm.getSmsFacade().sendMessage(amount +"\t has been withdrawn");
			
		}
		return true;
	}

	@Override
	public boolean changePinCode(String pin) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean acceptMoney(double amount) {
		// TODO Auto-generated method stub
		_atm.getAccount().setBalance(_atm.getAccount().getBalance()+amount);
		_atm.getSmsFacade().sendMessage(amount +"\t has been deposited");
		return true;
	}

}
