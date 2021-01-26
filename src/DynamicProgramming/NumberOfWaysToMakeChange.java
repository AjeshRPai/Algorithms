package DynamicProgramming;

public class NumberOfWaysToMakeChange
{
	public static void main(String[] args)
	{
		int[] denoms = new int[] {2, 3, 4, 7};
		int i = numberOfWaysToMakeChange(7, denoms);
		System.out.println("i = " + i);
	}

	public static int numberOfWaysToMakeChange(int n, int[] denoms)
	{
		// Write your code here.

		if(n == 0 || denoms.length == 0)
			return 1;

		int[] number_of_ways = new int[n+1];

		number_of_ways[0] = 1;

		for(int denom : denoms)
		{
			for(int amount = 0; amount < n+1; amount++)
			{
				if(denom <= amount)
				{
					number_of_ways[amount] += number_of_ways[amount - denom];
				}
			}
		}

		return number_of_ways[n];
	}
}
