class Solution {
    
    
    public boolean isValid(int[] arr, int n, int candidateDays, int bucket, int flowers)
    {
        int bloomedFlowersCount=0;
        int currBucket=0;
        for(int i: arr)
        {
            if(i<=candidateDays)
                bloomedFlowersCount++;
            else
               bloomedFlowersCount =0;
           
                if(bloomedFlowersCount==flowers)
                {
                    currBucket++;
                    bloomedFlowersCount=0;
                }
        }
        return bucket<=currBucket;
    }
    
    public int minDays(int[] bloomDay, int m, int k) {
        int n= bloomDay.length;
        
        if(n<m*k)
            return-1;
        
        int left=1, right=0;
        for(int i:bloomDay)
            right=Math.max(right, i);
        
        int days=-1;
        while(left<=right)
        {
            int mid= left+(right-left)/2;
            
            //System.out.println(mid+" "+isValid(bloomDay,n,mid,m,k) );
            
            if(isValid(bloomDay,n,mid,m,k))
            {
                days=mid;
                right=mid-1;
            }
            else
                left=mid+1;
            
        }
        return days;
        
    }
}