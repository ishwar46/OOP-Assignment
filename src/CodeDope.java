import javax.swing.*;

public class CodeDope {
    public static void main(String[] args){
        String num1,num2;
        num1= JOptionPane.showInputDialog("Enter any string: ");
        num2= JOptionPane.showInputDialog("Enter any string again: ");
        JOptionPane.showMessageDialog(null,num1+num2);
    }
}
