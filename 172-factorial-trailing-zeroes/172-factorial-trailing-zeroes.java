class Solution {
    public int trailingZeroes(int n) {
        int num=5;
        int count=0;
        while(n/num>0)
        {
            count = count + n/num;
            num*=5;
        }
        return count;
    }
}