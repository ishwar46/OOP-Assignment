import java.util.Scanner;

public class SwitchSize {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to print name: ");
        int num = sc.nextInt();
        String name;

        switch (num){
            case 1:
                name = "Ishwar";
                break;
            case 2:
                name = "Roz";
                break;
            case 3:
                name = "Dhawit";
                break;
            case 4:
                name = "Sneha";
                break;
            case 5:
                name = "Sandeep";
                break;
            default:
                name = "Invalid!";
                break;

        }
        System.out.println("Entered number is " +name );
    }
}

   /* String name = switch (num) {
        case 1 -> "Ishwar";
        case 2 -> "Roz";
        case 3 -> "Dhawit";
        case 4 -> "Sneha";
        case 5 -> "Sandeep";
        default -> "Invaild!";
    };*/