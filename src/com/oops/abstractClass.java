package com.oops;

abstract class vehicle{
	abstract void start();
}
class car extends vehicle{
	 void start() {
		System.out.println("car starts with key");
	}
}
class scooter extends car{
	void start() {
		System.out.println("scooter starts with kick");
	}
}
public class abstractClass {
public static void main(String[] args) {
		// TODO Auto-generated method stub
        car c= new car();
        c.start();
        scooter sc= new scooter();
        sc.start();
	}

}
// abstract class is mandotory
// a method which  has no body is know as abstract method
// if a class extends abstract class then it is mandotory to create that method which one is write in abstract class
// we can not create abstract class
//