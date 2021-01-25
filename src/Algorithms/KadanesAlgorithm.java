package Algorithms;

// Question: Write a function that takes in a non empty array of integers and
// returns the maximum sum that can be obtained by summing
public class KadanesAlgorithm
{
	public static void main(String[] args)
	{
		int[] input = new int[] {3, 5, -9, 1, 3, -2, 3, 4, 7, 2, -9, 6, 3, 1, -5, 4};
		int val = kadanesAlgorithm(input);
		System.out.println("val = " + val);
	}

	public static int kadanesAlgorithm(int[] array)
	{
		// Write your code here.
		if(array.length == 0)
			return 0;
		else if(array.length == 1)
			return array[0];

		int maxEndingHere = array[0];
		int maxSoFar = array[0];

		for(int i = 1; i < array.length; i++)
		{
			maxEndingHere = Math.max(array[i], array[i] + maxEndingHere);
			maxSoFar = Math.max(maxSoFar, maxEndingHere);
		}

		return maxSoFar;
	}
}
