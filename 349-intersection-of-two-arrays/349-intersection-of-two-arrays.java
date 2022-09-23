class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        
        
        ArrayList<Integer> ls = new ArrayList<>();
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < nums1.length; i++){
            set.add(nums1[i]);
        }
        
        for(int i = 0; i < nums2.length; i++){
            if (set.contains(nums2[i])){
               ls.add(nums2[i]);
                set.remove(nums2[i]);
            } 
        }
        
        int[] rs = new int[ls.size()];
        
        for(int i= 0; i < ls.size(); i++){
            rs[i] = ls.get(i);
        }
        
        return rs;
    }
}