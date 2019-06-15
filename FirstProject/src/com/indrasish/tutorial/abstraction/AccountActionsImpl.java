package com.indrasish.tutorial.abstraction;

import com.indrasish.tutorial.encapsulation.AccountPOJO;

public class AccountActionsImpl implements AccountActions {
	
	public AccountActionsImpl() {
		
	}

	@Override
	public String deposit(AccountPOJO holderDetails, int amount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String withdrawl(AccountPOJO holderDetails, int amount) {
		if(!isActiveAccount(holderDetails)) {
			return "Not a Active User. Contact Bank for Details.";
		}
		return "Withdrawl "+ amount + ". Your current Balance is " + getBalance(holderDetails) + ". ";
	}
	
	private boolean isActiveAccount(AccountPOJO holderDetails) {
		// Here should be a call to a server
		return true;
	}

	@Override
	public int getBalance(AccountPOJO holderDetails) {
		return 100;
	}
}
