package test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import src.Money;
import src.MoneyBag;


public class MoneyBagTest {
	
	private MoneyBag moneyBag;
	
	public MoneyBagTest() {
		Money money = new Money(10, "EUR");
		Money money2 = new Money(20, "EUR");
		Money money3 = new Money(30, "EUR");
		
		
		ArrayList<Money> moneyBagList = new ArrayList<Money>();
		moneyBagList.add(money);
		moneyBagList.add(money2);
		moneyBagList.add(money3);
		
		this.moneyBag = new MoneyBag(moneyBagList);
	}
	
	@Test
	public void NormalizeTest() {
		this.moneyBag.Normalize("USD").getMoneyBagList().forEach(m -> assertEquals(m.Currency(), "USD"));
	}
	
	@Test
	public void AddTest() {
		Money moneyToAdd = new Money(70, "USD");
		int oldSize = this.moneyBag.getMoneyBagList().size();
		
		this.moneyBag.Add(moneyToAdd);
		
		// On check que la monnaie a bien été ajoutée
		assertEquals(oldSize++, this.moneyBag.getMoneyBagList().size());
	}
}
