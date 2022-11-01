class Solution {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum=0;
        for(int i: arr)
            sum+=i;
        
        if(sum%3!=0)
            return false;
        int currSum=0;
        int count=0;
        for(int i:arr)
        {
            currSum+=i;
            if(currSum==sum/3)
            {
                currSum=0;
                count++;
            }
        }
        
        if(count>=3)
            return true;
        return false;
    }
}