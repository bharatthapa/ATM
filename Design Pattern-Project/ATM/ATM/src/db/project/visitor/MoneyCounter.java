package db.project.visitor;

public class MoneyCounter implements IVisitor {

	private int _count;
	@Override
	public void visit(Cash20 cash20) {
		// TODO Auto-generated method stub
		_count += cash20.getAmount();
	}

	@Override
	public void visit(Cash50 cash50) {
		// TODO Auto-generated method stub
		_count += cash50.getAmount();
	}

	@Override
	public void visit(OtherCash otherCash) {
		// TODO Auto-generated method stub
		_count += otherCash.getAmount();
	}
	
	public int get_count() {
		return _count;
	}

}
