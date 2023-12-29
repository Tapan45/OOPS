package com.oops;

class A{
	//void show() {
	Object show () {
		System.out.println("1");
		return null;
	}
}class B extends A{
	//void show() {//
		String show() { // we can write return type as either same or parent class  
		System.out.println("2");
		return null;
	}
}
public class MethodOverriding1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         A a = new A();
         a.show();
         B e = new B ();
         e.show();
	}

}
   // if you create accessmodifire in parent class then you should create same modifire or gretterthan in childclass