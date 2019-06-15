package com.indrasish.tutorial.passbyvalue;

class ObjectClass{
	int x=10;
	ObjectClass(){
		x=0;
	}
	ObjectClass(int y){
		x=y;
	}
}

public class ObjectType {
	
	public static void main(String[] args) {
	
		ObjectClass  obj = new ObjectClass(200);
		
		manipulate(obj);
		
		System.out.println(obj.x);
		
	}

	private static void manipulate(ObjectClass obj) {

		obj = new ObjectClass();
		
		obj.x = 100;
		
	}
	
	
}
