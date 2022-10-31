class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res= new ArrayList<Integer>();
        int firstMajor =0, freq1=0, secondMajor=0, freq2=0, n=nums.length;
        
        for(int i=0;i<n;i++)
        {
            if(nums[i] == firstMajor)
            {
                freq1++;
            }
            else if(nums[i] == secondMajor)
            {
                freq2++;
            }
            else if(freq1==0)
            {
                freq1=1;
                firstMajor=nums[i];
            }
            else if(freq2==0)
            {
                freq2=1;
                secondMajor = nums[i];
            }
            else
            {
                freq1--;
                freq2--;
            }
        }
        
        //System.out.println(firstMajor+" "+secondMajor);
        
        freq1=0; freq2=0;
        
        for(int i: nums)
        {
            if(firstMajor==i)
                freq1++;
            else if(secondMajor==i)
                freq2++;
        }
        
        if(freq1>n/3)
        {
            res.add(firstMajor);
        }
        if(freq2>n/3)
        {
            res.add(secondMajor);
        }
        return res;
    }
}