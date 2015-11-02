package dp.project.command;

import dp.project.ATM;

public class Withdraw implements ICommand {

	private ATM _atmMachine;
	private int _withDrawAmount;
	
	public Withdraw(ATM atmMachine, int withDrawAmount) {
		this._atmMachine=atmMachine;
		this._withDrawAmount=withDrawAmount;
	}

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return _atmMachine.withDraw(_withDrawAmount);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

}
