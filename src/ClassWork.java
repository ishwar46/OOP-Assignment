import java.util.Scanner;

//loops week4
public class ClassWork {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
    }
}
class NestedLoops
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 5 ; i++)
        {
            for(int j = 1; j <= 6 ; j++)
            {
                System.out.println("Iteration of outer loop i: "+ i +" Iteration of inner loop: "+ j );
            }
        }
    }
}

class EvenOdd{
    public static void main (String args[]){
        int i,j;
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(i=1; i<=num; i+=2 ){
                System.out.print(i+"\n");
            for(j=1; j<=num; j+=2) {
                System.out.println(j+"\n");
            }

        }

    }
}

//Outer loop week
//Inner loop days
class WeekDays {
    public static void main(String[] args) {

        int weeks = 3;
        int days = 7;
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= weeks; ++i) {
            System.out.println("Week: " + i);
            for (int j = 1; j <= days; ++j) {
                System.out.println("Day: " + j);
            }
        }
    }
}


// Program to display numbers from 1 to 5 using while loop
class NumberCheck {
    public static void main(String[] args) {
        int i = 1, num = 5;
        while(i <= num) {
            System.out.println(i);
            i++;
        }
    }
}

// Java program to find the sum of positive numbers

class Sum {
    public static void main(String[] args) {

        int sum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();
        while (number >= 0) {
            sum += number;

            System.out.println("Enter a number");
            number = sc.nextInt();
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}
class Natural{
    public static void main(String args[])
    {
        int a, i = 1 ;
        int sum = 0;
        System.out.println("Enter Number of items :");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        while(i <= a)
        {
            sum = sum +i;
            i++;
        }
        System.out.println("Sum of "+a+" numbers is :"+sum);
    }
}

class SumOddEven{
    public static void main(String[] args) {
            int n, even = 0, odd = 0;
            Scanner s = new Scanner(System.in);
            System.out.print("");
            n = s.nextInt();
            int[] a = new int[n];
            System.out.println("");
            for(int i = 0; i < n; i++)
            {
                a[i] = s.nextInt();
            }
            for(int i = 0; i < n; i++)
            {
                if(a[i] % 2 == 0)
                {
                    even = even + a[i];
                }
                else
                {
                    odd = odd + a[i];
                }
            }
            System.out.println("Sum of Even Numbers:"+even);
            System.out.println("Sum of Odd Numbers:"+odd);
        }
}

class CountNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter number: ");
        int num = sc.nextInt();

        int n = 20;
        while ( n  <=  num ) {
            System.out.println( n );
            n += 10;
        }
    }
}

class Count{
    public static void main(String[] args) {
        int num = 1;
        int count = 0;
        while (num<=20){
            if(num%3==0){
                count++;
            }
        }
        System.out.println(count);
    }
}

//Check Prime Number
class CheckPrime {
    public static void main(String args[]) {
        int num;
        boolean isPrime = false;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
        if (!isPrime) {
            System.out.println(num + " is a prime numbner ");
        } else {
            System.out.println(num + " is not a prime numbner ");
        }
    }
}


//Checking Prime Number using while loop
class WhilePrime{
    public static void main(String args[]){
        int num;
        boolean isPrime=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        num=sc.nextInt();

        int i=2;
        while( i<=num/2){
            if(num%i==0)
            {
                isPrime=true;
                break;
            }
            i++;
        }

        if(!isPrime){
            System.out.println(num+" is a prime numbner ");
        }
        else{
            System.out.println(num+" is not a prime numbner ");
        }
    }
}


class ExampleDoWhileLoop
{
public static void main(String args[])
{
    int i=1;
    do
    {
        System.out.println(i);
        i++;
    }
        while(i <=10);
        }
}

//even odd count 18

class oddeven {
    public static void main(String[] args) {
        int i = 1;
        int evencount = 0;
        int oddcount=0;
        do {
            if (i % 2 == 0) {
                evencount++;
                oddcount++;
            } else {
                oddcount++;
            }
            i++;
        }
        while (i <= 18);
        if (evencount>oddcount){
            System.out.println("even is more");
        }else{
            System.out.println("odd is more");
        }
    }
}