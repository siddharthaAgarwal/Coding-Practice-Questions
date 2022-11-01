class Solution {
    public boolean searchMatrix(int[][] A, int B) {
        
        int n=A.length, m=A[0].length;
        
        int left =0, right= n*m-1;
        
        while(left<=right)
        {
            int mid= left + (right-left)/2;
            int i= mid/m;
            int j= mid%m;
            if(A[i][j]==B)
                return true;
            else if(A[i][j]<B)
            {
                left= mid+1;
            }
            else right = mid-1;
        }
        return false;
    }
}