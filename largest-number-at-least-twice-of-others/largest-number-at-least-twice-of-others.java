class Solution {
    public int dominantIndex(int[] nums) {
        
        
        int result = -1;
        
        int maxValue = 0;
        int maxIndex = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] >= maxValue){
                maxValue = nums[i];
                maxIndex = i;
            }
        }
        
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 && maxValue != nums[i] && nums[i]*2 > maxValue){
                maxIndex = -1;
            } 
        }
        
        
        
        return maxIndex;
    }
}