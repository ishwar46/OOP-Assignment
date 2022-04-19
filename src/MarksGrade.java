/*Write a JAVA program to input marks of five subjects Physics, Chemistry, Biology,
        Mathematics and Computer. Calculate percentage and grade according to following:
        Percentage >= 90% : Grade A
        Percentage >= 80% : Grade B
        Percentage >= 70% : Grade C
        Percentage >= 60% : Grade D
        Percentage >= 40% : Grade E
        Percentage < 40% : Grade F*/
import java.util.Scanner;

public class MarksGrade {
    public static void main(String[] args) {
        float total,percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics: ");
        float Physics = sc.nextFloat();
        System.out.println("Enter the marks of Chemistry: ");
        float Chemistry = sc.nextFloat();
        System.out.println("Enter the marks of Biology: ");
        float Biology = sc.nextFloat();
        System.out.println("Enter the marks of Mathematics: ");
        float Mathematics = sc.nextFloat();
        System.out.println("Enter the marks of Computer: ");
        float Computer = sc.nextFloat();

        total = (Physics+Chemistry+Biology+Mathematics+Computer);
        System.out.println("Total Obtained marks is: " +total);

        percentage = (total)/5;
        System.out.println("Obtained Percentage is: " +percentage);

        if(percentage >= 90)
        {
            System.out.println("Grade A");
        }
        else if(percentage >= 80)
        {
            System.out.println("Grade B");
        }
        else if(percentage >= 70)
        {
            System.out.println("Grade C");
        }
        else if(percentage >= 60)
        {
            System.out.println("Grade D");
        }
        else if(percentage >= 40)
        {
            System.out.println("Grade E");
        }
        else
        {
            System.out.println("Grade F");
        }
    }
}
