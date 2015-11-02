package dp.project.command;

import dp.project.ATM;
import dp.project.Card;

public class InsertCard implements ICommand {

	private ATM _receiver;
	private Card _card;
	public InsertCard(ATM _receiver, Card card) {
		// TODO Auto-generated constructor stub
		this._receiver = _receiver;
		this._card = card;
		
	}
	@Override
	public boolean execute() {
		return _receiver.insertCard(_card);
	}

	@Override
	public boolean undo() {
		// TODO Auto-generated method stub
		 _receiver.ejectCard();
		 return true;
	}

}
