package com.oops;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int num=121,rev=0,rem,temp=num;
          while(num>0) {
        	  rem= num%10;
        	  num=num/10;
        	  rev=rev*10+rem;
          }
          if (temp==rev) {
        	  System.out.println("palindrome");
          }else {
        	  System.out.println("not palindrome");
          }
	}

}
