class Solution {
    public int totalHammingDistance(int[] A) {
         if (A == null) {
            return 0;
        }
        
        int res=0;
        int n=A.length;
        for(int i=0;i<32;i++)
        {
            int countOne=0;
            for(int j=0;j<n;j++)
            {
               countOne+=(A[j]>>i)&1; 
            }
            res= (res+(countOne* (n-countOne)));
        }
        return res;
        
    }
}

