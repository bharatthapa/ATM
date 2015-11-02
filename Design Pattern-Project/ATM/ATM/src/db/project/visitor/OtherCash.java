package db.project.visitor;

public class OtherCash implements IMoney {

	private int _amount;
	
	public OtherCash(int amount) {
		// TODO Auto-generated constructor stub
		_amount=amount;
	}
	public int getAmount(){
		return _amount;
	}
	
	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
