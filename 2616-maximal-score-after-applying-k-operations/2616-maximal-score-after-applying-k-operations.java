class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->(b-a));
        for(int i:nums)
        {
            pq.offer(i);
        }

        long res=0;
        while(k-->0)
        {
            int curr = pq.poll();
            pq.offer((curr+2)/3);
            res+=curr;
        }

        return res;
        
    }
}