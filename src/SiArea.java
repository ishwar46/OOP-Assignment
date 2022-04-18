//Write a program to calculate SI, Area of triangle and Volume of Cube and Cuboid.

import java.util.Scanner;

public class SiArea {
    public static void main (String args[])
    {
        float SI;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter P: ");
        float p = scanner.nextFloat();
        System.out.println("Enter T: ");
        float t = scanner.nextFloat();
        System.out.println("Enter R: ");
        float r = scanner.nextFloat();
        SI  = (p*t*r)/100;
        System.out.println("Simple Interest is: " +SI);
    }

}
class AreaNew
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the cuboid: ");
        int length=sc.nextInt();
        System.out.println("Enter the breadth of the cuboid: ");
        int breadth=sc.nextInt();
        System.out.println("Enter the height of the cuboid: ");
        int height=sc.nextInt();
        // surface area
        int area= SurfaceArea(length,breadth,height);
        System.out.println("The surface area of the cuboid is: "+area);
        //volume
        int vol=findVolume(length,breadth,height);
        System.out.println("The volume of the cuboid is: "+vol);
    }

    public static int SurfaceArea(int length,int breadth, int height)
    {
        int surface_area=2*((length*breadth)+(breadth*height)+(height*length));
        return surface_area;
    }
    //volume of cuboid
    public static int findVolume(int length,int breadth, int height)
    {
        int volume=length*breadth*height;
        return volume;
    }
}