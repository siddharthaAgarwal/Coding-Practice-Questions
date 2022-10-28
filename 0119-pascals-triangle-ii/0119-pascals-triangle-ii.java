class Solution {

    public List<Integer> binomial(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for (int i = 1; i <= n; i++) {
            long res=arr.get(i - 1) * (long)(n - i + 1) / i;
            arr.add((int)res);
        }
        return arr;
    }

    public List<Integer> getRow(int rowIndex) {
        return binomial(rowIndex);
    }
}
