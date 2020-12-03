package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Question
// The problem takes in an array and finds 3 numbers that when together added
// corresponds to a target sum
// The result should be in the ascending order

// Solution 1
// Sort the array
// Take the first element and iterate through the array with sum equal
// to the subtract

public class TargetSumForThreeNumbers {
    public static void main(String[] args) {
        //Test 1
        int[] test1 = new int[]{12, 3, 1, 2, -6, 5, -8, 6};
        int target = 0;
        List<Integer[]> integers = threeNumberSum(test1, target);
        System.out.println("result 1");
        for (Integer[] integer : integers) {
            System.out.println("integer = " + Arrays.toString(integer));
        }

    }

    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        Arrays.sort(array);
        ArrayList<Integer[]> arrayList = new ArrayList<Integer[]>();
        for (int i = 0; i < array.length; i++)
        {
            for (int j = i + 1; j < array.length; j++)
            {
                int target = targetSum - array[i];
                target = target - array[j];
                for (int k = j + 1; k < array.length; k++)
                {
                    if(array[k]!=target)
                        continue;
                    Integer[] triplet = new Integer[3];
                    triplet[0] = array[i];
                    triplet[1] = array[j];
                    triplet[2] = array[k];
                    arrayList.add(triplet);
                }
            }
        }
        return arrayList;
    }
}
