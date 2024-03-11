class Solution {
    
    static int lcs(int x, int y, String s1, String s2, int[][] dp)
    {
        
        if(dp[x][y]!=-1)
        {
            return dp[x][y];
        }



        
        if(x==0|| y==0)
        {
            dp[x][y]=0;
            return 0;
        }
        
        if(s1.charAt(x-1)==s2.charAt(y-1))
        {
            dp[x][y]= 1+ lcs(x-1,y-1, s1,s2,dp);
            return  dp[x][y];
        }     
         
        dp[x][y]= Math.max( lcs(x,y-1, s1,s2,dp), lcs(x-1,y, s1,s2,dp));
        return dp[x][y];
         
    }
    
    
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m=text1.length();
        int n=text2.length();
        
        int[][] dp = new int[m+1][n+1];
        
        for(int[] i:dp)
        {
            Arrays.fill(i,-1);
        }
        
        return lcs(m,n,text1,text2,dp);
        
    }
}