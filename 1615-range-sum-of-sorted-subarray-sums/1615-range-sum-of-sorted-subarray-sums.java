class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
          List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int sum=0;
            
            for(int j=i;j<n;j++)
            {
                sum= sum+ nums[j];
           //         cout<<sum<<" ";
            
                list.add(sum);
            
            }
        }
        
    long sum=0;
       Collections.sort(list);
        int c=1;
        for(int i: list)
        {
          // cout<<*i<<" ";
            if(c>=left && c<=right)
            {
                sum+=i;
            }
            c++;
            if(c>right)
                break;
            
        }
        
        return (int)(sum%1000000007);
    }
}