class Solution {
    public int romanToInt(String A) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        
        int max=map.get(A.charAt(A.length()-1));
        int ans=0;
        for(int i=A.length()-1;i>=0;i--)
        {
            char c=A.charAt(i);
            int curr =map.get(c);
            if(curr<max)
            {
                curr=-1*curr;
            }
            max=Math.max(max,curr);
            ans= ans+curr;
            //System.out.println(curr+" "+max);
        }
        return ans;
    }
}