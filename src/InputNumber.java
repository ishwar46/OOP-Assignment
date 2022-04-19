//Write a program to calculate sum of four numbers taking user input.
import javax.swing.*;

public class InputNumber {
        public static void main(String[] args){

            double num1,num2,num3,num4,sum;
            num1= Double.parseDouble(JOptionPane.showInputDialog("Enter num1: "));
            num2= Double.parseDouble(JOptionPane.showInputDialog("Enter num2: "));
            num3= Double.parseDouble(JOptionPane.showInputDialog("Enter num3: "));
            num4= Double.parseDouble(JOptionPane.showInputDialog("Enter num4: "));
            sum = num1+num2+num3+num4;

            JOptionPane.showMessageDialog(null,"The sum of four numbers is: " + sum);
        }
}
