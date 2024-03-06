package p7;

import java.util.*;

public class celcius {
	public static void main(String[] args) {
		System.out.println("Enter the value in fahrenheit: ");
		Scanner scan = new Scanner(System.in);
		double fahrenheit = scan.nextInt();
		
		double celcius = (fahrenheit - 32)/1.8;
		System.out.println("The value in celcius: " + celcius);
		
		
		scan.close();
		
		
		
		
	}
	

}
