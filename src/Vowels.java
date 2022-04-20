import java.util.Scanner;

public class Vowels {
    public static void main(String args[]){
        char ch;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Alphabet: ");
        ch=sc.next().charAt(0);
        if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){

            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                System.out.print(ch+" is vowel");
            }
            else{
                System.out.print(ch+" is consonant");
            }
        }
        else{
            System.out.print(ch+" is neither a vowel nor a consonant");
        }
    }
}
