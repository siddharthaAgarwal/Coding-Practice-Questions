class Solution {

    public List<String> fizzBuzz(int A) {
        ArrayList<String> ans = new ArrayList<>();
        for (int i = 1; i <= A; i++) {
            boolean flag = false;
            String res = "";
            if (i % 3 == 0) {
                res = "Fizz";
                flag = true;
            }
            if (i % 5 == 0) {
                res += "Buzz";
                flag = true;
            }
            if (!flag) {
                ans.add(i + "");
            } else ans.add(res);
        }
        return ans;
    }
}
