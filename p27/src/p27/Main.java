package p27;

public class Main {

	public static void main(String[] args) throws InvalidAgeException {
		InvalidAgeException exception = new InvalidAgeException("Age must be greater than or equal to 18.");
		
		throw exception;
	}

}

class InvalidAgeException extends Exception{
	public InvalidAgeException(String message) {
		super(message);
	}
}