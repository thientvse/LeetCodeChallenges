class Solution {
    public void moveZeroes(int[] nums) {
        int l = 0;
        int r = 1;
        
        while(r < nums.length){
            if(nums[l] == 0 && nums[r] != 0){
                nums[l++] = nums[r];
                nums[r++] = 0;
            } else if (nums[l] == 0 && nums[r] == 0){
                r++;
            } else {
                l++;
                r++;
            }
        }
    }
}