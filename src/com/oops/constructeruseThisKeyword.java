package com.oops;

class a{
	a(){
		System.out.println("default constructor");
	}
	a(int i){
	this();
		System.out.println("parameter constructor");
	}
}



public class constructeruseThisKeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             new a();
             new a(4);
	}

}
