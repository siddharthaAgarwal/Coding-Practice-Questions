class Solution {

    public void sortJumbled(int[] nums) {

    }

    public int getModifiedValue(int num, int[] mapping) {
        if(num==0)
        return mapping[0];
        int res = 0;
        int mul = 1;
        while (num != 0) {
            res = mapping[num % 10] * mul + res;
            mul *= 10;
            num /= 10;
        }
        return res;
    }

    public int[] sortJumbled(int[] mapping, int[] nums) {
        int n = nums.length;
        int[] nums2 = new int[n];
        Integer[] indexes = new Integer[n];

        for (int i = 0; i < nums.length; i++) {
            nums2[i] = getModifiedValue(nums[i], mapping);
            indexes[i] = i;
        }

        Arrays.sort(indexes, (a, b) -> (nums2[a] - nums2[b]));
        // System.out.println(Arrays.toString(nums2));

        for (int i = 0; i < n; i++) {
            nums2[i] = nums[indexes[i]];
        }

        return nums2;
    }
}