package Assignment.Array;

import java.util.Scanner;

public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the array size");
        int size= sc.nextInt();
        int []arr= new int[size];
        System.out.println("Enter the element: ");

        for (int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(addition(arr));
    }
    public static int addition(int[] arr){
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%11==0 && arr[i]%5==0){
                sum=sum+arr[i];
            }
        }
        return sum;
    }
}
