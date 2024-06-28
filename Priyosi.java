import java.util.Scanner;
class Priyosi{
    public static void main(String args[]){
        
        Scanner sc=new Scanner (System.in);
   
        int d[]=new int[3];
        
        for(int i=0;i<3;i++){
            System.out.println("Enter your number");
            d[i]=sc.nextInt();
        }
        
        for(int i=0;i<3;i++){
            System.out.println(d[i]);
        }
        
        
    }
}