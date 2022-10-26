class Solution {

    int squareRoot(int num) {
        if (num < 2) return num;
        int left = 1;
        int right = num;
        int res = 0;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            //System.out.println(left+" "+mid+" "+right);
            if (num / mid == mid) return mid; else if (mid < num / mid) {
                left = mid + 1;
                res = mid;
            } else right = mid - 1;
        }
        return res;
    }

    public int mySqrt(int x) {
        return squareRoot(x);
    }
}
