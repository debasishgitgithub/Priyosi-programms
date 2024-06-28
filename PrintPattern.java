public class PrintPattern {
    public static void main(String[] args) {
                int n = 4; 
// The number of lines in the pattern
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
