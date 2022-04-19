import javax.swing.*;

public class SquareNumber {

        public static void main(String[] args){
            double x;
            x= Double.parseDouble(JOptionPane.showInputDialog("Enter any number: "));
            JOptionPane.showMessageDialog( null,"The power of 2 is: " +Math.pow(x,2));
        }
}
