class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] res = new int[2*n];
        
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i*n+j]= nums[j];
            }
        }
        return res;
    }
}