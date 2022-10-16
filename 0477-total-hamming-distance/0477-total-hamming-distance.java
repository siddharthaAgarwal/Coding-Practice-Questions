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
                if(((A[j]>>i)&1)==1)countOne++;
                
            }
            res= (res+(countOne* (A.length-countOne)))%1000000007;
        }
        return (int)(res);
        
    }
}