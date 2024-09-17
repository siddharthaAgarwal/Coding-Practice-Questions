class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Set<String> unseen = new HashSet<>();
        Set<String> seen = new HashSet<>();
        
        for(String s: (s1+" "+s2).split("\\s"))
        {
            if(unseen.contains(s))
            {
                seen.add(s);
            }
            unseen.add(s);
        }

        unseen.removeAll(seen);
        return unseen.toArray(new String[0]);
        
    }
}