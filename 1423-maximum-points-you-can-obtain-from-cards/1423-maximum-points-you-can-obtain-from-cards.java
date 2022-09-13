class Solution {
    public int maxScore(int[] A, int k) {
            
        int n=A.length;
        int sum=0;
        for(int i=0;i<k;i++)
        {
            sum+=A[i];
        }
        
        int max= sum;
        
        for(int i=0;i<k;i++)
        {
            sum-=A[k-i-1];
            sum+=A[n-i-1];
            max=Math.max(max,sum);
        }
        return max;
        
    }
}