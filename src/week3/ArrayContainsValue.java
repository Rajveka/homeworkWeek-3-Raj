package week3;

public class ArrayContainsValue {
    public static void main(String[] args) {
        // Numeric array
        int[] numbers = {5, 10, 15, 20, 25};
        int targetValue = 15;

        // Check if array contains the target value
        boolean containsValue = false;
        for (int number : numbers) {
            if (number == targetValue) {
                containsValue = true;
                break;
            }
        }

        // Print the result
        if (containsValue) {
            System.out.println("The array contains the value " + targetValue);
        } else {
            System.out.println("The array does not contain the value " + targetValue);
        }
    }
}



