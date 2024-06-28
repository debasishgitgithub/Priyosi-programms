
import java.util.Scanner;

public class FactorialSeries {
    // Function to calculate factorial
    static int factorial(int n) {
        if (n == 0)
            return 1;
        else
            return (n * factorial(n - 1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int sum = 0;

        System.out.print("The series is: ");
        for (int i = 1; i <= n; i++) {
            // Calculate factorial for each term
            int fact = factorial(i);
            System.out.print(fact);
            if (i < n) {
                System.out.print(" + ");
            }
            // Summing up the factorial terms
            sum += fact;
        }
        System.out.println();
        System.out.println("Sum of the series: " + sum);

        scanner.close();
    }
}

