import java.util.Scanner;

public class Largest {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        int a=sc.nextInt();
        System.out.println("Enter your second number");
        int b=sc.nextInt();
        System.out.println("Enter your third number");
        int c=sc.nextInt();{
         if(a>b&&a>c)
         System.out.println("A is greatest");
         else {
         if(b>a&&b>c) {
         System.out.println("B is greatest");  
             }
         else
         System.out.println("C is greatest");
         }
         
         
        }
        
        
    }
}
