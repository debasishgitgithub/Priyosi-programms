import java.util.Scanner;
public class Season {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to print the season");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            case 10:
            case 11:
            case 12:
            System.out.println("Winter");
            break;
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Summer");
            break;
            case 6:
            case 7:
            case 8:
            case 9:
            System.out.println("Monsoon");
            break;
            default:
            System.out.println("Wrong input");
        }
    }
}