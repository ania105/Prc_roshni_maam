package p5;
import java.util.*;
public class oddEven {
	
	public static void main(String[] args) {
	int a;
	System.out.println("Enter a value: ");
	Scanner scan = new Scanner(System.in);
	a=scan.nextInt();
	
	if (a%2==0) {
		System.out.println("The number is even...");
	}
	else {
		System.out.println("The number is odd...");
		
	}
	
	scan.close();
	

}

}
