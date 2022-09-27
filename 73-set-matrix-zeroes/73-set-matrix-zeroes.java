class Solution {
    public void setZeroes(int[][] a) {
        
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(a[i][j]==0)
                {
                    row.add(i);
                    col.add(j);
                }
            }
        }
        
       for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                if(row.contains(i) || col.contains(j))
                {
                    a[i][j]=0;
                }
            }
        }
        
    }
}