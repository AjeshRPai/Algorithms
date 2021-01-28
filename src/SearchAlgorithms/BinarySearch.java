package SearchAlgorithms;

import java.util.*;

public class BinarySearch
{
	public static void main(String[] args)
	{
		int[] inputArray = new int[] {1,5,23,111};
		int index = binarySearch(inputArray, 111);
		System.out.println("index = " + index);
	}

	//  Input Conditions
	//	If input array is empty
// The input array will be sorted
//	targer Integer will be present

	public static int binarySearch(int[] array, int target)
	{

		if(array.length==0)
			return -1;

		int start = 0;
		int end = array.length-1;

		while(start<end)
		{
			System.out.println("start = " + start);
			System.out.println("end = " + end);
			int middle = ((start+end) / 2);

			System.out.println("middle = " + middle);
			System.out.println("value = " + array[middle]);
			if(array[middle]==target)
				return middle;

			if(end-start==1)
				if(array[end]==target)
					return end;
				else
					return -1;

			if(array[middle]>target)
				end = middle;
			if(array[middle]<target)
				start = middle;

		}
		return -1;
	}
}
