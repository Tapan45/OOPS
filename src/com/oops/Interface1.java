package com.oops;
 interface Interface1 {
   void show();//public abstarct 
}
 interface Interface2{
	 void display();
 }
class test implements Interface1,Interface2{
	public void show () {
		System.out.println(" tapa");
	}
	public void display() {//we should override display meyhod
		System.out.println("tapu");
	}
	public static void main(String[]args) {
		test t= new test();
		t.show();
		t.display();
	}
	
}