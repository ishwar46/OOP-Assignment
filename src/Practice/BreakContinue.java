//Break and Continue using loops
package Practice;

public class BreakContinue {
    public static void main(String[] args) {
        int i;
        for(i=1;i<5;i++){
            System.out.println(i);
            System.out.println("Hello World");
            if(i==2){
                System.out.println("Matched!");
                break;
            }
        }
        System.out.println("Loop Ends Here");
    }
}

class While{
    public static void main(String[] args) {
        int i = 0;
        while (i<5){
            System.out.println(i);
            System.out.println("Hello World!");
            if (i==2){
                System.out.println("Matched!");
                break;
            }
            i++;
        }
        System.out.println("Loop Ends here");

    }
}

class DoWhileLoop{
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.println(i);
            System.out.println("Hello Ishu!");
            if (i==2){
                System.out.println("Mathced!");
                break;
            }
            i++;

        }while (i<5);
        System.out.println("Loop Ends Here");
    }
}

class Cont{
    public static void main(String[] args) {
        int i = 0;
        for (i=0;i<5;i++){
            if (i==2){
                System.out.println("Matched!");
                continue;
            }
            System.out.println(i);
            System.out.println("Hello Ishu");
        }
        i++;
        System.out.println("Loop Ends Here");
    }
}

class DoWhileCont{
    public static void main(String[] args) {
        int a = 0;
        do {
            a++;
            if (a==2){
                System.out.println("Matched");
                continue;
            }
            System.out.println(a);
            System.out.println("Hello Ishu");

        }while (a<20);
        System.out.println("Loop ends here");
    }
}