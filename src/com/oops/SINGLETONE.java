package com.oops;

class A{
	static A t = null;
	static int count;
	private A() {
		count++;
	}
//	factory method
	public static A getInstance (){
		if (t==null)t=new A();
		return t;
	}
}
public class SINGLETONE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1= A.getInstance();
		A a2= A.getInstance();
				A a3= A.getInstance();
				System.out.println( a1==a2);
				System.out.println(a2==a3)
				;
				System.out.println(a1==a3);
				System.out.println("object="+A.count);

	}

}
