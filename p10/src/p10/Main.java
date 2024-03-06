package p10;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a single character from the Alphabet: ");
        String input = scanner.next();

        if (input.length() > 1) {
            System.out.println("Error: Please enter a single character.");
        } else {
            char letter = input.charAt(0);
            if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z')) {
                letter = Character.toLowerCase(letter);
                if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                    System.out.println("Vowel");
                } else {
                    System.out.println("Consonant");
                }
            } else {
                System.out.println("Error: Please enter a valid alphabetical character.");
            }
        }

        scanner.close();
    }
}
