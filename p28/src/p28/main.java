package p28;

public class main {

	public static void main(String[] args) {
	try {
		validateAge(15);
	}
	catch(InvalidAgeException e) {
		System.out.println("Caught"+e);
	}
}
	public static void validateAge(int age) throws InvalidAgeException{
		if(age < 18){
			throw new InvalidAgeException("Age must be greater than or equal to 18.");
		}
		else {
			System.out.println("Age is valid");
		}
	}
}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}