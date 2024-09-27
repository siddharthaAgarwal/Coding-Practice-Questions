class MyCalendarTwo {

    TreeMap<Integer, Integer> tMap;

    public MyCalendarTwo() {
        tMap = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        tMap.put(start, tMap.getOrDefault(start,0)+1);
        tMap.put(end, tMap.getOrDefault(end,0)-1);

        int result =0;
        for(Integer i: tMap.values())
        {
            result+=i;
            if(result>2)
            {
                tMap.put(start, tMap.getOrDefault(start,0)-1);
                tMap.put(end, tMap.getOrDefault(end,0)+1);
                return false;
             }

        }
        return true;
        
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */