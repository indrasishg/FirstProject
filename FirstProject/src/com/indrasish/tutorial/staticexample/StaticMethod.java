package com.indrasish.tutorial.staticexample;

public class StaticMethod {
	
	public static String method1() {
		return "First called!!!";
		
	}
	
	public String method2() {
		return "Second Method";
	}

	public static void main(String[] args) {		
		StaticMethod obj = new StaticMethod();
		System.out.println(obj.method2());
		System.out.println(method1());
	}

}
