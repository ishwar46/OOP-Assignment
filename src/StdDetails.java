import javax.swing.*;
// Write a program to take student details as input and display the result.
public class StdDetails {
    public static void main(String[] args) {
        String name, address;
        double age, percentage;
        name= JOptionPane.showInputDialog("Enter name: ");
        address= JOptionPane.showInputDialog("Enter address: ");
        age= Double.parseDouble(JOptionPane.showInputDialog("Enter  age: "));
        JOptionPane.showMessageDialog(null,"name= "+name+"\n age= "+age+"\n address= "+address);
    }
}



