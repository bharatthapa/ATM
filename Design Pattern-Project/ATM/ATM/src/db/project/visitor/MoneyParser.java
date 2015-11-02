package db.project.visitor;

import java.util.ArrayList;
import java.util.List;

public class MoneyParser {
	
	private List<IMoney> _listMoney;
	private int _count;
	
	public MoneyParser() {
		// TODO Auto-generated constructor stub
		_listMoney =  new ArrayList<IMoney>();
	}
	
	public void add(IMoney money){
		_listMoney.add(money);
	}
	
	public int countCash(){
		MoneyCounter moneyCounter = new MoneyCounter();
		for(IMoney money : _listMoney){
			money.accept(moneyCounter);
		}
		_count = moneyCounter.get_count();
		return _count;
	}
}
