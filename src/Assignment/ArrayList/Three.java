package Assignment.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ar = new ArrayList<Integer>();
        for(int i=0;i<5;i++){
            System.out.println("Enter the number: ");
            int value = scanner.nextInt();
            ar.add(i,value);
        }
        System.out.println(ar);
        System.out.println(sumPrime(ar));

    }
    static int sumPrime(ArrayList<Integer> arr){
        int count=0;
        int sum=0;
        for(int i=1; i<arr.size();i++){
            if(arr.get(i)%i==0){
                count+=1;
            }
            if(count==1){
                sum+=arr.get(i);
            }
        }
        return sum;
    }
}