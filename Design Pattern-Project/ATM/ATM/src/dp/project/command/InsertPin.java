package dp.project.command;

import dp.project.ATM;

public class InsertPin implements ICommand {
	private ATM _receiver;
	private String _pin;
	
	public InsertPin(ATM receiver, String pin) {
		this._receiver = receiver;
		this._pin = pin;
	}	
	

	@Override
	public boolean execute() {
		// TODO Auto-generated method stub
		return _receiver.insertPin(_pin);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		_receiver.removePin();
		return true;
	}

}
