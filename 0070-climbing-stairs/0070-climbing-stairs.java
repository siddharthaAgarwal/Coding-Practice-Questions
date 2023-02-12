class Solution {
    public int climbStairs(int num) {
        int n= Math.max(num,2);
        
        int[] arr = new int[n+1];
        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        
        for(int i=3;i<=n;i++)
        {
            arr[i]= arr[i-1]+arr[i-2]; 
        }
        return arr[num];
    }
}