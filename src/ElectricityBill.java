import java.util.Scanner;

/*Write a JAVA program to input electricity unit charges and calculate total electricity bill
        according to the given condition:
        For first 50 units Rs. 0.50/unit
        For next 100 units Rs. 0.75/unit
        For next 100 units Rs. 1.20/unit
        For unit above 250 Rs. 1.50/unit
        An additional surcharge of 20% is added to the bill*/
public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Total unit: ");
        int unit = sc.nextInt();
        double amount = 0.0;
        double sur_charge;
        sur_charge = amount * 0.20;
        if(unit <= 50)
            amount = unit * 0.50;
        else if(unit <= 150)
            amount = 25 + ((unit-50) * 0.75);
        else if(unit <= 250)
            amount = 100 + ((unit-150) * 1.20);
        else
            amount = 220 + ((unit-250) * 1.50);

        System.out.println("Units Consumed: " + unit);
        System.out.println("Surcharge: " +sur_charge);
        System.out.println("Total Amount: " + amount);

    }
}
