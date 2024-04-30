package week3;

import java.util.Scanner;

public class CityNamePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);

        // Determine city name
        String cityName;
        if (alphabet == 'A' || alphabet == 'a') {
            cityName = "Atlanta";
        } else if (alphabet == 'B' || alphabet == 'b') {
            cityName = "Boston";
        } else if (alphabet == 'C' || alphabet == 'c') {
            cityName = "Chicago";
        } else if (alphabet == 'D' || alphabet == 'd') {
            cityName = "Dallas";
        } else if (alphabet == 'E' || alphabet == 'e') {
            cityName = "El Paso";
        } else if (alphabet == 'F' || alphabet == 'f') {
            cityName = "Fort Worth";
        } else {
            cityName = "Invalid entry";
        }

        // Print the result
        System.out.println("City Name: " + cityName);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
