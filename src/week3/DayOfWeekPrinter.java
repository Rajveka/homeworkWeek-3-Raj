package week3;

import java.util.Scanner;

public class DayOfWeekPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number between 1 to 7
        System.out.print("Enter a number between 1 to 7: ");
        int dayNumber = scanner.nextInt();

        // Print the corresponding day of the week
        String dayName;
        switch (dayNumber) {
            case 1:
                dayName = "MONDAY";
                break;
            case 2:
                dayName = "TUESDAY";
                break;
            case 3:
                dayName = "WEDNESDAY";
                break;
            case 4:
                dayName = "THURSDAY";
                break;
            case 5:
                dayName = "FRIDAY";
                break;
            case 6:
                dayName = "SATURDAY";
                break;
            case 7:
                dayName = "SUNDAY";
                break;
            default:
                dayName = "Week contains 1 to 7 days";
        }

        // Print the result
        System.out.println("Day of the week: " + dayName);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

