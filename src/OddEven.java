import java.util.Scanner;

//Write a JAVA program to check whether a number is even or odd
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number to check Even or Odd: ");
        int num = sc.nextInt();

        if(num % 2 == 0){
            System.out.println("The given number " +num+ " is Even");
        }
        else {
            System.out.println("The given number " +num+ "is Odd");
        }
    }
}
