import java.util.Scanner;
public class Series2{    
    public static void main(String args[]){
       int n=5;
       int product=1;
       for(int i=1;i<=n;i++){
        product=i+(product*i);   
       }
       System.out.println(product);
       
    }
    }
