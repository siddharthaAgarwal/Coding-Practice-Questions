class Solution {

    public String convertToTitle(int A) {
        String res = "";
        while (A > 0) {
            int rem = (A % 26);
            A /= 26;
            if (rem == 0) {
                rem = 26;
                A--;
            }
            res = (char) (rem + 'A' - 1) + res;
        }

        return res;
    }
}
