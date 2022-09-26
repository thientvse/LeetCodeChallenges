class Solution {
    public int findDuplicate(int[] nums) {
//         Arrays.sort(nums);
        
//         for (int i = 1;i< nums.length ; i++){
//             if(nums[i] == nums[i-1]){
//                 return nums[i];
//             }
//         }
        
//         return -1;
        
        Set<Integer> set = new HashSet<Integer>();
        
        for(int num: nums){
            if(set.contains(num)){
                return num;
            } else {
                set.add(num);
            }
        }
        
        return -1;
        
    }
}