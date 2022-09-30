class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character,Integer> map = new HashMap<>();
        
        char[] jewelsArray = jewels.toCharArray();
        char[] stonesArray = stones.toCharArray();
        
        int count = 0;
        
        for(char ch: jewelsArray){
            map.put(ch, map.getOrDefault(ch, 0));
        }
        
        for(char ch: stonesArray){
            if(map.containsKey(ch)){
                count++;
            }
        }
        
        return count;
    }
}