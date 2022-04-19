import java.util.Scanner;

public class AlphabetCheck {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char alphabet = sc.next().charAt(0);

        if((alphabet>='A' && alphabet<='z') || (alphabet>='a' && alphabet<='z'))
        {
            System.out.println(" It is an Alphabet.");
        }
        else
        {
            System.out.println(" It is not an Alphabet.");
        }
    }
}
