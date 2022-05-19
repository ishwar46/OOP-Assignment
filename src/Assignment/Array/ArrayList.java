package Assignment.Array;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.*;

// A resizeable array
//Elements can be added and removed after compilation phase
//store reference data types

class FoodArray{
    public static void main(String[] args) {
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("momo");
        food.add("ham");

        food.set(0,"sushi");
        food.remove(2);
        //food.clear();

        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }
    }

}