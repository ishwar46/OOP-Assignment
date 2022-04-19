import javax.swing.*;

public class ThereeNumbers {
    public static void main(String[] args){
        double input1,input2,input3;
        input1= Double.parseDouble(JOptionPane.showInputDialog("Enter your first input: "));
        input2= Double.parseDouble(JOptionPane.showInputDialog("Enter your second input: "));
        input3= Double.parseDouble(JOptionPane.showInputDialog("Enter your third input: "));
        String total;
        total= (input1==input2)?"Any of two are equal" : (input1==input3&&input2!=input3)?
                "any of two are equal" :(input1==input2&&input2==input3)?"all are equal":"all are not equal";
        JOptionPane.showMessageDialog(null,total);
    }
}
