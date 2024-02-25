class Solution {
    public int countDigits(int num) {
        int count=0;
        var d=num;
        while(num!=0)
        {
            count += (d% (num%10))==0?1:0;
            
            num/=10;
        }
        
        return count;
    }
}