import java.util.Scanner;

public class UpperLower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character: ");

        char ch = sc.next().charAt(0);

        if((ch >= 'A') && (ch<='Z'))
        {
            System.out.println("It is an Uppercase character");
        }
        else if((ch >= 'a') && (ch<='z'))
        {
            System.out.println("It is an lowercase character");
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
