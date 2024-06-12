class Solution {
    public int maxProfit(int[] prices) {
        int smaller = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            int curr = prices[i];
            smaller = Math.min(smaller, curr);
            res = Math.max(curr - smaller, res);
        }
        return res;
    }
}