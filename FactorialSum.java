import java.util.Scanner;
public class FactorialSum {
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

        for (int i = 1; i <= n; i++) {
            // Calculate factorial for each term and add it to the sum
            sum += factorial(i);
        }

        System.out.println("Sum of the series: " + sum);

        scanner.close();
    }
}
