class Solution {
    public int maxSubArray(int[] nums) {
        int final_sum = Integer.MIN_VALUE;
        int max_ending = 0;
        
        for(int i= 0; i < nums.length; i++){
            max_ending = max_ending + nums[i];
            if (final_sum < max_ending){
                final_sum = max_ending;
            }
            
            if (max_ending < 0){
                max_ending = 0;
            }
        }
        
        return final_sum;
    }
}