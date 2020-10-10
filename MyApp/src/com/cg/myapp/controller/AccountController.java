package com.cg.myapp.controller;

import com.cg.myapp.bean.Account;
import com.cg.myapp.bean.Policy;

public class AccountController {

	public Account createAccount(int id,String name,int balance)
	{
		return new Account(id, name, balance);
	}
	public Account createAccountWithPolicy(int id,String name,int balance, Policy policy )
	{
		return new Account(id, name, balance, policy);
	}
	public Account createPolicyUsingExistingAccount(Account a , Policy policy )
	{
		a.setPolicy(policy);
		return a;
	}
	public int getBalance(Account a)
	{
		return a.getAccountBalance();
	}
	
	public Policy getPolicy(Account a) {
		return a.getPolicy();
	}
	
	
}//end class
