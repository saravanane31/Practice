package com.saravanan.thread;

public class Account {
	private int balance = 10000;
	
	public void credit(int amount){
		balance+=amount;
	}
	
	public void debit(int amount){
		balance-=amount;
	}
	
	public int getBalance(){
		return balance;
	}
	
	public static void fundTransfer(Account ac1, Account ac2, int amount){
		if(ac1.balance>amount){
			ac1.debit(amount);
			ac2.credit(amount);
		}else {
			System.out.println("insufficient balanceeeee");
		}
	}
}
