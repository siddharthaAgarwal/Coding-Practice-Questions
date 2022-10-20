class Solution {
    
    
    
    public String getFreqString(String s)
    {
    int[] v = new int[26];

    //cout<<s;
    for(int i=0;i<s.length();i++)
    {
        v[(int)(s.charAt(i)-97)]++;
    }

    String res="";
    for(int i=0;i<26;i++)
    {
        if(v[i]!=0)
        {
            res= res+ (char)(i+'a')+v[i];
        }
    }    
    
    return res;
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