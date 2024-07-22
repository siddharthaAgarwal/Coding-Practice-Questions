class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        Integer[] arr= new Integer[names.length];
        for(int i=0;i<names.length;i++)
        {
            arr[i]=i;
        }

        Arrays.sort(arr, (a,b)->Integer.compare(heights[b], heights[a]));

        String[] res= new String[names.length];
        int k=0;
        for(int i:arr)
        {
            res[k]= names[i];
            k++;
        }

        return res;
    }
}