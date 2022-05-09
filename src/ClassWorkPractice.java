// first five odd multiple
//Postive Integer

import java.util.Scanner;

public class ClassWorkPractice{
    public static void main(String[] args) {
        System.out.println("Multiple of 5 are: ");
        int sum=0;
        for (int number = 0; number < 50; number++) {



            if (number % 5 == 0 & number%2!=0) {

                System.out.println(number);

                sum+=number;
            }
        }
        System.out.println(sum);
    }
}

class Reverse {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers you want to reverse: ");
        int num= sc.nextInt();
        int a=num;
        int rev=0;
        int rem=0;
        while(a!=0)
        {
            rem=a%10;
            rev=rev*10+rem;
            a=a/10;
        }
        System.out.println("Reversed number is : " +rev);

    }
}

//Palindrome
class Palindrome {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int r,sum=0;
        int a=num;
        while(num>0)
        {
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(a==sum)
            System.out.println("The number "+a+" is a palindrome number ");
        else
            System.out.println("The number "+a+" is not a palindrome");
    }
}

//Fibonacii

class FibonacciSeries
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter positive number :");

        int num = sc.nextInt();

        int first = 0;

        int second = 1;

        int third = 0;

        while (third < num)
        {
            third = first + second;

            first = second;

            second = third;
        }

        if(third == num)
        {
            System.out.println("Number belongs to Fibonacci series");
        }
        else
        {
            System.out.println("Number doesn't belongs to Fibonacci series");
        }
    }
}


class CheckPln
{
    public static void main(String[] args) {

        System.out.print("Enter string : ");
        Scanner sc = new Scanner(System.in);

        String string = sc.nextLine();
        int length = string.length();

        boolean isPalindrome = true;

        for(int beginIndex = 0; beginIndex < length; beginIndex++)
        {
            if(string.charAt(beginIndex) != string.charAt(length-1-beginIndex)) {
                System.out.println("String is not a palindrome.");
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome) {
            System.out.println("String is a palindrome.");
        }
    }
}

class pallindrome {

    public static void main(String[] args) {

        String s= "Ishwar" ;
        String t="";
        for(int i=s.length()-1;i>=0;i--){
            t=t+s.charAt(i);
        }
        System.out.println("reversed word is "+ t);

        if (t.matches(s)){
            System.out.println("pallindrome");
        }
        else{
            System.out.println("not pallindrome");
        }
    }
}