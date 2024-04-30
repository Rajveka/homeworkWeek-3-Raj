package week3;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sales details
        System.out.print("Enter sales ID: ");
        int salesId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter seller's name: ");
        String sellerName = scanner.nextLine();
        System.out.print("Enter sales amount: ");
        double salesAmount = scanner.nextDouble();
        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate commission
        double commissionRate;
        if (salesAmount >= 50000) {
            commissionRate = 0.35;
        } else if (salesAmount >= 30000) {
            commissionRate = 0.20;
        } else if (salesAmount >= 20000) {
            commissionRate = 0.10;
        } else if (salesAmount >= 10000) {
            commissionRate = 0.05;
        } else {
            commissionRate = 0.02;
        }

        double commission = salesAmount * commissionRate;
        double totalSalary = basicSalary + commission;

        // Print results
        System.out.println("\nSales ID: " + salesId);
        System.out.println("Seller's Name: " + sellerName);
        System.out.println("Sales Amount: $" + salesAmount);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Commission Rate: " + (commissionRate * 100) + "%");
        System.out.println("Commission: $" + commission);
        System.out.println("Total Salary: $" + totalSalary);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}

