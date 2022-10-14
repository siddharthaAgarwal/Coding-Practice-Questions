class Solution {
    public String addBinary(String A, String B) {
        int n= A.length()-1;
        int m= B.length()-1;
        
        String res="";
        int c=0;        
        while(n>=0 || m>=0)
        {
            int sum=c;
            if(n>=0)
            {
                sum+=(int)(A.charAt(n)-'0');
                n--;
            }
            
            if(m>=0)
            {
                sum+=(int)(B.charAt(m)-'0');
                m--;
            }
            c=sum/2;
            sum%=2;
            res= sum+res;
        }
        if(c!=0)
            return ("1"+res);
        return res;
    }
}