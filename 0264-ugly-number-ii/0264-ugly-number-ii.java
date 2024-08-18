class Solution {
    public int nthUglyNumber(int n) {
       
       int[] dp = new int[n+1];
       dp[0]=0;
       dp[1]=1;
       

       int i1=1,i2=1,i3=1;
       for(int i=2;i<=n;i++)
       {
         dp[i]= Math.min(dp[i1]*2, Math.min(dp[i2]*3,dp[i3]*5));

         if(dp[i]==dp[i1]*2)
            i1++;
         if(dp[i]==dp[i2]*3)
            i2++;
         if(dp[i]==dp[i3]*5)
            i3++;
       }
       return dp[n];


    }
}