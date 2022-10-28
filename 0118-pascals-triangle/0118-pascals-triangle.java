class Solution {
    
     public List<Integer> binomial(int n) {
        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        for (int i = 1; i <= n; i++) {
            arr.add((int)(arr.get(i - 1) * (long)(n - i + 1) / i));
            //System.out.println(arr);
        }
        return arr;
    }
  
    
    public List<List<Integer>> generate(int A) {
         List<List<Integer>> res= new ArrayList<>();
        for(int i=0;i<A;i++)
        {
         res.add(binomial(i));   
        }
        return res;
        
    }
}