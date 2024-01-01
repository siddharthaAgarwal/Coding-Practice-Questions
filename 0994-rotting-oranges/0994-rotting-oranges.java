class Triple{

    Triple(int first, int second, int third) {
        this.first= first;
        this.second= second;
        this.third = third;
    }
    
    int first;
    int second;
    int third;
    
    public String toString()
    {
        return "{ "+first+", "+second+", "+third+" }";
    }
}


class Solution {        
    
    boolean isSafe(int n, int m, int x, int y)
    {
        return x < n && y < m && x >= 0 && y >= 0;
    }

    public int orangesRotting(int[][] grid) {
        int[] dx= {-1,0,0,1};
        int[] dy= {0,1,-1,0};

        int n= grid.length;
        int m = grid[0].length;

        int time=0;

        boolean[][] visited = new boolean[n][m];

        Queue<Triple> queue = new LinkedList<>();

        int oneCount=0;

        // Stored elements in queue;
        for(int i=0;i<n;i++)
        {
            for(int j=0; j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    queue.add(new Triple(i,j,0));
                    visited[i][j]=true;
                }
                else if(grid[i][j]==1)
                {
                    oneCount++;
                }
            }
        }

        // Stored elements in queue;
        while (!queue.isEmpty())
        {
            Triple currTriple = queue.poll();

            for(int i=0;i<4; i++)
            {
                int x = currTriple.first + dx[i];
                int y = currTriple.second + dy[i];
                int cost = currTriple.third;

                if(isSafe(n,m,x,y) && visited[x][y]==false && grid[x][y]==1)
                {
                    visited[x][y]= true;
                    int third =  currTriple.third+1;
                    queue.add(new Triple(x,y, third));
                    oneCount--;
                    time= third;
                }
            }
            
            //System.out.println(queue+" "+time+" "+oneCount);
        }
        return oneCount!=0?-1:time;

    }

}