import java.util.Scanner;

//Write a program to take two integer inputs from user and print sum and product of them
public class SumProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = sc.nextInt();
        System.out.println("Enter num2: ");
        int b = sc.nextInt();
        //sum
        int add= add(a,b);
        System.out.println("The the sum is : "+ add);

        //product
        int product = product(a,b);
        System.out.println("The Product is: ");
    }
    //sum
    public static int add(int a, int b)
    {
        int add=(a+b);
        return add;
    }
    //product
    public static int product(int a, int b)
    {
        int product=(a*b);
        return product;
    }
}

