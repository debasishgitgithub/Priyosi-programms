import java.util.Scanner;

class Investment {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your amount invested");
    int p = sc.nextInt();
    System.out.println("Enter the  number of years");
    int n = sc.nextInt();
    double r = 0;// here r means rate of interest and the default value is 0
    if (n == 1) {
      r = 8;

    } else if (n == 2) {
      r = 8.5;
    } else if (n == 3) {
      r = 9;
    } else {
      System.out.println("Invalid year");
    }
    double a = p * Math.pow((1 + r / 100), n);// a is the amount due
    System.out.println(a);
  }
}
