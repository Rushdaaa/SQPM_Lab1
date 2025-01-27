package com.ontariotechu.sofe3980U;

// Importing the Scanner class for user input
import java.util.Scanner;

/**
 * The main application class that demonstrates the functionality of the Binary class.
 * It allows the user to input two binary numbers and perform bitwise OR, AND, and multiplication operations.
 */
public class App {
    public static void main(String[] args) {
        // Creating a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompting the user to enter the first binary number
        System.out.println("Enter the first binary number:");
        String bin1 = scanner.nextLine(); // Reading the first binary number as a string

        // Prompting the user to enter the second binary number
        System.out.println("Enter the second binary number:");
        String bin2 = scanner.nextLine(); // Reading the second binary number as a string

        // Creating Binary objects from the user-provided binary strings
        Binary binary1 = new Binary(bin1); // The first binary number wrapped in a Binary object
        Binary binary2 = new Binary(bin2); // The second binary number wrapped in a Binary object

        // Performing a bitwise OR operation on the two Binary objects
        Binary orResult = Binary.or(binary1, binary2);

        // Performing a bitwise AND operation on the two Binary objects
        Binary andResult = Binary.and(binary1, binary2);

        // Performing a multiplication operation on the two Binary objects
        Binary multiplyResult = Binary.multiply(binary1, binary2);

        // Displaying the results of the OR operation
        System.out.println("OR Result: " + orResult.getValue());
        // Displaying the results of the AND operation
        System.out.println("AND Result: " + andResult.getValue());
        // Displaying the results of the multiplication operation
        System.out.println("Multiply Result: " + multiplyResult.getValue());

        // Closing the scanner to release resources
        scanner.close();
    }
}
