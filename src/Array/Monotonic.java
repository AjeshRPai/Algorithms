package Array;

import java.util.Arrays;

// Question
// An array is monotonic if its continuously increasing or Decreasing
// Same number can be there twice which is valid


public class Monotonic
{
	public static void main(String[] args)
	{
		int[] array = new int[] {-1, -5, -10, -1100, -1100, -1101, -1102, -9001};
		System.out.println("array = " + Arrays.toString(array));

		boolean monotonic = isMonotonic(array);
		System.out.println("monotonic = " + monotonic);

	}

	public static boolean isMonotonic(int[] array)
	{
		if(array.length<=1)
			return true;

		boolean decreasing = false;
		boolean increasing = false;

		for(int i = 1; i < array.length; i++)
		{
			if(array[i-1] < array[i])
			{
				System.out.println("Decreasing");
				decreasing = true;
			}
			else if(array[i - 1] > array[i])
			{
				System.out.println("Increasing");
				increasing = true;
			}
		}

		if(increasing && decreasing)
			return false;

		return true;
	}


}
