package Array;

import java.util.Arrays;

import static java.lang.System.out;

//Created by Ajesh on 15/02/18

public class StockBuyingAndSelling {
    public static void main(String[] args) {
        int[] prices=new int[]{2, 5, 7, 1, 4, 3,1,3};
        int  n = prices.length;
        System.out.println("profit is ="+getMaxProfit(prices,n,3));
    }
    
    private static int getMaxProfit(int price[], int n, int k)
    {
        // table to store results of subproblems
        // profit[t][i] stores maximum profit using
        // atmost t transactions up to day i (including
        // day i)
        int[][] profit=new int[k+1][n+1];
        
        // For day 0, you can't earn money
        // irrespective of how many times you trade
        for (int i = 0; i <= k; i++)
            profit[i][0] = 0;
        
        // profit is 0 if we don't do any transation
        // (i.e. k =0)
        for (int j= 0; j <= n; j++)
            profit[0][j] = 0;
        
        // fill the table in bottom-up fashion
        for (int i = 1; i <= k; i++)
        {
            out.print("i="+i);
            for (int j = 1; j < n; j++) {
                out.print(" j="+j);
                int max_so_far = Integer.MIN_VALUE;
                
                for (int m = 0; m < j; m++) {
                    out.println(" m="+m);
                    max_so_far = Integer.max(max_so_far,
                            price[j] - price[m] + profit[i - 1][m]);
                    out.println("Max ="+max_so_far+
                                " Price current="+price[j]+
                                 " Price tomoro= "+price[m]+
                                  " Profit some="+profit[i-1][m]);
                    
                }
                profit[i][j] = Integer.max(profit[i][j-1], max_so_far);
                out.println(" "+profit[i][j]);
    
            }
            out.println("");
        }
        
        return profit[k][n-1];
    }
}
