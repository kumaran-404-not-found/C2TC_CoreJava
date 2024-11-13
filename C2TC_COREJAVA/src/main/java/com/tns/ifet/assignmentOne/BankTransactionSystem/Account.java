package com.tns.ifet.assignmentOne.BankTransactionSystem;

public abstract class Account {
	protected double balance;
		
	public Account(double InitializeBalance){
		this.balance=InitializeBalance;
	}
	
	public abstract void deposit(double amount);
	public abstract void withdraw(double amount);
	public abstract double getBalance();
	
	public void displayBalance() {
		System.out.println("Current Balance:"+getBalance());
	}
}
