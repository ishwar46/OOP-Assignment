package Assignment.Array;

import java.util.Arrays;

public class QuestionTwo {
    public static void main(String[] args) {
            int[] newarr = numbers();
            System.out.println(Arrays.toString(newarr));
        }

        static int[] numbers(){
            int[] Array = {5,6,4,4,9,5,2,4,5,22,12,22};
            return Array;
        }
}