package com.indrasish.tutorial;

import com.indrasish.tutorial.abstraction.AccountActions;
import com.indrasish.tutorial.abstraction.AccountActionsImpl;
import com.indrasish.tutorial.encapsulation.AccountPOJO;

public class HelloWorld {

	public static void main(String[] args) {
				
	AccountPOJO accountHolder1 = new AccountPOJO();
	accountHolder1.setAccountNumber("SBI23400921");
	AccountActions accountActionDeposit = new AccountActionsImpl();
	System.out.println(accountActionDeposit.withdrawl(accountHolder1, 200));
	System.out.println(accountActionDeposit.getBalance(accountHolder1));
	System.out.println("New Feature");
	}
}

