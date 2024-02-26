class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0, dSum=0;
        for(int i:nums)
        {
            eleSum+=i;
            while(i!=0)
            {
                dSum+=i%10;
                i/=10;
            }
        }
     return eleSum-dSum;   
    }
}