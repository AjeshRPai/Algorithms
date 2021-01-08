package StringAlgorithms;

// Question
// Check if a string is palindrome or not

// A String is palindrome when written forward and backward, it will be same

// Considerations
// A Single Character String is palindrome

public class Palindrome
{
	public static void main(String[] args)
	{
		boolean b = isPalindrome("abbca");
		System.out.println("b = " + b);
	}

	public static boolean isPalindrome(String str) {
		if(str.length()==1)
			return true;

		int start = 0;
		int end = str.length()-1;

		while(end > start)
		{
			if(str.charAt(start)!=str.charAt(end))
				return false;
			start++;
			end--;
		}

		return true;
	}
}
