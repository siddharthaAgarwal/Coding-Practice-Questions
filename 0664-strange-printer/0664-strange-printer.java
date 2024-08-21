class Solution {

    int helper(String s, int i, int j, int[][] dp)
    {
        if(i>j)
            return 0;
        
        if(dp[i][j]!=-1)
            return dp[i][j];

        int ans = helper(s,i,j-1, dp)+1;

        for(int k=i;k<j;k++)
        {
            if(s.charAt(k)==s.charAt(j))
            {
                ans = Math.min(ans, helper(s,i,k, dp)+helper(s,k+1,j-1, dp));
            }
        }
        dp[i][j]=ans;
        return ans;
    }

    public int strangePrinter(String s) {
        int[][] dp = new int[s.length()+1][s.length()+1];

        for(int i[]: dp)
        {
            Arrays.fill(i,-1);
        }
        return helper(s,0,s.length()-1, dp);
    }
}


