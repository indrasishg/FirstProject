package com.indrasish.tutorial.inheritance.classes;

import com.indrasish.tutorial.inheritance.interfaces.Interface1;
import com.indrasish.tutorial.inheritance.interfaces.Interface2;

public class CallingClass implements Interface1, Interface2{

	public void show() {
		
		Interface1.super.show();
		
		Interface2.super.show();
	}
	public static void main(String[] args) {
		
		CallingClass obj = new CallingClass();
		obj.show();

	}

}
