package Array;

//Scratch Pad
// Logic 1: Take the elements in the order and subtract from target
// then check if that subtract is present in the array
//

import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        //test case 1
        int[] ints = new int[]{1,2,3,4,5,6,7,8,9};
        int[] result = twoNumberSum(ints, 10);
        System.out.println("result = " + Arrays.toString(result));

        //test case 2
        int[] ints2 = new int[]{4,6};
        int[] result2 = twoNumberSum(ints2, 10);
        System.out.println("result2 = " + Arrays.toString(result2));


    }

    public static int[] twoNumberSum(int[] array, int targetSum) {
        // Write your code here.
        for (int i = 0; i < array.length - 1; i++) {
            System.out.println("i = " + i);
            int target = targetSum - array[i];
            for (int j = i + 1; j < array.length; j++) {
                System.out.println("j = " + j);
                if (array[j] == target)
                    return new int[]{array[i], target};
            }
        }
        return new int[0];
    }
}
