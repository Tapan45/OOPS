package com.oops;

class demo{
	int i=10;
}
class memo extends demo
{
	int i=45;
	int j=64;

public void acessdata()
{
System.out.println(super.i);
System.out.println(this.i);
System.out.println(this.j);
}
}

public class superclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		memo tapa=new memo();
tapa.acessdata();
	}

}
