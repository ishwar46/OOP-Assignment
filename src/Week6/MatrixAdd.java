package Week6;

import java.util.Scanner;


public class MatrixAdd {
    public static void main(String[] args) {
        int numRows;
        int numCol;
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);

            System.out.print("Enter number of rows of matrix: ");
            numRows = scanner.nextInt();
            System.out.print("Enter number of columns of matrix: ");
            numCol = scanner.nextInt();

            int Matrix1[][] = new int[numRows][numCol];
            int Matrix2[][] = new int[numRows][numCol];
            int resultMatrix[][] = new int[numRows][numCol];

            System.out.print("Enter elements of first matrix: ");

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCol; j++) {
                    Matrix1[i][j] = scanner.nextInt();
                }
            }
            System.out.println("First Matrix is: ");
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCol; j++) {
                    System.out.print(" " + Matrix1[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("Enter elements of Second Matrix: ");

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCol; j++) {
                    Matrix2[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Second Matrix is: ");
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCol; j++) {
                    System.out.print(" " + Matrix2[i][j] + "\t");
                }
                System.out.println();
            }

            //Addition logic of two matrices
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCol; j++) {
                    resultMatrix[i][j] = Matrix1[i][j] + Matrix2[i][j];
                }
            }

            //Printing the result matrix
            System.out.println("Result Matrix is: ");
            for (int i = 0; i < resultMatrix.length; i++) {
                for (int j = 0; j < numCol; j++) {
                    System.out.print(" " + resultMatrix[i][j] + "\t");
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            if(scanner != null){
                scanner.close();
            }
        }
    }


}


class AddArray{
    public static void main(String args[]){

        int a[][]={{1,3,4},{3,4,5}};
        int b[][]={{1,3,4},{3,4,5}};

        int c[][]=new int[2][3];

        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}

class MatrixMultiplication{
    public static void main(String args[]){

        int a[][]={{1,1,1},{2,2,2},{3,3,3}};
        int b[][]={{1,1,1},{2,2,2},{3,3,3}};


        int c[][]=new int[3][3];


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                c[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}