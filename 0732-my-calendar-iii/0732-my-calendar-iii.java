class MyCalendarThree {
    Map<Integer,Integer> calendar;

    public MyCalendarThree() {
        calendar = new TreeMap<>();
    }
    
    public int book(int startTime, int endTime) {
        calendar.put(startTime, calendar.getOrDefault(startTime, 0)+1);
        calendar.put(endTime, calendar.getOrDefault(endTime, 0)-1);
        
        int sum=0, max=0;
        for(int i: calendar.values())
        {
            sum+=i;
            max = Math.max(sum, max);
        }
        return max;
    }
}

/**
 * Your MyCalendarThree object will be instantiated and called as such:
 * MyCalendarThree obj = new MyCalendarThree();
 * int param_1 = obj.book(startTime,endTime);
 */