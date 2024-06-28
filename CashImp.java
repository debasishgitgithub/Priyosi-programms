import java.util.Scanner;
public class CashImp{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        double sales=sc.nextDouble();
        double comm=0;
        
        if(sales <= 1000){
            comm=0;
        } else if(sales >= 1001 && sales < 3001){
            comm = sales * (5.0/100);
            
        }
        else if(sales >= 3001 && sales <= 5000){
            comm = sales *(10.0/100);
            
        }
        else if(sales > 5000){
            comm = sales *(15.0/100);
        }
        
        System.out.println("commission : " + comm);
        System.out.println("sales : " + sales);
    }
}