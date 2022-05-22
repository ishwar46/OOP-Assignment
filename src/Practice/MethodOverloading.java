package Practice;

public class MethodOverloading {

    static void message(){
        System.out.println("Good Morning!");
    }

    static void message(int a){
        System.out.println("Hello " +a );
    }

    static void message(int a, int b ){
        System.out.println("Good Morning " + a + " bhai!");
        System.out.println("Good Morning " + b + " bhai!");
    }



    static void change(int x){
        int a = 98;

    }

    static void change2(int [] arr){
        arr[0] = 98;
    }
    static void joke(){
        System.out.println("Joke");
    }

    public static void main(String[] args) {
        //joke();


// Case 1: Changing the Integer
        int x = 55;
        change(x);
        System.out.println("The value of x after running change is: " + x);


        //Case 1: Chanahing the Array

        int [] marks = {42,33,44,33,55,66,43};
        change2(marks);
        System.out.println(marks[0]);


//Method Overloading
        message();
        message(1000);
        message(200, 300);

        //Arguments are actual
    }

}



