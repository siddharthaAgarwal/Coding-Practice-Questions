class Solution {

    public int titleToNumber(String A) {
        int res = 0;
        int n = A.length();
        for (int i = 0; i < n; i++) {
            res += (A.charAt(i) - 'A' + 1) * Math.pow(26, (n - i - 1));
        }
        return res;
    }
}
