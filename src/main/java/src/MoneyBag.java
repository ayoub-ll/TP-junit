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
	
	public MoneyBag Add(Money money) {
		// Si la money qu'on demande à ajouter est de la même devise que l'une des monnaies existantes 
		// dans la collection, alors on l'ajoute
		if(money.getfCurrency().equals(this.moneyBagList.get(0).getfCurrency()))
			this.moneyBagList.add(money);
		
		return this;
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
