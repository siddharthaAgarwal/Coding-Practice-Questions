class Solution {
    public int maxPoints(int[][] points) {
        
        
        Map<Double, Integer> map = new HashMap<>();
        int res=1;
        for(int i=0; i<points.length-1;i++)
        {
            map.clear();
            for(int j=0;j<points.length;j++)
            {
                int x1 = points[i][0];
                int y1 = points[i][1];
                int x2 = points[j][0];
                int y2 = points[j][1];
                
                if(i==j)
                    continue;
            
                double temp = Integer.MIN_VALUE;
                if(x2!=x1)
                    temp = (y2 - y1) * 1.0d / (x2 - x1) * 1.0d;

                // double temp = (y2-y1)/((double)(x2-x1));
                
                int count = map.getOrDefault(temp, 1);
                
                map.put(temp, count+1);
                
                res=Math.max(res, count+1);
                
                // System.out.println("["+x1+" "+y1+"] ["+x2+" "+y2+"]");
                // System.out.println(map);
            }
        }
        
        return res;
    }
}