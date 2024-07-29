import java.util.Scanner;
public class ArraySmallest {
    public static void main(String args[]){
       int a[]={50,40,30,20,10};
       int pos=0;
       int smallestnum=a[0];
       for(int i=1;i<5;i++){
           if(smallestnum>a[i]){
            pos=i;
            smallestnum=a[i];
           }
        }
       System.out.println("Smallest number is ="+a[pos]);
    }
    
}