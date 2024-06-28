import java.util.Scanner;
public class Series1 {
    public static void main(String args[]) {
        System.out.println("Enter number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();;
        double sum=0.0;
        for(int i=1;i<=n;i++){
         int factorial=1; 
         for(int j=1;j<=i;j++){
          factorial=factorial*j;   
         }
         sum+=factorial;
        }
        System.out.println("sum is="+sum);
        
    }
}