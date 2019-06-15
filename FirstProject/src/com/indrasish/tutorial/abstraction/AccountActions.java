package com.indrasish.tutorial.abstraction;

import com.indrasish.tutorial.encapsulation.AccountPOJO;

public interface AccountActions {
	
	public String deposit(AccountPOJO holderDetails, int amount);
	
	public String withdrawl(AccountPOJO holderDetails, int amount);
	
	public int getBalance(AccountPOJO holderDetails);
	
	

}
