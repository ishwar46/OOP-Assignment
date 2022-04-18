//program to get student details
import java.util.Scanner;

public class StdDetails
{
    public static void main(String args[])
    {
        String name,address;
        int id;
        Scanner SC=new Scanner(System.in);
        System.out.print("Enter Student's Name: ");
        name=SC.nextLine();
        System.out.print("Enter Student's Address: ");
        address=SC.nextLine();
        System.out.print("Enter University ID: ");
        id=SC.nextInt();


        System.out.println("University ID:" + id +"\tName: "+name +"\tAddress: " +address);


    }

}
