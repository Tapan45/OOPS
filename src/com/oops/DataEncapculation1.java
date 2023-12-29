package com.oops;

 class Employee
 {
	 private int empid;
	 public void setempid(int eid) {
		 empid=eid;
	 } public int getempid() {
		 return empid;
	 }
 }

public class DataEncapculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Employee e=new Employee();
          e.setempid(101);
          System.out.println(e.getempid());
	}

}
