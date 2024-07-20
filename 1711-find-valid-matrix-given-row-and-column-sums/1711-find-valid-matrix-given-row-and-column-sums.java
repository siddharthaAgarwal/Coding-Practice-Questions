class Solution {
    public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int rows = rowSum.length;
        int cols = colSum.length;
        int[][] resultMatrix = new int[rows][cols];
        
        int r = 0, c = 0;
        while (r < rows && c < cols) {
            int cellValue = Math.min(rowSum[r], colSum[c]);
            resultMatrix[r][c] = cellValue;
            
            rowSum[r] -= cellValue;
            colSum[c] -= cellValue;
            
            if (rowSum[r] == 0) r++;
            else c++;
        }
        
        return resultMatrix;
    }
}