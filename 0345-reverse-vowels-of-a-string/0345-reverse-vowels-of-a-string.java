class Solution {
    public String reverseVowels(String s) {
        
        Set<Character> set = new HashSet<>();
        set.add('A');
        set.add('a');
        set.add('E');
        set.add('e');
        set.add('I');
        set.add('i');
        set.add('O');
        set.add('o');
        set.add('u');
        set.add('U');
        
        
        String vowel="";
        
        
        for(char c: s.toCharArray())
        {
            if(set.contains(c))
            {
                vowel=c+vowel;
            }
        }
         
        int ind=0;
        
        String res="";
        for(char c: s.toCharArray())
        {
            if(set.contains(c))
            {
                res+=vowel.charAt(ind);
                ind++;
            }
            else
                res+=c;
        }
        return res;
    }
}