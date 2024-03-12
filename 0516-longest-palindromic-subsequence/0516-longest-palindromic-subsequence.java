class Solution {
    
    
    static int lcs(int n, int m, String s1, String s2, int[][] dp)
    {
        for(int i=1;i<=n; i++)
        {
            for(int j=1;j<=m; j++)
            {
                if(s1.charAt(i-1)== s2.charAt(j-1))
                {
                    dp[i][j]=1+ dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        return dp[n][m];
    }
    
    
    public int longestPalindromeSubseq(String s) {
        
        int n= s.length();
        String s2= new StringBuilder(s).reverse().toString();
        int[][] dp = new int[n+1][n+1];
        return lcs(n,n,s,s2,dp);
        
    }
}