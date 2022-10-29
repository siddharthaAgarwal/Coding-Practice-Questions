class Solution {
    
    
    class SortbyStart implements Comparator<int[]> {
 
    // Method
    // Sorting in ascending order of name
    public int compare(int[] a, int[] b)
    {
 
        return a[0]-b[0];
    }
}

   
    
    
    
    public int[][] merge(int[][] intervals) {
        
        ArrayList<int[]> res= new ArrayList<>();
        Arrays.sort(intervals, new SortbyStart());
        
        int start=intervals[0][0], end =intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
        
            if(end>=intervals[i][0])
            {
                end = Math.max(end, intervals[i][1]);
            }
            else
            {
                res.add(new int[]{start, end});
                start=intervals[i][0];
                end =intervals[i][1];
            } 
                     //System.out.println(start+" "+end+" ");

        }
         res.add(new int[]{start, end});
        return res.toArray(new int[res.size()][2]);

    }
}