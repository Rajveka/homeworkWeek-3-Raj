package week3;

public class ArraySum {
    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {5, 10, 15, 20, 25};

        // Calculate sum
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Print sum
        System.out.println("Sum of the array elements: " + sum);
    }
}
