class Solution {
    public int maxSubArray(int[] nums) {
        var sum = 0;
        var maxValue = Integer.MIN_VALUE;
        
        for(int i = 0; i < nums.length; i++){
            
            // plus element
            sum += nums[i];
            
            // get max value with sum
            maxValue = Math.max(maxValue, sum);
            
            // if sum < 0 => sum = 0
            if (sum < 0) sum = 0;
        }
        
        return maxValue;
    }
}