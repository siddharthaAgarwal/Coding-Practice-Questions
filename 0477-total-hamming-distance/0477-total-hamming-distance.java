class Solution {
    public int totalHammingDistance(int[] A) {
         if (A == null) {
            return 0;
        }
        long res=0;
        for(int i=0;i<32;i++)
        {
            long countOne=0;
            for(int j=0;j<A.length;j++)
            {
               countOne+=(A[j]>>i)&1; 
            }
            res= (res+(countOne* (A.length-countOne)));
        }
        return (int)res;
        
    }
}

