package com.cg.myapp.bean;

public class Policy {
	private String policyName;
	private int policyAmount;
	
	@Override
	public String toString() {
		return "Policy [policyName=" + policyName + ", policyAmount=" + policyAmount + "]";
	}
	public Policy() {
		super();
	}
	public Policy(String policyName, int policyAmount) {
		super();
		this.policyName = policyName;
		this.policyAmount = policyAmount;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicyAmount() {
		return policyAmount;
	}
	public void setPolicyAmount(int policyAmount) {
		this.policyAmount = policyAmount;
	}
	
}
