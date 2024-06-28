import java.util.Scanner;

public class Triangle {
     public static void main(String args[]) {
          Scanner sc = new Scanner(System.in);
          int a = sc.nextInt();
          int b = sc.nextInt();
          int c = sc.nextInt();

          System.out.println("Enter three sides of a triangle");
          if (a == b && b == c && a == c) {
               System.out.println("It is an equilateral triangle");
          } else if (a == b || b == c || a == c) {
               System.out.println("It is an isosceles triangle");
          } else {
               System.out.println("It is a scalene triangle");
          }

     }
}
