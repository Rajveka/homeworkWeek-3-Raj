package week3;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("The entered number is POSITIVE.");
        } else if (number < 0) {
            System.out.println("The entered number is NEGATIVE.");
        } else {
            System.out.println("The entered number is ZERO.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

