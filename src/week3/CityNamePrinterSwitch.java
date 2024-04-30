package week3;

import java.util.Scanner;

public class CityNamePrinterSwitch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input alphabet
        System.out.print("Enter an alphabet from A to F: ");
        char alphabet = scanner.next().charAt(0);

        // Determine city name using switch statement
        String cityName;
        switch (alphabet) {
            case 'A':
            case 'a':
                cityName = "Atlanta";
                break;
            case 'B':
            case 'b':
                cityName = "Boston";
                break;
            case 'C':
            case 'c':
                cityName = "Chicago";
                break;
            case 'D':
            case 'd':
                cityName = "Dallas";
                break;
            case 'E':
            case 'e':
                cityName = "El Paso";
                break;
            case 'F':
            case 'f':
                cityName = "Fort Worth";
                break;
            default:
                cityName = "Invalid entry";
        }

        // Print the result
        System.out.println("City Name: " + cityName);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

