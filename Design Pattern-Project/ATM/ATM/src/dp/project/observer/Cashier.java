package dp.project.observer;

public class Cashier implements IObserver {

	public Cashier(ISubject producer) {
		// TODO Auto-generated constructor stub
		producer.attach(this);
	}
	
	@Override
	public void update(String message) {
		// TODO Auto-generated method stub
		System.out.println("Message Received in \t"+this+"\t"+message);
	}

}
