class Solution {
    public long maxKelements(int[] nums, int k) {
        // Initialize a max-heap (priority queue) to store the elements in descending order
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        
        // Add all elements from the array 'nums' to the priority queue
        for (int i : nums) {
            pq.offer(i);  // Insert each number into the max-heap
        }

        long res = 0;  // Initialize result to store the sum of selected elements

        // Perform exactly 'k' operations
        while (k-- > 0) {
            int curr = pq.poll();  // Get the largest element from the max-heap
            pq.offer((curr + 2) / 3);  // Apply the operation: ceil(curr / 3) and push the updated value back into the heap
            res += curr;  // Add the largest element to the result (score)
        }

        return res;  // Return the maximum score after 'k' operations
    }
}