package dp.project;

import db.project.visitor.Cash20;
import db.project.visitor.Cash50;
import db.project.visitor.IMoney;
import db.project.visitor.MoneyParser;
import db.project.visitor.OtherCash;
import dp.project.command.CheckCash;
import dp.project.command.Deposit;
import dp.project.command.ICommand;
import dp.project.command.InsertCard;
import dp.project.command.InsertPin;
import dp.project.command.Invoker;
import dp.project.command.SelectAccount;
import dp.project.command.Withdraw;
import dp.project.ui.InsertPinUI;

public class Client {
	
	static InsertPinUI window;
	static ATM atmMachine;
	public static void main(String[] args){
			
		
		Bank bank = Bank.getBankInstance();
		SMSfacade smsfacade = new SMSfacade();
		ATM atmMachine = ATM.getATM(bank, smsfacade);
		User bharat = new User("Bharat Paketmar Thapa" , "4576-8897-8989-5677", "1234");
		atmMachine.get_bank().addUser(bharat);
		
		Card card = new Card("4576-8897-8989-5677", "Bharat Paketmar Thapa");
		ICommand insertCard = new InsertCard(atmMachine, card);
		
		Invoker invoker = new Invoker();
		invoker.pushAndExecute(insertCard);
		
		ICommand insertPin = new InsertPin(atmMachine, "1234");
		invoker.pushAndExecute(insertPin);
		
		ICommand selectAccount = new SelectAccount(atmMachine, "Current");
		invoker.pushAndExecute(selectAccount);
		
		ICommand checkCash = new CheckCash(atmMachine);
		invoker.pushAndExecute(checkCash);
		
		ICommand withDraw = new Withdraw(atmMachine, 5000);
		invoker.pushAndExecute(withDraw);
		
		
		IMoney twenty1 = new Cash20();
		IMoney twenty2 = new Cash20();
		IMoney twenty3 = new Cash20();
		
		IMoney fifty1 = new Cash50();
		IMoney fifty2 = new Cash50();
		
		IMoney fiveDollar = new OtherCash(5);
		IMoney fifteen = new OtherCash(15);
		
		MoneyParser moneyParser = new MoneyParser();
		moneyParser.add(twenty1);
		moneyParser.add(twenty2);
		moneyParser.add(twenty3);
		moneyParser.add(fifty1);
		moneyParser.add(fifty2);
		moneyParser.add(fiveDollar);
		moneyParser.add(fifteen);
		
		System.out.println("total cash entered = " + moneyParser.countCash());
		
		ICommand acceptAmount = new Deposit(atmMachine, moneyParser.countCash());
		invoker.pushAndExecute(acceptAmount);
		
		
	}
}
