package com.cg.myapp.bean;

public class Account {

	private int accountNumber;
	private String accountHolderName;
	private int accountBalance;
	private Policy policy;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(Policy policy) {
		super();
		this.policy = policy;
	}
	public Account(int accountNumber, String accountHolderName, int accountBalance) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
	}
	public Account(int accountNumber, String accountHolderName, int accountBalance, Policy policy) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.accountBalance = accountBalance;
		this.policy = policy;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	@Override
	public String toString() {
		return "Account [accountNumber=" + accountNumber + ", accountHolderName=" + accountHolderName
				+ ", accountBalance=" + accountBalance + ", policy=" + policy + "]";
	}
	
	
	
	
}//end class
