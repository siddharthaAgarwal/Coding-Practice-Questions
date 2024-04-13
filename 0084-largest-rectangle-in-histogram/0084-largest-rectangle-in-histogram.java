class Solution {

    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;
        int res = 0;
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                int top = stack.pop();
                int curr = heights[top] * (stack.isEmpty() ? i : (i - stack.peek() - 1));
                res = Math.max(res, curr);
            }
            stack.push(i);
        }

        while (!stack.isEmpty()) {
            int top = stack.pop();
            int curr = heights[top] * (stack.isEmpty() ? n : (n - stack.peek() - 1));
            res = Math.max(res, curr);
        }
        return res;
    }
}