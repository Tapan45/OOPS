package com.oops;

class student{
	private int id;
	private String name;
	private int age;
public  int getId()	{
	return id;
}
public  void setId(int id)	{
	this.id=id;
}
public  String getName() {
	return name;
}

public  void setname(String name) {
	this.name=name;
}

public  int getAge()
{
	return age;
}
public  void setage(int age) {
	this.age=age;
}
public class DataEncapculation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
          student s=new student();
          System.out.println(s.getId());
          s.setId(2);
//          System.out.println(s.setId());
	}
	}}


