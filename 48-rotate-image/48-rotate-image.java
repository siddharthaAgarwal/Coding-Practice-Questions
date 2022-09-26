class Solution {
    
    public void swap(int[][] a, int i, int j, int k, int l)
    {
        int temp = a[i][j];
        a[i][j] = a[k][l];
        a[k][l] = temp;
    }
    
    
    public void rotate(int[][] arr) {
        
        for(int i=0;i<arr.length/2;i++)
        {
            for(int j=0;j<arr[i].length;j++)
            {
                swap(arr,i,j,arr.length-1-i,j);
            }
        }
        
        
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                swap(arr,i,j,j,i);
            }
        }
        
    }
}