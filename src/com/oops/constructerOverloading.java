package com.oops;

class tapa{
	tapa(){
		System.out.println("default constructer");
	}
	tapa(int a){
		System.out.println("int argument constructer");
	}
	tapa(double a){
		System.out.println("double argument constructer");
	}
}
public class constructerOverloading {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new tapa();
		 new tapa(10.65);
		new tapa (5);

	}

}
