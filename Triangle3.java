import java.util.Scanner;
public class Triangle3{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.println("Menu:");
     System.out.println("1 for equilateral triangle:");
     System.out.println("2 for right- angled triangle:");
     System.out.println("3 for scalene triangle:");
     int choice=sc.nextInt();
     switch(choice){
         case 1:
        System.out.println("Enter the side length of the equilateral triangle: ");
        double side = sc.nextDouble();
        double equilateralArea =(Math.pow(3,0.5)/4)* (side*side);
        System.out.println("The area of the equilateral triangle is: " + equilateralArea);
        break;
        case 2:
         System.out.println("Enter the base length of the right-angled triangle: ");
        double base = sc.nextDouble();
        System.out.print("Enter the height of the right-angled triangle: ");
        double height = sc.nextDouble();
        double rightAngledArea = (base * height) / 2;
        System.out.println("The area of the right-angled triangle is:"+rightAngledArea);
        break;
        case 3:
        System.out.println("Enter the all sides of the scalene triangle");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double s=(a+b+c)/2;
        double scaleneArea=Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
        break;
        default:
        System.out.println("Invalid choice");
    } 
}

    
}