class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        
        List<Integer>  res= new ArrayList<>();

        int[] col = new int[matrix[0].length];
        Arrays.fill(col, -1);
        
        for(int i=0;i<matrix.length;i++)
        {
            int minIndex=0;
            for(int j=1;j<col.length;j++)
            {
                if(matrix[i][j]<matrix[i][minIndex])
                {
                    minIndex = j; 
                }
            }

           // System.out.println(minIndex);

            if(col[minIndex]!=-1)
            {
                if(col[minIndex]== matrix[i][minIndex]){
                    res.add(col[minIndex]);
                }
                continue;
            }

            //System.out.println(Arrays.toString(col));
            int max=0;


            for(int k=0;k<matrix.length;k++)
            {
                max = Math.max(matrix[k][minIndex],max);
            }

            col[minIndex]=max;

            if(max== matrix[i][minIndex]){
                    res.add(col[minIndex]);
            }

        }
        return res;
    }
}