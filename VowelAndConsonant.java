package com.firstApp;
public class VowelAndConsonant {
	void findVowelOrNot(char ch) {
		if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U') {
			System.out.println("Entered character " + ch + " is Vowel");
		}
		else if((ch>='a' && ch<='z')|| (ch>='A' && ch<='Z')) {
			System.out.println("Entered character " + ch + " is Consonent");
		}else {
			System.out.println("Not an alphabet");
		}
	}
	public static void main(String[] args) {
		VowelAndConsonant c = new VowelAndConsonant();
		c.findVowelOrNot('a');
		c.findVowelOrNot('A');
		c.findVowelOrNot('&');
				
	}
	
}
