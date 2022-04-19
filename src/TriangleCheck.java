import java.util.Scanner;

//Write a JAVA program to check whether the triangle is equilateral, isosceles or scalene triangle.
public class TriangleCheck {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first side of Triangle: ");
        double side1 = sc.nextDouble();
        System.out.println("Enter second side of Triangle: ");
        double side2 = sc.nextDouble();
        System.out.println("Enter third side of Triangle: ");
        double side3 = sc.nextDouble();

        if(side1 == side2 && side2 == side3)
        {
            System.out.println("It is an Equilateral Triangle");
        }
        else if(side1 == side2 || side2 == side3 || side1 == side3)
        {
            System.out.println("It is an Isosceles Triangle");
        }
        else
        {
            System.out.println("It is a Scalene Triangle");
        }
    }
}
