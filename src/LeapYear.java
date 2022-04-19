//Write a JAVA program to check whether a year is leap year or not.

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year to check if it is Leap Year or not: ");
        int year = sc.nextInt();

        if(((year % 4 == 0) && (year % 100!=0)) || (year % 400 == 0)){
            System.out.println("Entered year " +year+ " is a LeapYear");
        }
        else{
            System.out.println("Entered number " +year+ " is not a leapyear");
        }
    }
}
