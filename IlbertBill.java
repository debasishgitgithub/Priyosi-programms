import java.util.Scanner;
public class IlbertBill {
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      double purchase=sc.nextDouble();
      double discount=0;
          if(purchase<=1000){
          discount=0 ;
        }else if(purchase>=1001 && purchase<=5000){
           discount=purchase*(5.0/100);  
        }else {
            discount=purchase*(10.0/100);
            
        }
        
        System.out.println("dicount is"+discount);
         System.out.println("purchase is"+purchase);
        System.out.println("final bill is "+(purchase - discount));
      }
    }
