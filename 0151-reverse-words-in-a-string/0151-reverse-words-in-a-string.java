class Solution {
    public String reverseWords(String A) {
          String[] arr= A.split("\\s");
        
        String res="";
        
        for(String i:arr)
        {
            if(!i.equals(""))
            res=i+" "+res;
        }
        
        return res.trim();
    }
}