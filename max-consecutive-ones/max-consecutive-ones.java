class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        
        for(int n: nums){
            if (n==1){
                count++;
            } else {
                if (count>max){
                    max = count;
                }
                    
                count = 0;
            }
        }
        
        return count>max? count:max;
    }
}