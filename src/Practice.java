import java.net.Socket;
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

class StdMarks{
    public static void main(String[] args) {
        float progamming;
        float database;
        float android;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you marks in Progamming: ");
        progamming = sc.nextFloat();
        System.out.println("Enter you marks in database: ");
        database = sc.nextFloat();
        System.out.println("Enter you marks in android: ");
        android = sc.nextFloat();

        float avg = (progamming + database + android)/3.0f;
        System.out.println("Average Marks is: " +avg);
        if(avg>=40 && progamming >=33 && database >=33 && android >=33){
            System.out.println("Congratulations, You have passed.");
        }
        else {
            System.out.println("Sorry, you have failed!");
        }

    }
}

class GovTax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float tax = 0;
        float income = sc.nextFloat();
        if(income<=2.5){
            tax = tax + 0;
        }
        else if(income>2.5f && income <= 5f){
            tax = tax + 0.05f * (income - 2.5f);
        }
        else if(income>5f && income <= 10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (income - 5f);
        }
        else if(income>10.0f){
            tax = tax + 0.05f * (5.0f - 2.5f);
            tax = tax + 0.2f * (10.0f - 5f);
            tax = tax + 0.3f * (income - 10.0f);
        }

        System.out.println("The total tax paid by the employee is: " + tax);
    }
}

//Find out the day of the week 1 for Sunday to 7 for Saturday

class DaysWeek{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of day: ");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid!!");
        }
    }
}