class Solution {
    public int arithmeticTriplets(int[] nums, int diff) {
        int result = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }
        
        for(int c: nums){
            if(map.containsKey(c+diff) && map.containsKey(c+2*diff)){
                result++;
            }
        }
        
        return result;
    }
}