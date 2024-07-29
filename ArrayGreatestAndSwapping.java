import java.util.Scanner;
public class ArrayGreatestAndSwapping {
    public static void main(String args[]){
       int a[]={50,10,20,30,40};
       int pos=0;
       int largestnum=a[0];
       for(int i=0;i<5;i++){
           
           if(largestnum<a[i]){
            pos=i;
            largestnum=a[i];
           }
        }
        a[pos]=a[0];
        a[0]=largestnum;
        for(int i=0;i<5;i++){
            System.out.println(a[i]);
        }
       System.out.println("Largest number is ="+a[pos]);
    }
    
}