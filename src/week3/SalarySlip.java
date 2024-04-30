package week3;

import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to input employee details
        System.out.print("Enter Employee Id: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Employee Name: ");
        String empName = scanner.nextLine();
        System.out.print("Enter Basic Salary: ");
        double basicSalary = scanner.nextDouble();

        // Calculate allowances and deductions
        double hra = 0.10 * basicSalary;
        double ta = 0.08 * basicSalary;
        double da = 0.09 * basicSalary;
        double pf = 0.20 * basicSalary;

        // Calculate gross salary
        double grossSalary = basicSalary + hra + ta + da - pf;

        // Print salary slip
        System.out.println("_______________________________");
        System.out.println("| Salary Slip                 |");
        System.out.println("|_____________________________|");
        System.out.println("| Employee Id   : " + empId);
        System.out.println("| Employee Name : " + empName);
        System.out.println("|_____________________________|");
        System.out.println("| Basic Salary  : " + basicSalary);
        System.out.println("| HRA 10%       : " + hra);
        System.out.println("| TA 8%         : " + ta);
        System.out.println("| DA 9%         : " + da);
        System.out.println("| PF - 20%      : " + pf);
        System.out.println("|_____________________________|");
        System.out.println("| Gross Salary  : " + grossSalary);
        System.out.println("|=============================|");

        // Close the scanner
        scanner.close();
    }
}

