import java.util.Scanner;

//Week4
//First 10 whole number
public class ForLoops {
    public static void main(String[] args) {
        for(int i = 0; i <=9; i++)
        {
            System.out.println(i);
        }
    }
}

class OddNumber {
    public static void main(String[] args) {
        int number=20;
        for (int i=1; i<=number; i++)
        {
            if (i%2!=0)
            {
                System.out.print(i + " ");
            }
        }
    }
}

class Even {
    public static void main(String[] args) {
        for(int i = 0; i <=20; i+=2)
        {
            System.out.println(i);
        }
    }
}

class Name{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Name: ");
        for (int i = 0; i < 5; i++) {
            System.out.println(name);
        }
    }
}

class Infinite{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = sc.next();
        for( int i = 0; i >= 0 ; i++)
        {
            System.out.println(name);
        }
    }
}

class InfiniteNew{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name: ");
        String name = sc.next();
        for( ; ;)
        {
            System.out.println(name);
        }
    }
}