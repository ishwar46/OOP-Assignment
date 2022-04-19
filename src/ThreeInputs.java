import java.util.Scanner;

public class ThreeInputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();
        System.out.println("All three numbers are equal?  " +(num1 == num2 && num2 == num3 && num3 ==num1));
        System.out.println("Any two numbers are equal? " +(num1 == num2 || num2 == num3 || num3 == num1));

    }
}
