import java.util.Scanner ;
public class Series6 {
    public static void main(String args[]){
        System.out.println("Enter a number");
        Scanner sc=new Scanner(System.in);
        int y=sc.nextInt();
        double sum=0;
        for(int i=1;i<=10;i++){
            sum=sum+Math.pow(y,i);
        }
        System.out.println(sum);
    }
}