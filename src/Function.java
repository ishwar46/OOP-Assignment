import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Function functions = new Function();
        //System.out.println(functions.addition());

    }
    public void addition(){
        int a = 2;
        int b = 4;
        int num = a+b;
    }

}

class MyDetails{
    public static void main(String[] args) {

    }


}

//PRIME NUMBER
class PrimeNumberFunction{
    int check(int n)
    {
        int count = 0;
        for(int i = 1; i<=n; i++)
        {
            if(n%i==0)
                count++;
        }
        if(count==2)
            return 1;
        else
            return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        PrimeNumberFunction ob = new PrimeNumberFunction();
        if(ob.check(num)==1)
            System.out.println(num+"is a prime number");
        else
            System.out.println(num+"is a prime number");
    }
}
