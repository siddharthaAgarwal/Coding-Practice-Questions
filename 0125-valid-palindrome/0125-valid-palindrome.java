class Solution {
    public boolean isPalindrome(String A) {
         A=A.toLowerCase();
        StringBuilder res= new StringBuilder();
        
        for(int i=0;i<A.length();i++)
        {
            char c= A.charAt(i);
            if((c>='a'&& c<='z')||(c>='0'&& c<='9') || (c>='A'&& c<='Z'))
            {
                res.append(c);
            }
        }
            for(int i=0;i<res.length()/2;i++)
            {
                if(res.charAt(i)!=res.charAt(res.length()-i-1))
                    return false;
            }
            
       return true;
        
    }
}