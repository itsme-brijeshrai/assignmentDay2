package com.firstApp;
import java.util.Scanner;
public class CheckWeather {
	public static void main(String[] args){
		boolean isSnowing = false;
		boolean isRaining = true;
		double temperature = 50.0;
		
		String weather = "sunny";
		if(weather == "raining") {
			isRaining = true;
			System.out.println("Let's stay home");
		}
		else if (weather == "snowing") {
			isSnowing = true;
			System.out.println("Let's stay home");
		}
		else if (temperature <50) {
			System.out.println("Let's stay home");
		}else {
			System.out.println("Let's go out!");
		}
	}	
}
