class Solution {

    Integer isBigger(String a, String b)
    {
        return  (b+a).compareTo(a+b);
    }

    public String largestNumber(int[] nums) {
        Integer[] numsArr = Arrays.stream(nums).boxed().toArray(Integer[]::new);

        // Sort the array using a custom comparator
        Arrays.sort(numsArr, (a, b) -> isBigger(a+"", b+""));

    

        StringBuilder res = new StringBuilder();
        for(int i:numsArr)
        {
            res.append(i);
        }
        
        if(res.charAt(0)=='0')
            return "0";
        return res.toString();
    }
}