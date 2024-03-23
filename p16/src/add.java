import java.util.*;
public class add {
	int add(int x, int y) {
		return(x+y);
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for x");
		int x = sc.nextInt();
		System.out.print("Enter the value for y");
		int y = sc.nextInt();
		
		add a = new add();
		int result = a.add(x, y);
		System.out.println("Result: "+result);
	}

}
