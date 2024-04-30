package week3;

import java.util.Scanner;

public class InputTypeIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input value
        System.out.print("Enter a value: ");
        char input = scanner.next().charAt(0);

        // Check if the input is a number, alphabet, or symbol
        if ((input >= '0' && input <= '9')) {
            System.out.println(input + " is a number.");
        } else if ((input >= 'A' && input <= 'Z') || (input >= 'a' && input <= 'z')) {
            System.out.println(input + " is an alphabet.");
        } else {
            System.out.println(input + " is a symbol.");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

