package test.bank;

import org.junit.Test;

import com.server.SavingAccount;

import junit.framework.Assert;

public class Test_SavingAccount {
	
	@Test
	public void checkSavingAccountAvailable() {
		
		SavingAccount obj = new SavingAccount();
		/*if(obj == null) {
			throw new RuntimeException("The account object does not exists");
		}*/
		Assert.assertNotNull(obj);
		
	}
	@Test
	public void checkInitialBalance() {
		SavingAccount obj = new SavingAccount();
		int amount = obj.readBalance(); // what are all the Guide lines based on that method impl will be there
		/*if(amount != 1000) { // some condition like min balance should be 1000
			throw new RuntimeException("The balance is not sufficient");
		}*/
		Assert.assertEquals(1000, amount);
		
	}
	@Test
	public void testAccountDesposit() {
		SavingAccount obj = new SavingAccount();
		obj.depositAmount(1200);
		int amount = obj.readBalance();
		Assert.assertEquals(2200, amount);
	}

}
