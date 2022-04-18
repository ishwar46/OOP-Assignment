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
