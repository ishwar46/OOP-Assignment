/*Write a program to calculate the total marks of four subjects of a student and the total
        percentage secured. And use following conditions to generate the final result;
        a. If equal to or more than 70 -> First Class
        b. If more than 59 -> Upper second Class
        c. If more than 49 -> Second class
d. If more than 39 -> Third class and if below than 40 the result is fail*/
import java.util.Scanner;

public class Results {
    public static void main(String args[])
    {
        float progammming, database, android, math, communication;
        double total, average, percentage;
        Scanner std=new Scanner(System.in);

        System.out.print("Enter marks of progammming :");
        progammming=std.nextFloat();
        System.out.print("Enter marks of database :");
        database=std.nextFloat();
        System.out.print("Enter marks of android :");
        android=std.nextFloat();
        System.out.print("Enter marks of maths :");
        math=std.nextFloat();
        System.out.print("Enter marks of communication :");
        communication=std.nextFloat();

        total = progammming + database + android + math + communication;
        average = (total / 5.0);
        percentage = (total / 500.0) * 100;


        System.out.println("Total marks ="+total);
        System.out.println("Average marks = "+average);
        System.out.println("Percentage = "+percentage);
        if (percentage >= 70) {
            System.out.println("First Class Class");
        } else if (percentage <= 59) {
            System.out.println("Upper Second Class");
        } else if(percentage <=49 ){
            System.out.println("Second Class");
        }
        else {

            System.out.println("Third Class");
        }
    }
}
