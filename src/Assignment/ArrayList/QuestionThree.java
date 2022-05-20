package Assignment.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class QuestionThree {
    public static void main(String[] args) {

        ArrayList<Integer> newlist = new ArrayList<>();
        newlist.add(3);
        newlist.add(2);
        newlist.add(1);
        newlist.add(4);
        newlist.add(6);
        newlist.add(5);
        newlist.add(10);
        newlist.add(9);
        newlist.add(12);
        newlist.add(11);
        System.out.println("Before Sorting: " +newlist);
        Collections.sort(newlist);
        System.out.println("Ascending Order: " +newlist);
        Collections.sort(newlist,Collections.reverseOrder());
        System.out.println("Descending Order:" +newlist);


}}