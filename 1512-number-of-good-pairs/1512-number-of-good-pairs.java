class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        
        int count = 0;
       
        for (int num: nums){
            int countFreq = map.getOrDefault(num, 0);
            count += countFreq;
            map.put(num, countFreq+1);
        }
        
        return count;
    }
}