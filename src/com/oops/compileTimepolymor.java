package com.oops;

class A{
	
	void show () {
		System.out.println("1");
	}
	void show(int a,int b) {
		System.out.println("2");
	}
}
public class compileTimepolymor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          A tapa = new A();
          tapa.show();
          tapa.show(10,20);
	}

}
