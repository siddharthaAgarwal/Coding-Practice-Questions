//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        
	    int t=Integer.parseInt(br.readLine().trim());
	    while(t > 0)
	    {
	        int n= Integer.parseInt(br.readLine().trim());
	        String x = br.readLine().trim();
	        String string_list[] = x.split(" ",n);
	        
	        Solution ob = new  Solution();
	        
	        List <List<String>> ans = ob.Anagrams(string_list);
	        
	        Collections.sort(ans, new Comparator<List<String>>(){
            public int compare(List<String> l1, List<String> l2) {
                    String s1 =  l1.get(0);
                    String s2 = l2.get(0);
                    
                    return s1.compareTo(s2);
                }
            });
	        
	        for(int i=0;i<ans.size();i++)
	        {
	            for(int j=0;j<ans.get(i).size();j++)
	            {
	                System.out.print(ans.get(i).get(j) + " ");
	            }
	            System.out.println();
	        }
	       
	       
            t--;
	    }
	}
    
}

// } Driver Code Ends


//User function Template for Java

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

    
    
    public List<List<String>> Anagrams(String[] A) {
        
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
