package Array;

// Question
// Find numbers from the two arrays which has the closest absolute difference to zero
// And returns an array containing these two values

// Solution
// Take a number from each array and calculate the difference
// If a difference is less than the smallest difference then store it and
// iterate through the rest of the array


import java.util.Arrays;

public class SmallestDifference {

    public static void main(String[] args) {
        int[] firstArray = new int[]{-1, 5, 10, 20, 28, 3};
        int[] secondArray = new int[]{26, -5, 135, 15, 17};

        int[] ints = smallestDifference(firstArray, secondArray);
        System.out.println("ints = " + Arrays.toString(ints));
    }

    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        int smallestDifference = Integer.MAX_VALUE;
        int[] smallestDifferenceArray = new int[2];
        for (int i : arrayOne) {
            for (int j : arrayTwo) {
                int difference = Math.abs(i-j);
                System.out.println("difference = " + difference + " i = " + i + " j =" + j +" smallestDifference = "+smallestDifference);
                if (difference < smallestDifference) {
                    smallestDifference = difference;
                    smallestDifferenceArray[0] = i;
                    smallestDifferenceArray[1] = j;
                }
            }
        }
        return smallestDifferenceArray;
    }
}
