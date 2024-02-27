package p3;
import java.util.Scanner;
public class gl {public static void main(String[] args) {
	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter the first number: ");
	int a = scan.nextInt();
	
	System.out.println("Enter the second number: ");
	int b = scan.nextInt();
	System.out.println("Enter the third number: ");
	int c = scan.nextInt();
	
	int max = a;
    if (b > max) {
        max = b;
    }

    if (c > max) {
        max = c;
    }
    
   
    

    System.out.println("Greatest value :" + max);
    
    
    
    
    
	scan.close();	
		
	}


}
