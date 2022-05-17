package Assignment.Array;

import java.util.Scanner;

public class QuestionFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of an array");
        int n = sc.nextInt();

        //Declare an array
        int newarr[] = new int[n];

        System.out.println("Enter an array values");

        //Input array values
        for(int i = 0; i<n; i++){
            newarr[i] = sc.nextInt();
        }

        int temp;

        int start = 0;
        int end = n-1;

        while (start<end){
            temp = newarr[start];
            newarr[start] = newarr[end];
            newarr[end] = temp;

            start++;
            end--;
        }
        System.out.println("Integers after reverse: ");

        for(int j = 0; j <n; j++){
            System.out.println(newarr[j]);
        }
    }
}
