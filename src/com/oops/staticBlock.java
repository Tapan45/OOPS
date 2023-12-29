package com.oops;

public class staticBlock {
		static {
		System.out.println("i am exucute 1st");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am 3rd");
	}
	static {
		System.out.println(" i am 2nd");
	}

}
//we should creat main method to exucte 
// but before jdk 1.6 static block can executed without main method
//static block exucute at the time of class loading 
// first execute upper static block,then other static block,then main method
// used to initialize static member