class Solution {
    public int numTeams(int[] arr) {
        int n = arr.length;
        int ans = 0;
        for (int i = 1; i < n - 1; i++) {
            int l[] = {0, 0}, r[] = {0, 0};
            for (int j = 0; j < i; j++) {
                l[arr[j] < arr[i] ? 0 : 1]++;
            }
            for (int k = i + 1; k < n; k++) {
                r[arr[k] < arr[i] ? 0 : 1]++;
            }

            System.out.println(Arrays.toString(l));
            System.out.println(Arrays.toString(r));
        
            ans += l[0] * r[1] + l[1] * r[0];
        }
        return ans;
    }
}