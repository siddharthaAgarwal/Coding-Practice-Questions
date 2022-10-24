class Solution {
    public int strStr(String A, String B) {
         if(B==null)
            return -1;
        
        int n=B.length();
        
        for(int i=0;i<A.length()-n+1;i++)
        {
            //System.out.println(A.substring(i,i+n));
            if(A.substring(i,i+n).equals(B))
            return i;
        }
        return -1;
    }
}