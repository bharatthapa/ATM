package db.project.visitor;

public class Cash20 implements IMoney {
	
	private int amount;
	
	public Cash20(){
		amount = 20;
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
