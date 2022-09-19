class Solution {
    public List<Integer> spiralOrder(int[][] A) {
        
        int a=0,m=0,n=A.length-1, b=A[0].length-1;
        List<Integer> res= new ArrayList<>();
        
        
        while(a<=b && m<=n)
        {
        for(int i=a;i<=b;i++)
        {
            res.add(A[m][i]);
        }
        m++;
        
        for(int i=m;i<=n;i++)
        {
            res.add(A[i][b]);
        }
        b--;
        
        if(m<=n)
        for(int i=b;i>=a;i--)
        {
            res.add(A[n][i]);
        }
        n--;
        
        if(a<=b)
        for(int i=n;i>=m;i--)
        {
            res.add(A[i][a]);
        }
        a++;
        }
        return res;
        
    }
}