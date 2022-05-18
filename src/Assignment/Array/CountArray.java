package Assignment.Array;

import java.util.Scanner;

public class CountArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array range: ");
        int size= sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the elements of the array :");

        int count=0;
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();

        }
        countFactor(arr);
    }
    public static void countFactor(int[] arr ){
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%2==0){
                count++;
            }
        }
        System.out.println("the total no of factors of 2 is: "+count);
    }
}


class Count{


}