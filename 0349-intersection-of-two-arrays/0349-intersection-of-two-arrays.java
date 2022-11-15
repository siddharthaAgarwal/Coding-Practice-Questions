class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet1= new HashSet<>();
        HashSet<Integer> hashSet2= new HashSet<>();
        
        for(int i: nums1)
            hashSet1.add(i);
        
        for(int i: nums2)
            hashSet2.add(i);
        
        hashSet1.retainAll(hashSet2);
        
        int[] arr= new int[hashSet1.size()];
        int j=0;
        for(int i: hashSet1)
        {
            arr[j++]= i;
        }
        return arr;

    }
}