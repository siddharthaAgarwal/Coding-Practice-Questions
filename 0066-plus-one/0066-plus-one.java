class Solution {
    public int[] plusOne(int[] digits) {
        int n= digits.length;
        int c=0;
        
        int i=n-1;
        do
        {
            digits[i] = digits[i]+1;
            c=digits[i]/10;
            digits[i] = digits[i]%10;
            i--;
        }while(c!=0 && i>=0);
        
        if(c==0){
            return digits;
        }

        int []arr= new int[n+1];
        arr[0]=1;

        return arr;
    }
}