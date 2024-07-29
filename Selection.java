import java.util.Scanner;
public class Selection {
    public static void main(String args[]){
        int a[]={5,7,3,9,1};
        int n=a.length;
        System.out.println("Unsorted array");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
        }
            for (int i=0;i<n-1;i++){
              int pos=i;
              int snum=a[i];
              for(int j=i+1;j<n;j++)
              if(snum>a[j]) {
                  pos=j;
                 snum=a[j];
              }
                  a[pos]=a[i];
                  a[i]=snum;
            
            }
            
        System.out.println("sorted array");
        for (int i=0;i<n;i++){
            System.out.println(a[i]);
            
        }
    }
 
}