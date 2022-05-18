package com.firstApp;

public class StaticNonStatic {
		//Every method in java defaults to a non-static method without static keyword preceding it. Non-static methods can access any static method
		//and static variable, without creating an instance of the object.
		int n; 
		int y;
	public static void main(String[] args) {
		//A static method is a method that belongs to a class, but it does not belong to an instance of that class
		//and this method can be called without the instance or object of that class.
		//Here we are taking static data 
		int number = 1;
		int totalSum = number * (number+1)/2;
		System.out.println("total sum is(static method)- "+ totalSum);
		
		//this is the way we take non-static data, in the form of object.
		StaticNonStatic obj1 = new StaticNonStatic();
		obj1.n = 10;
		obj1.y = 20;
		
		StaticNonStatic obj2 = new StaticNonStatic();
		obj2.n = 10;
		obj2.y = 11;
		
		System.out.println(obj1.n + obj1.y);
		System.out.println(obj2.n * obj2.y);

	}

}
