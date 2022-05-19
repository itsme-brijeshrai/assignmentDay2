package com.firstApp;

public class StudentDetail{
	   Student s1 = new Student();
	   
	   StudentDetail(){
		   
	   }
	   StudentDetail(int roll,int age,int marks,String name){
		   s1.StudentDetail(roll,age,marks,name);
	   }
	   
	   public static void main(String[] args) {
		
		   StudentDetail student1 = new StudentDetail();
		   student1.s1.StudentDetail(10, 25, 400, "Anubhav");
		   
		   StudentDetail student2 = new StudentDetail(11, 35, 450, "Briju");
	       
	   }
	}