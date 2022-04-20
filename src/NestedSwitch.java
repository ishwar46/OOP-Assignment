import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a: ");
        int a = sc.nextInt();

        System.out.println("Enter b: ");
        int b = sc.nextInt();

        //Outer switch
        switch (a){
            case 1:
                //inner switch
                switch (b){
                    case 1:
                        System.out.println("b is 1");
                        break;
                    case 2:
                        System.out.println("b is 2");
                        break;
                    case 3:
                        System.out.println("b is 3");
                }
                break;

            case 2:
                System.out.println("a is 2");
                break;
            case 3:
                System.out.println("a is 3");
                break;
            default:
                System.out.println("Invalid");
        }

    }
}
