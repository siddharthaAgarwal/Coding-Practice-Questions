class Solution {
    public int searchInsert(int[] a, int b) {
        
        int n=a.length;
        int left=0, right=n-1;
        int mid =0;
        
        while(left<=right)
        {

            mid=left+(right-left)/2;
            if(a[mid]==b)
            {
                return mid;
            }
            else if(a[mid]<b)
            {
                left=mid+1;
            }
            else
            right=mid-1;
            //System.out.println("left->"+left+"-> "+leftVal+", mid->"+mid+"right ->"+right+"->"+rightVal);
        }
        return left;
        
        
    }
}