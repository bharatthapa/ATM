package dp.project.state;

import dp.project.Card;

public interface IState {
	public boolean insertCard(Card card);
	public boolean insertPIN(String pin);
	public boolean selectAccount(String accountType);
	public boolean checkBalance();
	public boolean withdraw(double amount);
	public boolean changePinCode(String pin);
	public boolean acceptMoney(double amount);
}
