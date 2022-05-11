package Practice;

public class DoWhile {
    public static void main(String[] args) {
        int num = 0;
        do{
            System.out.println(num);
            num++;
        }
        while (num<5);
    }
}


//natural numbers

class NaturalNum{
    public static void main(String[] args) {
        int a = 1;
        do {
            System.out.println("Natural Numbers are: "+a);
            a++;
        }while (a<=20);
    }
}