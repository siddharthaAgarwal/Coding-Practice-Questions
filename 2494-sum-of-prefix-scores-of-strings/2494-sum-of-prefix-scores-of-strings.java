class Trie
{
    int count =0;
    Trie[] child = new Trie[26];
}


class Solution {
    Trie root  = new Trie();
    
    void insert(String word){
        Trie node = root;
        for(char c: word.toCharArray()){
            if(node.child[c-'a']==null)
            {
                node.child[c-'a']= new Trie();
            }
            node.child[c-'a'].count++;
            node = node.child[c-'a'];
        }
    }

     public int getSum(String word)
     {
        int res=0;
        Trie temp = root;
       for(int i=0;i<word.length() && temp.child[word.charAt(i)-'a']!=null ;i++)
       {
            res += temp.child[word.charAt(i)-'a'].count;
            temp = temp.child[word.charAt(i)-'a'];
       }   
       return res;     
     }


    public int[] sumPrefixScores(String[] words) {
        
        for(String s: words)
        {
            insert(s);
        }

        Trie node = root;
        int[] res= new int[words.length];

        for(int i=0;i<words.length;i++)
        {
            res[i]= getSum(words[i]);
        }
        return res;
    }
}