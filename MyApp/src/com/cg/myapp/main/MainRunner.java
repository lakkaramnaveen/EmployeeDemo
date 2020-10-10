package com.cg.myapp.main;

import com.cg.myapp.bean.Account;
import com.cg.myapp.bean.Policy;
import com.cg.myapp.controller.AccountController;

public class MainRunner {

	public static void main(String[] args) {
		//----
		AccountController accountController = new AccountController();
		Policy policy = new Policy("SIIP", 12_000);

		Account account = accountController.createAccount(1, "Rahul", 1_000_000);
		System.out.println(account);
		accountController.createPolicyUsingExistingAccount(account, policy);
		System.out.println(account);
		System.out.println(accountController.getPolicy(account).getPolicyName());
		System.out.println(accountController.getPolicy(account).getPolicyAmount());


		//		AccountController ac = new AccountController();
		//		Policy p = new Policy("Life Insurance",12_000);	
		//      Account a = ac.createAccountWithPolicy(1, "Rahul", 1_000_000,p);	
		//		Policy p1 = a.getPolicy();
		//		System.out.println(p1.getPolicyName());
		//		System.out.println(p1.getPolicyAmount());
		//----
	}
}
