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

     public int getSum(Trie root, String word, int i)
     {
        if(root == null || i==word.length())
        {
            return 0;
        }
        
        int index = word.charAt(i)-'a';
        if(root.child[index]==null)
        {
            return 0;
        }

        return root.child[index].count+ getSum(root.child[index],word,i+1);
        
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
            res[i]= getSum(root,words[i],0);
        }
        return res;
    }
}