import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class MoneyTest {
	
	private Money money = new Money(10, "EUR");

	@Test
	public void CheckPositiveAmountTest() {
		assertTrue(money.Amount() >= 0);
	}
	
	@Test
	public void CheckISORuleForCurrency() {
		assertTrue(money.Currency().length() == 3);
		assertTrue(money.Currency() == "ER" 
				|| money.Currency() == "USD" 
				|| money.Currency() == "CHF" 
				|| money.Currency() == "GBP");
	}
}
