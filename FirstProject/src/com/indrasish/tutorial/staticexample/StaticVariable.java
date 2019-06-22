package com.indrasish.tutorial.staticexample;

public class StaticVariable {
	
	static {
		System.out.println("Static block executed");
	}

	public static int staticint = 20;
	
	
	public static void main(String[] args) {
		System.out.println(StaticVariable.staticint);

	}

	
}
