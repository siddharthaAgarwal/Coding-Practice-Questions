class Solution {
    
    public boolean isPalindrome(char[] arr, int i, int j)
    {
        if(i>=j)
            return true;
        
        if(arr[i]!=arr[j])
            return false;
        
        return isPalindrome(arr,i+1, j-1);
    }
    
    
    public boolean validPalindrome(String s) {
        char[] arr = s.toCharArray();
        int i=0, j= arr.length-1;
        while(i<j)
        {
            if(arr[i]!=arr[j])
                return isPalindrome(arr, i+1, j) || isPalindrome(arr, i, j-1);
            i++; j--;
            
        }
        return true;
    }
}