package DynamicProgramming;

public class LongestCommonSubsequence {
    
    int lcs(char[] X,char[] Y,int m,int n){
        int result[][]=new int[m+1][n+1];
        
        for(int i=0;i<=m;i++){
            for(int j=0;j<=n;j++){
                if(i==0 || j==0)
                    result[i][j]=0;
                else if(X[i-1]==Y[j-1])
                    result[i][j]=result[i-1][j-1]+1;
                else result[i][j]=max(result[i-1][j],result[i][j-1]);
            }
        
        }
        return result[m][n];
    }
    
    private int max(int a, int b){
        return (a>b)?a:b;
    }
    
    public static void main(String args[]){
        
        LongestCommonSubsequence LCS = new LongestCommonSubsequence();
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
    
        char[] X=s1.toCharArray();
        char[] Y=s2.toCharArray();
        int m = X.length;
        int n = Y.length;
    
        System.out.println("Length of LCS is" + " " +
                LCS.lcs( X, Y, m, n ) );
    }
}
