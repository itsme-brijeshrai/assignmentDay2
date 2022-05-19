package com.firstApp;

public class Demo2 {

	   Demo2(){
		   System.out.println("This is the Demo() constructor");
	   }
	   
	   Demo2(String s)
	   {
		   System.out.println("This is the Demo(String s) constructor");
	   }
	   
	   Demo2(int i)
	   {
		   System.out.println("This is the Demo(int i) constructor");
	   }
	   
	   Demo2(float f)
	   {
		   System.out.println("This is the Demo(float f) constructor");
	   }
	   
	   public static void main(String[] args) {

		   Demo2 d1 = new Demo2(10.5f);
		    
		   
		}
	}