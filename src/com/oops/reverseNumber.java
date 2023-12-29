package com.oops;

public class reverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	 int num=143,rem,rev =0;
	 while (num>0) {
		rem=num%10;
		num=num/10;
		rev= rev*10+rem;
	 }
System.out.println(rev);
	}

}
