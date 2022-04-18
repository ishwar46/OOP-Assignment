import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        System.out.println("Sum of four numbers");
        int a,b,c,d,total;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        a = scanner.nextInt();
        System.out.print("Enter second number: ");
        b = scanner.nextInt();
        System.out.print("Enter third number: ");
        c = scanner.nextInt();
        System.out.print("Enter fourth number: ");
        d = scanner.nextInt();
        total = a+b+c+d;
        System.out.println("Total Sum of four number is: " + total);

    }
}
