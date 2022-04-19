import javax.swing.*;
public class CompMarks {
    public static void main(String[] args){
        double x,y;
        x= Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
        y= Double.parseDouble(JOptionPane.showInputDialog("Enter a number: "));
        String Compare;
        Compare= (x<50)?"true":(x<y)?"True":"False";
        JOptionPane.showMessageDialog(null,Compare);
    }
}

