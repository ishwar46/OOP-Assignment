package Assignment.ArrayList;

import java.util.ArrayList;

public class QuestionOne {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>(3);
        cars.add("Ford Mustang GT");
        cars.add("Nissan Skyline");
        cars.add("Shelby 500 GT");
        for (String carName : cars) {
            System.out.println(carName);
        }
    }
}