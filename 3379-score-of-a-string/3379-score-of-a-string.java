class Solution {
    public int scoreOfString(String s) {

        int res=0;
        char prev=s.charAt(0);
     for(char c: s.toCharArray())
     {
        res+= Math.abs(c-prev);
        prev=c;
     }   

     return res;
    }
}