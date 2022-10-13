class Solution {
    public int minAddToMakeValid(String A) {
         int a=0, res=0;
        for(char c: A.toCharArray())
        {
            if(c=='(')
                a++;
            else
                a--;
                
            if(a<0)
            {
                res++;
                a=0;
            }
        }
        return res+a;
    }
}