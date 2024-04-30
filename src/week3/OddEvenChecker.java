package week3;

import java.util.Scanner;

public class OddEvenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even using ternary operator
        String result = (number % 2 == 0) ? "even" : "odd";

        // Print the result
        System.out.println("The input number is " + result);

        // Close the scanner
        scanner.close();
    }
}
