package Array;

//Question
//Traverse through a 2 dimensional array
// and print the elements in spiral order

// Spiral order starts at the top left corner of the two dimensional array
// goes to the right and proceeds in spiral order

// Case 1
// The array can be n!=m or n==m(square shaped)

import java.util.*;

class SpiralTraverse
{
	public static void main(String[] args)
	{
		int[][] array =
			{
				{1,2,3,4},
				{12,13,14,5},
				{11,16,15,6},
				{10,9,8,7},
			};
		List<Integer> integers = spiralTraverse(array);
		System.out.println("integers = " + integers);

	}

	public static List<Integer> spiralTraverse(int[][] array) {
		// Write your code here.
		if(array.length==0)
			return new ArrayList<>();

		ArrayList<Integer> result = new ArrayList<>();

		int startRow = 0;
		int endRow = array.length - 1;
		int startCol = 0;
		int endCol = array[0].length-1;

		while(startRow <= endRow && startCol <= endCol)
		{
			//Iterate to right end element
			for(int col = startCol; col <= endCol; col++)
			{
				result.add(array[startRow][col]);
			}

			//Iterate down from element just under the row
			for(int row = startRow+1; row<=endRow;row++)
			{
				result.add(array[row][endCol]);
			}

			//Iterate from right end to start
			for(int col=endCol-1;col>=startCol;col--)
			{
				if(startRow==endRow)
					break;
				result.add(array[endRow][col]);
			}

			//Iterate from the down to up
			for(int row=endRow-1;row>startRow;row--)
			{
				if(startCol==endCol)
					break;
				result.add(array[row][startCol]);
			}
			startRow++;
			endRow--;
			startCol++;
			endCol--;
		}
		return result;
	}

}
