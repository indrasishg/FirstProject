package com.indrasish.tutorial.staticexample;

public class StaticBlock {
	
	static {
		System.out.println("Static Block Executed");
	}
	
	StaticBlock(){
		System.out.println("Constructor called !!!!");
	}
	
	public String method1() {
		return "Method1 Called !!!!";
	}

	public static void main(String[] args) {
		StaticBlock obj = new StaticBlock();
		System.out.println(obj.method1());
	}

}
