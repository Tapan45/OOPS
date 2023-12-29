package com.oops;
class A{
   static int count ;
   private A() {
	   count ++;
   }

// factory method 
   public static A getInstance ()
   {
	  
	   return new A ();
   }

public static A getInstance() {
	// TODO Auto-generated method stub
	return null;
}
}
public class privateConstructer {
	public static void main(String[] args) {
		A a1= A.getInstance ();
		A a2= A.getInstance ();
		A a3= A.getInstance ();

		System.out.println(a1==a2);
		System.out.println(a2==a3);
		System.out.println(a3==a1);
	}

}
