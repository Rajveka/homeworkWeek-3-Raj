package week3;

/**
 * Write a java program that tells us that Input number is odd or even?
 */

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is odd or even
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
