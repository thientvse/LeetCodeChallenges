class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for(var i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
                return true;
            } else {
                map.put(nums[i], map.getOrDefault(nums[i],0)+1);
            }
        }
        
        return false;
        
    }
}