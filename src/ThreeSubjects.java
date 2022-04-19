import java.util.Scanner;

public class ThreeSubjects {
    public static void main(String[] args) {
        float total, percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths: ");
        float math = sc.nextFloat();
        System.out.println("Enter the marks of OOP: ");
        float oop = sc.nextFloat();
        System.out.println("Enter the marks of Flutter: " );
        float flutter = sc.nextFloat();
        total = math+oop+flutter;
        percentage = total/100;
        System.out.println("The total marks is: " +total);
        System.out.println("Total percentage is: " +percentage);






    }
}
