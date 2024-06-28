import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        Scanner sc=new Scanner (System.in);
        int digit,rev=0;
        int num=0;
        System.out.println("Enter a number");
        num=sc.nextInt();
        int n1=num;
        while(num>0) {
            digit=num%10;
            rev=rev*10+digit;
            num=num/10;
        }
        if(rev==n1)
        System.out.println("The number is a palindrome="+n1);
        else {
           System.out.println("The numberis not a palindrome="+n1); 
        }
        
    }
}