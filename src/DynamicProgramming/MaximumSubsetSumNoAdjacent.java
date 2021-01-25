package DynamicProgramming;

// If the array length is 0 or only 1 then return default response

public class MaximumSubsetSumNoAdjacent
{
	public static void main(String[] args)
	{
		int[] array = new int[] {30, 25, 50, 55, 100};
		int max = maxSubsetSumNoAdjacent(array);
		System.out.println("max = " + max);
	}

	// Iterate through the array and
	public static int maxSubsetSumNoAdjacent(int[] array)
	{
		if(array.length == 0)
			return 0;
		else if(array.length == 1)
			return array[0];

		int[] maxSums = array.clone();

		// Get the first and second
		maxSums[1] = Math.max(array[0], array[1]);

		for(int i = 2; i < array.length; i++)
		{
			maxSums[i] = Math.max(maxSums[i - 1], maxSums[i - 2] + array[i]);
		}

		return maxSums[array.length - 1];
	}

}
