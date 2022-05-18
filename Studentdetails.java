package com.firstApp;
	
public class Studentdetails {
	int roll;
	String name;
	int marks;
	public static void main(String[] args) {
		Studentdetails student1 = new Studentdetails();
		Studentdetails student2 = new Studentdetails();
		
		student1.name = "Brijesh";
		student1.roll = 101;
		student1.marks = 43;
		
		student2.name = "Anubhav";
		student2.roll = 141;
		student2.marks = 33;
		
		System.out.println(student1.name + " whose roll number is " + student1.roll + " got " + student1.marks + " marks");
		System.out.println(student2.name + " whose roll number is " + student2.roll + " got " + student2.marks + " marks");
		
		student1 = null;
		student2 = null;
		
		System.out.println(student1);
		System.out.println(student2);
		
	}
}
