import java.util.Scanner;
public class Circle{
    public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      int choice;
     System.out.println("1:Area of the circle ");
     System.out.println("2:Area of the Square");
     System.out.println("3:Area of the Rectangle");
     System.out.println("Enter a number from 1 to 3");
     choice =sc.nextInt();
     switch (choice){
         case 1:
         float radius;
         double pi=3.14,area;
         System.out.println("Enter radius");
         radius=sc.nextFloat();
         area=pi*radius*radius;
         System.out.println("Enter the area of the circle="+area);
         break;
         case 2:
        int side_area1,side_area;
        System.out.println("Enter side:");
        side_area1=sc.nextInt();
        side_area=side_area1*side_area1;
        System.out.println("The area of the square is="+side_area);
        break;
        case 3:
        int length,breadth_area;
        System.out.println("Enter length and breadth");
        length=sc.nextInt();
        breadth_area=sc.nextInt();
        area=length*breadth_area;
        System.out.println("The area of the rectangle is="+area);
        break;
        default:
        System.out.println("Wrong input");
        
     }
     
    }
    
     
     
}