class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        
        Arrays.sort(nums);
        
       
        List<Integer> rs = new ArrayList<>();
        
        
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == target){
                rs.add(i);
            }
        }
        
        return rs;
    
    }
}