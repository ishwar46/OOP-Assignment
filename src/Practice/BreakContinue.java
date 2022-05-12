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
    }
}
