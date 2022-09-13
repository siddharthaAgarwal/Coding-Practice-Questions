class Solution {

    public int reverse(int A) {
        int ans = 1;
        if (A < 0) {
            ans = -1;
            A *= -1;
        }
        long rev = 0;
        while (A != 0) {
            rev = rev * 10 + A % 10;
            A /= 10;
        }

        int res = ((rev * ans) < Integer.MIN_VALUE || (rev * ans) > Integer.MAX_VALUE) ? 0 : (int) rev * ans;
        return res;
    }
}
