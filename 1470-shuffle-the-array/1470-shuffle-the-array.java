class Solution {
    public int[] shuffle(int[] nums, int n) {
        
        int[] rs = new int[nums.length];
        
        int k = 0;
        
        for (int i = 0; i < n; i++){
            
            rs[k++] = nums[i];
            rs[k++] = nums[n+i];
        }
        
        return rs;
        
    }
}