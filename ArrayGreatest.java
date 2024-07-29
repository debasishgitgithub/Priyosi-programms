import java.util.Scanner;
public class ArrayGreatest {
    public static void main(String args[]){
       int a[]={10,20,30,40,50};
       int pos=0;
       int largestnum=a[0];
       for(int i=0;i<5;i++){
           if(largestnum<a[i]){
            pos=i;
            largestnum=a[i];
           }
        }
       System.out.println("Largest number is ="+a[pos]);
    }
    
}