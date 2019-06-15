package com.indrasish.tutorial.passbyvalue;

public class PrimitiveTypes {

	public static void main(String[] args) {
		
		int x = 5;
		change(x);
		System.out.println(x);

	}

	private static void change(int x) {
		x = 10;
		
	}

}
