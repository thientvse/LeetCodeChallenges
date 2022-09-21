class Solution {
    public int[] sortArrayByParity(int[] nums) {
        
        int[] result = new int[nums.length];
//         int index = 0;
        
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i]%2 == 0){
//                 result[index++] = nums[i];
//             }
//         }
        
        
//         for(int i = 0; i < nums.length; i++){
//             if(nums[i]%2 == 1){
//                 result[index++] = nums[i];
//             }
//         }
        
        int first = 0;
        int end = nums.length - 1;
        for(int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                result[first++] = nums[i];
            } else {
                result[end--] = nums[i];
            }
        }
        
        return result;
        
    }
}