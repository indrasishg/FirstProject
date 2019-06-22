package com.indrasish.tutorial.staticexample;

public class StaticNestedClass {
	
	//Compile Time Constant
	
	static class NestedClass{
		
		
		public static void display1() {
			System.out.println("Display Method called");
		}
		
		public NestedClass() {
			System.out.println("NestedClass Constructor called");
		}
		
	}
	
	class NonStaticInnerClass{
		
		public static final int staticvariable = 10;
		
		public void display1() {
			System.out.println("Non Static Method called");
		}
		
		public NonStaticInnerClass() {
			System.out.println("NonStaticInnerClass called");
		}
	}

	public static void main(String[] args) {
		//Non Static Inner class
		StaticNestedClass outerObj = new StaticNestedClass();
		StaticNestedClass.NonStaticInnerClass obj1 = outerObj.new NonStaticInnerClass();
		obj1.display1();
		
		//Static inner class
		StaticNestedClass.NestedClass objstaticinnerobject = new StaticNestedClass.NestedClass();
		objstaticinnerobject.display1();
		
		
		
	}

}
