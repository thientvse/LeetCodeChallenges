class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
           if (!hashSet.add(nums[i])){
               hashSet.remove(nums[i]);
           }
        }

        for (int num: hashSet) {
            return num;
        }

        return 0;
    }
}