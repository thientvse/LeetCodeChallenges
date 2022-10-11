class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        
        List<Integer> rs = new ArrayList<>();
        
        for(int i: nums1){
            map.put(i, map.getOrDefault(i,0)+1);
        }
        
        for(int i: nums2){
            if(map.containsKey(i) && map.getOrDefault(i,0) > 0){
                rs.add(i);
                map.put(i, map.getOrDefault(i,0)-1);
            }
        }
        
        int[] result = new int[rs.size()];
        
        for(int i=0; i < rs.size(); i++){
            result[i] = rs.get(i);
        }
        
        return result;
        
        
    }
}