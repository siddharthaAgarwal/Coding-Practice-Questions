class Solution {
    public void swap(int[] A, int i, int j)
    {
        int temp = A[i];
        A[i]=A[j];
        A[j]=temp;      
    }

    
    public int firstMissingPositive(int[] A) {
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>0 && A[i]<=A.length && A[i]!=i+1 && A[A[i]-1]!=A[i])
            {
                swap(A,i,A[i]-1);
                i--;
            }
        }
        
        int ans=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]!=i+1)
            {
                return i+1;
            }
        }
        return A.length+1;
        
    }
}