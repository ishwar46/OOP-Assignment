import java.util.Scanner;

public class SquareNum {
    private static Scanner sc;
    public static void main(String[] args) {
        int number, square;
        sc = new Scanner(System.in);

        System.out.print(" Please Enter any Number : ");
        number = sc.nextInt();

        square = sq(number);

        System.out.println("The Square of a Given Number is " + square);
    }

    public static int sq(int num)
    {
        return num * num;
    }
}
