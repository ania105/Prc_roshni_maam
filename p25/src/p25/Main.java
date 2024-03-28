package p25;

public class Main {

	public static void main(String[] args) {
		try {
			int num1, num2,result;
			num1 = 7;
			num2 = 0;
			result = num1/num2;
			System.out.println("Result: "+ result);	
			}
		
		
		catch(ArithmeticException e) {
			System.out.println("An error occured: "+ e);
		}

	}

}
