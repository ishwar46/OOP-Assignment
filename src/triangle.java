import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Side A: ");
        int SideA = sc.nextInt();
        System.out.println("Enter Side B: ");
        int SideB = sc.nextInt();
        System.out.println("Enter Side C: ");
        int SideC = sc.nextInt();

        if (SideA + SideB + SideC == 180 && SideA != 0 && SideB != 0 && SideC != 0)
        {
            System.out.println("It is an valid triangle");
        }
        else {
            System.out.println("It is not an valid triangle");
        }

    }

}
