package src;
import java.util.ArrayList;
import java.util.List;

public class MoneyBag {
	private ArrayList<Money> moneyBagList;
	
	public MoneyBag(ArrayList<Money> moneyBagList) {
		this.moneyBagList = moneyBagList;
	}

	public MoneyBag Normalize(String currency) {
		for(Money money : this.moneyBagList) {
			money.setfCurrency(currency);
		}
		
		return this;
	}
	
	public void Add(Money money) {
		this.moneyBagList.add(money);
	}
	
	public void Subb(ArrayList<Money> moneyBag) {
		this.moneyBagList = moneyBag;
	}

	public ArrayList<Money> getMoneyBagList() {
		return moneyBagList;
	}

	public void setMoneyBagList(ArrayList<Money> moneyBagList) {
		this.moneyBagList = moneyBagList;
	}
	
	
}
