package p7;

import java.util.*;

public class celcius {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the conversion: ");
		System.out.println("1. Fahrenheit to celcius");
		System.out.println("2. Celcius to fahrenheit");
		
		int choice = sc.nextInt();
		
		if (choice==1) { 
		System.out.println("Enter the value in fahrenheit: ");
	
		double fahrenheit = sc.nextInt();
		
		double celcius = ((fahrenheit - 32)* 5)/9;
		System.out.println("The value in celcius: " + celcius);
		}
		else if(choice == 2) {
			System.out.println("Enter the value in Celcius: ");
			double celcius = sc.nextInt();
			double fahrenheit = ((celcius * 9)/5)+ 32;
			System.out.println("The value in Fahrenheit is : "+ fahrenheit);
		}
		else {
			System.out.println("Invalid Choice. ");
		}
		
		sc.close();
		
		
		
		
	}
	

}
