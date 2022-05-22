package Practice;

public class VarArgrs {

    /*static int sum(int a, int b){
        return a+b;
    }

    static int sum(int x, int y, int z){
        return x+y+z;
    }

    static int sum(int x, int y, int z, int d){
        return x+y+z+d;
    }*/

    static int sum(int ...arr){
        //int[] arr;
        int result = 0;

        for (int a: arr){
            result +=a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Var Args!");
        System.out.println("sum of 2 and 3 is : " +sum(2,3));
        System.out.println("Sum of 2, 3, and 1 is: " +sum(2,3,1));
        System.out.println("Sum of 2, 4, 3, and 1 is: " +sum(2,3,4,4));
    }
}

