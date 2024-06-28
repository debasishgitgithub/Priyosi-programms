import java.util.Scanner;
public class Workers {
    public static void main (String args[]){
        int emp,d;
        System.out.println("Enter option for category of employee");
        Scanner sc=new Scanner(System.in);
        System.out.println("1.Unskilled");
        System.out.println("2.Semi skilled");
        System.out.println("3.Skilled");
        System.out.println("4.Highly skilled");
        emp=sc.nextInt();
        System.out.println("Enter number of working days");
        d=sc.nextInt();
        switch(emp){
            case 1:
            System.out.println("Total wages="+d*257);
            break;
            case 2:
            System.out.println("Total wages="+d*268);
            break;
            case 3:
            System.out.println("Total wages="+d*324);
            break;
            case 4:
            System.out.println("Total wages="+d*396);
            break;
            default:
            System.out.println("Wrong choice");
        }
    }
}