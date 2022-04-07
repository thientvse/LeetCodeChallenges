class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> mark = new HashSet<>();
        
        for (int num: nums){
            mark.add(num);
        }
        
        List<Integer> result = new ArrayList<>();
        for(int i=1; i <= nums.length; i++){
            if(!mark.contains(i)){
                result.add(i);
            }
        }
        
        return result;
    }
}