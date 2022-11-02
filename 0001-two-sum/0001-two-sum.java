class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        
        int[] rs = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            
            int key = target - nums[i];
            
            if(hm.containsKey(key)){
                rs[1] = i;
                rs[0] = hm.get(key);
                
                return rs;
            } else {
                hm.put(nums[i], i);
            }
        }
        
        return rs;
    }
}