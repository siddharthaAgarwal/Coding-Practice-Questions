class Solution {
    public String mergeAlternately(String word1, String word2) {
         
        StringBuilder strBuilder = new StringBuilder();
        
        for(int i=0, j=0;i<word1.length() || j<word2.length();i++,j++)
        {
            
            if(i<word1.length())
            {
                strBuilder.append(word1.charAt(i));
            }
            if(j<word2.length())
            {
                strBuilder.append(word2.charAt(j));
            }
        }
        return  strBuilder.toString();
    }
}