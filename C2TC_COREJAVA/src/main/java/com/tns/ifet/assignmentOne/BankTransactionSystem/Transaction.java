package com.tns.ifet.assignmentOne.BankTransactionSystem;

public class Transaction {
	private final double tran_fee = 2/100;
	
	public final void performTransaction(Account account,double amount,boolean isDeposit) {
		if(isDeposit) {
			account.deposit(amount);
		}else {
			account.withdraw(amount+(amount*tran_fee));
			System.out.println("Transaction Fee of Rs:"+amount*tran_fee+" is applied");
		}
		account.displayBalance();
	}
}
