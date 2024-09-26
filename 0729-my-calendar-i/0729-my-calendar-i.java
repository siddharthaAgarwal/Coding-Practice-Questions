class MyCalendar {
    
    // Main Data Structure, which will be going to define TreeMap
    TreeMap<Integer, Integer> calendar;
    
    public MyCalendar() {
        calendar = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        
        Integer floor = calendar.floorKey(start);
        Integer ceil = calendar.ceilingKey(start);
        
        if((floor==null || calendar.get(floor)<=start) && (ceil==null || ceil>=end))
        {
            calendar.put(start, end);
            return true;
        }
        return false;
    }
}

/**
 * Your MyCalendar object will be instantiated and called as such:
 * MyCalendar obj = new MyCalendar();
 * boolean param_1 = obj.book(start,end);
 */