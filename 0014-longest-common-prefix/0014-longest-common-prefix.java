class Solution {
    
    
     
    String getCommon(String s1, String s2)
    {
        
        StringBuilder res= new StringBuilder("");
        int n=Math.min(s1.length(), s2.length());
        for(int i=0;i<n;i++)
        {
            if(s1.charAt(i)== s2.charAt(i))
            res= res.append(s1.charAt(i));
            else
                break;
        }
        
        return res.toString();
    }

    public String longestCommonPrefix(String[] A) {
          String res=A[0];
        for(int i=1;i<A.length;i++)
        {
            String temp= getCommon(res, A[i]);
            if(temp.length()<res.length())
            {
                res=temp;
            }
        }
        return res;
        
    }
}