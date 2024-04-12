class Solution {
    public int mySqrt(int x) {
     
        long l=0, r=x;
        long res=0;
        
        if(x==1) return x;
        
        while(l<r)
        {
            long mid= (l+r)/2;
            
            if(mid* mid<x)
            {
                res=mid;
                l=mid+1;
            }
            else if(mid*mid>x) {
                r=mid;
            }
            else
            {
                return (int)mid;
            }
        }
        return (int)res;
    }
}