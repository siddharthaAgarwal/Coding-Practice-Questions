class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int size = original.length;
        int[][] res= new int[0][0];

        if(m*n!=size)
        return  res;

        res = new int[m][n];

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                res[i][j]= original[i*n+j];
            }
        }
        return res;
    }
}