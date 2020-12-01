package Array;

import java.util.ArrayList;
import java.util.List;

// Question
// A Subsequence of an array is a set of numbers that arent
// necessarily adjacent in the array but are in the same order as they appear in the array
// [1,2,3,4] and [2,4]

// Solution 1
// Get the first number in sequence and check whether its present in array and iterate through the sequence
// If found then shift the counter of the sequence and array by one and call the function recursively

// O(n) as we have to iterate through the entire array sequence

public class ValidateSubsequence
{
	public static void main(String[] args)
	{
		//test1
		List<Integer> test1 = new ArrayList<>();
		test1.add(1);
		test1.add(2);
		test1.add(3);
		test1.add(4);
		test1.add(5);

		List<Integer> testSequence1 = new ArrayList<>();
		testSequence1.add(1);
		testSequence1.add(2);
		testSequence1.add(3);
		testSequence1.add(4);

		boolean isValid = isValidSubsequence(test1, testSequence1);
		System.out.println("isValid = " + isValid);

	}

	public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
		System.out.println("array = " + array + ", sequence = " + sequence);

		// Write your code here.
		if(sequence.size()>array.size())
			return false;

		if(sequence.get(0).equals(array.get(0)))
		{
			if(sequence.size()==1)
				return true;
			else
				return isValidSubsequence(array.subList(1, array.size()), sequence.subList(1, sequence.size()));
		}
		else
		{
			return isValidSubsequence(array.subList(1, array.size()), sequence);
		}
	}
}
