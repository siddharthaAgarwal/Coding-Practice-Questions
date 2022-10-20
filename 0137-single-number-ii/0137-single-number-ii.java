class Solution {
    public int singleNumber(int[] A) {
        int num=0;
        for(int i=0;i<32;i++)
        {
            int one=0;
            for(int j=0; j<A.length;j++)
            {
                one+=(A[j]&1);
                A[j]>>=1;
            }
            int n=one%3;
            num= num| n<<i ;
        }
        return num;
    }
}