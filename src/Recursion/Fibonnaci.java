package Recursion;

//Generate the nth fibonnaci number
// Fibonnaci series is
public class Fibonnaci
{
	public static void main(String[] args)
	{
		int fibonnaci = getNthFib(6);
		System.out.println("fibonnaci = " + fibonnaci);
	}

	public static int getNthFib(int n) {
		// Write your code here.
		if(n==1)
			return 0;
		if(n==2)
			return 1;

		return getNthFib(n - 1)+getNthFib(n-2);
	}
}
