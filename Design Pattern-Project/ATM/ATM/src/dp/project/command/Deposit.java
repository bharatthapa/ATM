package dp.project.command;

import dp.project.ATM;

public class Deposit implements ICommand {
	
	public ATM _atmMachine;
	public int _cashCount;

	public Deposit(ATM atmMachine, int countCash) {
		
		this._atmMachine= atmMachine;
		this._cashCount=countCash;
	}

	@Override
	public boolean execute() {
		_atmMachine.deposit(_cashCount);
		
		return false;
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

}
