import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter a non-negative integer:");
        int number = scanner.nextInt();
        
        if (number < 0) {
            System.out.println("Number must be non-negative.");
        } else {
            System.out.println("Factorial of " + number + " using iterative method is " + calculateFactorialIterative(number));
            System.out.println("Factorial of " + number + " using recursive method is " + calculateFactorialRecursive(number));
        }

        scanner.close();
    }

    // Iterative method to calculate factorial
    public static long calculateFactorialIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    // Recursive method to calculate factorial
    public static long calculateFactorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorialRecursive(n - 1);
    }
}
