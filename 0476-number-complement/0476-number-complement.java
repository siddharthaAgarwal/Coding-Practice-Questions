class Solution {
    public int findComplement(int num) {
        int res=0;
        int mul=1;
        while(num!=0) {
            res= res + (num%2==0?1:0)*mul;
            num/=2;
            mul*=2;
        }
        return res;
    }
}