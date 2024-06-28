 import java.util.Scanner;
 class Himadri {
     public static String address="Labpur";
     public static int max (int a,int b){/* formal parameter*/
         if (a>b){
           // System.out.println("a is greater"); 
           return a;
         }
         else {
           //  System.out.println("b is greater");
           return b;
         }
     }
     
     public static void main(String args[]){
      System.out.println(max(10,19));
      
        
     }
 }