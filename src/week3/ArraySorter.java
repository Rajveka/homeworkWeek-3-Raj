package week3;

import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {
        // Numeric array
        int[] numericArray = {5, 2, 9, 1, 6};
        System.out.println("Original numeric array: " + Arrays.toString(numericArray));
        Arrays.sort(numericArray);
        System.out.println("Sorted numeric array: " + Arrays.toString(numericArray));

        // String array
        String[] stringArray = {"banana", "apple", "orange", "grape", "pineapple"};
        System.out.println("\nOriginal string array: " + Arrays.toString(stringArray));
        Arrays.sort(stringArray);
        System.out.println("Sorted string array: " + Arrays.toString(stringArray));
    }
}
