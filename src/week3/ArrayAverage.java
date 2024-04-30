package week3;

public class ArrayAverage {
    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {5, 10, 15, 20, 25};

        // Calculate sum
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Print average
        System.out.println("Average of the array elements: " + average);
    }
}
