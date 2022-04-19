import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char alphabet = sc.next().charAt(0);

        if((alphabet>='A' && alphabet<='Z') || (alphabet >= 'a' && alphabet>='z'))
        {
            System.out.println(alphabet+ " is an Alphabet");
        }
        else{
            System.out.println(alphabet+ " is not an Alphabet");

        }


    }
}
