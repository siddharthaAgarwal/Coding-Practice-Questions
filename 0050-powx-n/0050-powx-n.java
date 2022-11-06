class Solution {
    public double myPow(double x, int n) {
        if(n==1)
            return x;
        
        if(n==0)
            return 1;
        
        double res=0;
        if(n%2==0)
        {
            res = myPow(x*x, Math.abs(n/2));
        }
        else
        {
            res = x*myPow(x*x, Math.abs(n/2));
        }
        
        if(n<0)
            return 1/res;
        return res;
        
    }
}