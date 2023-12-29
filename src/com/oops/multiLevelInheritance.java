package com.oops;

class Bike{
	public void biketstarts () {
		System.out.println("switch on the key to starts bike");
	}
}
class ktm extends Bike{
	public void roadsafety() {
		System.out.println("use helmet for safety WHILE driving Ktm");
	}
}
class Activa extends ktm{
	public void forsafety()
	{
		System.out.println(" DO not use disc break for safety while using activa");
	}
}

public class multiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Activa t=new Activa();
		t.biketstarts ();
       t.roadsafety();
       t.forsafety();
	}

}
