package week3;

public class DivisibleByThreeAndFive {
    public static void main(String[] args) {
        System.out.println("Numbers between 1 to 100 divisible by 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nNumbers between 1 to 100 divisible by 5:");
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
