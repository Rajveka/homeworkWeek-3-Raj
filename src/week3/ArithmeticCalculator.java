package week3;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Input arithmetic symbol
        System.out.print("Enter arithmetic symbol (+, -, *, /): ");
        char symbol = scanner.next().charAt(0);

        // Perform arithmetic operation based on the symbol
        double result;
        if (symbol == '+') {
            result = num1 + num2;
            System.out.println("Addition: " + result);
        } else if (symbol == '-') {
            result = num1 - num2;
            System.out.println("Subtraction: " + result);
        } else if (symbol == '*') {
            result = num1 * num2;
            System.out.println("Multiplication: " + result);
        } else if (symbol == '/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Division: " + result);
            } else {
                System.out.println("Error: Division by zero!");
            }
        } else {
            System.out.println("Invalid arithmetic symbol!");
        }

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
