package db.project.visitor;

public interface IVisitor {

	public void visit(Cash20 cash20);
	public void visit(Cash50 cash50);
	public void visit(OtherCash otherCash);
}
