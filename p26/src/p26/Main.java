package p26;

public class Main {

	public static void main(String[] args) {
		int[] arr = {1,2,3};
		
		try {
			int value = arr[4];
			System.out.println("Value: "+ value);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("An error occured: "+ e);
		}

	}

}
