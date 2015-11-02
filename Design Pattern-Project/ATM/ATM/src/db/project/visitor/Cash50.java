package db.project.visitor;

public class Cash50 implements IMoney {
	
	private int amount;
	
	public Cash50(){
		amount = 50;
	}

	public int getAmount(){
		return amount;
	}
	@Override
	public void accept(IVisitor visitor) {
		// TODO Auto-generated method stub
		visitor.visit(this);
	}

}
