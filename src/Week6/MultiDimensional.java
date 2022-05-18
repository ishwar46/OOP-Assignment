package Week6;

import java.util.Arrays;
import java.util.Scanner;

public class MultiDimensional {
    public static void main(String[] args) {
        int row = 5;
        int column = 5;
        int [][] myArr = new int[row][column];
        System.out.println(myArr.length);

        myArr[0][0]=1;
        myArr[1][1]=2;
        myArr[2][2]=3;
        myArr[3][3]=4;
        //System.out.println(Arrays.deepToString(myArr));

        Scanner sc = new Scanner(System.in);
        for(int i = 0; i<row; i++){
            for(int j = 0; i<column; j++){
                myArr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(myArr));
    }
}
