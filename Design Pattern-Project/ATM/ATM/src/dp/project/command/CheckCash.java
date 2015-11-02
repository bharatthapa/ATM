package dp.project.command;

import dp.project.ATM;

public class CheckCash implements ICommand {

	private ATM _receiver;
	
	public CheckCash(ATM receiver) {
		// TODO Auto-generated constructor stub
		this._receiver= receiver;
	}
	
	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return _receiver.checkCash();
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		return false;
	}

}
