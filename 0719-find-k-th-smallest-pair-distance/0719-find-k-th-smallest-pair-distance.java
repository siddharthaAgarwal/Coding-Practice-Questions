class Solution {
    private int getPairs(int t, int[] nums) {
        int cnt = 0;
        for (int l = 0, r = 1; r < nums.length; r++) {
            while (l < r && t < nums[r] - nums[l]) l++;
            cnt += r - l;
        }
        return cnt;
    }

    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int l = 0, r = nums[nums.length - 1];
        while (l < r) {
            int mid = (l + r) / 2;
            if (getPairs(mid, nums) < k) l = mid + 1;
            else r = mid;
        }
        return l;
    }
}