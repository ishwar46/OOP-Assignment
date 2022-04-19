import javax.swing.*;

public class Marks {
    public static void main(String[] args){

        double Progamming, Android,Database, Flutter, Obtained_Marks, Percentage;
        int Total_Marks;
        Progamming = Integer.parseInt(JOptionPane.showInputDialog("Enter marks: "));
        Android = Integer.parseInt(JOptionPane.showInputDialog("Enter marks: "));
        Database = Integer.parseInt(JOptionPane.showInputDialog("Enter marks: "));
        Flutter = Integer.parseInt(JOptionPane.showInputDialog("Enter marks: "));
        Total_Marks= 400;
        Obtained_Marks= Progamming+Android+Database+Flutter;

        Percentage= (Obtained_Marks*100)/Total_Marks;

        JOptionPane.showMessageDialog(null,"The total marks is: " + Total_Marks + " and The percentage is: " + Percentage);
        if (Percentage>=70){
            JOptionPane.showMessageDialog(null,"First Class");
        }
        else if(Percentage>59){
            JOptionPane.showMessageDialog(null,"Upper Second class");
        }
        else if (Percentage>49){
            JOptionPane.showMessageDialog(null,"Second Class");
        }
        else if (Percentage>39){
            JOptionPane.showMessageDialog(null,"Third Class");
        }
        else{
            JOptionPane.showMessageDialog(null,"Sorry you have failed!");
        }
    }
}