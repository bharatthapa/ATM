package dp.project;

public abstract class Account {
	private String _accountNumber;
	private double balance;
	/**
	 * @param _accountNumber
	 * @param balance
	 */
	public Account(String _accountNumber, double balance) {
		
		this._accountNumber = _accountNumber;
		this.balance = balance;
		
	}
	
	/**
	 * @return the _accountNumber
	 */
	public String get_accountNumber() {
		return _accountNumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
