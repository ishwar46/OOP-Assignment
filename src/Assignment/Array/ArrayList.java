package Assignment.Array;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.*;

import static java.util.Collections.sort;

// A resizeable array
//Elements can be added and removed after compilation phase
//store reference data types

class FoodArray{
    public static void main(String[] args) {
        ArrayList<String> snacks = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);

        snacks.add("pizza");
        snacks.add("momo");
        snacks.add("ham");
        snacks.add("noodles");
        snacks.add("maggie");

        snacks.set(0,"sushi");
        snacks.remove(2);
        //snacks.clear();

        for(int i = 0; i<snacks.size(); i++){
            String value = sc.next();
            //System.out.println(snacks.get(i));
            System.out.println(value);
        }
    }

}


class NewArray {
    public static void main(String[] args) {

        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("Ishu");
        nameList.add("Sam");
        nameList.add("Sandeep");
        nameList.add("Sijan");
        nameList.add("Roz");

        nameList.remove(4);
        System.out.println(nameList);
        System.out.println(nameList.size());
    }
}

class IntArray{
    public static void main(String[] args) {
        ArrayList<Integer> name = new ArrayList<Integer>();

        name.add(0,3);
        name.add(0,1);
        name.add(1,1);
        name.add(2,3);
        name.add(3,5);
        name.add(4,6);

        name.get(4);

        System.out.println(name);
        System.out.println(name.get(4));

    }
}

/*
class ClassArrayList{
    public static void main(String[] args) {
        ArrayList<Integer> text = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        for(int i = 0; i<10; i++){
            text.add(sc.nextInt());
        }
        for(int j=0; j<)

    }
}*/

class SortArray{
    public static void main(String[] args) {
        ArrayList <String> testList = new ArrayList();

        testList.add("Ishu");
        testList.add("Sijan");
        testList.add("Sam");
        testList.add("Dhawit");
        testList.add("Sansdeep");
        testList.add("Sandhya");
        testList.add("Ishu");
        testList.add("Ishu");
        testList.add("Roz");
        Collections.sort(testList);

        for(String i: testList){
            System.out.println(i);
        }
    }
}



class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println(checkPrime(20));
    }

    private static List<Integer> checkPrime(int n) {

        boolean[] primes = new boolean[n + 1];
        Arrays.fill(primes, true);

        for (int i = 2; i * i < n; i++) {

            if (primes[i]) {

                for (int j = i * i; j <= n; j += i)
                    primes[j] = false;
            }
        }

        List<Integer> primeNumbers = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (primes[i])
                primeNumbers.add(i);
        }
        return primeNumbers;
    }

}

class Main {
    public static void main(String[] args){

        ArrayList<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(3);
        number.add(5);
        System.out.println(number);

        System.out.println(number.clone());
    }
}
