
import java.util.Scanner;
public class Rise {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your first number");
        
        double p= sc.nextInt();//p is the first number
        System.out.println("Enter your second number");
        double a=sc.nextInt();// a is the second number
        double quotient=p/a;
        double reminder=p%a;
        
        System.out.println("Quotient is="+quotient);
        System.out.println("Reminder is="+reminder);
            
    }
    }
    

