class Solution {
    private int[][][] dp;

    private int func(int idx, int M, boolean isAlice, int[] piles) {
        if (idx >= piles.length) return 0;

        if (dp[idx][M][isAlice ? 1 : 0] != -1) return dp[idx][M][isAlice ? 1 : 0];

        int total = 0;
        int maxScore = isAlice ? Integer.MIN_VALUE : Integer.MAX_VALUE;

        for (int x = 1; x <= 2 * M; x++) {
            if (idx + x > piles.length) break;

            total += piles[idx + x - 1];

            if (isAlice) {
                maxScore = Math.max(maxScore, total + func(idx + x, Math.max(M, x), !isAlice, piles));
            } else {
                maxScore = Math.min(maxScore, func(idx + x, Math.max(M, x), !isAlice, piles));
            }
        }

        dp[idx][M][isAlice ? 1 : 0] = maxScore;
        return maxScore;
    }

    public int stoneGameII(int[] piles) {
        int n = piles.length;
        dp = new int[n][n + 1][2];

        for (int[][] arr : dp) {
            for (int[] innerArr : arr) {
                Arrays.fill(innerArr, -1);
            }
        }

        return func(0, 1, true, piles);
    }
}