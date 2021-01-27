package GreedyAlgorithms;

import java.util.*;

public class MinimumWaitingTime
{

	public static void main(String[] args)
	{
		int[] arrays = {3,2,1,2,6};
		int minimumWaitingTime = minimumWaitingTime2(arrays);
		System.out.println("minimumWaitingTime = " + minimumWaitingTime);
	}

	// In this approach we are going over the query by iterating and adding it
	public int minimumWaitingTime1(int[] queries) {
		if(queries.length==0)
			return 0;
		Arrays.sort(queries);

		System.out.println("queries = " + Arrays.toString(queries));

		int[] time = new int[queries.length];
		time[0] =0;
		for(int i = 1; i < queries.length; i++)
		{
			time[i] += (time[i-1] + queries[i - 1]);
		}
		int min =0;

		for(int i = 0; i < time.length; i++)
		{
			min += time[i];
		}

		return min;
	}


	// Instead of adding it we know upfront that this will be added to every query.
	// So Multiplying it with queries left will add to the solution

	public static int minimumWaitingTime2(int[] queries) {
		// Write your code here.

		if(queries.length==0)
			return 0;

		Arrays.sort(queries);

		System.out.println("queries = " + Arrays.toString(queries));

		int min = 0;


		for(int i = 0; i < queries.length; i++)
		{
			int duration = queries[i];
			int queriesLeft = queries.length - (i+1);
			min += duration * queriesLeft;
		}

		return min;
	}
}
