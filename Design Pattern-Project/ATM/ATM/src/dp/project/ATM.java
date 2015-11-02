package dp.project;

import java.util.ArrayList;
import java.util.List;

import dp.project.observer.IObserver;
import dp.project.observer.ISubject;
import dp.project.state.AccountSelectedState;
import dp.project.state.HasCardState;
import dp.project.state.HasPinState;
import dp.project.state.IState;
import dp.project.state.NoCardState;

public class ATM implements ISubject{
	private static ATM _uniqueATM = null;
	
	private Bank _bank;
	private User _user;
	private Account _account;
	
	private IState _noCardState;
	private IState _hasCardState;	
	private IState _hasPinState;
	private IState _accountSelectedState;
	private IState _currentState;
	private SMSfacade _smsfacade;
	
	//Observer's List
	private List<IObserver> _listObserver;
	private String _message;
	
	public synchronized static ATM getATM(Bank bank, SMSfacade smsfacade){
		if(_uniqueATM == null)
			_uniqueATM = new ATM(bank, smsfacade);
		return _uniqueATM;
	}
	
	public ATM(Bank bank, SMSfacade smsfacade){
		_bank = bank;
		_noCardState = new NoCardState(this);
		_hasCardState = new HasCardState(this);	
		_hasPinState = new HasPinState(this);
		_accountSelectedState = new AccountSelectedState(this);
		
		_currentState = _noCardState;
		
		_listObserver= new ArrayList<IObserver>();
		_smsfacade = smsfacade;
	}
	
	public SMSfacade getSmsFacade(){
		return _smsfacade;
	}
	
	public Bank get_bank(){
		return _bank;
	}
	
	/**
	 * @return the _user
	 */
	public User get_user() {
		return _user;
	}

	/**
	 * @param _user the _user to set
	 */
	public void set_user(User _user) {
		this._user = _user;
	}



	/**
	 * @return the _noCardState
	 */
	public IState get_noCardState() {
		return _noCardState;
	}

	/**
	 * @return the _hasCardState
	 */
	public IState get_hasCardState() {
		return _hasCardState;
	}

	/**
	 * @return the _hasPinState
	 */
	public IState get_hasPinState() {
		return _hasPinState;
	}

	/**
	 * @return the _accountSelectedState
	 */
	public IState get_accountSelectedState() {
		return _accountSelectedState;
	}

	
	
	//Receiver for Command Pattern
	//Command Methods
	
	public boolean insertCard(Card card){
		return _currentState.insertCard(card);
	}

	public boolean ejectCard(){
		//to be implemented in state 
		//_currentState.ejectCard(); 
		return false;
	}
	
	public boolean insertPin(String pin){
		return _currentState.insertPIN(pin);
	}
	
	public boolean selectAccount(String accountType){
		return _currentState.selectAccount(accountType);
	}
	
	public boolean checkCash(){
		return _currentState.checkBalance();
	}
	
	public boolean withDraw(int _withDrawAmount){
		return _currentState.withdraw(_withDrawAmount);
	}
	
	public boolean deposit(){
		return _currentState.acceptMoney(30);
	}
	
	public boolean payBill(){
		return false;
	}

	public boolean removePin() {
		// TODO Auto-generated method stub
		//_currentState.removePin();
		return false;
	}

	public boolean set_currentState(IState state) {
		_currentState = state;
		return true;
	}
	
	

	
	//Observer Pattern 
	//ATM acts as Producer i.e. Concrete ISubject
	@Override
	public void attach(IObserver observer) {
		// TODO Auto-generated method stub
		_listObserver.add(observer);
	}

	@Override
	public void detach(IObserver observer) {
		// TODO Auto-generated method stub
		int index = _listObserver.indexOf(observer);
		if(index>0)
		_listObserver.remove(index);
	}

	@Override
	public void notifyObservers() {
		// TODO Auto-generated method stub
		for (int i = 0; i < _listObserver.size(); i++) {
			IObserver observer = _listObserver.get(i);
			observer.update(_message);
		}
	}
	
	public void message(String message) {
		this._message	= message; 
		notifyObservers();
	}

	public void set_account(Account account) {
		this._account = account;	
	}

	public Account getAccount() {
		// TODO Auto-generated method stub
		return _account;
	}

	public boolean deposit(int _cashCount) {
		// TODO Auto-generated method stub
		return _currentState.acceptMoney(_cashCount);
	}
	
}
