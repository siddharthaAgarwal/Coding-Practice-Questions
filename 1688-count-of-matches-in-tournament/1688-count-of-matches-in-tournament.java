class Solution {
    
    
    public int numberOfMatches(int n) {
        
        if(n<=1)
        {
            return 0;
        }
        
        return n/2+numberOfMatches((n+1)/2);
    }
}