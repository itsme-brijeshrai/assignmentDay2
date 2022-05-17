package com.firstApp;
import java.util.Scanner;
public class CricketScore {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1s");
		int a = sc.nextInt();
		System.out.println("Enter 2s");
		int b = sc.nextInt();
		System.out.println("Enter 3s");
		int c = sc.nextInt();
		System.out.println("Enter 4s");
		int d = sc.nextInt();
		System.out.println("Enter 6s");
		int e = sc.nextInt();
		
		int totalScore = a*1 + b*2 + c*3 + d*4 + e*6;
		System.out.println("totalScore is :"+totalScore);
		
	}
}
