package p9;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a,b;
		
		System.out.println("Enter the first no: ");
		a=sc.nextDouble();
		System.out.println("Enter the second no: ");
		b=sc.nextDouble();
		if(a == b){
		    System.out.println("They are same.");
		     
		}
		else{
		    System.out.println("The numbers are different.");
		}
    }
}
