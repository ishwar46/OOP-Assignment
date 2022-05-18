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

