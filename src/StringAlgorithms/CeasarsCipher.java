package StringAlgorithms;

import java.util.*;

// Assumptions
// Non Empty String
// Non Negative Integer meaning can be zero

// Scenario Missed
// If the Key is Very large the index has to be calibrated multiple times
// Can be done using String class without the need for an array

public class CeasarsCipher
{
	public static void main(String[] args)
	{
		String caesarCypherEncryptor = caesarCypherEncryptor("abc", 2);
		System.out.println("caesarCypherEncryptor = " + caesarCypherEncryptor);

	}

//   Solution 1
	public static String caesarCypherEncryptor(String str, int key) {
		// Write your code here.
		if (str.isEmpty()|| key ==0)
			return str;

		char[] arr = new char[26];
		int j = 0;
		for (char i = 'a' ; i <= 'z' ; i++) {
			arr[j] = i;
			j++;
		}

		//

		char[] input = str.toCharArray();

		for(int i = 0; i < input.length; i++)
		{
			for(int k = 0; k < arr.length; k++)
			{
				if(input[i] == arr[k])
				{
					int index = k + key;
					// 18 + 9
					// index starts from 0 so calibrate with 26
					index = index%26;
					System.out.println("index = " + index);
					input[i] = arr[index];
					break;
				}


			}

		}

		return String.valueOf(input);
	}


	public static String caesarCypherEncryptor2(String str, int key) {
		// Write your code here.
		if (str.isEmpty()|| key ==0)
			return str;

		String alphabets = "abcdefghijklmnopqrstuvwxyz";

		//

		char[] input = str.toCharArray();

		for(int i = 0; i < input.length; i++)
		{
			int newLetterIndex = alphabets.indexOf(input[i])+key;
			int index = newLetterIndex%26;
			input[i] = alphabets.charAt(index);
		}

		return String.valueOf(input);
	}



}
