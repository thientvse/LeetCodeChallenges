class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        
        // 1. create Set to save distince result
        Set<List<Integer>> set = new HashSet<>();
        
        var size = nums.length;
        
        
        // 2. sort array
        Arrays.sort(nums);
        
        // 3. use two pointer patter
        for(int i = 0; i < nums.length; i++){
            int left = i+1;
            int right = size - 1;
            
            
            while (left < right){
                int sum = nums[i]+nums[left]+nums[right];
                
                if(sum == 0){
                    set.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0){
                    right--;
                } else {
                    left++;
                }
            }
        }
        
        return new ArrayList<>(set);
        
    }
}