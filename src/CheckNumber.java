import java.util.Scanner;

//Write a JAVA program to check whether a number is negative, positive or zero.
public class CheckNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number: ");
        int num = sc.nextInt();

        if(num > 0){
            System.out.println("Entered number " +num+ " is Positive");
        }
        else if(num < 0){
            System.out.println("Entered number " +num+ " is Negative");
        }
        else {
            System.out.println("The Entered number" +num+ " is neither Positive or Negative");
        }
    }
}
