class Solution {
    public String kthDistinct(String[] arr, int K) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for(String s: arr)
        {
            map.put(s, map.getOrDefault(s,0)+1);
        }
        int counter=0;
        String res="";
       for(Map.Entry<String, Integer> m: map.entrySet()){
            if(m.getValue()==1)
            {
                counter++;
            }

            if(counter==K)
            {
                return m.getKey();
            }
        }
        return res;
    }
}