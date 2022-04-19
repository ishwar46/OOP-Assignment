import java.util.Scanner;

//Write a JAVA program to check whether a number is divisible by 5 and 11 or not.
public class Divide {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        if((num % 5 == 0) && (num % 11 == 0)){
            System.out.println("The Given Number " +num+ "is divisible ny 5 and 11");
        }
        else {
            System.out.println("The Given Number is " +num+ " is not divisible by 5 and 11");
        }
    }
}
