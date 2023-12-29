package com.oops;

class color
{
	public void draw()
	{
		System.out.println("drawing is use for sketch");
	}
}
 class red extends color{
	 public void draw() {
		 System.out.println("drawing is use for compittion");
	 
 }
public void accessdata()
{
	super.draw();
	this.draw();
}
}
public class superWithMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          red tapu=new red();
          tapu.accessdata();
	}

}
