class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();

            for(int num: nums){
                if (hashMap.containsKey(num)){
                    hashMap.put(num, hashMap.get(num)+1);
                } else {
                    hashMap.put(num,1);
                }
            }

            return hashMap.entrySet()
                    .stream()
                    .filter(entry -> entry.getValue() == Collections.max(hashMap.values()))
                    .map(Map.Entry::getKey).findAny().orElse(0);
    }
}