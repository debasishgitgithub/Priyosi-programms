import java.util.Scanner;
public class Terms {
    public static void main (String[] args){
        int n=10;
        int sum=0;
        for(int i=1;i<=n;i++){
            int total=i+(i+1);
            sum=sum+total;
            System.out.println(i+" "+" "+(i+1));
        }
        System.out.println("Sum is="+sum);
    }
}