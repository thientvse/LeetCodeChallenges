class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> value = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (value.containsKey(diff))
                return new int[]{i, value.get(diff)};
            value.put(nums[i], i);
        }

        return new int[]{};
    }
}