class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 1;
        
        // Arrays.sort(nums);
        
        for (int i = 1; i < nums.length; i++){
            if(nums[i-1] != nums[i]){
                nums[index] = nums[i];
                index++;
            }
        }
        
        return index;
        
    }
        
       
}