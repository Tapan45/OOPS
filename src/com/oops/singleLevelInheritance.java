package com.oops;

class colour{
	public void m1()
	{
		System.out.println("m1 calling");
	}
}
class Red extends colour{
	public void m2() {
	System.out.println("m2 calling");
	}	
}

public class singleLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           Red r=new Red();
           r.m1();
           r.m2();
           
	}

}
