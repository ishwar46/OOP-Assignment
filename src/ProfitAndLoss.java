import java.util.Scanner;

public class ProfitAndLoss {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println(" Total CostPrice: ");
        double CP=sc.nextDouble();
        System.out.println("Total Selling price:");
        double SP=sc.nextDouble();

        if(CP-SP>0)
        {
            System.out.println("loss:" +(CP-SP));
        }
        else if(CP-SP<0)
        {
            System.out.println("profit:" +(SP-CP));
        }
        else
            System.out.println("All Good!");
    }
}
