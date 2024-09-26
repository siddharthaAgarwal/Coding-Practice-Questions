class MyCalendar {
    
    // Main Data Structure, which will be going to define TreeMap
    TreeMap<Integer, Integer> calendar;
    
    public MyCalendar() {
        calendar = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        
        // Find Events about to happen before and after current start time
        Integer eventBefore = calendar.floorKey(start);
        Integer eventAfter = calendar.ceilingKey(start);
        
        // Make sure PreviousEvent completes before current Event start and next event should start only after current event Ends
        if((eventBefore==null || calendar.get(eventBefore)<=start) && (eventAfter==null || eventAfter>=end)) {
            /**
                We only need to book non-overlapping events
            */
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