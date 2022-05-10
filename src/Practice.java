import java.util.Scanner;

//Marks of student
public class Practice {
    public static void main(String[] args) {
        float total, percentage;
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        System.out.println("");

        System.out.println("Enter the marks for maths: ");
        int math = sc.nextInt();

        System.out.println("Enter the marks for physics: ");
        int phy = sc.nextInt();

        System.out.println("Enter the marks for programming: ");
        int programming = sc.nextInt();

        System.out.println("Enter the marks for database: ");
        int database = sc.nextInt();

        System.out.println("Enter the marks for database: ");
        int android = sc.nextInt();

        total = (math+phy+programming+database+android);
        percentage = total/5;

        System.out.println("The obtained marks is: " +total);
        System.out.println("The obtained percentage is: " +percentage);


    }
}

//
class CheckNumber{
    public static void main(String[] args) {
        int a = 10;
        if(a==11)
            System.out.println("Iam 11");
        else {
            System.out.println("Iam not 11");
        }
    }
}