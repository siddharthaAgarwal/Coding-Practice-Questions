class KthLargest {

    PriorityQueue<Integer> pq;
    int K=0;
    public KthLargest(int k, int[] nums) {
        K=k;
        pq = new PriorityQueue<>();
        for(int i:nums)
        {
            if(pq.size() <k)
            {
                pq.add(i);
            }
            else if(pq.peek()<i)
            {
                pq.poll();
                pq.add(i);
            }
        }
        
    }
    
    public int add(int val) {
            if(pq.size() <K)
            {
                pq.add(val);
            }
            else if(pq.peek()<val)
            {
                pq.poll();
                pq.add(val);
            }
        return pq.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */