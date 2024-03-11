class Solution {
    public int fib(int number) {
    {
        int[] dp = new int[number+1];
        
        dp[0]=0;
        if(number>=1)
        {
            dp[1]=1;
        }
        
        for(int i=2;i<=number;i++)
        {
            dp[i]= dp[i-1]+dp[i-2];
        }
        return dp[number];
    }

    }
}