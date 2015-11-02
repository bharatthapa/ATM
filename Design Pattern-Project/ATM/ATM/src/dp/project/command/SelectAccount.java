package dp.project.command;

import dp.project.ATM;

public class SelectAccount implements ICommand {
	private ATM _atmMachine;
	private String _accountType;

	public SelectAccount(ATM atmMachine, String accountType) {
		_atmMachine = atmMachine;
		_accountType = accountType;
	}

	@Override
	public boolean execute() {
		return _atmMachine.selectAccount(_accountType);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

}
