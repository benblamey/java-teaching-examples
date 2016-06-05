import static org.junit.Assert.*;

import org.junit.Test;


public class BankAccountTesty {

	@Test
	public void test() {
		
		BankAccount ba = new BankAccount(1000);
		
		ba.withdraw(300.0);
		
		assertEquals(700.0, ba.getBalance(), 0.00001);
		
	}

}
