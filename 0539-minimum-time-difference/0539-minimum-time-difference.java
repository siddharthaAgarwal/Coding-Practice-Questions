class Solution {
    int getTime(String s)
    {
        return ((s.charAt(0)-'0')*10+(s.charAt(1)-'0'))*60 + (s.charAt(3)-'0')*10+(s.charAt(4)-'0');
    }
    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        for(String s: timePoints)
        {
            list.add(getTime(s));
        }

        Collections.sort(list);
        int min = 1440 -list.get(list.size()-1)+list.get(0);
               // System.out.println(list.get(list.size()-1));
        
        for(int i=1;i<list.size();i++)
        {
            min = Math.min(min, list.get(i)-list.get(i-1));
        }
        return min;
    }
}