package DynamicProgramming;


/**
 *
 * @see <a href="https://www.geeksforgeeks.org/count-ways-reach-nth-stair">Question</a>
 *
 *
 *
 * There are n stairs, a person standing at the bottom wants to reach the top.
 * The person can climb either 1 stair or 2 stairs at a time. Count the number of ways, the person can reach the top.
 *
 * */

public class NumberOfWays {
    
    // Returns number of ways to reach s'th stair
    private static int countWays(int s, int m) {
        return countWaysUtil(s+1, m);
    }
    
    private static int countWaysUtil(int n, int m) {
        int res[]=new int[n];
        res[0]=1;
        res[1]=1;
        
        for(int i=2;i<n;i++){
            res[i]=0;
            for(int j=0;j<=m && j<=i;j++)
                res[i]+=res[i-j];
        }
        
        
        return res[n-1];
    }
    
    public static void main(String[] args) {
        int s = 6, m = 3;
        System.out.println("Nuber of ways = " + countWays(s, m));
    }
    
}
