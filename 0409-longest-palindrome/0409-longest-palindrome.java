class Solution {
    public int longestPalindrome(String s) {
         HashMap<Character, Integer> map = new HashMap<>();

        for (Character c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int res=0, odd=0;
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            res+=entry.getValue()/2 *2;
            if(entry.getValue()%2==1)
            {
                odd=1;
            }
        }
        return res+odd;
    }
}