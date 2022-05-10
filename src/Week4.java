import java.util.Scanner;
//Practice Questions Week 4
public class Week4 {
    public static void main(String[] args) {
        System.out.println("Week 4");
    }
}

class Assignment {
    /*
Question 1
Write a program to print numbers from 1 to 10.
 */
    class First {
        public static void main(String[] args) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(i);
            }
        }
    }
}
/*Question 2
        WAP to display even number between 10 and 30.*/
class Sec{
    public static void main(String[] args) {
        for(int i=10;i<=30;i+=2){
            if(i%2!=0){
            }
            System.out.println(i);
        }
    }
}
/*
Question 3
WAP to display the number of even numbers between 10 and 30.
 */
class Three{
    public static void main(String[] args) {
        for(int i=10;i<=30;i+=2){
            System.out.println(i);
        }

    }
}

/*
Question 4
Write a program to find the factorial value of any number entered through the
keyboard.
 */
class Fourth{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of factorial value: ");
        int a=scanner.nextInt();
        int fact=1;
        for(int j=1;j<=a;j++){
            fact*=j;
        }
        System.out.println("The factorial of number is "+fact);

    }
}

/*
Question 5
Two numbers are entered through the keyboard. Write a program to find the value
of one number raised to the power of another. (Do not use Java built-in method)
 */
class Fifth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base= scanner.nextInt();
        System.out.print("Enter the power: ");
        int power = scanner.nextInt();
        int i = 1;
        int ans=1;
        while(i<=power){
            ans*=base;
            i++;
        }
        System.out.println("The ans is "+ans);
    }
}

/*
Question 6
Write a program that prompts the user to input an integer and then outputs the
number with the digits reversed. For example, if the input is 12345, the output
should be 54321.
 */
class Sixth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num= scanner.nextInt();
        if (num<0){
            System.out.println("Please enter a positive number");
        }
        else{
            int i=1;
            int ans =0;
            while(num>0){
                int rem = num%10;
                ans =(ans*10)+rem;
                num/=10;
            }
            System.out.printf("The reverse number is %d.",ans);
        }

    }

}

/*
Question 7
Write a program that reads a set of integers, and then prints the sum of the even
and odd integers.
 */
class Seven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in set: ");
        int n = scanner.nextInt();
        int sumEven=0;
        int sumOdd=0;
        for(int i=0; i<n; i++){
            System.out.print("Enter the number: ");
            int num =scanner.nextInt();
            if(num%2==0){
                sumEven+=num;
            }
            else {
                sumOdd+=num;
            }
        }
        System.out.println("The sum of odd number is "+sumOdd);
        System.out.println("The sum of even number is "+sumEven);
    }
}

/*
Question 8
Write a program that prompts the user to input a positive integer. It should then
output a message indicating whether the number is a prime number.
 */
class Eighth{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int num = scanner.nextInt();
        int count=0;
        if(num<0){
            System.out.println("Please enter positive number.");
        }
        else{
            if(num==1||num==0){
                System.out.println("The number is not prime.");
            }

            else {
                for(int i =1;i<=num; i++){
                    if(num%i==0){
                        count++;
                    }
                }
                if(count==2){
                    System.out.println("The number is prime.");
                }
                else{
                    System.out.println("The number is not prime");
                }
            }
        }
    }
}

/*
Question 9
Write a program to calculate HCF of Two given number.
 */
class Nine{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number:: ");
        int num1= scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2= scanner.nextInt();
        int n;
        if(num2>num1){
            n=num2;
        }
        else{
            n=num1;
        }
        int hcf=0;
        for(int i=1; i<=n; i++){
            if(i<=num1&&i<=num2)
                if(i%num1==0||i%num2==0){
                    hcf=i;
                }
        }
        System.out.printf("The HCF of %d and %d is %d.",num1,num2,hcf);
    }
}

/*
 Question 10
Write a do-while loop that asks the user to enter two numbers. The numbers
should be added and the sum displayed. The loop should ask the user whether he
or she wishes to perform the operation again. If so, the loop should repeat;
otherwise it should terminate.
  */
class Ten{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean value=false;
        do{
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            int sum =a+b;
            System.out.printf("The sum of %d and %d is %d.",a,b,sum);
            System.out.print("Do you want to calculate again?: ");
            String ans = scanner.next();//doesn't stop to take input
            if (ans=="yes"){
                value = true;
            }
            else if(ans=="no"){
                value = false;
            }

        }while(value== true);
    }
}

/*
  Question 11
Write a program to enter the numbers till the user wants and at the end it should
display the count of positive, negative and zeros entered.
   */
