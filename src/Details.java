import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student's Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Field if interest: ");
        String interest = sc.nextLine();
        System.out.println("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.println("Hey, my name is "+name+" and my roll number is "+roll+". My field of interest are" +interest+ ".  ");


    }
}
