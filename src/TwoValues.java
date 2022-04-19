import java.util.Scanner;

/*Write a program to enter the values of two variables 'a' and 'b' from keyboard and then
        check if both the conditions 'a < 50' and 'a < b' are true.*/
public class TwoValues {
    public static void main(String[] args) {
        int a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        a = sc.nextInt();
        System.out.println("Enter num 2: ");
        b =sc.nextInt();
        System.out.println("If both is true or not: " +(a<50 && a<b));

    }
}
