import java.util.Scanner;

public class MonthDays {
    public static void main(String[] args)
    {
        int month;
        Scanner p=new Scanner(System.in);

        System.out.print("Enter month number 1 to 12: ");
        month=p.nextInt();
        if(month == 1)
        {
            System.out.println("JANUARY 31 days");
        }
        else if(month == 2)
        {
            System.out.println("FEBRUARY 28 or 29 days");
        }
        else if(month == 3)
        {
            System.out.println("MARCH 31 days");
        }
        else if(month == 4)
        {
            System.out.println("APRIL 30 days");
        }
        else if(month == 5)
        {
            System.out.println("MAY 31 days");
        }
        else if(month == 6)
        {
            System.out.println("JUNE 30 days");
        }
        else if(month == 7)
        {
            System.out.println("JULY 31 days");
        }
        else if(month == 8)
        {
            System.out.println("AUGUST 31 days");
        }
        else if(month == 9)
        {
            System.out.println("SEPTEMBER 30 days");
        }
        else if(month == 10)
        {
            System.out.println("OCTOBER 31 days");
        }
        else if(month == 11)
        {
            System.out.println("NOVEMBER 30 days");
        }
        else if(month == 12)
        {
            System.out.println("DECEMBER 31 days");
        }
        else
        {
            System.out.println("Invalid input! Please enter month number between 1-12.");
        }

    }
}
// Month Number = Month Name
//