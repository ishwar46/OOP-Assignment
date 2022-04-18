import java.util.Scanner;

public class Preimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side");
        int x = sc.nextInt();
        System.out.println("The area of a square is " +(x*x)+ " and Perimeter is " +(4*x)+ " " );
    }
}
