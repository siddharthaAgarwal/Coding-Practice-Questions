class Solution {
    public int totalHammingDistance(int[] A) {
         if (A == null) {
            return 0;
        }
        long res=0;
        for(int i=0;i<32;i++)
        {
            long countOne=0;
            int num=0;
            int c=0;
            for(int j=0;j<A.length;j++)
            {
                num=A[j]>>i;
                if((num&1)==1)countOne++;
                if(num==0)c++;
                
            }
            res= (res+(countOne* (A.length-countOne)))%1000000007;
                if(c==A.length)
                break;
        }
        return (int)res;
        
    }
}