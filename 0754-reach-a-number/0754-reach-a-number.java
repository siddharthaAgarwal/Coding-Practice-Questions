class Solution {

    public int reachNumber(int A) {
        A = Math.abs(A);
        int n = (int) (Math.sqrt(1 + (8.0 * A)) - 1) / 2;
        int running_sum = (n * (n + 1)) / 2;

        if (running_sum < A) {
            n++;
            running_sum += n;
        }
        while ((running_sum - A) % 2 != 0) {
            n++;
            running_sum += n;
        }
        return n;
    }
}
