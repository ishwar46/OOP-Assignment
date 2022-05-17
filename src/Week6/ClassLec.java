package Week6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ClassLec {
    public static void main(String[] args) {
        int [] myArray = new int[5];

        myArray[0] =1;
        myArray[1] =2;
        myArray[2] =3;
        myArray[3] =4;
        myArray[4] =5;
        //System.out.println(myArray);
        System.out.println(Arrays.toString(myArray));


    }

}


class NameString{
    public static void main(String[] args) {
        String[] newarry= new String[6];
        newarry[0]= "Ishu";
        newarry[1]= "Sam";
        newarry[2]= "Sam";
        newarry[3]= "Sandeep";
        newarry[4]= "Sandeep";
        newarry[5]= "Sandeep";

        System.out.println(Arrays.toString(newarry));
    }
}







class AvgArr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int[] newarr = new int[]{10, 20, 25, 45, 15, 60};

        int sum = 0;

        for(int i=0; i < newarr.length ; i++)
            sum = sum + newarr[i];
        double average = sum / newarr.length;

        System.out.println("Average value is : " + average);
    }
}





class Strr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] newarr;

        newarr=new String[10];
        for(int i=0;i<newarr.length;i++){
            System.out.print("Enter a value:");
            newarr[i]=sc.next();
        }
        System.out.println(Arrays.toString(newarr));
        for(int i = 0; i<newarr.length;i++){
            System.out.println("Element at " +i+ "index" +newarr [i]);
        }
    }

}





class Add{
    public static void main(String[] args){
        Scanner sc=new Scanner (System.in);
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            System.out.print("Enter a value:");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for (int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.print("Sum of an array:"+sum);
    }
}



class array {
    public static void main(String[] args) {
        int[] array = {6,48,47,7,2,0,10,1,191,157};

        for (int i = 0; i < array.length; i++) {
            boolean isPrime = true;
            if (array[i] == 1)
                isPrime = false;
            else {
                for (int j = 2; j <= array[i] / 2; j++) {
                    if (array[i] % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime){
                if (array[i] == 0){}
                else {
                    System.out.print(array[i] + " , ");
                }
            }}
        System.out.println(" are the prime number in the array ");
    }
}



class OddEvennew{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int newarray, a, countEven = 0, countOdd = 0;
        System.out.println("enter number of elements of an array: ");
        newarray = sc.nextInt();
        int[] arrNumbers = new int[newarray];
        System.out.println("enter " + newarray + " elements of an array: ");
        for(a = 0; a < newarray; a++)
        {
            arrNumbers[a] = sc.nextInt();
        }
        for(a = 0; a < arrNumbers.length; a++)
        {
            if(arrNumbers[a] % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }
        System.out.println("Total even numbers : " + countEven);
        System.out.println("Total odd numbers : " + countOdd);
    }
}





class OddEven{
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int oddCount = 0, evenCount = 0;
        int oddPos = 0, evenPos = 0;

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0)
                oddCount++;
            else
                evenCount++;
        }

        int[] odd = new int[oddCount];
        int[] even = new int[evenCount];

        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                even[evenPos] = num[i];
                evenPos++;
            } else {
                odd[oddPos] = num[i];
                oddPos++;
            }
        }
    }
}

class SecondQuestion{
            public static boolean contains(int[] array, int item) {
                for (int num : array) {
                    if (item == num) {
                        return true;
                    }
                }
                return false;
            }
            public static void main(String[] args) {
                int[] newarr = {1,2,3,4,5,6,7,8,9,10};
                System.out.println(contains(newarr, 10));
                System.out.println(contains(newarr, 20));
            }
}


class MaxAndMinElementsinArray {
    public static void main(String[] args) {
        /*int a[] = {50, 100, 40, 20, 60};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max)
                max = a[i];
            System.out.println("Maximum Element is array is:" + max);*/

        int a[] = {50, 100, 40, 20, 60};
        int min = a[0];
        for (int i = 1; i <= a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
                System.out.println("Minimum Element is array is:" + min);
            }
        }
    }
}


 class NewnewArrays{
     public static void main(String[] args) {
         double values-(81, 52, 33, 95, 18, 4, 7:
         double snallest-volues(0):
         for (int i- 0;ie values.length; ++){
             if (volues[i]<smallest){
                 snallest-values[i):
                 System.out.print(smollest);
             }
         }
     }
    }
 }