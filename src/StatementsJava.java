//Using if condition
import java.util.Scanner;

public class StatementsJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = sc.nextInt();
        if(age<18){
            System.out.println("Your are not eligible to vote");
        }else if(age>18) {
            System.out.println("You can vote");
        }
    }
}

class Marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks");
        double marks = sc.nextDouble();
        if(marks>50){
            System.out.println("Very Good");
        }
        else{
            System.out.println("Bad");
        }
    }
}

class Results {
    public static void main(String args[]) {
        float progammming, database, android, math, communication;
        double total, average, percentage;
        Scanner std = new Scanner(System.in);

        System.out.print("Enter marks of progammming :");
        progammming = std.nextFloat();
        System.out.print("Enter marks of database :");
        database = std.nextFloat();
        System.out.print("Enter marks of android :");
        android = std.nextFloat();
        System.out.print("Enter marks of maths :");
        math = std.nextFloat();
        System.out.print("Enter marks of communication :");
        communication = std.nextFloat();

        total = progammming + database + android + math + communication;
        average = (total / 5.0);
        percentage = (total / 500.0) * 100;


        System.out.println("Total marks =" + total);
        System.out.println("Average marks = " + average);
        System.out.println("Percentage = " + percentage);
        if (percentage >=70) {
            System.out.println("First Class Class");
        } else if (percentage <69 && percentage>=60) {
            System.out.println("Upper Second Class");
        } else if (percentage <59 && percentage>=50) {
            System.out.println("Second Class");
        } else if (percentage <39 && percentage>=30) {
            System.out.println("Third Class");
        }
        else {
            System.out.println("Fail");
        }
    }
}

class NewVoting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        boolean votercard = false;
        int age = sc.nextInt();
        if (age >18)
        {
            //System.out.println("You can vote");
            if (votercard == true)
            {
                System.out.println("You can vote");
            }
        }
    }
}

//Multiple id else
