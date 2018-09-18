package com.server;

public class SavingAccount {
	
	private int balance;
	private int acctNo;

	public SavingAccount() {
		//balance=1000
		System.out.println("This is SavingAccount() ");
		balance=1000;
		//this.balance = balance;1
	}
	public SavingAccount(int balance) {
		this.balance = balance;
	}
	
	public int readBalance() {
		// TODO Auto-generated method stub
		//return 1000;
		return balance;
	}

	public void depositAmount(int i) {
		// TODO Auto-generated method stub
		balance = balance +i;
		
	}

}
