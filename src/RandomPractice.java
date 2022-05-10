//Practice Makes a Man Perfect
public class RandomPractice {
    public static void main(String[] args) {
        System.out.println("Practice Makes a Man Perfect");
    }
}

//Conditional Statements

class Age{
    public static void main(String[] args) {
        int age = 20;
        if(age>18){
            System.out.println("You can drive ");
        }
        else {
            System.out.println("You cannot drive!!");
        }
    }
}

//Logical Operators

class LogicalOps{
    public static void main(String[] args) {
        System.out.println("For Logical AND");
        boolean a = true;
        boolean b = false;
        boolean c = true;
        if (a && b && c){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

class LogicalOR{
    public static void main(String[] args) {
        System.out.println("Logical OR");
        boolean a = true;
        boolean b = false;
        //boolean c = true;
        if(a || b){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}

class LogicalNOT{
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        System.out.println("For Logical NOT");
        System.out.println("Not(A) is ");
        System.out.println(!a);
        System.out.println("Not(B) is ");
        System.out.println(!b);
    }
}