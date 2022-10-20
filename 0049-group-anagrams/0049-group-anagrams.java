class Solution {
    
    
    
    public String getFreqString(String s)
    {
    int[] v = new int[26];

    //cout<<s;
    for(int i=0;i<s.length();i++)
    {
        v[(int)(s.charAt(i)-97)]++;
    }

    StringBuilder res=new StringBuilder("");
    for(int i=0;i<26;i++)
    {
        if(v[i]!=0)
        {
            res.append( (char)(i+'a'));
            res.append(v[i]);
        }
    }    
    
    return res.toString();
    }


    
    
    public List<List<String>> groupAnagrams(String[] A) {
    List<List<String>> ans= new ArrayList<>();
    Map<String, ArrayList<String>> map = new HashMap<>();
    
    for(int i=0;i<A.length;i++)
    {
        String s=getFreqString(A[i]);
        ArrayList<String> res=map.getOrDefault(s, new ArrayList<String>());
        res.add(A[i]);
        map.put(s,res);
    }
    
    for(ArrayList<String> l: map.values())
    {
        ans.add(l);
    }
    
    return ans;
        
    }
}