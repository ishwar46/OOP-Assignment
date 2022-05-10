import java.util.Scanner;

//Switch Case
public class SwitchCase {
    public static void main(String[] args) {
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        age = sc.nextInt();

        switch (age){
            case 15:
                System.out.println("You cannot have your Driving Licence.");
                break;
            case 18:
                System.out.println("You can have your Driving Licence.");
                break;
            case 90:
                System.out.println("We recommend you not to drive");
                break;
            default:
                System.out.println("Invalid!");
        }
    }
}
