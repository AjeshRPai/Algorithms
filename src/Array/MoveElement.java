package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class MoveElement {

    public static void main(String[] args) {
        List<Integer> test1 = new ArrayList<>();
        test1.add(1);
        test1.add(2);
        test1.add(3);
        test1.add(4);
        test1.add(5);

        List<Integer> result = moveElementToEnd(test1, 2);
        System.out.println("result = " + result);



    }

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        List<Integer> resultArray = new ArrayList<>();
        List<Integer> addToEnd = new ArrayList<>();
        for (Integer integer : array) {
            if (integer != toMove) {
                resultArray.add(integer);
            }
            else
                addToEnd.add(integer);
        }
        resultArray.addAll(addToEnd);
        return resultArray;
    }

}
