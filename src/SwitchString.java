import java.util.Scanner;

public class SwitchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String phonename;
        System.out.println("Enter phone company and I will recommend the model for you: ");
        phonename = sc.next();

        switch (phonename){
            case "Apple":
                System.out.println("Buy iPhone 13 Pro max Green");
                break;
            case "Samsung":
                System.out.println("Buy Galaxy S22");
                break;
            case "Xiaomi":
                System.out.println("Buy Note 10 pro");
                break;
            default:
                System.out.println("Sorry you don't have enough cash");
        }
    }
}

class ShoesName{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shoes;
        System.out.println("Enter the Shoe brand you want to buy: ");
        shoes = sc.next();

        switch (shoes){
            case "Nike":
                System.out.println("You can buy Air Jordan or Air Force 1");
                break;
            case "Adidas":
                System.out.println("You ca buy Alexander Wang ");
                break;
            case "Gold Star":
                System.out.println("You can buy G10");
                break;
            case "Sikhar":
                System.out.println("You can buy Sikhar 10");
                break;
            case "Caliber":
                System.out.println("You can buy baseman shoes");
                break;
            default:
                System.out.println("Use FLIP FLOP!!!!");
                break;

        }

    }
}

