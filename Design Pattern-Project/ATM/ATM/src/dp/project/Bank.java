package dp.project;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	private static Bank _uniqueInstance = null;
	private List<User> _users;
	
	public Bank(){
		_users = new ArrayList<User>();
	}
	
	public static Bank getBankInstance(){
		if(_uniqueInstance == null)
			_uniqueInstance = new Bank();
		
		return _uniqueInstance;
	}
	
	public void addUser(User user){
		_users.add(user);
	}
	
	public User getUser(String name, String cardNumber){
		User user = null;
		for(User u : _users){
			if(u.getName() == name && u.getCardNumber() == cardNumber){
				user = u;
			}
		}		
		return user;
	}

}
