package Assignment.ArrayList;

import java.util.ArrayList;

public class QuestionOne {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("> Ford Mustang GT");
        cars.add("> Nissan GTR");
        cars.add("> Shelby 500 GT");
        for (String names : cars) {
            System.out.println(names);
        }
    }
}