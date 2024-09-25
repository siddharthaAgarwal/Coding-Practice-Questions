class Solution {
    
    public int helper(String s, int i, int j,int[][] dp){
        if(i>=j)
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(s.charAt(i)== s.charAt(j))
        {
            return helper(s, i+1, j-1, dp);
        }
        dp[i][j]= 1+Math.min(helper(s,i, j-1, dp), helper(s,i+1, j, dp));
        return dp[i][j];
    }
    public int minInsertions(String s) {
        int[][] dp = new int[s.length()][s.length()];
        for(int[] i:dp)
        {
            Arrays.fill(i,-1);
        }
        return helper(s,0, s.length()-1, dp);
    }
}