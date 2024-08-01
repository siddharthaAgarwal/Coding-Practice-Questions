class Solution {
    public int countSeniors(String[] details) {
        
        int res=0;
        //System.out.println(details[0].substring(11,13));
        for(String s: details)
        {
            if(s.substring(11,13).compareTo("60")>0)
            res++;
        }
        return res;
    }
}