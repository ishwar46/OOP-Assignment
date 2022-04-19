import java.util.Scanner;

public class ADS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter anything to check: ");
        char ch = sc.next().charAt(0);

        if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch<='Z'))
        {
            System.out.println("Entered character is a Alphabet");
        }
        else if(ch >= '0' && ch<='9')
        {
            System.out.println("Enter character is a Digit");
        }
        else {
            System.out.println("Entered character is a Special Character");
        }

    }
}
