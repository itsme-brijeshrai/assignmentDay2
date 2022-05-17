package com.firstApp;

public class Switch{
	public static void main(String[] args) {
		String city = 	"Bangalore";
		switch(city){

			case "Mumbai":
			System.out.println("Financial city");
			break;

			case "Kolkata":
			System.out.println("City of joy");
			break;

			case "Delhi":
			System.out.println("Capital of the country");
			break;

			case "Bangalore":
			System.out.println("Cyber City");
			break;

			default:
			System.out.println("May be other Indian City");
			break;
		}
	}
}