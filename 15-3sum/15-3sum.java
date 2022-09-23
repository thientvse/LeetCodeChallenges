class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Set<List<Integer>> set = new HashSet<>();
        
        int size = nums.length;
        
        Arrays.sort(nums);	// Sort the elements

        
        for(int i = 0; i < size -2; i++){
            int left = i + 1;
            int right = size - 1;
            
            while (left < right){
                int sum = nums[i] + nums[left] + nums[right];
                
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if(sum > 0){
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        return new ArrayList<>(set);
        
        
    }
}