class Eleven{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter how many number you want: ");
        int num = scanner.nextInt();
        int countPositive=0;
        int countNegative =0;
        int countZero = 0;
        for (int i=1;i<=num; i++){
            System.out.print("Enter the number: ");
            int myNum = scanner.nextInt();
            if(myNum>0){
                countPositive++;
            }
            else if(myNum<0){
                countNegative++;

            }
            else if(myNum==0){
                countZero++;
            }
        }
        System.out.println("Positive Number: "+countPositive);
        System.out.println("Negative Number: "+countNegative);
        System.out.println("Zero: "+countZero);

    }
}

/*
  Question 12
Write a program to enter the numbers till the user wants and at the end the
program should display the largest and smallest numbers entered.
   */
class Twelve{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many numbers you want to enter?: ");
        int num = scanner.nextInt();
        int lNum=0;
        int sNum=0;
        for (int i=1; i<=num; i++){
            System.out.println("Enter the number: ");
            int myNum= scanner.nextInt();
            if(myNum>lNum){
                lNum = myNum;
            }
            if(i==1){
                sNum = myNum;
            }
            else if(i!=1&&myNum<sNum){
                sNum=myNum;
            }
        }
        System.out.println("Largest: "+lNum);
        System.out.println("Smallest: "+sNum);
    }
}

/*
  Question 13
Write a program to print out all Armstrong numbers between 1 and 500. If sum of
cubes of each digit of the number is equal to the number itself, then the number is
called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
   */
class Thirteen {
    public static void main(String[] args) {
        int n, count = 0, a, b, c, sum = 0;
        System.out.println("Armstrong numbers from 1 to 500:");
        for (int i = 1; i <= 500; i++) {
            n = i;
            while (n > 0) {
                b = n % 10;
                sum = sum + (b * b * b);
                n = n / 10;
            }
            if (sum == i) {
                System.out.print(i + " ");
            }
            sum = 0;
        }
    }
}

/*
  Question 14
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 .....
   */
class Fourteen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int i = 1;
        int num1 = 0;
        int num2 = 1;
        int fab = 0;
        while (fab <= num) {
            num1 = num2;
            num2 = fab;
            fab = num1 + num2;
            System.out.println(num1);

        }

    }
}

/*
  Question 15
Write a program to calculate the sum of following series where n is input by user.
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
   */
class Fifteen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        double ans = 0;
        for (int i = 1; i <= num; i++) {
            double a = (double) 1 / i;
            ans += a;
        }
        System.out.print("The ans is " + ans);
    }
}

/*
  Question 16
Compute the natural logarithm of 2, by adding up to n terms in the series
1 - 1/2 + 1/3 - 1/4 + 1/5 -... 1/n
where n is a positive integer and input by user
   */
class Sixteen{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = scanner.nextInt();
        double ans = 0;
        for (int i = 1; i <= num; i++) {

            double a = (double) 1 / i;
            if (i % 2 != 0) {
                ans += a;
            } else if (i % 2 == 0) {
                ans -= a;
            }
        }
        System.out.print("The answer is " + ans);
    }
}

/*
  Question 17
Write a program that generates a random number and asks the user to guess what
the number is. If the user's guess is higher than the random number, the program
should display "Too high, try again." If the user's guess is lower than the random
number, the program should display "Too low, try again." The program should use
a loop that repeats until the user correctly guesses the random number.
   */
class Seventeen{
    public static void main(String[] args) {
        int rand = (int) (Math.random() * 11);
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        while (num != rand) {
            if (num > rand) {
                System.out.println("Too High, try again");
            } else if (rand > num) {
                System.out.println("Too low, try again");
            }
            int num2 = scanner.nextInt();
            num = num2;
        }
        System.out.print("Correct!!");
    }
}

//Question 18

//i) ******
//********
//********
//********

class St{
    public static void main(String[] args) {
        for (int i=1; i<=4; i++){
            for (int j=1; j<=10; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
ii)
*
**
*
**
*
 */
class stt{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
iii)
    *
   **
  *
 **
*

 */
class staa{
    public static void main(String[] args) {
        for(int i =1; i<=5;i++){
            for(int j=i;j<5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
iv)
  *
 *
*
***
*****

 */
class Saa{
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for (int j=i; j<=5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for (int j=1; j<i;j++){
                System.out.print("*");
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}

/*
v) 1
 222
 33333
 4444444
555555555
 */
class Soo{
    public static void main(String[] args) {
        for (int i=1; i<=5;i++){
            for (int j=i; j<=5;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            for (int j=1; j<i;j++){
                System.out.print(i);
            }
            for(int j=1;j<=i;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
/*
vi)
  1
 212
 32123
 4321234
543212345
 */
class Yp{
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            for (int j=i;j<=5;j++){
                System.out.print(" ");
            }
            for(int j=i; j>=1;j--){
                System.out.print(j);
            }
            for (int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}