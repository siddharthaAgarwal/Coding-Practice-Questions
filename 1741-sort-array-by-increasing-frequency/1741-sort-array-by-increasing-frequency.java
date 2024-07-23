class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        int[] freq = new int[201];
        for (int i = 0; i < n; i++) {
            freq[nums[i] + 100]++;
        }
        for (int i = 0; i < n; i++) {
            nums[i] = freq[nums[i] + 100] * 1000 + (100 - nums[i]);

        }
        Arrays.sort(nums);
        for (int i = 0; i < n; i++) {
            nums[i] = 100 - nums[i] % 1000;
        }
        return nums;
    }
}